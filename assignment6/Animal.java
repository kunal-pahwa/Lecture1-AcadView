package assignment5;


public class Animal {
   String breed;
   String color;

   void Speak(){
       System.out.println("i am animal!!");
   }


   public static void main(String args[])
   {
       Animal an=new Animal();
       Dog d=new Dog();
       Cat c=new Cat();

       an.Speak();
       d.Speak();
       c.Speak();
   }

}



                