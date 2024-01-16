/*
Carpet isminde bir sınıf yazınız.
Carpet sınıfı için 3 adet instance variable tanımlayınız. int width, int height, PaintColor color Hepsi private olmalı.
Carpet sınıfı için constructor & getter metodlarını yazınız.
Carpet sınıfı içerisinde lying isminde bir metod tanımlayınız. Herhangi bir değer dönmeyecek.
Sadece 'Carpet is lying on Bedroom floor.' mesajını ekrana basacak.
 */
public class Carpet {
    private int width, height;
    private PaintColor color;

    public Carpet(int width, int height, PaintColor color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getColor() {
        return color;
    }

    public void lying(){
        System.out.println("Carpet is lying on Bedroom floor.");
    }
}
