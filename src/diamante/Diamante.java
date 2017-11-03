/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diamante;

import java.util.Scanner;

public class Diamante {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        System.out.print("N= ");
        int n=leer.nextInt();
        
          for(int i=0; i<=n;i++){
            
            for(int x=n-i; x>0;x--) {
                System.out.print(" ");     
            }
            for(int x=0; x<i;x++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
          
         for(int i=0; i<=n;i++){
            
            for(int x=0; x<=i;x++) {
                System.out.print(" ");     
            }
            for(int x=n-i-1; x>0;x--) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}
    
    
  