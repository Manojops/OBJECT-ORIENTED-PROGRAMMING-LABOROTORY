/*
3 .     Develop a java application with an Employee class with Emp_name,
        Emp_id, Address, Mail_id, Mobile_no as members. Inherit the
        classes, Programmer, Assistant Professor, Associate Professor and
        Professor from employee class. Add Basic Pay (BP) as the member
        of all the inherited classes with 97% of BP as DA, 10 % of BP as
        HRA, 12% of BP as PF, 0.1% of BP for staff club funds. Generate
        payslips for the employees with their gross and net salary
*/

import java.util.Scanner;

class Employee{
    String emp_name,emp_id,address,mail_id,mobile_no;
    double BP,DA,HRA,PF,CF,GP,NP;
    Scanner sc=new Scanner(System.in);
    public Employee(){
        System.out.print("Enter the Employee Name : ");
        emp_name=sc.nextLine();
        System.out.print("Enter the Employee ID : ");
        emp_id=sc.nextLine();
        System.out.print("Address of the Employee : ");
        address=sc.nextLine();
        System.out.print("Mail ID : ");
        mail_id=sc.nextLine();
        System.out.print("Mobile Number : ");
        mobile_no=sc.nextLine();
    }

    void display(){
        System.out.println("Employee Name : "+emp_name);
        System.out.println("Employee ID : "+emp_id);
        System.out.println("Address : "+address);
        System.out.println("Mobile Number : "+mobile_no);
        DA=BP*0.97;
        HRA=BP*0.10;
        PF=BP*0.12;
        CF=BP*0.01;
        GP=DA+HRA+BP;
        NP=GP-PF-CF;
        System.out.println("Basic Pay : "+BP);
        System.out.println("Dearness Allowance : "+DA);
        System.out.println("House Rent Allowance : "+HRA);
        System.out.println("Provident Fund : "+PF);
        System.out.println("Club Fund : "+CF);
        System.out.println("Gross Pay : "+GP);
        System.out.println("Net Pay : "+NP);
    }
}

class Programmer extends Employee{
    Programmer(){
        System.out.print("Enter the Basic Pay of the Programmer : ");
        BP=sc.nextDouble();
    }

    void display(){
        System.out.println("\nPaySlip for The Programmer\n===================================\n");
        super.display();
    }
}

class AssistantProfessor extends Employee{
    AssistantProfessor(){
        System.out.print("Enter the Basic Pay of the AssistantProfessor : ");
        BP=sc.nextDouble();
    }

    void display(){
        System.out.println("\nPaySlip for The AssistantProfessor\n===================================\n");
        super.display();
    }
}

class AssociateProfessor extends Employee{
    AssociateProfessor(){
        System.out.print("Enter the Basic Pay of the AssociateProfessor : ");
        BP=sc.nextDouble();
    }

    void display(){
        System.out.println("\nPaySlip for The AssociateProfessor\n===================================\n");
        super.display();
    }
}

class Professor extends Employee{
    Professor(){
        System.out.print("Enter the Basic Pay of the Professor : ");
        BP=sc.nextDouble();
    }

    void display(){
        System.out.println("\nPaySlip for The Professor\n===================================\n");
        super.display();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n1.Programmer\n2.AssistantProfessor\n3.AssociateProfessor\n4.Professor\n5.Exit\nEnter your choice ? ");
        int choice=sc.nextInt();
        while(choice!=5){

            if (choice==1){
                Programmer p=new Programmer();
                p.display();
                break;
            } else if (choice==2) {
                AssistantProfessor asp=new AssistantProfessor();
                asp.display();
                break;
            } else if (choice==3) {
                AssociateProfessor acp=new AssociateProfessor();
                acp.display();
                break;
            } else if (choice==4) {
                Professor pf=new Professor();
                pf.display();
                break;
            } else if (choice==5) {
                System.out.println("Exit...");
                break;
            } else{
                System.out.println("Invalid choice ! try again");
            }
        }

    }
}
