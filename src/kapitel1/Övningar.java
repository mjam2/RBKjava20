package kapitel1; // Den här raden berättar att denna Java-klass ligger i ett package med namnet kapitel1

public class Övningar { // Här börjar Java-klassen Övningar. Klassnamnet måste vara samma som filnamnet.

    public static void main(String[] args) { // Detta är main-metoden. Här börjar programmet köra om kompileringen går igenom.
        System.out.println("Kör övning 1.2:");
        övning1_2(); // Anrop till metoden övning1_2
        System.out.println("Kör övning 1.3:");
        övning1_3();
    }

    static void övning1_2() { // Det här är en metod med namnet övning1_2
        // TODO: Skriv ut Java och Visual Basic...
        System.out.println("Programmeringspråk");
        System.out.println();
        System.out.println("C++");
        System.out.println("Java");
        System.out.println("Visual Basic");
    }


    static void övning1_3() {
        // TODO: Skriv ut texten To be or not to be ...
        System.out.println( "\"To be or not to be, that is the question\".");
    }
}
