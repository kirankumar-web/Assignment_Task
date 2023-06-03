package data;

import Assignment_general.Data_retrival;

public class demodata 
{
   public static void main(String[] args) 
   {
	   String Filepath="//Volumes//C//Eclipse//selenium//cucumberjava//Test//data//sample.xlsx";

	  int s1=Data_retrival.getCellData(Filepath, "Sheet1", 2, 4);
	  String s2=Data_retrival.getdata(Filepath, "Sheet1", 7, 5);

	  System.out.println(s2);
	  System.out.println(s1);
}
}
