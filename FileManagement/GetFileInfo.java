// Get file info of FileName.txt
import java.io.File;

public class GetFileInfo {
	public static void main(String[] args) {
		// "myObj" represents the file
		File myObj = new File("FileName.txt");
		// If file exists, print info
		if (myObj.exists()) {
			// Outputs the file name with filetype: FileName.txt
			System.out.println("File Name\t" + myObj.getName());
			// Outputs the Absolute Path: C:\Users\Documents\FileName.txt
			System.out.println("Path\t\t" + myObj.getAbsolutePath());
			// Outputs whether the file can be written on as a boolean value: true
			System.out.println("Writeable\t" + myObj.canWrite());
			// Outputs whether the file can be read as a boolean value: true
			System.out.println("Readable\t" + myObj.canRead());
			// Outputs the file size in bytes
			System.out.println("File Size\t" + myObj.length() + " bytes");
			}
		// Error msg if file does not exist
		else {
			System.out.println("The file does not exist.");
		}
	}
}