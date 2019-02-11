import java.util.Scanner;

class Q3{

 public static void main(String args[])
{
int size,choice,ans=1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the Array:");
size=sc.nextInt();
int []a = new int[100];

for(int i=0;i<size;i++)
{
System.out.println("Enter Array Elements:");
a[i]=sc.nextInt();
}
System.out.println("1)Insert At Beginning\n2)Insert At End\n3)Delete At Beginning\n4)Delete At End\n5)Insert At Any Position\n6)Delete At Any position");
choice=sc.nextInt();

while(ans==1){

switch(choice)
{
case 1:
int temp;
System.out.println("Enter Value to be added:");
temp=sc.nextInt();
size++;
for(int i=size-1;i>0;i--)
{
a[i]=a[i-1];
}
a[0]=temp;
break;


case 2:
int temp;
System.out.println("Enter Value to be added:");
temp=sc.nextInt();
size++;
a[size-1]=temp;
break;

case 3:
for(int i=0;i<size;i++)
{
a[i]=a[i+1];
}
size--;
break;

case 4:
size--;
break;

case 5:






}
}