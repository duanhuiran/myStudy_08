package com.duanhuiran;

/**
 * A variable or method defined in a class is also called a member of that class.
 * Static members are accessed using class name, e.g. Dog.binomen.
 * Non-static members cannot be invoked using class name: Dog.makeNoise.
 * Static methods must access instance variables via a specific instance, e.g. d1.
 * 静态与非静态，其实是实例与非实例的关系。
 **/

public class DogLauncher {
    public static void main(String[] args){
//  如果不添加instance（new）的话，则无法从静态上下文中引用非静态 方法 makeNoise()
//        Dog.makeNoise(); //————错
        Dog d = new Dog();
//  在 DogLauncher 这个class中创建实例，则能够访问里面的函数和变量，并且执行他或者修改它。
//  若已经在 Dog 这个 class 中创建了实例，则在 DogLauncher 这里无法修改变量
        d.weightInPounds = 0;//修改体重变量
        d.makeNoise();//执行method。

        Dog c = new Dog();
        c.weightInPounds = 25;
        c.makeNoise();

/**现在来看构造函数 constructor 的call **/
        Dog2 e1 =  new Dog2(13);
        e1.makeNoise();

        Dog2 e2 =  new Dog2(33);
        e2.makeNoise();

/** call一个静态的比较method **/
        Dog2.maxDog(e1,e2).makeNoise();

/** call一个非静态的比较method**/
        e1.maxDogNon(e2).makeNoise();

/** 访问一个静态的变量 bioname **/
        System.out.println(Dog2.bioname);
        System.out.println(e1.bioname);





    }
}
