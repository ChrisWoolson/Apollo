import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SavingToFileTest {

	
	public static void main(String[] args) {
		FileWriter fw = null;
		FileReader fr = null;
		
		int i;
		String s = "";
		try {
			fw = new FileWriter("FileTest");
			fr = new FileReader("FileTest");
			
			fw.write("Random Txt");
			
			fw.close();
			i = fr.read();
			
			s += (char)i;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
		System.out.println(s);
		
		
		
	}
}
