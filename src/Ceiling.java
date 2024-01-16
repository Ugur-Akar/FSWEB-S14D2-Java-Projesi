/*
Ceiling isminde bir sınıf yazınız. Ceiling sınıfının 2 tane instance variable olmalı. height ve paintedColor. h
eight int tipinde olmalı paintedColor PaintColor isminde bir enum olmalı ve ikisi de private olmalı.
Ceiling sınıfının bir constructor metodu olmalı. 2 değişkenine de değer atamalı.
Ceiling sınıfının getHeight() adında bir metodu olmalı. height değerini dönmeli.
getPaintedColor adında bir metodu olmalı ve paintedColor değerini dönmeli.
Ceiling sınıfının create isimli bir metodu olmalı. Ceiling objesinin height ve paintingColor değerlerini ekrana basmalı.
 */
public class Ceiling {
    private int height;
    private PaintColor paintedColor;

    public Ceiling(int height, PaintColor paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getPaintedColor() {
        return paintedColor;
    }

    public void create() {
        System.out.println("Ceiling{" + "height=" + height + ", paintedColor=" + paintedColor + '}');
    }
}
