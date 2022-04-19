public class First {
    public static void main(String[] args) {
        int maths=9;
        int English=9;
        int Science=7;
        int Nepali=81;
        int Sum=maths+ English+Science+Nepali;
        int percent= Sum/4;
        System.out.println(percent + "%");
        if (percent>=70) {
            System.out.println("first Class");
        }else if(percent>59){
            System.out.println("Upper Second Class");
        }
        else if (percent>49){
            System.out.println("Second Class");
        }
        else if (percent>39){
            System.out.println("Third Class");
        }
        else{
            System.out.println("Fail");
        }
    }
}


// area of trianlge

class Area{
    public static void main(String[] args) {
        double length=20;
        double breadth=10;
        double Area=(0.5)*(length*breadth);
        System.out.println(Area+" square cm");
    }
}