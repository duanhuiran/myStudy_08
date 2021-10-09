package com.duanhuiran;

public class Dog2 {

    public int weightInPounds = 10;
    public static String bioname = "AllDogsName"; //这个静态变量可以适用于整个Dog2 class（也适用于实例），可以直接由 Dog2.bioname 访问

/*One integer constructor for dogs
 * 可以添加一个新的构造函数，把没有参数的class Dog 变得必须用class Dog(x)的参数执行 */

    public Dog2(int x){
        weightInPounds = x;
    }

    public void makeNoise(){
        if (weightInPounds < 10)
            System.out.println("1Bark!");
        else if (weightInPounds < 30)
            System.out.println("2Wooooo~");
        else
            System.out.println("3HAHAHAHAHAHAAHA!");
    }
/** 创建一个静态的 maxDog 函数 **/
    public static Dog2 maxDog(Dog2 d1 , Dog2 d2){
        if (d1.weightInPounds > d2.weightInPounds){
            return d1;
        }
        return d2;
    }
/** 创建一个非静态的 maxDogNon 函数，并运用 this **/
/** 这里没搞懂，也许用this的时候，需要从外部class引入一个实例dog（不是通过参数引入），就变成非静态了 **/

    public Dog2 maxDogNon(Dog2 d1){
        if (this.weightInPounds > d1.weightInPounds){
            return this;
        }
        return d1;
    }

}
