package com.direncan.paket2;

public class Araba {  //public yazıldığı için hem bulunduğu paketin içinden hem de dışından bu classlardan obje üretebiliyoruz ve erişebiliyoruz.  //  1
    /* public access modifier'ı sildik. default olarak kaldı. Herhangi bir erişim belirleyicisi olmadığında biz sadece aynı paket
       içerisinden erişebiliriz. paket1de paket2yi dahil ettiğimiz halde Araba araba = new Araba(); satırında hata aldık.
       Bu tür default yazılmış  durumlarda, yani erişim belirleyicisi olmayan durumlarda farklı bir paketten erişim sağlamak için erişim
       belirleyicisi olmak zorunda. */  //  8

    /* Aynı zamanda bu class için erişim belirleyicisini private ve protected olarak yazarsak da java yine bize hata veriyor.
       Çünkü biz bu classlara ulaşamadığımız zaman herhangi bir obje üretemeyeceğiz ve bu classlarımız boşa gidecek, bir
       anlamı olmayacak. Classlar yoktan yere yazılmış olacağı için private ve protected erişim belirleyiciler classlar için KULLANILAMAZLAR. */  //  9
    String model = "Renault";  //  2
    String renk = "Gümüş";  //  3
    String yil = "2001";  //  4

    /* public özellikleri private yapınca, "paket1" içindeki "Main.java" class'ındaki main metodu içerisinde "araba.model", "araba.renk",
       "araba.yil" şeklinde yazdırınca hata aldık. private özellikler veya metodlar sadece bulunduğu paket içerisinde çağırılabilir. */  //  11

    /* Acess modifierları özelliklerden silince yani default olarak bıraktığımızda, aynı paket içinde olan (yani paket2 içerisinde) Main
       metodunda herhangi bir sıkıntı çıkmadı. Doğrudan erişim sağlayabildik. Fakat paket1'den erişim sağladığımızda problem yaşadık. */  //  13



}
