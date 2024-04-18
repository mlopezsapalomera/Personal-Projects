
import java.util.Scanner;

public class EjercicioFechas {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String fecha = sc.nextLine();
        while (!(fecha.equals("0"))) {
            if (ComprobarFecha(fecha)) {
                System.out.println("La data es correcta");
            } else {
                System.out.println("La data no es correcta");
            }
            fecha = sc.nextLine();
        }
    }

    public static boolean ComprobarFecha(String data) {
        String[] partsData = data.split("-");
        if (partsData.length != 3) {
            return false;
        }
        try {
            int dia = Integer.parseInt(partsData[0]);
            int mes = Integer.parseInt(partsData[1]);
            int any = Integer.parseInt(partsData[2]);
            int[] diasMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if (mes < 1 || mes > 12) {
                return false;
            } if (comprobarBisiesto(any)) {
                diasMes[2] = 29;
            } return dia >= 1 && dia <= diasMes[mes];
        } catch (NumberFormatException i) {
            return false;
        }
    }

    public static boolean comprobarBisiesto(int any) {
        return any % 4 == 0 && (any % 100 != 0 || any % 400 == 0);
    }
}
