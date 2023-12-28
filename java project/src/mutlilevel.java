class lion{  
void eat(){System.out.println("eating...");}  
}  
class tiger extends lion{  
void bark(){System.out.println("barking...");}  
}  
class BabyDog extends tiger{  
void weep(){System.out.println("weeping...");}  
}  
class mutlilevel{  
public static void main(String args[]){  
BabyDog d=new BabyDog();  
d.weep();  
d.bark();  
d.eat();  
}}  