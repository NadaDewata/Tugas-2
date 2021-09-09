public class TugasSoal3 {
    
    public static void main(String args []){
        int number[] = {1, 2, 5, 7, 8, 9, 12};
        int keynumber = 7;
        int cari = TugasSoal3.HadiahBinary(number, keynumber);
            System.out.println("Key "+ keynumber +" ditemukan pada index ke-"+cari);
    }
    public static int HadiahBinary(int[] list,int numberkey){
        int x = 0;int y=list.length -1;
        while (y >= x){
            int z = (x + y)/2;
            if(numberkey < list[z])
                y=z-1;
            else
                if(numberkey==list[z])
            return z;
            else
                x=z+1;
        }
            return -1;
    }    
}
