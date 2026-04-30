// CSE 110     : <Class #> / <meeting days and times>
// Assignment  : <assignment #>
// Author      : <name> & <studentID>
// Description : you must write a program to compute the materials and costs required for a specified road construction project.

import java.util.Scanner;

public class Assignment02 {
    
    
    
    
    
    
    static double decimal(double amountTruckloads){
		int dd = (int)amountTruckloads;
		amountTruckloads -=dd;
		return amountTruckloads;
	}

    static double round(double roundedNum) {
        if (decimal(roundedNum) > .00 ) {
            double number = 1 - decimal(roundedNum);
            roundedNum +=  number;
        }

        return roundedNum;
    }

    
    static double roundDown(double roundedNum) {
        return roundedNum - decimal(roundedNum);
    } 

    // if (decimal(amountTruckloads) > .00 ) {
    //     double number = 1 - decimal(amountTruckloads);
    //     finalTruck =  number + amountTruckloads;
    // } else {
    //     finalTruck = amountTruckloads;
    // }
    
    
    public static void main(String[] args) {
        /////////////////////////////////////////////////////////////////////   
        // Variables
        /////////////////////////////////////////////////////////////////////  
        int lanes;
        int days;
        double depth;
        double roadLength;

        int amountWage =        25; 
        int asphaltWeight =     150;  
        int costAsphalt =       200; 
        int costLight =         25000;
        int costPipe =          500;
        int feetInMile =        5280;
        int pipeLength =        24;  
        int roadLaneWidth =     12;
        int truckCapacityLBS =  10000; 
        int truckCapacityTons = 5; 
        int workDayHours =      8;

		Scanner keyboard = new Scanner(System.in);


        /////////////////////////////////////////////////////////////////////   
        // Inputs
        /////////////////////////////////////////////////////////////////////  
        System.out.print("Length of road project (miles) : ");
        roadLength = keyboard.nextDouble();
        System.out.print("Number of lanes : ");
        lanes = keyboard.nextInt(); 
        System.out.print("Depth of asphalt (inches) : ");
        depth = keyboard.nextDouble();
        System.out.print("Days to complete project : ");
        days = keyboard.nextInt();
       
        
        /////////////////////////////////////////////////////////////////////   
        // Logic
        ///////////////////////////////////////////////////////////////////// 
        double roadLengthInFeet = feetInMile * roadLength;               
        double pipePerMile = roadLengthInFeet / pipeLength; 
        double totalCubicFeet = roadLengthInFeet * (roadLaneWidth * lanes) * (depth / 12);
        double amountTruckloads = (totalCubicFeet * asphaltWeight) / truckCapacityLBS;

        // Amount
        double amountCrew = (50 * roadLength * lanes) / days;
        double amountLights = (2 + lanes) * roundDown(roadLength);       

        // Totals
        double totalCostAsphalt = round(amountTruckloads) * truckCapacityTons * costAsphalt;
        double totalCostLabor = amountWage * workDayHours * days * amountCrew;
        double totalCostLight = costLight * amountLights;
        double totalCostPipes =  pipePerMile * costPipe;
        double totalCostProject = totalCostAsphalt  + totalCostLight + totalCostPipes + totalCostLabor;

        /////////////////////////////////////////////////////////////////////   
        // Outputs
        /////////////////////////////////////////////////////////////////////   
        System.out.println("=== Amount of materials needed ===");
        System.out.println("Truckloads of Asphalt : " + round(amountTruckloads));
        System.out.println("Stoplights : " + amountLights);
        System.out.println("Conduit pipes : " + pipePerMile);
        System.out.println("Crew members needed : " + round(amountCrew));
        System.out.println("=== Cost of Materials ============");
        System.out.println("Cost of Asphalt : $" + totalCostAsphalt);
        System.out.println("Cost of Stoplights : $" + totalCostLight);
        System.out.println("Cost of Conduit pipes : $" + totalCostPipes);
        System.out.println("Cost of Labor : $" + totalCostLabor); 
        System.out.println("=== Total Cost of Project ========");
        System.out.println("Total cost of project : $" + totalCostProject);
    }

}
//////////////////////////////////////////////////////////////////////////////////////////
// Length of road project (miles) : 2.75
// Number of lanes : 3
// Depth of asphalt (inches) : 12
// Days to complete project : 30

// Expected Output
// === Amount of materials needed ===
// Truckloads of Asphalt : 7841
// Stoplights : 10
// Conduit pipes : 605
// Crew members needed : 14
// === Cost of Materials ============
// Cost of Asphalt : $7841000.00
// Cost of Stoplights : $250000.00
// Cost of Conduit pipes : $302500.00
// Cost of Labor : $84000.00
// === Total Cost of Project ========
// Total cost of project : $8477500.00
//////////////////////////////////////////////////////////////////////////////////////////




//////////////////////////////////////////////////////////////////////////////////////////
// Length of road project (miles) : 3
// Number of lanes : 2
// Depth of asphalt (inches) : 18
// Days to complete project : 50

// Expected Output
// === Amount of materials needed ===
// Truckloads of Asphalt : 8554
// Stoplights : 12
// Conduit pipes : 660
// Crew members needed : 6
// === Cost of Materials ============
// Cost of Asphalt : $8554000.00
// Cost of Stoplights : $300000.00
// Cost of Conduit pipes : $330000.00
// Cost of Labor : $60000.00
// === Total Cost of Project ========
// Total cost of project : $9244000.00
//////////////////////////////////////////////////////////////////////////////////////////



//////////////////////////////////////////////////////////////////////////////////////////
// Length of road project (miles) : 1
// Number of lanes : 1
// Depth of asphalt (inches) : 1
// Days to complete project : 1

// Expected Output
// === Amount of materials needed ===
// Truckloads of Asphalt : 80
// Stoplights : 3
// Conduit pipes : 220
// Crew members needed : 50
// === Cost of Materials ============
// Cost of Asphalt : $80000.00
// Cost of Stoplights : $75000.00
// Cost of Conduit pipes : $110000.00
// Cost of Labor : $10000.00
// === Total Cost of Project ========
// Total cost of project : $275000.00

//////////////////////////////////////////////////////////////////////////////////////////