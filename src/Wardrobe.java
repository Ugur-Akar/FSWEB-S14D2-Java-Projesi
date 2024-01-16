/*
Wardrobe isminde bir sınıf yazınız.
Wardrobe sınıfı için 3 adet instance variable tanımlayınız. int width, int height, double weight Hepsi private olmalı.
Wardrobe sınıfı için constructor & getter metodlarını yazınız.
Wardrobe sınıfı içerisinde add isminde bir metod tanımlayınız. Herhangi bir değer dönmeyecek.
Sadece 'Wardrobe added into Bedroom.' mesajını ekrana basacak.
 */
public class Wardrobe {
    private int width, height;
    private double weight;

    public Wardrobe(int width, int height, double weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void add(){
        System.out.println("Wardrobe added into Bedroom.");
    }
}
