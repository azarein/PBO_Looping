/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Muhamad Yamin
 */
public class PalindromeAngka {
public static void main(String[] args){
		Scanner baca = new Scanner(System.in);
                String cek;
                int atas=0, bawah=0, i;
                char aw, ak;
                boolean m;
                System.out.print("Jumlah angka : ");
                int p = baca.nextInt();
                if (p > 100 || p < 0){
                    System.out.println("Terlalu Besar/Kecil");
                }else{
                    int[] array=new int[p];
                    int[] hasil=new int[p];
                    for (int x =0; x<p; x++){
                        System.out.print("Angka ke"+(x+1)+":");
                        array[x]=baca.nextInt();
                        for (int j = array[x] - 1; j>0; j--){
                            String h = String.valueOf(j);
                            m = cek(h);
                            if (m){
                                bawah = j;
                                break;
                            }
                          }
                        for (int j = array[x] +1; j < 2147483647; j++){
                            String h = String.valueOf(j);
                            m = cek(h);
                            if (m) {
                                atas = j;
                                break;
                            }
                        }
                        if (array[x] - bawah >= atas - array[x]){
                            hasil[x] = atas;
                        }else{
                            hasil[x] = bawah;
                        }
                        if(array[x]==11){
                            hasil[x]=22;
                        }
                        if(array[x]<10){
                            hasil[x]=11;
                        }
                        }System.out.println("=============");
                        for (int x = 0; x < p; x++){
                            System.out.println("Terdekat dengan angka ke "+(x+1)+" :"+hasil[x]);
                        } 
                    }
                }
public static boolean cek(String ck){
    boolean cek = false;
    char aw, ak;
    int x = ck.length();
    int y = -1;
    int h=x-1;
    for (int i = h; i >= 0; i--){
        y++;
        aw = ck.charAt(y);
        ak = ck.charAt(i);
        if (aw == ak){
            cek = true;
        }else{
            cek = false;
            break;
        }
    }
return cek;
    }
}
