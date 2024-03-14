package com.direncan.paket1;
import com.direncan.paket2.*;  //  paket2 deki sadece Araba class'ını değil de "*" ile herşeyi dahil etmiş olduk.  //  7

public class Main {

    /*

    Access Modifiers - Erişim Belirleyiciler

    Erişim Belirleyiciler 2 düzeyde erişimi belirlerler:

        1) Sınıf Düzeyinde Erişim Belirleyiciler

    public  Bir class eğer public yazılmışsa bu classa paketin içindeki dışındaki tüm classlar tarafından erişilir.

    default: default erişim belirleyici kullanmak anlamına gelir.
    Eğer bir class hiçbir erişim belirleyici kullanmadan yazılmışsa, bu class'a sadece aynı paketin içindeki classlar erişebilir. Paketin
    dışındaki classlar bu class'a erişemez.

    *** protected, private erişim belirleyiciler classlar için kullanılmazlar.

        2) Metod ve Özellik Düzeyinde Erişim Belirleyiciler

    public: Eğer bir metod veya özellik (class member veya alan) public olarak tanımlanmışsa, bu alana paketin içindeki
    ve dışındaki tüm classlar erişebilir.
    Ancak tabii ki bu alanın içinde bulunduğu classın erişilebilir olması gerekir.

    default: Eğer bir metod veya özellik tanımlanırken hiçbir erişim belirleyici kullanılmamışsa (default), bu alana sadece
    kendi paketinde classlar erişebilir.

    protected: Eğer bir metod veya özellik (class member veya alan) public olarak tanımlanmışsa, bu alana aynı paketin içindeki diğer classlar
    tarafından erişilebilir. Paketin dışındaki classlar ise sadece ve sadece bu alanın bulunduğu classın bir alt classıysa erişebilir.

    private: Eğer bir alan private olarak tanımlanmışsa bu alana sadece kendi classı erişebilir.

    Daha önceden öğrendiğimiz gibi bir metodun içinde tanımlanmış değişkenler lokal değişkenler olarak tanımlanırlar. Yani, bu değişkenlere
    diğer metodlardan ve classlardan erişilemez. Bundan dolayı bu değişkenlere access modifier eklenemez.


    Hoca bile derste bunları zaman zaman kullanmayınca unutabildiğini söyledi.

    Lazım olunca, eğer çok karışırırsak Google'a "acces modifier java table" yazacağız. İlk çıkan oracle'ın sayfasına tıklayarak tabloyu
    görüntüleyebiliriz. Alternatif olarak da java bize hata çıkardığında, çözüm yollarını da yine gösteriyor. Oradan da bakabiliriz.


     */

    /*public static void main(String[] args) {
        Araba araba = new Araba();  //  6

        System.out.println(araba.model);  //  Araba classında public olarak tanımlandıkları için bu şekilde direkt olarak erişebiliyoruz.  //  10
        System.out.println(araba.renk);  //  Araba classında public olarak tanımlandıkları için bu şekilde direkt olarak erişebiliyoruz.  //  10
        System.out.println(araba.yil);  //  Araba classında public olarak tanımlandıkları için bu şekilde direkt olarak erişebiliyoruz.  //  10

        /* paket2 içerisinde yer alan Araba class'ı içerisindeki public özellikleri private yapınca burada hata aldık. private
           özellikler veya metodlar sadece bulunduğu paket içerisinde çağırılabilir. */  //  12



    //}


}
