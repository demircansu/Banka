
package banka;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Banka {
   
    public static void main(String[] args) throws IOException{
        BankAccount a1=new BankAccount(123,2000);

        print(a1);
       
    }
    public static void print(BankAccount banka){
        islemler();

        try{
        
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(new File("C:\\Users\\cansu\\OneDrive\\Belgeler\\NetBeansProjects\\Banka\\src\\banka\\banka.txt"),true));
        bufferedWriter.write(banka.getBakiye()+" "+ banka.getHesapNumarasi()+"\n");
        bufferedWriter.close();
        }catch(IOException ex){
            System.out.println("Hata");
        }
    }
    public static void read(BankAccount banka){
        String dosyaYolu="Banka1.txt";
        try(BufferedReader okuyucu= new BufferedReader(new FileReader(dosyaYolu))){
            String satir;
            while((satir=okuyucu.readLine())!=null){
                System.out.println("Satir");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        
    } 
    
    public static void islemler(){
         Scanner scan=new Scanner(System.in);
         BankAccount customer1=new BankAccount(1234,2000);
         System.out.println("Yapmak istediğiniz işlemi girin:\n1-Para yatir\n2-Para cek\n3-Çikiş");
        int islem=scan.nextInt();
    switch(islem){
        case 1: 
            System.out.println("Yatirmak istediğiniz miktari girin: ");
            int miktar=scan.nextInt();
            customer1.paraYatir(miktar);
            break;
        case 2:
            System.out.println("Çekmek istediğiniz tutari girin: ");
            miktar=scan.nextInt();
            customer1.paraCek(miktar);
            break;
        case 3:
            System.out.println("Çikiş yapılıyor..");
            break;
        default:
            System.out.println("Hata!!!");
            islemler();
            break;
    }
    }
  
}
