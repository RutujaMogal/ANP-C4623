package corejava;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOExp {

	public static void main(String[] args) {
		//writing a file
		try
		{
			FileWriter fw=new FileWriter("output.txt");
					fw.write("Hello world");
			fw.close();
			System.out.println("Successfully wrote to the file");
		}
		catch(IOException e)
		{
			System.out.println("An error occure while writing to the file.");
			e.printStackTrace();
		}
		//Reading from a file
		try
		{
			BufferedReader br= new BufferedReader(new FileReader("input.txt"));
			String line=br.readLine();
			while (line!=null)
			{
				System.out.println(line);
				line=br.readLine();
			}
			br.close();
		}catch(IOException e)
			{
				System.out.println("An error occured while reading from file");
				e.printStackTrace();
			}
	}

}
