import java.util.*;

public class seatingChart1516 {
    int seat;
    
    int[] checkArray;
    
    String period;
    
    Scanner scanning = new Scanner(System.in);
    
    public Random rgen = new Random();
    
    public int NUMBER_OF_STUDENTS;
    
    public void setUp() {
        System.out.println("What is the period you want to make a seating chart for? ");
        period = scanning.nextLine();
        System.out.println("How many students are in the class? ");
        NUMBER_OF_STUDENTS = scanning.nextInt();
        scanning.nextLine();
        checkArray = new int[NUMBER_OF_STUDENTS];
        seats();
    }
    
    public void seats() {
        for (int element : checkArray) {
            element = 24;
        }
        int placeNumber = 0;
        while (placeNumber < NUMBER_OF_STUDENTS) {
            seat = rgen.nextInt(NUMBER_OF_STUDENTS) + 1;
            if (placeNumber == 0) {
                checkArray[placeNumber] = seat;
                placeNumber++;
                toName(seat);
                continue;
            }
            while (checkIfNumIsDoneBefore(placeNumber, seat) == false) {
                seat = rgen.nextInt(NUMBER_OF_STUDENTS) + 1;
            }
            checkArray[placeNumber] = seat;
            placeNumber++;
            toName(seat);
            if (placeNumber % 6 == 0) System.out.println();
        }
        System.out.println();
    }
    
    public boolean checkIfNumIsDoneBefore(int indexOfElement, int value) {
        for (int allElements = 0; allElements < indexOfElement; allElements++) {
            if (value == checkArray[allElements]) {
                return false;
            }
        }
        return true;
    }
    
    public void toName(int x) {
        if (period.equals("B")) {
            switch(x) {
                case 1: 
                    System.out.print("Emily      ");
                    break;
                case 2: 
                    System.out.print("Makenzie   ");
                    break;
                case 3: 
                    System.out.print("Bryanna    ");
                    break;
                case 4: 
                    System.out.print("Gina       ");
                    break;
                case 5: 
                    System.out.print("Sam        ");
                    break;
                case 6: 
                    System.out.print("Dom        ");
                    break;
                case 7: 
                    System.out.print("Ladd       ");
                    break;
                case 8: 
                    System.out.print("Alexis     ");
                    break;
                case 9: 
                    System.out.print("Liana      ");
                    break;
                case 10: 
                    System.out.print("Billy      ");
                    break;
                case 11: 
                    System.out.print("Jenny      ");
                    break;
                case 12: 
                    System.out.print("Caroline   ");
                    break;
                case 13: 
                    System.out.print("Stephen    ");
                    break;
                case 14: 
                    System.out.print("Nick       ");
                    break;
                case 15: 
                    System.out.print("Garrett    ");
                    break;
                case 16: 
                    System.out.print("Leah       ");
                    break;
                case 17: 
                    System.out.print("Jeffrey    ");
                    break;
                case 18: 
                    System.out.print("Luke       ");
                    break;
                case 19: 
                    System.out.print("Abby       ");
                    break;
                case 20: 
                    System.out.print("Shawn      ");
                    break;
                case 21: 
                    System.out.print("Adam       ");
                    break;
                case 22: 
                    System.out.print("TJ         ");
                    break;
                case 23: 
                    System.out.print("Taylor     ");
                    break;
                case 24: 
                    System.out.print("Alyssa     ");
                    break;
                case 25: 
                    System.out.print("John       ");
                    break;
                case 26: 
                    System.out.print("Julia      ");
                    break;
                case 27: 
                    System.out.print("Lexi       ");
                    break;
                case 28:
                    System.out.print("Jess       ");
                    break;
            }
        }
        if (period.equals("C")) {
            switch(x) {
                case 1: 
                    System.out.print("Jonah      ");
                    break;
                case 2: 
                    System.out.print("EmilyB     ");
                    break;
                case 3: 
                    System.out.print("Brian      ");
                    break;
                case 4: 
                    System.out.print("Nick       ");
                    break;
                case 5: 
                    System.out.print("Nathan     ");
                    break;
                case 6: 
                    System.out.print("Sean       ");
                    break;
                case 7: 
                    System.out.print("Jon        ");
                    break;
                case 8: 
                    System.out.print("EmilyC     ");
                    break;
                case 9: 
                    System.out.print("Jack       ");
                    break;
                case 10: 
                    System.out.print("RyanG      ");
                    break;
                case 11: 
                    System.out.print("Ceilidh    ");
                    break;
                case 12: 
                    System.out.print("RyanK      ");
                    break;
                case 13: 
                    System.out.print("Grace      ");
                    break;
                case 14: 
                    System.out.print("Kelsey     ");
                    break;
                case 15: 
                    System.out.print("Jay        ");
                    break;
                case 16: 
                    System.out.print("Julia      ");
                    break;
                case 17: 
                    System.out.print("Ally       ");
                    break;
                case 18: 
                    System.out.print("Lily       ");
                    break;
                case 19: 
                    System.out.print("EmilyS     ");
                    break;
                case 20: 
                    System.out.print("Rich       ");
                    break;
            }
        }
        if (period.equals("F")) {
            switch(x) {
                case 1: 
                    System.out.print("Jessie     ");
                    break;
                case 2: 
                    System.out.print("Emma       ");
                    break;
                case 3: 
                    System.out.print("Abbey      ");
                    break;
                case 4: 
                    System.out.print("Dylan      ");
                    break;
                case 5: 
                    System.out.print("Michelle   ");
                    break;
                case 6: 
                    System.out.print("AJ         ");
                    break;
                case 7: 
                    System.out.print("Danny      ");
                    break;
                case 8: 
                    System.out.print("Nicole     ");
                    break;
                case 9: 
                    System.out.print("Pat        ");
                    break;
                case 10: 
                    System.out.print("Sarah      ");
                    break;
                case 11: 
                    System.out.print("Ashley     ");
                    break;
                case 12: 
                    System.out.print("Alyssa     ");
                    break;
                case 13: 
                    System.out.print("Tom        ");
                    break;
                case 14: 
                    System.out.print("Kayla      ");
                    break;
                case 15: 
                    System.out.print("Becca      ");
                    break;
                case 16: 
                    System.out.print("Tadarius   ");
                    break;
                case 17: 
                    System.out.print("Tommy      ");
                    break;
                case 18: 
                    System.out.print("Alex       ");
                    break;
                case 19: 
                    System.out.print("Haylie     ");
                    break;
                case 20:
                    System.out.print("Aidan      ");
                    break;
                case 21:
                    System.out.print("Sean       ");
                    break;
                case 22:
                    System.out.print("Nathaniel  ");
            }
        }
        if (period.equals("G")) {
            switch(x) {
                case 1: 
                    System.out.print("Chris     ");
                    break;
                case 2: 
                    System.out.print("Georgia   ");
                    break;
                case 3: 
                    System.out.print("Stephany  ");
                    break;
                case 4: 
                    System.out.print("David     ");
                    break;
                case 5: 
                    System.out.print("Kat       ");
                    break;
                case 6: 
                    System.out.print("Brian     ");
                    break;
                case 7: 
                    System.out.print("SeanF     ");
                    break;
                case 8: 
                    System.out.print("Avery     ");
                    break;
                case 9: 
                    System.out.print("Jeremy    ");
                    break;
                case 10: 
                    System.out.print("Alyssa    ");
                    break;
                case 11: 
                    System.out.print("Taylor    ");
                    break;
                case 12: 
                    System.out.print("TJ        ");
                    break;
                case 13: 
                    System.out.print("Gavin     ");
                    break;
                case 14: 
                    System.out.print("Kevin     ");
                    break;
                case 15: 
                    System.out.print("Kristen   ");
                    break;
                case 16: 
                    System.out.print("Noah      ");
                    break;
                case 17: 
                    System.out.print("Spencer   ");
                    break;
                case 18: 
                    System.out.print("Julianne  ");
                    break;
                case 19: 
                    System.out.print("SeanR     ");
                    break;
                case 20: 
                    System.out.print("Jeff      ");
                    break;
                case 21:
                    System.out.print("Adam      ");
                    break;
                case 22:
                    System.out.print("Justin    ");
                    break;
                case 23:
                    System.out.print("Richie    ");
                    break;
            }
        }
    }
}