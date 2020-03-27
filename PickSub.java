import java.util.Scanner;

public class PickSub
{
    //declaring variable needed
    String name;
    int n;
    String subArray[];
    Scanner scanner;
    String reverseSub[];
    int subjectComplexityPoints[];
    //mthods required

    public void firstState()
    {
        // this is a method to get the name and the no of subject that the user possess
        System.out.println("Please Enter Your name: ");
        scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Also Enter How many Subjects you have :");
        n = scanner.nextInt();

        System.out.println("Enter your all " + n + " subjects name :");

        subArray = new String[n];
        for(int i = 0; i < n; i++)
        {
            subArray[i] = scanner.next();
        }

        System.out.println("Your subjects are :");
        
        for(String s: subArray)
        {
            System.out.print(s + "\t");
        }
        System.out.print("\n");
    }

}

class PickSubDemo
{
    public static void main(String args[])
    {
        PickSub ps = new PickSub();
       ps.firstState();
    }
}