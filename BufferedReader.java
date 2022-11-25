/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_modul7_pbo;

/**
 *
 * @author user
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class {
                public static void main(String[] args){
                                BufferedReader masukan=new BufferedReader(new InputStreamReader(System.in));
                                int data[]=new int[10];
                                String input="";
                                for (int i=0;i<data.length;i++){
                                                System.out.print("masukan data ke "+(i+1)+":");
                                                try{
                                                                input=masukan.readLine();
                                                                data[i]=Integer.parseInt(input);
                                                }catch (Exception e){
                                                               
                                                }
                                }
                                int terbesar =data[0];
                                for (int i=0;i<data.length;i++){
                                if(data[i]>terbesar){
                                                terbesar=data[i];
                               
                                }
                }
               
                System.out.println("");
                System.out.println("input terbesar adalah:"+terbesar);
}
}
