import java.util.Scanner;

class Q1{

 public static void main(String args[])
{
int size,min,max;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the Array:");
size=sc.nextInt();
int []a = new int[size];
for(int w=0;w<size;w++)
{
 System.out.println("Enter Value:");
a[w]=sc.nextInt();
}

min = a[0];
max = a[0];

for(int y=1;y<size;y++)
{
if(a[y]<min){

min=a[y];
}
if(a[y]>max){
max=a[y];
}
}

System.out.println("Maximum Value:"+max);
System.out.println("Minimum Value:"+min);

}
}