package ues.za20003;

public class Pet {

    private int age;
    private double weight, height;
    private String typePet;

    public Pet() {}

    public Pet(int age, double weight, double height, String typePet) {
        this.age = age;
        //peso en kg
        this.weight = weight;
        //altura en cm
        this.height = height;
        this.typePet = typePet;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getTypePet() {
        return typePet;
    }

    public void setTypePet(String typePet) {
        this.typePet = typePet;
    }

    @Override
    public String toString() {
        return "Tipo de Mascota: " + this.typePet + "\nEdad: " + this.age + " años\nPeso: "
                + this.weight + "kg \nAltura: " + this.height + "cm";
    }

}
