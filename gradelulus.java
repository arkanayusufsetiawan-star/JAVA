import java.util.Scanner;


public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        String grade;

        if (nilai >= 85) {
            grade = "A";
        } else if (nilai >= 75) {
            grade = "B";
        } else if (nilai >= 65) {
            grade = "C";
        } else {
            grade = "D";
        }

        String status = (nilai >= 55) ? "Lulus" : "Tidak Lulus";

        System.out.println("Grade: " + grade);
        System.out.println("Status: " + status);
    
}