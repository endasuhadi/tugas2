/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author asus
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class JavaApplication2
{
public static void main( String[] args ){
BufferedReader dataIn=new BufferedReader(new InputStreamReader(System.in));
String [] nama =new String[100];
String [] alamat =new String[100];
String [] telp =new String[100];
String [] email =new String[100];

//contoh input 5 data bisa disesuaikan
int in = 5;
SiswaRecord namaRecord = new SiswaRecord();
for(int i=0; i<in; i++ ){
System.out.print("Input Nama: ");
           try{
            nama[i]=dataIn.readLine();
           }catch(IOException e){
           System.out.println("Erorr!");
           }

System.out.print("Input Alamat: ");
           try{
            alamat[i]=dataIn.readLine();
           }catch(IOException e){
           System.out.println("Erorr!");
           }
System.out.print("Input telpon: ");
           try{
            telp[i]=dataIn.readLine();
           }catch(IOException e){
           System.out.println("Erorr!");
           }
System.out.print("Input Email: ");
           try{
            email[i]=dataIn.readLine();
           }catch(IOException e){
           System.out.println("Erorr!");
           }
    }
for(int i=0; i<in; i++ ){
namaRecord.setName(nama[i],i,alamat[i],telp[i],email[i]);
System.out.println("===========================================");
System.out.println("Nama                  :"+namaRecord.getName(i) );
System.out.println("Alamat                :"+namaRecord.getAlamat(i) );
System.out.println("Telepon               :"+namaRecord.getTelpon(i) );
System.out.println("Email                 :"+namaRecord.getEmail(i) );
System.out.println("===========================================");
}

System.out.println("\nTotal Jumlah Siswa ="+SiswaRecord.getSiswaCount());
}
}
