
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcion;
        int butaca = 0;
        String palomitas = "No";
        String gaseosa = "No";

        double precioButaca = 15.00;
        double precioPalomitas = 0;
        double precioGaseosa = 0;

        do {
            System.out.println("================================");
            System.out.println("       SISTEMA DE CINE");
            System.out.println("================================");
            System.out.println("1. Comprar una butaca");
            System.out.println("2. Comprar palomitas");
            System.out.println("3. Comprar gaseosas");
            System.out.println("4. Mostrar boleto");
            System.out.println("5. Salir");
            System.out.println("================================");
            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    if (butaca == 0) {
                        System.out.println("BUTACAS DISPONIBLES");
                        System.out.println("1. Butaca A1");
                        System.out.println("2. Butaca A2");
                        System.out.println("3. Butaca A3");
                        System.out.print("Seleccione su butaca: ");

                        int seleccion = teclado.nextInt();

                        if (seleccion >= 1 && seleccion <= 3) {
                            butaca = seleccion;
                            System.out.println("Butaca comprada correctamente.");
                        } else {
                            System.out.println("Butaca no valida.");
                        }
                    } else {
                        System.out.println("Ya compraste una butaca.");
                    }
                    break;

                case 2:
                    System.out.println("TIPOS DE PALOMITAS");
                    System.out.println("1. Pequenas - S/ 5.00");
                    System.out.println("2. Medianas - S/ 8.00");
                    System.out.println("3. Grandes - S/ 12.00");
                    System.out.print("Seleccione una opcion: ");

                    int tipoPalomitas = teclado.nextInt();

                    switch (tipoPalomitas) {
                        case 1:
                            palomitas = "Pequenas";
                            precioPalomitas = 5.00;
                            break;
                        case 2:
                            palomitas = "Medianas";
                            precioPalomitas = 8.00;
                            break;
                        case 3:
                            palomitas = "Grandes";
                            precioPalomitas = 12.00;
                            break;
                        default:
                            System.out.println("Opcion no valida.");
                            break;
                    }

                    if (tipoPalomitas >= 1 && tipoPalomitas <= 3) {
                        System.out.println("Palomitas compradas correctamente.");
                    }
                    break;

                case 3:
                    System.out.println("TIPOS DE GASEOSAS");
                    System.out.println("1. Pequena - S/ 3.00");
                    System.out.println("2. Mediana - S/ 5.00");
                    System.out.println("3. Grande - S/ 7.00");
                    System.out.print("Seleccione una opcion: ");

                    int tipoGaseosa = teclado.nextInt();

                    switch (tipoGaseosa) {
                        case 1:
                            gaseosa = "Pequena";
                            precioGaseosa = 3.00;
                            break;
                        case 2:
                            gaseosa = "Mediana";
                            precioGaseosa = 5.00;
                            break;
                        case 3:
                            gaseosa = "Grande";
                            precioGaseosa = 7.00;
                            break;
                        default:
                            System.out.println("Opcion no valida.");
                            break;
                    }

                    if (tipoGaseosa >= 1 && tipoGaseosa <= 3) {
                        System.out.println("Gaseosa comprada correctamente.");
                    }
                    break;

                case 4:
                    System.out.println("================================");
                    System.out.println("          BOLETO DE CINE");
                    System.out.println("================================");

                    if (butaca == 0) {
                        System.out.println("Butaca: No comprada");
                    } else {
                        System.out.println("Butaca: A" + butaca);
                    }

                    System.out.println("Palomitas: " + palomitas);
                    System.out.println("Gaseosa: " + gaseosa);

                    double total = 0;

                    if (butaca != 0) {
                        total += precioButaca;
                    }

                    total += precioPalomitas;
                    total += precioGaseosa;

                    System.out.printf("Precio de butaca: S/ %.2f%n", butaca == 0 ? 0.0 : precioButaca);
                    System.out.printf("Precio de palomitas: S/ %.2f%n", precioPalomitas);
                    System.out.printf("Precio de gaseosa: S/ %.2f%n", precioGaseosa);
                    System.out.println("--------------------------------");
                    System.out.printf("TOTAL A PAGAR: S/ %.2f%n", total);
                    System.out.println("================================");
                    break;

                case 5:
                    System.out.println("Gracias por visitar nuestro cine.");
                    break;

                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
            }

        } while (opcion != 5);
    }
}
