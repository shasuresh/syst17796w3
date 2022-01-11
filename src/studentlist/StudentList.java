/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package studentlist;

import java.util.Scanner;

/**
 *
 * @author Megha Patel
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student[] sList=new Student[3];
        
        Scanner input=new Scanner(System.in);
        
        for(int i=0; i<=sList.length-1;i++)
        {
            sList[i]=new Student();
            System.out.println("Enter Student name: ");
            sList[i].setStud_Name(input.nextLine());
        }
        
        for(int i=0; i<=sList.length-1;i++)
        {
            System.out.println("Student name: "+sList[i].getStud_Name());
            
        }
    }

}
