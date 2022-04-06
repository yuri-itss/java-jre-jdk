public class TestaLacos {
    public static void main(String[] args) {

        int contador = 0;

        while (contador <= 10){
            System.out.println(contador);
            contador++;
        }

        for (int contador2 = 0; contador2 <= 10; contador2++){
            System.out.println(contador2);
        }

        // Tabuada
        for (int multiplicador = 1; multiplicador <= 10; multiplicador++){
            for (int contador3 = 0; contador3 <=10; contador3++){
                System.out.print(multiplicador * contador3);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}