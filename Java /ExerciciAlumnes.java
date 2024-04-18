import java.util.Scanner;

public class EjercicioAlumnos {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);
        System.out.print("Introdueix la quantitat d'alumnes: ");
        int quantitatAlumnes = llegir.nextInt();
        llegir.nextLine();

        String[] noms = new String[quantitatAlumnes];
        int[] notes = new int[quantitatAlumnes];

        introduirNomsAlumnes(noms);
        introduirNotesAlumnes(noms, notes);
        mostrarNotaMasAlta(noms, notes);
        alumnesSuspesos(noms, notes);
    }

    public static void introduirNomsAlumnes(String[] noms) {
        Scanner llegir = new Scanner(System.in);
        for (int i = 0; i < noms.length; i++) {
            System.out.print("Introdueix el nom de l'alumne " + (i + 1) + ": ");
            noms[i] = llegir.nextLine();
        }
    }

    public static void introduirNotesAlumnes(String[] noms, int[] notes) {
        for (int i = 0; i < noms.length; i++) {
            int nota;
            do {
                System.out.print("Introdueix la nota de l'alumne " + noms[i] + ": ");
                nota = sc.nextInt();
            } while (nota < 0 || nota > 10);

            notes[i] = nota;
            sc.nextLine();
        }
    }
    public static void mostrarNotaMasAlta(String[] noms, int[] notes) {
        int notaMesAlta = notes[0];
        String alumneNotaMesAlt = noms[0];
        for (int i = 1; i < notes.length; i++) {
            if (notes[i] > notaMesAlta) {
                notaMesAlta = notes[i];
                alumneNotaMesAlt = noms[i];
            }
        }
        System.out.println("El alumno con la nota más alta es " + alumneNotaMesAlt +
                " con una nota de " + notaMesAlta);
    }

    public static void alumnesSuspesos(String[] noms, int[] notes) {
        System.out.println("Alumnes con nota menor a 5:");
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] < 5) {
                System.out.println(noms[i] + ": " + notes[i]);
            }
        }
    }
}
