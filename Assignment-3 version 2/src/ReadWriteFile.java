

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
/**
 * 
 * @author oscar-11
 * @version 1.0
 * @Date 2069/12/2
 */
public class ReadWriteFile {
	/**
	 * Writes a string of line to File
	 * @param void
	 * @return void
	 */
	public  void writeToFile(){
		try{dfdfd
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();
		sc.close();
		File file=new File("bigyan.txt");
		FileWriter fwrite=new FileWriter(file,true);
		BufferedWriter out=new BufferedWriter(fwrite);
		out.write(line+" "+"\n");
		out.close();
		System.out.println("Successfully written to File");
		}
		catch(Exception e){
			System.err.println("Error: " + e.getMessage());
		}
	}
	/**
	 * Read all Strings from file
	 * @return String
	 * @param void
	 */
	public String ReadFromFile(){
		
		String str="",temp="";
		try{
			
			File file=new File("bigyan.txt");
			FileReader fread=new FileReader(file);
			BufferedReader in=new BufferedReader(fread);
			while((temp=in.readLine())!=null){
				str+=temp;
			
			}	
		}
			catch(Exception e){
				System.err.println("Error: " + e.getMessage());
	}
	return (str);
	}
}
