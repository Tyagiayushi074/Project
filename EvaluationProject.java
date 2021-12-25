package Project;
import java.io.*;
import java.util.Scanner;

public class EvaluationProject{
		static int choice2;
        public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		File file=new File("c:\\users\\hp\\Desktop\\mainstudentdetail.txt");	
		if(file.exists())
	    {
			System.out.println("already exist");
	    } else
			try {
				file.mkdir();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		System.out.println("Welcome to our first project evaluation......");
		while(true) {
		System.out.println("Please enter your choice:-");
		System.out.println("Press 1:if you want to retrieve all the files ");
		System.out.println("Press 2:if you want to perform file operations");
		System.out.println("Press 3:if you want to see the program status");
		int choice1=scr.nextInt();
		switch(choice1)
		{
		case 1:{
			       File arr[]=file.listFiles();
		           for(int start=0;start<arr.length;start++)
		           {if(arr[start].isFile()) {
		        	   System.out.println("File is: "+" "+arr[start]);}
		        	   else if(arr[start].isDirectory()) {
		        	   System.out.println("Folder is:"+" "+arr[start]);}
		        	   }
		        	    break;}
		case 2:{do{System.out.println("enter your choice of file operation which you want to perform");
                System.out.println("Press 1:if you want to add new file/folder ");
                System.out.println("Press 2:if you want to delete a file");
                System.out.println("Press 3:if you want to see all file starting with...");
                System.out.println("Press 4:if you want to return to the previous menu");
                System.out.println("Press 5:if you want to see the status ");
                choice2=scr.nextInt();
                switch(choice2) {
                case 1:{System.out.println("enter file name");
                        String fname=scr.next();
                        File file1=new File("c:\\users\\hp\\Desktop\\mainstudentdetail.txt\\"+fname+".txt");
		        	    try {
							file1.createNewFile();
							System.out.println("File created successfully");
						} catch (IOException e) {
							e.printStackTrace();
						}
                        break;
		               }
                case 2:{int count=0;
                	    System.out.println("enter the file name which you want to delete");
                        String fname=scr.next();
                        File arr[]=file.listFiles();
     		           for(int start=0;start<arr.length;start++)
     		           {
     		        	   if(arr[start].getName().equals(fname+".txt")) {
     		        	    count++;
     		        	    arr[start].delete();
     		        	    System.out.println("File deleted successfully");}    		        	   
     		           }if(count==0)
     		        	   System.out.println("Sorry file not found");
                        break;}
                case 3:{System.out.println("enter the file name:-");
                        String fname=scr.next();
                        File arr[]=file.listFiles();
                        for(int start=0;start<arr.length;start++)
		                {
		        	     if(arr[start].getName().startsWith(fname)) {
		        	     System.out.println("File is:-"+arr[start]);}
                         }break; }  
                case 4:
           	           break;
                case 5:{
            	        System.out.println("program is executed successfully");
            	        break;
                        }
                default:{
           	            System.out.println("please enter the correct choice");
           	            break;}
                }} while(choice2>=1 && choice2<4);}
		           if(choice2>=4)
                	break;
		case 3:{
		        System.out.println("Program is executed successfully");
		        break;}
		default:{
		          System.out.println("Please enter the correct choice....");
		          break; }
	          }}}}