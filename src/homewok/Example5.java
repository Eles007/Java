package homewok;
import java.io.*;
import java.util.*;
public class Example5 { 
	 public static void main(String[] args) {
         
		 try(BufferedReader br = new BufferedReader (new FileReader("notes5.txt")); 
	                BufferedWriter bw = new BufferedWriter(new FileWriter("notes5.txt")))
	        {
			    String text = "Hello World! Hey! Teachers! Leave them kids alone.";
	            bw.write(text);
	            bw.flush();
	            String[] subStr;
	            String delimeter = " ";
	            subStr = text.split(delimeter);
	            for(int i = 0; i < subStr.length; i++) {
	            	if(i % 2 == 0 ) {
	            		System.out.print(subStr[i].toLowerCase() + " ");
	            	}else {
	            		System.out.print(subStr[i].toUpperCase() + " ");
	            	}
	             }
	        }
	        catch(IOException ex){
	              
	            System.out.println(ex.getMessage());
	        } 
	    }    
}