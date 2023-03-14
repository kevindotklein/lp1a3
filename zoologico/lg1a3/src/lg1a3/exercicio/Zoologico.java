package lg1a3.exercicio;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {

	private static List<Animal> animais = new ArrayList<>();
	
	
	public List<Animal> getAnimais() {
		return animais;
	}
	
	public static void adicionarAnimal(Animal animal) {
		animais.add(animal);
	}
	
	public static void listarAnimais() {
		for(Animal animal : animais) {
			System.out.println(animal);
		}
	}

	public static void alimentarAnimais() {
		for(Animal animal : animais) {
			animal.alimentar();
		}
	}
	
	public static void main(String[] args) {
		Mamifero humano = new Mamifero("bruno", 18, "humano", 9);
		Ave pombo = new Ave("pombo", 3, "pombo", "pequeno");
		Reptil jacare = new Reptil("jacare", 10, "jacare", 26.5);
		
		adicionarAnimal(humano);
		adicionarAnimal(pombo);
		adicionarAnimal(jacare);
		
		alimentarAnimais();
		
		listarAnimais();
	}

}
