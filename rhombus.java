public class rhombus {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++)
        {
            // Inner loop to print space
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print(" ");
            }
            //Inner loop to print *
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
