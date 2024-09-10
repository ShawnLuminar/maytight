package Controlstatements;

import javax.print.DocFlavor.STRING;

public class stringsplitcheck {

	public static void main(String[] args) {
		 String s3 = "selenium webdriver is used for webapplication Testing";
	        
	        // Split the string into words
	        String[] words = s3.split(" ");
	        
	        // Iterate through words and print them
	        for (String word : words) {
	            System.out.println(word);
	            // Check if the word is "webapplication"
	            if (word.equalsIgnoreCase("webapplication")) {
	                System.out.println("The word 'webapplication' is present. Stopping execution.");
	                break; // Stop execution if the word "webapplication" is found
	            }
	        }
	    }
	}