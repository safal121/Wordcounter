

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Hashtable;
/**
 * Object for counting the number of String
 * @author oscar-11
 * @version 1.0
 * @Date 2069/12/2
 */

public class FindOutput {
	/**
	 * Finds and Display the number of occurrence of Strings
	 * @param String
	 * @return void
	 */
	public void showResult(String str){
        
		int length;
		
		List <Integer>index=new ArrayList();
		List <String> words=new ArrayList();
		List <Integer> count=new ArrayList();
		HashMap<String,Integer> nameCount=new HashMap();
		Hashtable<String,String> output=new Hashtable();
		length=str.length();
		int j=0;
	
		for(int i=0;i<length;i++){
			if(str.charAt(i)=='.')
				index.add(i);
			else if(str.charAt(i)==',')
				index.add(i);
			else if(str.charAt(i)==' ')
				index.add(i);
		}
		
		if(str.charAt(0)!='.'||str.charAt(0)!=','||str.charAt(0)!=' ')
		words.add(str.substring(0,index.get(0)));
	
		for (int i=0;i<index.size()-1;i++)
			words.add(str.substring((index.get(i))+1,index.get(i+1)));
		
		for(int i=0;i<words.size();i++){	
			if(words.get(i).equals(" ")){
				words.remove(i);
			}
		
		
		for(j=0;j<words.size();j++){
			int counter=0;
			for(i=0;i<words.size();i++){
				if(words.get(i).equals(words.get(j)))
				++counter;
				
		}
		count.add(counter);
		}
		
		for(i=0;i<count.size();i++)
			nameCount.put(words.get(i),count.get(i));
	}
		
		ArrayList<String> tableValues=new ArrayList();
		ArrayList<String>tableKeys=new ArrayList();
		for(String k:nameCount.keySet()){
			tableValues.add(k);
			//tableKeys.add(nameCount.get(k));
		}
		String cat[]=new String[tableValues.size()];
		for(int i=0;i<tableValues.size();i++){
			cat[i]="";
		}
		for(int i=0;i<tableValues.size();i++){
			int s=0;
			while(s<i){
			cat[i]+="a";
			++s;
			}
			
		}
		for(int i=0;i<tableValues.size();i++){
			tableKeys.add(nameCount.get(tableValues.get(i))+cat[i]);
		}
		for(int i=0;i<tableValues.size();i++){
			output.put(tableKeys.get(i), tableValues.get(i));
		}
		
		String sortKey[]=tableKeys.toArray(new String[tableKeys.size()]);
		Arrays.sort(sortKey);
		String second[]=new String[tableValues.size()];
		
		for(int i=0;i<tableValues.size();i++){
			second[i]=output.get(sortKey[i]);
		}
		
		for(int i=0;i<tableValues.size();i++){
			sortKey[i]=sortKey[i].replaceAll("\\D+","");
					}
		if(tableValues.size()>5){
		for(int i=tableValues.size()-1;i>=tableValues.size()-5;i--){
			System.out.println(second[i]+":"+sortKey[i]);
		}
		}
		
		else{
			for(int i=tableValues.size()-1;i>=tableValues.size()-5;i--){
				System.out.println(second[i]+":"+sortKey[i]);
		}
		}	
		}
}