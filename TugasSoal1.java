import java.util.Scanner;
public class TugasSoal1 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Input angka yang diinginkan : ");
        int bilangan = input.nextInt();
        boolean angka = true;
        for(int index=2; index<=bilangan/2; index++){
            if(bilangan%index==0){
                angka = false;
                break;
            }
        }
        if(angka &&((bilangan > 0)&&(bilangan != 1)))
            System.out.println("Angka yang anda inputkan merupakan bilangan prima");
        else
            System.out.println("Angka yang anda inputkan bukan merupakan bilangan prima");
    input.close();
    }
    
}
