package hash_lab;
import java.util.*;
public class HashTable {
    private Words[] buf;
    
    public HashTable(int N) {
		buf = new Words[N];
		for (int i = 0; i < buf.length; i++)
			buf[i] = new Words (" ",0);
	}

    public static int hash(char key) {
    
      return ((int)key)-97;
      
	} 

    public void put(Words w) {
        int index =hash( w.getWord().charAt(0));

        if (buf[index].getFrequency()==0){
            buf[index] = w;
            return ;
        }
        while (index < buf.length && buf[index].getFrequency()!=0){
          index++;
        }

        buf[index]=w;
       
    }

    public Words get (String w){

      int index =hash(w.charAt(0));
      
      
              if (buf[index].getWord().equals(w)){
                  return buf[index] ;  
              }
              
              while (index < buf.length && !buf[index].getWord().equals(w)){
      
                index++;
      
              }
            if (index==buf.length){
              return null;
            }
             return buf[index] ;
      
        }

    public Words remove(String w) {
        
      int index = hash(w.charAt(0));
      
      if (buf[index].getWord().equals(w)){// find direct in index
        Words word =buf[index];
        buf[index]=new Words (" ",0);
        return word;
      }
    

        while (index < buf.length && !buf[index].getWord().equals(w)){// find based on lieaner prob

          ++index;
         
        }

        if (index < buf.length &&buf[index].getWord().equals(w)){
          Words word =buf[index];
        buf[index]=new Words (" ",0);
        return word; 
        }else {

         return null;
        }

      }



    public void print() {
        for (int i = 0; i < buf.length; i++) {
                if (buf[i].getFrequency()!=0){
          System.out.println("i is "+ i +"the word is " + buf[i].getWord());}
        }
    }

   
    
   
    
    
}
