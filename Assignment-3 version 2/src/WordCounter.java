import java.util.Scanner;
/**
 * 
 * @author oscar-11
 * @version 1.0
 * @ Date 2069/12/2
 * This object is for calcualtion of tax,provident fund amount,citizen investment fund amount,monthly cash in hand
 */
public class WordCounter {
	/**
	 * This is the entry point of the program
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindOutput find=new FindOutput();
		String strInput="";
		ReadWriteFile readwritefile=new ReadWriteFile();
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you want to write to File?(y/n)");
		char check=sc.next().charAt(0);
		if(check=='y'){
			readwritefile.writeToFile();
		}
		
			strInput=readwritefile.ReadFromFile();
		
		
	find.showResult(strInput);	
	}
		}

