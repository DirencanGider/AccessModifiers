package com.direncan.paket1;
import com.direncan.paket2.*;  //  19

public class At extends Hayvan {  //  18

    public At(String isim) {  //  20
        super(isim);
    }
    public void ismini_soyle() {  //  21

        System.out.println(super.isim);  //  super ile üst classa (Hayvan) erişim sağladık.

    }

}
