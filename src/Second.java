import java.util.Scanner;


//Question 1
public class Second {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the Name of student: ");
        String A=scanner.nextLine();
        System.out.println("enter the marks of student: ");
        int B=scanner.nextInt();
        if (B>=70) {
            System.out.println(A+" has Scored "+" First division");
        }
        else if(B>=50){
            System.out.println(A+" has Scored "+"Second division");
        }
        else if (B>=40){
            System.out.println(A+" has Scored "+"Third division");
        }
        else {
            System.out.println(A+" has Scored "+"Fail");
        }
    }
}

class Question2{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int A=scanner.nextInt();
        System.out.println("Enter the Second number: ");
        int B=scanner.nextInt();
        System.out.println("Enter the Third number: ");
        int C=scanner.nextInt();
        System.out.println("Enter the Fourth number: ");
        int D=scanner.nextInt();

        int Sum=A+B+C+D;
        System.out.println("The sun is "+Sum);

    }
}

class question3{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Marks of Maths: ");
        double A=scanner.nextDouble();
        System.out.println("Enter the Marks of English: ");
        double B=scanner.nextDouble();
        System.out.println("Enter the Marks of Nepali: ");
        double C=scanner.nextDouble();
        System.out.println("Enter the Marks of Science: ");
        double D=scanner.nextDouble();
        double sum = A+B+C+D;
        System.out.println("The total marks is "+ sum);
        double percent=sum/4;
        String result;
        result=(percent>70)? "First class": (percent>59)? "Upper Second class" :(percent>49)?
                "Second class":(percent>39)?"third class" :"fail";
        System.out.println(result);


    }
}

class question4{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int A=scanner.nextInt();
        System.out.println("Enter the second number: ");
        int B=scanner.nextInt();
        int sum =A+B;
        int product=A*B;
        System.out.println("The sum of given number is "+ sum);
        System.out.println("The product of given number is "+ product);
    }
}

class question5{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int A=scanner.nextInt();
        System.out.println("Enter the second number: ");
        int B=scanner.nextInt();
        float sum =A+B;
        float product=A*B;
//        float SUM=Integer.parseInt(sum);
        float Division=product/sum;
        System.out.println("The Answer is "+ Division);

    }
}

class question6{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length: ");
        double A=scanner.nextDouble();
        System.out.println("Enter the breadth: ");
        double B=scanner.nextDouble();
        double Area =A*B;
        System.out.println("The area of rectangle is "+ (int)Area);
    }
}
class question7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Name: ");
        String A = scanner.nextLine();
        System.out.println("Enter the roll number: ");
        int B=scanner.nextInt();
        System.out.println("Enter the Field of interest: ");
        scanner.nextLine();
        String C = scanner.nextLine();
        System.out.println("My name is "+A+ " and my roll number is "+B+" " +
                "and my field of interest is "+C+".");
    }
}

class question8{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System .in);
        System.out.println("Enter the length of square: ");
        float A=scanner.nextFloat();
        float Area=A*A;
        float perimeter=4*A;
        System.out.println("the area is "+Area);
        System.out.println("the perimeter is "+perimeter);


    }
}
class Simple{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the Principle: ");
        String A=scanner.nextLine();

        System.out.println("enter the Time: ");
        String B=scanner.nextLine();


        System.out.println("enter the Rate: ");
        String C=scanner.nextLine();

        int AA=Integer.parseInt(A);
        int Ab=Integer.parseInt(B);
        int Ac=Integer.parseInt(C);
        float SI=(AA*Ab*Ac)/100;
        System.out.println(SI);

    }
}
class AreaTriangle{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length: ");
        double length=scanner.nextDouble();
        System.out.println("Enter the breadth: ");
        double breadth  =scanner.nextDouble();
        double Area=(0.5)*(length*breadth);
        System.out.println(Area+" square cm");
    }
}

class Volumecube{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of cube: ");
        double length=scanner.nextDouble();
        double Volume=length*length*length;
        System.out.println("The volume of cube is "+ Volume);
    }
}

class Volumecuboid{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length: ");
        double length=scanner.nextDouble();
        System.out.println("Enter the breadth: ");
        double breadth  =scanner.nextDouble();
        System.out.println("Enter the height: ");
        double height  =scanner.nextDouble();

        double Volume= length*breadth*height;
        System.out.println("The volume of cuboid is "+ Volume);
    }
}

class question9{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        float  A= scanner.nextFloat();
        double Square =A*A;
        System.out.println("The square of "+A+" is "+ Square);
    }
}
class question10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Name: ");
        String A = scanner.next();
        System.out.println("Enter the Last Name: ");
        String B = scanner.next();
        System.out.println(A+" "+B);
    }
}
class question11{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int A=scanner.nextInt();
        System.out.println("Enter the Second Number: ");
        int B=scanner.nextInt();
        System.out.println("Enter the third Number: ");
        int C=scanner.nextInt();

        String check=((A==B)&&(A==C)) ?"All three are equal": (A==B)?"A and B are equal":(A==C)?"A and C are Equal":(B==C)?"B ans C are equal":"no thing is equal";
        System.out.println(check);
    }
}

class question12{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int A=scanner.nextInt();
        System.out.println("Enter the Second Number: ");
        int B=scanner.nextInt();
        System.out.println((A<B)&& (A<50));
    }
}

class question13{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first Marks : ");
        float A = scanner.nextFloat();
        System.out.println("Enter the Second Marks: ");
        float B = scanner.nextFloat();
        System.out.println("Enter the Second Marks: ");
        float C = scanner.nextFloat();
        float sum = A + B + C;
        System.out.println("the total marks is " + sum);
        float percent=sum/3;
        System.out.println("the percent scored is "+percent);
    }
}


