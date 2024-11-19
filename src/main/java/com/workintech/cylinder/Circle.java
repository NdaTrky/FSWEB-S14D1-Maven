package com.workintech.cylinder;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
}

    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }

}
// Eğer ortak method kullanımları artıyorsa (iki farklı class'da aynı şeyleri yapmaya başlıyorsak)
// ve bir ortak paydada birleşebiliyorsa; mutlaka bir parent class düşünülmeli. Bu parent class'ın
// içinde ortak paydaları kullanıp bir kalıtım hiyerarşisi oluşturmalıyız.
