package Assignment7;

public class DDog extends AbAnimal{
		String breed,colour,name;
		DDog(String breed,String colour,String name){
		this.breed=breed;
		this.colour=colour;
		this.name=name;
		}
		void me() {
			System.out.println("name: "+name);
			System.out.println("breed: "+breed);
			System.out.println("colour: "+colour);
		}

		void eat(){
			System.out.println("I eat cat.");
				}

	
}
