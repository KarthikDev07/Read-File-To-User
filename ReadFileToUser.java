//A program that reads in a list of names and birthdays from a file and displays them to the user
import java.io.FileInputStream;
import java.util.Scanner;
public class ReadFileToUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
final String filename =sc.nextLine();
try{
    var myFiObj = new FileInputStream(filename);
    int myData;
    while( (myData = myFiObj.read()) != -1)
    {
        System.out.print((char)myData);
    }
}
catch(Exception e){
    System.out.println("File Read Error");
}
    }
}
