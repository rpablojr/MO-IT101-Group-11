/*package Java
import Java.util.Scanner

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;
import java.util.Scanner;
/**
 *
 * @author Robert
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates an object of scanner
        Scanner input = new Scanner(System.in);
        
        //For Employee Number
        System.out.print("Enter your Employee No: ");
        String EmpNo = input.nextLine();
        System.out.println("Employee No: " + EmpNo);
        
        //For Employee First Name
        System.out.print("Enter your First Name: ");               
        String FName = input.nextLine();      
        System.out.println("Employee First Name: " + FName);
        
        //For Employee Last Name
        System.out.print("Enter your Last Name: ");
        String LName = input.nextLine();
        System.out.println("Employee Last Name: " + LName);
        
        String Birthday = "September 14, 1993";
        String Address = "93/54 Shanahan Alley Apt. 183, Santo Tomas 1572 Masbate";
        String PhoneNumber = "070-766-300";
        String SSS = "2696476083";
        String PhilHealth = "26-9647608-3";
        
        String PagIBIGNumber = "218002473454";
        String TINumber = "210-805-911-000";
        String Status = "Regular";
        String Position = "Payroll Manager";
        String ImmediateSupervisor = "Crisostomo, Jose";
        
        int BasicSalary = 60825;
        int RiceSubsidy = 1500;
        int PhoneAllowance = 1000;
        int ClothingAllowance = 1000;
        int GrossSemiMonthlyRate = 30413;
        double HourlyRate = 362.05;
        int GrossWageCalculation = 64325;   
        int SSSContribution = 5000;
        int PhilHealthContribution = 200; 
        int PagIBIGContribution = 200;
        int Tax = 5000;
        
        String Day1 = "September 1, 2022";
        String Day2 = "September 2, 2022";
        String Day3 = "September 5, 2022";
        String Day4 = "September 6, 2022";
        String Day5 = "September 7, 2022";
        String Day6 = "September 8, 2022";
        String Day7 = "September 9, 2022";
        
        int D1 = 8;
        int D2 = 8;
        int D3 = 8;
        int D4 = 8;
        int D5 = 8;
        int D6 = 8;
        int D7 = 8;
                
        
        System.out.println("Birthday:" + Birthday);
        System.out.println("Address:" + Address);
        System.out.println("PhoneNumber:" + PhoneNumber);
        System.out.println("SSS Number:" + SSS);
        System.out.println("PhilHealth:" + PhilHealth);
        
        System.out.println("PagIBIGNUmber:" + PagIBIGNumber);
        System.out.println("TINumber:" + TINumber);
        System.out.println("Status:" + Status);
        System.out.println("Position:" + Position);
        System.out.println("ImmediateSupervisor:" + ImmediateSupervisor);
        
        System.out.println("BasicSalary:" + BasicSalary);
        System.out.println("RiceSubsidy:" + RiceSubsidy);
        System.out.println("PhoneAllowance:" + PhoneAllowance);
        System.out.println("ClothinAllowance:" + ClothingAllowance);
        System.out.println("GrossSemiMonthlyRate:" + GrossSemiMonthlyRate);
        System.out.println("HourlyRate:" + HourlyRate);
        
        System.out.println("Sum of hours worked in a week:");
        System.out.println(D1 + D2 + D3 + D4 + D5 + D6 + D7);
        
        System.out.println("Gross Wage Salary:"); 
        System.out.println(BasicSalary + RiceSubsidy + PhoneAllowance + ClothingAllowance);
        
        System.out.println("Net Wage Calculation:");
        System.out.println(GrossWageCalculation - SSSContribution - PhilHealthContribution - PagIBIGContribution - Tax);
        
        
        //September 
// TODO code application logic here
    }
    
}
