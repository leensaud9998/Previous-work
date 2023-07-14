package hash_lab;


import java.util.*;

public class HashTableChain {
	private ArrayList<Words>[] buf=new ArrayList[26];

	public HashTableChain(){
		for (int i=0;i<buf.length ;i++){
       buf[i]= new ArrayList();
		}
	}


	public static int hash(char key) {
		
		return ((int)key)-97;
	} 


	public void put(Words w) {
	  int index =hash (w.getWord().charAt(0));

	 buf[index].add(w);
			
		
	}
	
	public Words get(String w) {
        
		int index = hash(w.charAt(0));
		
			  for (int i=0; i<buf[index].size();i++){
			
                if (buf[index].get(i).getWord().equals(w)){
					
					return buf[index].get(i);
					
				}

			  }

			return null;
	  
			}

public Words remove(String w) {
        
		int index = hash(w.charAt(0));
			  
			  for (int i=0; i<buf[index].size();i++){
                if (buf[index].get(i).getWord().equals(w)){
					Words wordfound=buf[index].get(i);
					buf[index].remove(i);
					return wordfound;
					
				}

			  }//end for

			return null;
	  
			}
	


	public void print() {
		for (int i = 0; i < buf.length; i++) {
			for (int j=0; j<buf[i].size();j++){
			System.out.println(" i is : "+ i+ "the word are"+ buf[i].get(j).getWord());}
		}
	}


}
