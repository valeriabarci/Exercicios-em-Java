public class exerc4 {
    public static void main(String[] args) {
        int i, fatorial = 1;
        for(i = 1; i <= 10; i++) {
            fatorial = fatorial * i;
            System.out.println("O fatorial de "+ i + " é (" + (i-1) +"!) * "+ i +" = " + fatorial);            
        }
    }
}
