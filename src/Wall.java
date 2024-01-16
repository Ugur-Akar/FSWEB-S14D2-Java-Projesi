/*
Wall isminde bir sınıf yazınız. İçerisinde bir tane değişkeni olmalı direction String değerinde olmalı ve private olarak tanımlanmalı.
Wall sınıfının bir constructor metodu olmalı ve tek değişkenine değer atamalı.
Wall sınıfının iki metodu olmalı. getDirection direction değişkeninin değerini dönmeli.
create metodu Wall objesinin hangi directiona göre oluşturulduğunu ekrana basmalı.
 */
public class Wall {
    private String direction;

    public Wall(String direction) {
        this.direction = direction;
    }

    public java.lang.String getDirection() {
        return direction;
    }

    public void create(){
        System.out.println(direction);
    }
}
