
public class exceptions {

    public static void main(String[] args) {
        int valor2 = 5;
        System.out.println("El entero se inicializó en : " + valor2);

        try {
            
            valor2 = Integer.valueOf("a");
            System.out.println("El número indicado es : " + valor2);
        } catch (NumberFormatException e) {
            System.out.println("El valor indicado no es un número");
        }

        try {
            int valor3 = Integer.valueOf("10");
        } catch (Exception e) {
            System.out.println("El valor indicado no es un número");
        }

        try {
             int valor4 = Integer.valueOf("a");
             System.out.println("El número indicado es : " + valor4) ;
        } catch (NumberFormatException e) {
            System.out.println("El valor indicado no es un número");
        } catch (Exception e) {
        System.out.println("El valor indicado no es un número");
    } finally {
        int valor5 = 7;
        System.out.println("El número indicado es : " +valor5);
    }

    }
}