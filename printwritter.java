import java.io.PrintWriter;
public class printwritter{
    public static void main(String args[]){
        PrintWriter pw=new PrintWriter(System.out);
        pw.println("Hello,World");
        pw.print("this is a");
        pw.print("print statement.");
        pw.close();
    }
}