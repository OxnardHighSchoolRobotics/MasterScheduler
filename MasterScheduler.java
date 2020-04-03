/*
Soph1	     Soph2	    Junior			
Soph2	     Soph1		         Junior		
PREP	     PREP	     PREP	 PREP	Soph2/Junior   Soph1
Senior	     Junior		        Soph2	Soph1	
Junior	     Senior	    Soph2	Soph1		
6th class	6th class	Soph1			         Soph2/Junior
Gerckens	Hanreader	Thomas	Science	Math	PE/Elective
*/

class QuickStart {
    public static String EnginPeriod1 = "Engineering Principles1";
    public static String EnginPeriod2 = "Engineering Principles2";
    public static String EnginPeriod4 = "Honors CAD";
    public static String EnginPeriod5 = "Honors Robotics";
    public static String EnginPeriod6 = "ComputerScienceP/A";
    
    public static String EngliPeriod1 = "English2-1";
    public static String EngliPeriod2 = "English2-2";
    public static String EngliPeriod4 = "English3";
    public static String EngliPeriod5 = "English4";
    public static String EngliPeriod6 = "???";

    public static String HistoPeriod1 = "History3";
    public static String HistoPeriod2 = "???";
    public static String HistoPeriod4 = "???";
    public static String HistoPeriod5 = "History2-2";
    public static String HistoPeriod6 = "History2-1";
    
    public static String ScienPeriod1 = "???";
    public static String ScienPeriod2 = "Physics";
    public static String ScienPeriod4 = "Science2-2";
    public static String ScienPeriod5 = "Science2-1";
    public static String ScienPeriod6 = "???";
    
    public static String MathePeriod1 = "???";
    public static String MathePeriod2 = "Physics";
    public static String MathePeriod4 = "Science2-2";
    public static String MathePeriod5 = "Science2-1";
    public static String MathePeriod6 = "???";
    
    public static String ElectivePeriod3 = "???";
    public static String MathePeriod2 = "Physics";
    public static String MathePeriod4 = "Science2-2";
    public static String MathePeriod5 = "Science2-1";
    public static String MathePeriod6 = "???";

    public static String AOEDPREP = "AOEDPREP";

    public static void main(String[] args) {
        printScheduler();
    }

    public static void printScheduler(){
        printEngineering(); 
        printEnglish();
        printHistory();
        printScience();
        printMath();
    }

    public static void printEngineering(){
        System.out.println("Engineering");
        System.out.println("Period 1: " + EnginPeriod1);
        System.out.println("Period 2: " + EnginPeriod2);
        System.out.println("Period 3: " + AOEDPREP);
        System.out.println("Period 4: " + EnginPeriod4);
        System.out.println("Period 5: " + EnginPeriod5);
        System.out.println("Period 6: " + EnginPeriod6);
    }
    public static void printEnglish(){
        System.out.println("\nEnglish");
        System.out.println("Period 1: " + EngliPeriod1);
        System.out.println("Period 2: " + EngliPeriod2);
        System.out.println("Period 3: " + AOEDPREP);
        System.out.println("Period 4: " + EngliPeriod4);
        System.out.println("Period 5: " + EngliPeriod5);
        System.out.println("Period 6: " + EngliPeriod6);
    }
    public static void printHistory(){
        System.out.println("\nHistory");
        System.out.println("Period 1: " + HistoPeriod1);
        System.out.println("Period 2: " + HistoPeriod2);
        System.out.println("Period 3: " + AOEDPREP);
        System.out.println("Period 4: " + HistoPeriod4);
        System.out.println("Period 5: " + HistoPeriod5);
        System.out.println("Period 6: " + HistoPeriod6);
    }
    public static void printScience(){
        System.out.println("\nScience");
        System.out.println("Period 1: " + ScienPeriod1);
        System.out.println("Period 2: " + ScienPeriod2);
        System.out.println("Period 3: " + AOEDPREP);
        System.out.println("Period 4: " + ScienPeriod4);
        System.out.println("Period 5: " + ScienPeriod5);
        System.out.println("Period 6: " + ScienPeriod6);
    }
    public static void printMath(){
        System.out.println("\nMath");
        System.out.println("Period 1: " + MathePeriod1);
        System.out.println("Period 2: " + MathePeriod2);
        System.out.println("Period 3: " + AOEDPREP);
        System.out.println("Period 4: " + MathePeriod4);
        System.out.println("Period 5: " + MathePeriod5);
        System.out.println("Period 6: " + MathePeriod6);
    }
}