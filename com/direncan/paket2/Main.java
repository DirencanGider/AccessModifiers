package com.direncan.paket2;

public class Main {

    /*public static void main(String[] args) {

    Araba araba = new Araba();  //  Araba zaten paket2 içerisinde olduğu için ve public yazıldığı için direkt erişebildik.  //  7

    }*/  /*  AccesModifiers projesi içerisinde hem paket1de hem de paket2 de toplamda 2 adet main metodu olduğu için birini yoruma almamız
             gerekli. Aksi takdirde iki main metodu birden çalışamaz. Çakışma olur. Bunu yoruma aldık. */  //  5

    /*public static void main(String[] args) {

        Araba araba = new Araba();

        System.out.println(araba.model);
        System.out.println(araba.renk);
        System.out.println(araba.yil);

    }*/  //  14

    /*public static void main(String[] args) {  //  22

        Hayvan hayvan = new Hayvan("Hayvan");  /*  Hayvan classında protected olarak belirlenmiş isim'e ulaşabildik.
                                                        Çünkü aynı paketin içerisindeyiz(paket2). */  //  23
        //System.out.println(hayvan.isim);  //  24

    //}

}
