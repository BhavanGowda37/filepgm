package com.test;

import java.io.*;
import java.util.*;
import au.com.*;

public class cvs_student {

	public static void main(String[] args) throws IOException 
	{
		
		try 
		{
		       try 
		       {
		           FileReader fr = new FileReader("C:\\Users\\bkumary\\Desktop\\StudentData.csv");
		 
		           FileWriter fw = new FileWriter("C:\\Users\\bkumary\\Desktop\\SelectedStudent.csv");
		           String str = "";
		           int j;
		           int i;
		           while ((i = fr.read()) != -1) 
		           {
		               str += (char)i;
		           }
		           fw.write(str);
		           fr.close();
		           fw.close();
		           System.out.println("File reading and writing both done");
		       }
		       catch (IOException e) 
		       {
		           System.out.println("There are some IOException: "+e);
		       }
		   }
			finally 
			{
			    System.out.println("Finally");
			}
		}
}
