import java.util.Scanner;

public class DistanceConvert {
    public static void main(String[] args) {
        System.out.println("Welcome to Distance Converter -- By Jay" + "\n");
        
        System.out.println("Usable Units:" + "\n");
        System.out.println("Meters");
         System.out.println("Kilometer");
         System.out.println("Centimeter");
         System.out.println("Miles");
                           
        System.out.println("\n" + "Enter a number");

        double userNum;

        boolean valid;

        do {
            valid = true;
            Scanner Num1 = new Scanner(System.in);
            try {
                userNum = Num1.nextDouble();
                break;
            } catch (Exception a) {
                System.out.println("It should be a number!");
                valid = false;
            }
        } while(true);

        String Unit1;
        boolean Valid;
        boolean NewValid;

        
 	Scanner unit2 = new Scanner (System.in);
		  	  	String Unit2;			  	  
        System.out.println("Enter the unit of " + userNum);   
		  Scanner unit1 = new Scanner (System.in);		 
		  
		do {
		  Valid = true;  
		  	Unit1 = unit1.next();
		  	
		  if (Unit1.equalsIgnoreCase("meter")) {
		  	  	
		  	  System.out.println("\n" + "Enter a unit to be converted into");		  	  			  			 
		  	  	
		  	  do {	 		  	  		  	  
		  	  	NewValid = true; 
		  	  	Unit2 = unit2.next(); 			  	 
		  	  	 	  		  	  		  												  	  			  	 
		  	  	 if (Unit2.equalsIgnoreCase("meter")) {
		  	  	 	System.out.println("\n" + "Meter: " + userNum);
		  	  	 	System.out.println("Converted into Meter: " + userNum);
		  	  	 	break; 	
		  	  	 	} 
		  	  	 	else if (Unit2.equalsIgnoreCase("kilometer")) {
		  	  	 	         System.out.println("\n" + "Meter: " + userNum);
		  	  	 	         double Km = userNum / 1000.0d;
		  	  	 	         System.out.println("Converted to Kilometer: " + Km);
		  	  	 	         }
		  	  	 	         
		  	  	 else if (Unit2.equalsIgnoreCase("centimeter")) {
		  	  	 	        System.out.println("\n" + "Meter: " + userNum);
								 double Cm = userNum * 100d;
								 System.out.println("Converted to Centimeter: " + Cm);
		  	  	 	         }
		  	  	 	         
		  	  	 else if (Unit2.equalsIgnoreCase("miles")) {
		  	  	 	         System.out.println("\n" + "Meter: " + userNum);
		  	  	 	         double miles = userNum / 1609;
		  	  	 	         System.out.println("Converted to Miles: " + miles);
		  	  	 	         }		  	  	 	 	           
		  	  	 	         else  System.out.println("Enter a valid unit");
		  	  	 	        NewValid = false;
		  	  	 	         		  	  	
		  	  	 	         
		  	  	} while (NewValid == false);
		  	  	
		  	} else if (Unit1.equalsIgnoreCase("kilometer")) {		  		  
		  		  System.out.println("\n" + "Enter a unit to be converted into");
		  		 
		  		 do {
		  		 	NewValid = true;
		  		 	Unit2 = unit2.next();
		  		 	 if (Unit2.equalsIgnoreCase("meter")) {
		  		 	 	System.out.println("\n" + "Kilometer: " + userNum);
		  		 	 	double meter = userNum * 1000.0d;
		  		 	 	System.out.println("Converted to Meter: " + meter);
		  		 	 	break;
		  		 	 	
		  		 	 	}
		  		 	 	
		  		 	 	 else if (Unit2.equalsIgnoreCase("kilometer")) {
		  		 	 	   System.out.println("\n" + "Kilometer: " + userNum);
		  		 	 	   System.out.println("Converted to Kilometer: " + userNum);
		  		 	 	   break;
		  		 	 	   }
		  		 	 	   
		  		 	 	   else if (Unit2.equalsIgnoreCase("centimeter")) {
		  		 	 	   	
		  		 	 	   	System.out.println("\n" + "Kilometer: " + userNum);
		  		 	 	   	double centi = userNum * 100000.0d;
		  		 	 	   	System.out.println("Converted into Centimeter: " + centi);
		  		 	 	   	break;
		  		 	 		}
		  		 	 		
		  		 	 		else if (Unit2.equalsIgnoreCase("miles")) {
		  		 	 		  
		  		 	 		  System.out.println("\n" + "Kilometer: " + userNum);
		  		 	 		  double Miles = userNum / 1.609d;
		  		 	 		  System.out.println("Converted into Miles: " + Miles);
		  		 	 		  break;
		  		 	 		  }		  		 	 	   
		  		 	 	   else System.out.println("Enter a valid unit");
		  		 	 	NewValid = false;
		  		 	 	
		  		 	} while (NewValid == false);
		  		}    else if (Unit1.equalsIgnoreCase("centimeter")) {
		  			System.out.println("\n" + "Enter a unit to be converted into");
		  			  do {
		  					
		  					NewValid = true;
		  					Unit2 = unit2.next();
		  					 if (Unit2.equalsIgnoreCase("meter")) {
		  					 	System.out.println("\n" + "Centimeter: " + userNum);
		  					 	double meters = userNum / 100.0d;
		  					 	System.out.println("Converted to Meter: " + meters);
		  					 	break;
		  					 	}
		  					 	else if (Unit2.equalsIgnoreCase("kilometer")) {
		  					 	  System.out.println("\n" + "Centimeter: " + userNum);
		  					 	  double kilometers = userNum / 100000.0d;
		  					 	  System.out.println("Converted to Kilometer: " + kilometers);
		  					 	  break;
		  					 	   }
		  					 	   
		  					 	 else if (Unit2.equalsIgnoreCase("centimeter")) {
		  					 	  System.out.println("\n" + "Centimeter: " + userNum);
		  					 	  System.out.println("Converted to Centimeter: " + userNum);
		  					 	  break;
		  					 	  }  
		  					 	  
		  					      else if (Unit2.equalsIgnoreCase("miles")) {
		  					 		System.out.println("\n" + "Centimeter: " + userNum);
		  					 		 double miles = userNum / 160934.0d;
		  					 		 System.out.println("Converted to Miles: " + miles);     	
		  					      	} 
		  					 	  else System.out.println("Enter a valid unit");
		  					 	NewValid = false;
		  					 		  			  			  	
		  			  	} while (NewValid == false);
		  			} else if (Unit1.equalsIgnoreCase("miles")) {
		  					System.out.println("\n" + "Enter a unit to be converted into");
		  					
		  					do {
		  						NewValid = true;
		  						Unit2 = unit2.next();
		  						 if (Unit2.equalsIgnoreCase("meter")) {
		  						 	System.out.println("\n" + "Miles: " + userNum);
		  						 	double newMeter = userNum * 1609.0d;
		  						 	System.out.println("Converted to Meter: " + newMeter);
		  						 	break;
		  						 	
		  						 	} else if (Unit2.equalsIgnoreCase("kilometer")) {
		  						 		System.out.println("\n" + "Miles: " + userNum);
		  						 		double newKilo = userNum * 1.609d;
		  						 		System.out.println("Converted to Kilometer: " + newKilo);
		  						 		break;
		  						 		} else if (Unit2.equalsIgnoreCase("centimeter")) {
		  						 			System.out.println("\n" + "Miles: " + userNum);
		  						 			double newCenti = userNum * 160934.0d;
		  						 		  System.out.println("Converted to Centimeter: " + newCenti);
		  						 		   break;
		  						 		} else if (Unit2.equalsIgnoreCase("miles"))
		  						 		       System.out.println("\n" + "Miles: " + userNum);
		  						 		       System.out.println("Converted to Miles: " + userNum);                         
		  						} while (NewValid == false);		  					
		  					}  
		  					
		  	else {System.out.println("Enter a valid unit");
		  	 Valid = false;	
		  	 }
		  	 
		  }while (Valid == false);
    }
}