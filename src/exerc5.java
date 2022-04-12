public class exerc5 {
    public static void main(String[] args) {
        System.out.println("O fatorial de 0 é 1");
        for (long i = 1, fatorial = 1; i <= 40; i++) {
            long aux = i;
            fatorial = i;
            while(aux != 1){
                aux = aux - 1;
                fatorial = fatorial * aux;
            }
            System.out.println("O fatorial de " + i + " é (" + (i-1) + "!) * " + i + " = " + fatorial);        
        }
    }
}
