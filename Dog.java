class Dog extends Animal{

    public static void run(double r){
        if(r<=500 && r>0) System.out.println("dog.run("+r+") -> результат: run: true");
        else System.out.println("dog.run("+r+") -> результат: run: false");
    }
    public static void jump(double j){
        if(j<=0.5 && j>0) System.out.println("dog.jump("+j+") -> результат: jump:true");
        else System.out.println("dog.jump("+j+") -> результат: jump:false");
    }
    public static void swim(double s){
        if(s<=10 && s>0) System.out.println("dog.jump("+s+") -> результат: jump:true");
        else System.out.println("dog.swim("+s+") -> результат: swim:false");
    }
}
