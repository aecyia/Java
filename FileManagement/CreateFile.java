// Creates a new empty .txt file called FileName
import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		// Try to create the file
		try {
			// Declare "myObj" as a new file
			File myObj = new File("FileName.txt");
			// Creates the file
			if (myObj.createNewFile()) {
				System.out.println("File Created: " + myObj.getName());
			}
			// Error msg if file exists
			else {
				System.out.println("File already exists !");
			}
		}
		// Catch IOException
		catch (IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}
}