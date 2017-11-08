import java.util.Scanner;

/**
 * Created by juam_ on 08/11/2017.
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pilas p = new Pilas();

        String opcion;
        do {
            System.out.println(" ********** Pilas ************");
            System.out.println("********** Menú Principal  **********");
            System.out.println("1. Insertar.");
            System.out.println("2. Mostrar.");
            System.out.println("3. Buscar.");
            System.out.println("4. Eliminar.");
            System.out.println("5. Tamaño.");
            System.out.println("6. Máximo.");
            System.out.println("7. Mínimo.");
            System.out.println("8. Terminar.");
            System.out.println();
            System.out.print("Elija una opción: ");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1": {
                    try {
                        System.out.println("*** Insertar ****");
                        System.out.println("¿Cuántos números desea insertar?");
                        String n = sc.nextLine();

                        for(int i = 1; i<=Integer.parseInt(n); i++ ){
                            System.out.print("Inserte número: " + i + "   ");
                            p.push(Integer.parseInt(sc.nextLine()));
                        }

                        System.out.println("\n*** Números agregados ***\n");
                    }catch (Exception e){
                        System.out.println("\n*** Debe ingresar sólo números ***\n");
                    }
                    System.out.println();
                    break;
                }
                case "2": {
                    System.out.println("*** Mostrar ***");
                    p.peek();
                    System.out.println("\n*** Datos mostrados correctamente ***\n");
                    break;
                }
                case "3": {
                    System.out.println("*** Buscar ***");
                    break;
                }
                case "4": {
                    System.out.println("*** Eliminar ***");
                    break;
                }
                case "5": {
                    System.out.println("*** Tamaño ***");
                    break;
                }
                case "6": {
                    System.out.println("*** Máximo ***");
                    break;
                }
                case "7": {
                    System.out.println("*** Mínimo ***");
                    break;
                }
                case "8": {
                    System.out.println("\n¡Hasta luego!");
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("\b\t*** Opción incorrecta ***\n");
                    break;
                }
            }
        } while (!opcion.equals("8"));

        /*
        p.push(100);
        p.push(50);
        p.push(20);

        p.peek();
        p.cima();
        p.pop();
        p.peek();
        p.pop();
        p.cima();
        p.pop();
        p.peek();

        */


    }

}
