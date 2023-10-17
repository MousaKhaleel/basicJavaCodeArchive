package study;
//import java.util.Scanner;//important
//import java.util.Date;
//import java.util.Random;
import java.util.*;
import java.util.ArrayList; 
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.math.BigInteger;  
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class Study /*<E>*/ {  
    public static void main(String[] args) throws FileNotFoundException, IOException, SQLException, InterruptedException /*throws IOException*/ {
        Scanner input=new Scanner(System.in);
oop();
java();

ArrayList n=new ArrayList();
n.add(1);
n.add("th");
Object x=1;
        System.out.println(x.equals(3));
        
    }
    
    public static void oop(){
              /*
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to java\n\n"+(double) 5/2+"\nwelcome back");
        double r,e;
        System.out.println("enter radus");
        r=input.nextDouble();
            final double PI=3.1314;
       e=r*r*PI;
               System.out.println("crcle\n" + r+" \n"+e);
//and i tested the comment feature
    double k,l;
    k=input.nextDouble();
    l=input.nextDouble();
    System.out.println((k+l) + " "+ k*l);
          System.out.println(Math.pow(3,5));
          System.out.println(java.lang.System.currentTimeMillis());
          int c,b;
          c=input.nextInt();
          b=input.nextInt();
          System.out.println(c +" "+ b);*/
    
  /*  int x,y;
    x=input.nextInt();
    y=input.nextInt();
    if(y>x){
        int s;
        s=y;
        y=x;
        x=s;
    }
    System.out.println(x-y);
    */
  
/*  int s=5;
  double d=6.456;
  
        System.out.printf("the people %3d amout is %.1f", s,d);
        System.out.println();
  
  


System.out.printf("%6s","rum" );
        System.out.println();
  
String s="hi";

System.out.printf("%6s",s);
        System.out.println();

  
  double x=System.currentTimeMillis()/1000;
  if (x>2);
        System.out.println(x%60);

         Circle c1 = new Circle();
    System.out.println("The area of the circle of radius "
      + c1.radius + " is " + c1.getArea());
    
   
    System.out.println("The area of the circle of radius "
      + c2.radius + " is " + c2.getArea());
    
    Circle c3 = new Circle(125);
    System.out.println("The area of the circle of radius "
      + c3.radius + " is " + c3.getArea());
    
    c2.radius = 100; // or c2.setRadius(100)
    System.out.println("The area of the circle of radius "
      + c2.radius + " is " + c2.getArea());    
     Circle c2 = new Circle();
        System.out.println(c2.setRadius(300)+ c2.getArea());
    Student s = new Student();
    System.out.println("name? " + s.name); 
    System.out.println("age? " + s.age); 
    System.out.println("isMajor? " + s.isMajor); 
    System.out.println("gender? " + s.gender); 


Date clock=new Date();
        System.out.println(clock);
        Random randy=new Random();
        System.out.println((char)randy.nextInt(100));
        System.out.println((char)randy.nextInt(100));

//System.out.println("Before creating objects");
//  System.out.print();
  Circle c1 = new Circle();
  Circle c2 = new Circle();
  Circle c3 = new Circle();
    System.out.println("Number of Circle objects is "+Circle.getNumberOfObjects());
  Circle c4 = new Circle();
  Circle c5 = new Circle(6);
  Circle c6 = new Circle();
  System.out.println("Number of Circle objects is "+Circle.getNumberOfObjects());
  
    Circle c = new Circle(5.0);
    System.out.println("The area of the circle of radius "
      + c.getRadius()+" is "+c.getArea());

    c.setRadius(2.0);
    System.out.println("The area of the circle of radius "
      + c.getRadius()+" is "+c.getArea());
    
    System.out.println("The number of objects created is "
      + Circle.getNumberOfObjects());






  //  Scanner input = new Scanner(System.in);
    System.out.print("Enter annual interest rate, for example, 8.25: ");
    double ar = input.nextDouble();
    System.out.print("Enter number of years as an integer: ");
    int yr = input.nextInt();
    System.out.print("Enter loan amount, for example, 120000.95: ");
    double am =  input.nextDouble();
    Loan loan = new Loan(ar, yr, am);
    System.out.println("The loan was created on "+ loan.getLoanDate().toString());    
    System.out.println("The monthly payment is "+ loan.getMonthlyPayment());    
    System.out.println("The total payment is "+ loan.getTotalPayment());


String a=new String("welcome pal");

        System.out.println(a);

 Scanner in = new Scanner(System.in);
 Time t = new Time();
        t.setTime(16, 15, 30);
 
 System.out.print("Lunch time at : ");
        t.getTime();
 t.elprinto();
Time t1 = new Time();
        t1.setTime(16444444, 15, 30);
         t1.getTime();
t1.elprinto();
        System.out.println(t);

Circle c = new Circle(1);
    System.out.println("A circle "+ c.toString());
    System.out.println("The color is "+ c.getColor());
    System.out.println("The radius is "+ c.getRadius());
    System.out.println("The area is "+ c.getArea());
    System.out.println("The diameter is "+ c.getDiameter());
    
    Rectangle r = new Rectangle(2, 4);
    System.out.println("\nA rectangle "+ r.toString());
    System.out.println("The area is "+ r.getArea());
    System.out.println("The perimeter is "+ r.getPerimeter());

eltesto j=new eltesto();
        System.out.println(j.getSars());

    // Create and initialize two objects
    Object o1 = new Circle(1);
    Object o2 = new Rectangle(1, 1);

    // Display circle and rectangle
    displayObj(o1);
    displayObj(o2);
  }
  public static void displayObj(Object obj) {
    if (obj instanceof Circle) {
      System.out.println("The circle area is "+
                                        ((Circle)obj).getArea());
      System.out.println("The circle diameter is "+
                                    ((Circle)obj).getDiameter());
    }
    else if (obj instanceof Rectangle) {
      System.out.println("The rectangle area is "+
                                     ((Rectangle)obj).getArea());
    }

try{
    System.out.print("Enter two integers: ");
    int n1 = input.nextInt();
    int n2 = input.nextInt();
    System.out.println(n1+" / "+n2+" is "+youwontpass(n1,n2));
}catch(ArithmeticException elexepto){
    System.out.println("you got cought mr exception");
}catch(IllegalArgumentException elpaso){
    System.out.println("boss said no 5/2 for snitches");
}catch(Exception bruh){
    System.out.println("so thats why you are here");
}finally{
    System.out.println("congrets if nyou unlocked the secret ending");
}

int[] list = {1, 4, 4, 2, 5, -3, 9, 2};
  int i = linearSearch(list, 4);  // returns 1
  int j = linearSearch(list, 7);  // returns -1
  int k = linearSearch(list, 9);  // returns 6
System.out.println(i);
System.out.println(j);
System.out.println(k);


Student s = new Student();
    System.out.println("name? " + s.name); 
    System.out.println("age? " + s.age); 
    System.out.println("isMajor? " + s.isMajor); 
    System.out.println("gender? " + s.gender); 

try{
Student s1=new Student(101,"Rami","Zarqa"); 
 Student s2=new Student(102,"Fares","Jarash"); 
 System.out.println(s1);//compiler writes here s1.toString() 
 System.out.println(s2);//compiler writes here s2.toString() 
 Student s3=new Student(100,"Fares","Jarash"); 
 System.out.println(s1);
}catch(Exception eb){
    System.out.println(eb);
}finally{
    System.out.println("Fin...or not");
}

        System.out.println("test");
System.out.println("test");
System.out.println("test");
System.out.println("that was teasty...");


try { 
 System.out.println("Inside try block"); 
 int data=25/0; 
 System.out.println(data); 
 } 
 catch (ArithmeticException e){ 
 System.out.println("Exception handled"); 
 System.out.println(e); 
 } 
 finally { 
 System.out.println("finally block is always executed"); 
 } 
 System.out.println("rest of the code..."); 
 

boolean x=true;
   boolean     y=!false;
        System.out.println(!(x&&y));

String str="12.3";
        System.out.println(str.charAt(2));
String bar="165";
        System.out.println(bar.charAt(2));
double mar= Double.parseDouble(str) + Integer.parseInt(bar) ;
        System.out.println(mar);

String maar= str + bar ;
        System.out.println(maar);

BigInteger bint = new BigInteger("100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");   
        System.out.println(bint);

int w=0;
        System.out.println( ++w +" " + w++);


int ae[]= new int[5];

for(int x:ae)
    ae[x]=input.nextInt();

for(    int var:ae)
    System.out.println(var);
    }
    
    
    
    
    
    
    
    
    
    
    
//    public void spam(E [] a){
//        for (int i = 0; i < a.length; i++) {
//            System.out.println("its more than a feeling when i here that old song they used to play");
//            
//        }
//        System.out.println("oh and here is your array");
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
//    }
    
    
    
    

    
    
    
    
    
    
    
    


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static String[] myRemove(String p[]){
        for (int i = 0; i < p.length; i++) {
            p[i]="";
        }
              return p; 


                                    //        for (int i = 0; i < p.length; i++)  //            //            return p[i];}
  }



    
    
    
    
    
    
    


public static int linearSearch(int[] list, int key) {
  for (int i = 0; i < list.length; i++)
    if (key == list[i])
      return i;
  return -1;
}



public static int youwontpass(int yumme , int monch) throws Exception{
    if(yumme ==5 && monch==2)
        throw new IllegalArgumentException("wont pass pal");
    else return yumme/monch;
                





    
}



int f2(){
    return f1();
}

int f1(){
    return 5;
}


static class priNo implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println(i);
            }
        }
    
}
    
    static class priA implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println("a");
            }
        }
        
    }











static class Student  { 
int no; 
String name; 
String city; 
Student(int no, String name, String city) throws IllegalArgumentException { 
this.no=no; 
this.name=name; 
this.city=city; 
if (no==100){
    throw new IllegalArgumentException ("not this time");

}
}
public String toString(){
    return "take on me";
}
}


/*
static class Student {
  String name; // name has default value null
  int age; // age has default value 0
  boolean isMajor; // isMajor has default value false
  char gender; // c has default value '\u0000'
}
*/


 class Time {
 private int Hour;
 private int Minute;
 private int Second;
 
 public int setTime(int Hour, int Minute ,int Second){
     this.Hour= Hour;
    this.Minute= Minute;
    this.Second= Second;
    return Hour+Minute+Second;
 }
 public void getTime(){
     System.out.println(Hour + " " +Minute +" "+ Second);
 }
 
 public void elprinto(){
     System.out.println(Hour + " " +Minute +" "+ Second);
     
 }

 public String toString(){
     return Hour + " " +Minute +" "+ Second;
 };
}
}
    
    public static void java(){
        /*
        Scanner input=new Scanner(System.in);
ArrayList<String> string =new ArrayList<>();

string.add("ahmad");
string.add("wq3tr");
string.add("er");
string.add("yjyt");
string.add("wr3hgdf");
        System.out.println(string.contains("a*."));
        System.out.println(string);*/
/*

ArrayList<String> string =new ArrayList<>();

string.add("ahmad");
string.add("wq3tr");
string.add("er");
string.add("yjyt");
string.add("wr3hgdf");
string.clear();
    for(var i:string){
        System.out.println(string);
    }
    String []y={"4w","trae","atr","tare"};
        myRemove(y);
        for (int i = 0; i < 4; i++) {
            
        
        System.out.print(y[i]);
        }
        
        
        
        
        h ob=new overrider();
        
        System.out.println(ob.gethit());
        
        String st;
        
        System.out.println( st="yfgg");
        
        char[] g={'t','f'};
        String c=new String(g);
        System.out.println(c);
//        String j=g;
        
        String f="3fmea";
        System.out.println(f.charAt(0)==3);
//        signed int g =6;

        System.out.println("enter email");
String email=input.nextLine();
        System.out.println(email.substring(email.indexOf('@')+1,email.indexOf('.',email.indexOf('@')+1)));
*/

        /*
        String a="sej jesri sojs gsoj";
        String [] arr=a.split(" ");
        System.out.println(arr[0].length());
        
        
        String dg="   books  are fine  ";
        System.out.println(dg.trim());
        System.out.println(dg.replace("ar","br"));
        
        
        Integer x=4;
        */
        /*
        ArrayList<Integer> st =new ArrayList<>();
        st.add(6);
        st.add(7);
        st.add(4);
        int h=st.set(1, 3);
        
        
        int s=st.size();
        
        System.out.println(st);
        boolean j= st.remove(new Integer(4));
        System.out.println(h);
        System.out.println(j);
        System.out.println(st);
        */
        
        /*
        File objF1=new File("C:\\Users\\mousa\\OneDrive\\Documents\\test filz.txt");
        File objD1=new File("C:\\Users\\mousa\\OneDrive\\Documents\\trest file c");
        File objF2=new File("test file.txt");
        System.out.println(objF2.isFile());
        System.out.println(objF1.lastModified());
        System.out.println(objF1.length());
        String [] hh=objD1.list();
        for (int i = 0; i < hh.length; i++) {
            System.out.println(hh[i]);
        }
        File objD2=new File("C:\\Users\\mousa\\OneDrive\\Documents\\trest file c\\created directory");
        System.out.println(objD2.mkdir());
        File objF3=new File("C:\\Users\\mousa\\OneDrive\\Documents\\trest file c\\created file.txt");
        try{
        System.out.println(objF3.createNewFile());
        }catch(IOException e){System.out.println("problem");}
        for (int i = 1; i <= 100; i++) {
            File holder=new File(objD2 , i + ".pdf");
            try {
                holder.createNewFile();
            } catch (IOException ex) {System.out.println("error");}
        }
        File[] farr= objD2.listFiles();
        for (int i = 0; i < farr.length; i++) {
            System.out.println(farr[i].getName());
        }
        int numOfFiles=0;
        for (int i = 0; i < farr.length; i++) {
            if(farr[i].isFile())
                numOfFiles++;
        }
        System.out.println("num "+numOfFiles);
        */
        /*
        
        String test="welcome to jatova";
        System.out.println(test.indexOf("t", 9));
        System.out.println(test.replace('o', 'e'));
        System.out.println(test.replaceFirst("o", "as you are"));
        System.out.println(test.replaceAll("o", "as you are"));
        System.out.println(test.replaceAll("[oe]", "as you are"));
        System.out.println(test.replaceFirst("[oe]", "as you are"));
        String[] splited = test.split("[to]");
        for (int i = 0; i < splited.length; i++) {
            System.out.println(splited[i]);
        }
        System.out.println(test.matches("we.*"));
        System.out.println(test.matches(".*come.*"));
        String no="043-821-343-24";
        System.out.println(no.matches("\\d{3}-\\d{3}-\\d{3}-\\d{2}"));
        char[] to=test.toCharArray();
        for (int i = 0; i < to.length; i++) {
            System.out.println(to[i]);
        }
        char[] vic={'a','b','c','d','e','f','g','h','i','j','k','l'};
        String str="ii wontt be replaced";
        str.getChars(2, 5, vic, 4);
        for (int i = 0; i < vic.length; i++) {
            System.out.print(vic[i]);
        }
        System.out.println();
        ArrayList<String> mylis=new ArrayList<>();
        mylis.add("tr");
        mylis.add("tih");
        mylis.add("just");
        System.out.println(mylis.remove("tr"));
        
        for(String x:mylis)
        System.out.println(x);
        System.out.println(mylis);
        
        
        File myfile=new File("test file.txt");
        */
        /*
        ArrayList<String>rd=new ArrayList<>();
        rd.add("Dallas");
        rd.add("Dallas");
        rd.add("Houston");
        rd.add("Dallas");
        System.out.println(rd);
        for (int i =  rd.size(); i>=0 ; i--) {
            rd.remove("Dallas");
        }
        System.out.println(rd);
       */ 
        
//        File objF1=new File("C:\\Users\\mousa\\OneDrive\\Documents\\test filz.txt");
//        File objD1=new File("C:\\Users\\mousa\\OneDrive\\Documents\\trest file c");
//        File objF2=new File("test file.txt");
        /*
        FileInputStream reader=new FileInputStream(objF1);
//        for (int i = 0; i < objF1.length(); i++) {
//            System.out.print((char)reader.read());
//        }
        byte[] tar=new byte[(int)objF1.length()];
        reader.read(tar);
        reader.close();
                for (int i = 0; i < objF1.length(); i++) {
            System.out.print((char)tar[i]);
        }
        String str=new String(tar);
        System.out.println(str.toUpperCase());
        */
        /*
        FileOutputStream writer=new FileOutputStream(objF1,true);
        writer.write('g');
//        boolean flag=true;
//        char temp=65;
//        while(flag){
//            if (objF1.length() != 0)
//            temp=input.next().charAt((int)objF1.length());
//            if(temp=='E')
//                flag=false;
//            writer.write(temp);
//        }
        
        

String holder=input.nextLine();
//        for (int i = 0; i < holder.length(); i++) {
//            writer.write(holder.charAt(i));
//        }
        
byte[] holdarr=holder.getBytes();
writer.write(holdarr);
*/
  /*      
File objFi=new File("C:\\Users\\mousa\\OneDrive\\Documents\\el marks.txt");
FileOutputStream outer=new FileOutputStream(objFi);
String sName;
int mid,finalExam,howManyStudents;
byte[] aryer;
String holding;
        System.out.println("how manmy studnts");
        howManyStudents=input.nextInt();
        for (int i = 0; i <howManyStudents ; i++) {
            System.out.println("enter student name");
            sName=input.nextLine();
            sName=input.nextLine();
            System.out.println("enter student mid mark");
            mid=input.nextInt();
            System.out.println("enter student final mark");
            finalExam=input.nextInt();
            holding=sName+"\t"+mid+"\t"+finalExam+"\n";
            aryer=holding.getBytes();
            outer.write(aryer);
        }
*/

  
//  File objF1=new File("C:\\Users\\mousa\\OneDrive\\Documents\\test filz.txt");
//  Scanner reader=new Scanner(objF1);
//  
//  while(reader.hasNext()){
//      System.out.println(reader.nextLine());
//  }
  /*
File objFi=new File("C:\\Users\\mousa\\OneDrive\\Documents\\el marks.txt");  
Scanner reader=new Scanner(objFi);
        System.out.println("choose what you want: 1-name 2-mid 3-final");
int choise=input.nextInt()-1;
String[] sarr;
double count=0;
int total=0;
while(reader.hasNext()){
    sarr=reader.nextLine().split("\t");
    System.out.println(sarr[choise]);
    total+=Integer.parseInt(sarr[choise]);
    count++;
}
        System.out.println("avarge "+total/count);
*/

  /*
File objFi=new File("C:\\Users\\mousa\\OneDrive\\Documents\\el marks.txt");  
Scanner reader=new Scanner(objFi);
  
  while(reader.hasNext()){
      reader.next();
      System.out.println(reader.nextInt());
      System.out.println(reader.next());
  }
*/

  /*
  FileReader fr=new FileReader("C:\\Users\\mousa\\OneDrive\\Documents\\test filz.txt");
  BufferedReader reader=new BufferedReader(fr);
  int lineNum=0;
  while(reader.readLine()!=null){
      lineNum++;
  }
  fr=new FileReader("C:\\Users\\mousa\\OneDrive\\Documents\\test filz.txt");
  reader=new BufferedReader(fr);
  String[] lines=new String[lineNum];
          for (int i = 0; i < lineNum; i++) {
              lines[i]=reader.readLine();
            System.out.println(lines[i]);
        }
          reader.close();
          fr.close();
          /*
      /*    
    fr=new FileReader("C:\\Users\\mousa\\OneDrive\\Documents\\test filz.txt");
  reader=new BufferedReader(fr);
    ArrayList <String> liness=new ArrayList<>();
          for (int i = 0; i < lineNum; i++) {
              liness.add(reader.readLine());
            System.out.println(liness.get(i));
        }
  */
  /*
  //input=new Scanner(System.in);
        System.out.println("--------------------------");
    File objF1=new File("C:\\Users\\mousa\\OneDrive\\Documents\\test filz.txt");
  Scanner read=new Scanner(objF1);
  
  while(read.hasNext()){
      System.out.println(read.nextLine());
  }
        System.out.println("-------------------");
//        objF1=new File("C:\\Users\\mousa\\OneDrive\\Documents\\test filz.txt"); //no need
  read=new Scanner(objF1);
  while(read.hasNext()){
      System.out.println(read.nextLine());
  }
  */
  /*
  FileWriter fw=new FileWriter("C:\\Users\\mousa\\OneDrive\\Documents\\test filz.txt",true);
  PrintWriter writer=new PrintWriter(fw);
  writer.println();
  writer.println("this line is brought to you by the FileWriter and PrintWriter gang");
  writer.close();//or fw.close()
  */
  
  //JOptionPane.showMessageDialog(null, "congreats on your progress...now it\'s time to move to intelij...");
  
  /*
  Connection con= DriverManager.getConnection("jdbc:derby://localhost:1527/stdy","stdy","stdy");
  Statement st=con.createStatement();
  ResultSet r=st.executeQuery("select * from myEmp");
  while(r.next()){
        System.out.print(r.getInt(4)+" ");
        System.out.print(r.getString(4)+" ");
        System.out.println(r.getString(3));
  }
  
  Connection con2=DriverManager.getConnection("jdbc:derby://localhost:1527/stdy","stdy","stdy");
  PreparedStatement ps =con2.prepareStatement("insert into myEmp (id,fname,lname,salary,position) values (?,?,?,?,?)");
  */
  /*
    PreparedStatement ps2 =con2.prepareStatement("update myEmp set salary=? where id=?");
  ps2.setInt(1, 80000);
  ps2.setInt(2, 104);//or nextInt
  ps2.executeUpdate();
  */
//  ps.setInt(1, 104);
//  ps.setString(2,"morello");
//  ps.setString(3, "salvatorie");
//  ps.setInt(4, 70000);
//  ps.setString(5, "don");
//  ps.executeUpdate();
  
//    ps.setInt(1, 105);
//  ps.setString(2,"ac");
//  ps.setString(3, "dc");
//  ps.setInt(4, 5000);
//  ps.setString(5, "hells bells");
//  ps.executeUpdate();
        

//String [] sa={"g","fsd"};
//Study s=new Study();
//s.spam(sa);
//
//Integer [] g={2,34,4,5,6,6,6,7};
//s.spam(g);
////int [] i={2,34,4,5,6,6,6,7};
////spam(i);//error

        
/*
genericClass mrG= new genericClass(2,4.8);
        System.out.println(mrG.getX());

        
        Runnable r1=new priNo();// or priNo instade of Runnable
        Runnable r2=new priA();
        
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        
        t1.start();
        //t1.sleep(5000);
        //t1.yield();
        //t2.setPriority(7);//defult is 5
        t2.start();

*/
    }


abstract class h{
    abstract int gethit();
}
class overrider extends h{
   @Override
   int gethit(){
        return 5;
    }
}
}