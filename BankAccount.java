
package banka;


public class BankAccount {
    
    private int hesapNumarasi;
    private int bakiye;

    public BankAccount(int hesapNumarasi, int bakiye) {
        this.hesapNumarasi = hesapNumarasi;
        this.bakiye = bakiye;
    }

    
    public void ekranaYaz(){
        System.out.println("Hesap No: "+ hesapNumarasi);
        System.out.println("Bakiye: " + bakiye);
    }
    public void paraYatir(int miktar){
         System.out.println("eski Bakiyeniz :" +bakiye);
         bakiye+=miktar;
         System.out.println("Güncellenmiş bakiyenizde : "+bakiye);
         
                
    }
    public void paraCek(int miktar){
        if(miktar<=bakiye){
            bakiye-=miktar;
            System.out.println("Yeni bakiye: " + bakiye);
        }
        else{
            System.out.println("Yetersiz bakiye");
        }
    }

    public int getHesapNumarasi() {
        return hesapNumarasi;
    }

    public void setHesapNumarasi(int hesapNumarasi) {
        this.hesapNumarasi = hesapNumarasi;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
    
}
