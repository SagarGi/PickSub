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

        // the subjects is supposed to be more than 2.
        while(n < 2)
        {
            System.out.println("No of subjects should be more than 2!!");
            System.out.println("Also Enter How many Subjects you have :");
            n = scanner.nextInt();
        }

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

    public void reverseSubjects()
    {
        // this is the second state where you compare each and every subjects with each other based on their complexity;

        //reversing the array
        reverseSub = new String[n];

        for(int i = 0; i < n; i++)
        {
            reverseSub[i] = subArray[n-1-i];
        }

        // System.out.println("\nYour reverserd subjects are :");

        // for(String s: reverseSub)
        // {
        //     System.out.print(s + "\t");
        // }
    }

    public void finalState()
    {
        firstState();
        reverseSubjects();

        //final stage
        subjectComplexityPoints = new int[n];
        for(int i = 0; i < n; i++)
        {
            subjectComplexityPoints[i] = 0;
        }

        int m = n-1;
        String ans;
        for(int i = 0; i < n; i++)
        { 
            for(int j = 0; j < m; j++)
            {
                
                System.out.println("\nWhich is complex between " + reverseSub[i] + " and " + subArray[j] + " ?");
                ans = scanner.next();
                // check if the user enter the correct subject or not
                
                while(!ans.equals(reverseSub[i]) && !ans.equals(subArray[j]))
                {
                    System.out.println("Ture");
                    System.out.println("Subject did not match. Please enter right subject!!");
                    System.out.println("\nWhich is complex between " + reverseSub[i] + " and " + subArray[j] + " ?");
                    ans = scanner.next();
                }

                if(ans.equals(subArray[j]))
                {
                    subjectComplexityPoints[j]++;
                }
                else
                {
                    subjectComplexityPoints[n-1-i]++;
                }
            }
            m = m -1;
        }

        System.out.println("The complexity points for the given subject for you is: ");
        for(int i = 0; i < n; i++)
        {
            System.out.println(subArray[i] + " = " + subjectComplexityPoints[i]);
        }

    }

}

class PickSubDemo
{
    public static void main(String args[])
    {
        PickSub ps = new PickSub();
        ps.finalState();
    }
}