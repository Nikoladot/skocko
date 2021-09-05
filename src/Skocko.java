
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Skocko {

    public static void main(String[] args) {
        ArrayList<Integer> mojaLista = new ArrayList<>();
        ArrayList<Integer> randomLista = new ArrayList<>();
        
        Random rnd = new Random();
        
        int n = 4;
        
        for (int i = 0; i < n; i++){
            randomLista.add(rnd.nextInt(6) + 1);
        }
        System.out.println("Kombinacija: " + randomLista);
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++){
            System.out.print("Unesi broj: ");
            mojaLista.add(sc.nextInt());
        }
        
        int pogodjen = 0;
        int loseMesto = 0;
        
        for (int i = 0; i < n; i++){
            if (mojaLista.get(i) == randomLista.get(i)){
                pogodjen++;
                randomLista.remove(i);
                randomLista.add(i, -1);
                
                mojaLista.remove(i);
                mojaLista.add(i, -2);
            }
        }
        
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (mojaLista.get(i) == randomLista.get(j)){
                    loseMesto++;
                    randomLista.remove(j);
                    randomLista.add(j, -1);
                    
                    mojaLista.remove(i);
                    mojaLista.add(i, -2);
                }
            }
        }
        
        System.out.println("Ukupno pogodjenih: " + (pogodjen + loseMesto));
        System.out.println("Na pravom mestu: " + pogodjen);
    }
    
}