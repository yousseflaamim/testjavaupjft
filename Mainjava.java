import java.util.Scanner;

public class Mainjava {
    // method
    static void testprv(String name,int age ){

        System.out.println(name + " "+age);


    }
    static int printdata(int numb2,int numb3){
        return numb2*numb3;
    }
    public static void main(String[] args) {

        //methode return
        System.out.println(printdata(2,7));
      testprv("giu",23);
        // datatype variabel
        byte b =23;
        short l =4;
        int a =1;
        boolean q=true;
        char w ='h';
        String m ="mario";
        long e =12345;
        double k =1.2;
        System.out.println(w);

        //if else scanner
        Scanner verfemail= new Scanner(System.in);
         System.out.println("enter ur email");
        String email = verfemail.nextLine();
        System.out.println("enter ur pass");
        Scanner pass = new Scanner(System.in);
        int passw = pass.nextInt();
        if(passw==1234567|| email=="youssef@so.com"){
            System.out.println("you can logg in ur profill");
        }else {
            System.out.println("you are cant logga in ");
        }

         //switch calclut
        System.out.println("shosse number1");
        Scanner number1 = new Scanner(System.in);
        int num = number1.nextInt();
        System.out.println("chouse number2");
        Scanner number2= new Scanner(System.in);
        int num2 = number2.nextInt();
        System.out.println("chosse which process");
        Scanner model = new Scanner(System.in);
        String operater = model.nextLine();

        switch (operater){
            case "+":
                System.out.println(num+num2);
            case "-":
                System.out.println(num-num2);
            case "*":
                System.out.println(num*num2);
            default:
                System.out.println("ur chosse isnt correct");

        }
        //for loop

       String modelCars[]={"bmw","volvo","audi"};
     //   for (int i=0;i<modelCars.length;++i){
        for (String modelars: modelCars){
            System.out.println(modelars);
        }

        //while
        int y=1;
        while (y<=12){
            System.out.println(y);
            ++y;
        }
        //do while
       int contenere =1;
      do {System.out.println("Hello im youssef ");
           contenere++;
         }while (contenere <=10);
      //array opjk
      String [0] array =new String [5];
      array [1]="html";
      array[2]="c++";
      array[3]="js";
      array[4]="css";
     System.out.println(array [3]);
//try catch
     int [] number={1,3,7,9};
     try{
         System.out.println(number[2]);
      }catch(Exception error){}finally {System.out.println(number[3]);
      }
//class opjk
    Animle animle = new Animle ();
    animle.name="losi";
    animle.age=2;
    animle.type="dog";
    animle.explain();

    }

}
public class Animle{
String name;
Int age;
String color;
String type;
public void explain (){
System.out.println("is a nice animal");
}
    
}
//abstrac.............................................................
public abstract  class Form {
    public abstract void calculersurf();
    
    
//    ............................................................................
    public class Testfrom {
    public static void main(String[] args) {
        
        
        
        Cercle cercle = new Cercle(4);
        Carre carre=new Carre(2);
        carre.calculersurf();
        cercle.calculersurf();
    }
}
   // ..........................................................................
        public class Cercle extends Form{
    public  int rayon;
    public Cercle(int rayon){
        this.rayon=rayon;

    }
    @Override
    public void calculersurf() {
        System.out.println("le rayon is  "+Math.PI*rayon*rayon);

    }
}
//................................................................
    public class Carre extends Form{
    private  int cote;
    public Carre(int cote){
        this.cote=cote;
    }
    @Override
    public void calculersurf() {
        System.out.println("carre is "+cote*cote);

    }
}
  //  extande......................................................
    import java.util.ArrayList;

public class Payment {
    public static void main(String[] args) {
     Chef ali = new Chef("ali");
     Dricteur momr=new Dricteur("momr");
     ouvrier jamal=new ouvrier("jamal");
        ArrayList<Salarier>salariers=new ArrayList<>();
        salariers.add(ali);
        salariers.add(momr);
        salariers.add(jamal);
        for (Salarier salari:salariers
             ) {
            salari.afficheSalire();
        }
    }
}
    //..................................................................
    public class Salarier {
    double salaair;
  String name;
   public  Salarier(String name){
       this.name=name;
       this.salaair=salaair;

   }

    @Override
    public String toString() {
        return name;
    }
    public void afficheSalire(){
       System.out.println("sallire"+salaair+"nome "+name);
    }
}
//..................................................................
    public class Chef extends Salarier {

    public Chef(String name) {
        super(name);
        salaair=5000;
    }
}
//..................................
    public class ouvrier extends Salarier{
    public ouvrier(String name) {
        super(name);
        salaair=7000;
    }
}
//....................................................
    public class Dricteur extends Salarier{
    public Dricteur(String name) {
        super(name);
        salaair=6000;
    }
}


