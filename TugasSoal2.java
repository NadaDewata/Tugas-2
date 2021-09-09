public class TugasSoal2 {
    public static void main(String[]args){
        int[]contohangka = {1, 2, 4, 5, 10, 13, 17, 21, 25, 26, 28, 33, 38, 40, 234, 506, 105, 92, 300, 52, 89, 934};
        System.out.print("Even Number : ");
        for(int i = 0; i < contohangka.length; i++){
            if (contohangka[i]%2==0){
                System.out.print(contohangka[i]+" ");
            }
        }
        System.out.println(" ");
        System.out.print("Odd Number : ");
        for(int i=0;i<contohangka.length;i++){
            if(contohangka[i]%2!=0){
                System.out.print(contohangka[i]+" ");

            }
        }
        System.out.println(" ");

    }
}
