import java.util.Arrays;
public class TugasSoal4 {
    public static void main(String[]args){
        int[]kesatria = {5, 1};
        int[]naga = {6, 3, 2};
        Arrays.sort(kesatria);
        Arrays.sort(naga);
        int indeksNaga = 0;
        int Tinggibadan = 0;
        for(int dungeon : kesatria){
            if(indeksNaga < naga.length){
                if(dungeon >= naga[indeksNaga]){
                    Tinggibadan += dungeon;
                    indeksNaga++;
                }
            }
        }
        if(indeksNaga < naga.length){
            System.out.println("Minimum Height : "+Tinggibadan);
        } else {
            System.out.println("Knight Fall");
        }
    }
}
