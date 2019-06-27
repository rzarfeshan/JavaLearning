package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ShowFile {

	public static void main(String[] args) {
		int i;
		FileInputStream fin = null;
		File file = null;
		//Attempt to open the file
		try {
			file = new File("C:\\Rabeya\\myFile.txt");
			System.out.println(file.getAbsolutePath());
			//fin = new FileInputStream(file);
			fin = new FileInputStream("C:\\Rabeya\\myFile.txt");
			do {
				i = fin.read();
				if (i != -1) {
					System.out.print((char)i);
				}
			} while (i != -1);
		}
		catch (IOException e) {
			System.out.println("Caught FileNotFoundException");
			e.printStackTrace();
		}
		finally {
			try {
				if (fin != null)
					fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
