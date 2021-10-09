package com.duanhuiran;

public class Dog{

    public int weightInPounds;// it's an instance variable.对于实例的变量。

//静态Statics method 不能从非静态 No-Statics 的 field 里引入变量，
//所以解决方案之一是，下面的函数删除 Statics 或者 在上面的class上也加入Statics

    public void makeNoise(){ // nom-static method A.K.A instance method. The method will be invoked in an instance class
        //简单来说，就是他会变成 my instance 的话，就得用非静态method
        if (weightInPounds < 10)
            System.out.println("Bark!");
        else if (weightInPounds < 30)
            System.out.println("Wooooo~");
        else
            System.out.println("HAHAHAHAHAHAAHA!");
    }



}
