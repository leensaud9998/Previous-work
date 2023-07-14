
package hash_lab;
import java.util.*;
import java.nio.file.Paths;

public class Main {
    public static void main (String [] args)throws Exception {

        Scanner input = new Scanner (System.in);
         int k; 
        String filename="wordcount.txt";
    
       System.out.print("Enter the number for  for resolving collision 1-Separate Chaining or 2-Linear probing.");
       int choise=input.nextInt();

       input = new Scanner (Paths.get(filename));
       if (choise==1){
        HashTableChain  hashtable  = new HashTableChain();
       while (input.hasNext()){//reading the word into an array//n*n

        String currentword = input.next().toLowerCase();
          
       Words word= hashtable.get(currentword);

        if (word==null){
         word = new Words (currentword,1);
         hashtable.put(word);}
        else {
           hashtable.remove(word.getWord());

            word.setFrequency(word.getFrequency()+1);
            hashtable.put(word);}
            
        }// now all Words in hash table with frequency
      hashtable.print();
      
       }
      

  else if (choise==2){
        HashTable  hashtable2  = new HashTable(500);
   
    while (input.hasNext()){

        String currentword = input.next().toLowerCase();
       
       
       Words word= hashtable2.get(currentword);

        if (word==null){
          
         word = new Words (currentword,1);
         hashtable2.put(word);}
        else {
            
            word =hashtable2.remove(word.getWord());

            word.setFrequency(word.getFrequency()+1);

            hashtable2.put(word);}
            
        }// now all Words in hash table with frequency
       hashtable2.print();
      
  } //end linear probe
       else {
           System.out.println("Invalid choise");
       }
      
//    input.close();
    }//end main

    }//end class

   

