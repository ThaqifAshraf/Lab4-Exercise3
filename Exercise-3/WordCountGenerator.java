
public class WordCountGenerator {
	public int  Getwordcount() {  
        
		String str1 = "Computer Science Rocks";

	     String[] wordArray = str1.trim().split("\\s+");
	     int wordcount = wordArray.length;
        
        return wordcount;
    }  
}  

