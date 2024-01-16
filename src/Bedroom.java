/*
Bedroom isimli bir sınıf oluşturunuz.
Bu sınıfın 10 tane instance variable değeri olmalı. name String tipinde. wall1 wall2 wall3 wall4 Wall tipinde. ceiling Ceiling tipinde.
 bed Bed tipinde. lamp Lamp tipinde. wardrobe Wardrobe tipinde. carpet Carpet tipinde.
Sınıfımızın constructor metodu tek olmalı ve 10 değişkeni de almalı.
getter metodlarını eklemelisiniz.
 */
public class Bedroom extends Room{
    private Bed bed;
    private Lamp lamp;
    private Wardrobe wardrobe;
    private Carpet carpet;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling,
                   Bed bed, Lamp lamp, Wardrobe wardrobe, Carpet carpet) {
        super(name, wall1, wall2, wall3, wall4, ceiling);
        this.bed = bed;
        this.lamp = lamp;
        this.wardrobe = wardrobe;
        this.carpet = carpet;
    }

    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public Wall getWall1() {
        return super.getWall1();
    }
    @Override
    public Wall getWall2() {
        return super.getWall2();
    }
    @Override
    public Wall getWall3() {
        return super.getWall3();
    }
    @Override
    public Wall getWall4() {
        return super.getWall4();
    }
    @Override
    public Ceiling getCeiling() {
        return super.getCeiling();
    }

    public Bed getBed() {
        return bed;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Carpet getCarpet() {
        return carpet;
    }
}
