class noargs extends Exception
{int n;
noargs(int n)
{
this.n=n;
}
public String toString()
{
return n+"["+"NO COMMAND LINE ARGS"+"]";
}
}
class neg_args extends Exception
{int i;
neg_args(int x)
{
i=x;
}
public String toString()
{
  return i+"["+"NEG NUMBER"+"]";
}
}
class Student{
public static void main(String args[]) {
try {
	int len= args.length;
if(len==0)
{
throw new noargs(0);
}
System.out.println("STUDENT 1:");
System.out.println("USN:"+args[0]);
System.out.println("Name:"+args[1]);
System.out.println("Marks1:"+args[2]);
System.out.println("Marks2:"+args[3]);
System.out.println("Marks3:"+args[4]);
System.out.println("STUDENT 2:");
System.out.println("USN:"+args[5]);
System.out.println("Name:"+args[6]);
System.out.println("Marks1:"+args[7]);
System.out.println("Marks2:"+args[8]);
System.out.println("Marks3:"+args[9]);

int a=Integer.parseInt(args[2]);
int x=Integer.parseInt(args[7]);
int y=Integer.parseInt(args[8]);
int z=Integer.parseInt(args[9]);
if(a<0)
{
throw new neg_args(a);
}
int b=Integer.parseInt(args[3]);
if(b<0)
{
throw new neg_args(b);
}
int c=Integer.parseInt(args[4]);
if(c<0)
{
throw new neg_args(c);
}
if(x<0||y<0||z<0)
{
	throw new neg_args(-1);
}
}

catch(noargs e) {
System.out.println(e);
}
catch(neg_args e)
{
System.out.println(e);
}
}
}