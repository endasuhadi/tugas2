/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

public class SiswaRecord
{
private String[] name=new String [100];
private String[] alamatna=new String [100];
private String[] telpona=new String [100];
private String[] emailna=new String [100];

private static int studentCount;
private static int index;

public SiswaRecord(){
studentCount=0;
}
public String getName(int index){
return name[index];
}


public String getAlamat(int index){
return alamatna[index];
}
public String getTelpon(int index){
return telpona[index];
}
public String getEmail(int index){
return emailna[index];
}
public void setName( String nama, int index,String alamat,String telpon,String email){
name[index] = nama;
alamatna[index] = alamat;
telpona[index] = telpon;
emailna[index] = email;
studentCount++;
}

public static int getSiswaCount(){
return studentCount;
}
}
