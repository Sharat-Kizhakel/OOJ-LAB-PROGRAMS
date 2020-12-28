import java.util.Scanner;
import java.util.Arrays;

class Cmd_sorted
{
    public static void main(String args[])
    {
        Scanner ss=new Scanner(System.in);
        double arr_cmd[]=new double[args.length];
        int l=args.length;
        System.out.println("The Commandline Arguments are:");
        for(int i=0;i<l;i++)
        {
            System.out.print(" "+args[i]);
            arr_cmd[i]=Double.parseDouble(args[i]);
        }
		double t;
       for(int i=0;i<l;i++)
       {
		for(int j=1;j<(l-i);j++)
		{
		if(arr_cmd[j-1]>arr_cmd[j])
		    {
		t=arr_cmd[j-1];
		arr_cmd[j-1]=arr_cmd[j];
		arr_cmd[j]=t;
		    }
		}
           
       }
	   System.out.println(" ");
	   for(int i=0;i<l;i++)
	   {
	    System.out.print(" "+arr_cmd[i]);
	   }
    }
}