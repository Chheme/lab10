class Cat extends Animal{

    public static void run(double r){
        if(r<=200 && r>0) System.out.println("cat.run("+r+") -> результат: run: true");
        else System.out.println("cat.run("+r+") -> результат: run: false");
    }
    public static void jump(double j){
        if(j<=2 && j>0) System.out.println("cat.jump("+j+") -> результат: jump:true");
        else System.out.println("cat.jump("+j+") -> результат: jump:false");
    }
    public static void swim(double s){
        System.out.println("Кот не умеет плавать");
    }
}
