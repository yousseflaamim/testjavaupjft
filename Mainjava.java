import java.util.Scanner;

public class Mainjava {
    // method
    static void testprv(String name,int age ){

        System.out.println(name + " "+age);


    }
    static int printdata(int numb2,int numb3){
        return numb2*numb3;
    };
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

    }

}
