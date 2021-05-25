import java.io.*; // imports all java.io classes
import java.util.*; // imports all java.util classes

public class StudentGrades {
	public static void main(String[] args) {
        // Reads lines of the .txt file in an array-format
        ArrayList<String> lines = readFile("Students.txt");
        /* Pre-Check; Can ignore
        String[] lines = readArray("Students.txt");
        System.out.println("Full Array: " + Arrays.toString(lines));
        System.out.println("Total Items: " + lines.length);
        */
        // Declaring variables + values for the array
        String[] fN = new String[lines.size()];         // First Name
        String[] lN = new String[lines.size()];         // Last Name
        Integer[] eG = new Integer[lines.size()];       // Exam Grades ( # )
        Character[] lG = new Character[lines.size()];   // Letter Grades ( A - F )
        // Reads every line >> Splits into types >> Stores data values
        for (int i = 0; i < lines.size(); i++) {
            // Get & Split Lines
            String str = lines.get(i);
            String[] stringS = str.split(" ");
            // Storage
            fN[i] = stringS[0];
            lN[i] = stringS[1];
            eG[i] = Integer.parseInt(stringS[2]);
        }
        // Declaring variables needed
        double avg = getMean(eG);         	// Average / Mean
        int top = getMax(eG);              	// Top Exam Grade
        lG = calculateLetterGrade(eG);  	// Letter Grade
        // Top Exam Grade
        for (int i = 0; i < eG.length; i++) {
            if (top == eG[i])
                System.out.println("Top Scorer: " + fN[i] + " " + lN[i] + " :: " + eG[i] + " :: " + lG[i]);
        }
        // Standard Deviation
        double sD = calculateStdDev(eG, avg);
        System.out.println("Average Exam Grade: " + avg);
        System.out.println("Standard Deviation: " + sD);
        }
    // Letter Grades
    public static Character[] calculateLetterGrade(Integer[] zz) {
        Character[] cLg = new Character[zz.length];
        // If + Else If Conditions

        for (int i = 0; i < zz.length; i++) {
            if      (zz[i] < 60)
                cLg[i]='F';
            else if (zz[i] >= 60 && zz[i] < 69)
                cLg[i] = 'D';
            else if (zz[i] >= 70 && zz[i] < 79)
                cLg[i] = 'C';
            else if (zz[i] >= 80 && zz[i] < 89)
                cLg[i] = 'B';
            else if (zz[i] >= 90)
                cLg[i] = 'A';
        }
        return cLg;
    }
    // Top Grade
    public static Integer getMax(Integer[] zz) {
        Integer top = 0;
        // Highest Score
        for (int i = 0; i < zz.length; i++) {
            if(zz[i] > top)
                top = zz[i];
        }
        return top;
    }
    // Average / Mean
    public static Float getMean(Integer[] zz) {
        Integer sum = 0;
        // Sum / Amount = Average
        for (int i = 0; i < zz.length; i++)
            sum += zz[i];
        return (float)sum / (float)(zz.length);
    }
    // Standard Deviation 
    public static double calculateStdDev(Integer[] zz, double avg) {
        double sum = 0;
        // Multiplying the difference btwn the exam grades and average
        for (int i = 0; i < zz.length; i++) {
            sum += (zz[i] - avg) * (zz[i] - avg);
        }
        // Divide by the array's size
        sum /= zz.length;
        // Sqrt
        return Math.sqrt(sum);
    }
    // Stuff to read every line of the .txt file
    public static ArrayList<String> readFile(String file) {
        ArrayList<String> lineS = new ArrayList<>();
        try {
            // Create File & FileReader objects
            File f = new File(file);
            FileReader fR = new FileReader(f);
            // Use BufferedReader
            BufferedReader bR = new BufferedReader(fR);
                String line;
            // Read every line
            while((line = bR.readLine()) != null)
                lineS.add(line);
        }
        // Print any errors for any thrown exceptions
        catch (Exception e) {
            e.printStackTrace();
        }
        return lineS;
    }
    /* Additional Code on readString and readArray that I did not need b/c readFile was enough
    public static String readString(String file) {
        String text = "";
        try {
            Scanner s = new Scanner(new File(file));
            while (s.hasNextLine()){
                text = text + s.next() + " ";
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        return text;
    }
    public static String[] readArray(String file) {
        int rA = 0;
        try {
            Scanner s1 = new Scanner(new File(file));
            while (s1.hasNextLine()) {
                rA = rA + 1;
                s1.next();
            }
            String[] words = new String[rA];
            Scanner s2 = new Scanner(new File(file));
            for (int i = 0; i < rA; i = i + 1) {
                words[i] = s2.next();
            }
            return words;
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        return null;
    }
    */
}