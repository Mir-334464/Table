/*class Table
{

  public static void main(String[]args)
     {

      int i ,j;

for(i=1; i<=10; i++)
 
  {
System.out.println("\t\t\t");
    for(j=1; j<=5; j++)

          System.out.print(i*j+" ");
         System.out.println();
        }

   }
}*/

/*class Table

{

  public static void main(String[]args)

      {

     int i=1;
while(i<=10)

  {

      int j=1;
     while(j<=5)
       {

         System.out.print(i*j+" ");
       j++;
      }
System.out.println();
    i++;
    }
  }
}*/

class Table

{

  public static void main(String[]args)

      {

     int i=1;
do

  {

      int j=1;
    do
       {

         System.out.print(i*j+" ");
       j++;
      } while(j<=5);
System.out.println();
    i++;

    }while(i<=10);
  }
}


