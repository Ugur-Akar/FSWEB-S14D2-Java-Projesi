/*Lamp isimli bir sınıf yazınız.
Lamp sınıfı için 3 tane instance variable tanımlamalıyız. style tipi LampType isminde bir enum olmalı. battery tipi boolean olmalı.
globRating tipi int olmalı.
Lamp sınıfının tüm değişkenleri private olmalı. Lamp sınıfı için 3 değişkeninde eklenebileceği tek bir constructor olmalı.
Lamp sınıfı için toplamda 4 metod yazmamız gerekiyor. turnOn herhangi bir değer dönmeyecek. Sadece 'Lamp is being turned on.'
mesajının ekrana basacak.
getStyle() style değişkenin değerini dönmeli. isBattery() battery değişkeninin değerini dönmeli. getGlobalRating() globalRating
değişkeninin değerini dönmeli.*/


public class Lamp {
    private LampType style;
    private boolean battery;
    private int globRating;

    public Lamp(LampType style, boolean battery, int globRating){
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on");
    }

    public LampType getStyle(){
        return style;
    }

    public boolean isBattery(){
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
