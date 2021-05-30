
package Stack;

public class TumpukanApp {
    public static void main (String [] args){
        Tumpukan tumpukan = new Tumpukan (10);
        tumpukan.push(50);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(100);
        tumpukan.baca();
        tumpukan.pop();
        //long nilai1 = tumpukan.pop(); // membuat variabel baru dengan mendeklarasikan variabelnya untuk menyimpan data yang akan di pop
        //System.out.println("nilai1 = "+ nilai1);
        System.out.println(" ");
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(60);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(80);
        tumpukan.baca();
        tumpukan.pop();
        //long nilai2 = tumpukan.pop();
        //System.out.println("nilai2 ="+ nilai2);
        System.out.println(" ");
        tumpukan.baca();
        System.out.println(" ");
        long nilai = tumpukan.peek(); // buat variabel baru (nilai) untuk dapat menyimpan nilai top dengan memanggil fungsi peek
        System.out.println("nilai top = "+ nilai); // variabel nilai di panggil agar dapat mengakses nilai top
        System.out.println("DESTY NURUL ANITSA 20090134");
    }
}
