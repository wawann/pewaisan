/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wawan
 */
public class Subclass {
 private int x,y;
 public Subclass(){
     x=1;
     y=2;
 }
 public Subclass(int i, int j){
     x=i;
     y=j;
 }
 public int tambah(){
     return x+y;
 }
 public int kali(){
     return x*y;
 }
}
