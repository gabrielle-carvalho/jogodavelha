/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATS99879
 */
import javax.swing.*;

public class Codigo {
    String simb="X";
    String cam[] = new String[9];
    int cj=0;
    
    public String simbolo(String s){
        if (s.equals("")){
            if(simb.equals("X")){              
                simb="O";                
            }else if (simb.equals("O")){
                simb="X";
            }
            cj++;            
        }else{
            simb=s;
        }              
        return simb;
    }
    
    public void start(){
        cj=0;
        for (int x=0;x<10;x++){
            cam[x]="";
        }
    }
    
    public void armazenar(JButton b){
        String nb=b.getName();
        switch (nb){
            case "b1":
                cam[1]=cam[1]+simb;
                cam[4]=cam[4]+simb;
                cam[7]=cam[7]+simb;
                break;
            case "b2":
                cam[2]=cam[2]+simb;
                cam[4]=cam[4]+simb;                
                break;
            case "b3":
                cam[3]=cam[3]+simb;
                cam[4]=cam[4]+simb;
                cam[8]=cam[8]+simb;
                break;
            case "b4":
                cam[1]=cam[1]+simb;                
                cam[5]=cam[5]+simb;                
                break;
            case "b5":
                cam[2]=cam[2]+simb;
                cam[5]=cam[5]+simb;
                cam[7]=cam[7]+simb;
                cam[8]=cam[8]+simb;
                break;
            case "b6":
                cam[3]=cam[3]+simb;
                cam[5]=cam[5]+simb;                
                break;
            case "b7":
                cam[1]=cam[1]+simb;
                cam[6]=cam[6]+simb;                
                cam[8]=cam[8]+simb;
                break;
            case "b8":
                cam[2]=cam[2]+simb;
                cam[6]=cam[6]+simb;                                
                break;
            case "b9":
                cam[3]=cam[3]+simb;
                cam[6]=cam[6]+simb;                
                cam[7]=cam[7]+simb;
                break;
        } 
    }
    
    public void triunfo(){
        
    }
}
