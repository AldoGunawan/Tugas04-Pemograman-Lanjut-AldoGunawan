import java.util.stream.*;
public class ArrayTgsPl {
    public static void main(String[] args) {
        ///Menghitung jumlah semua angka pada array
            int[] angka = {
                    82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32
            };
                int bgnH = IntStream.of(angka).sum();
                    System.out.println("Jumlah dari Semua Angka Adalah :" + bgnH);
    }
}
