import java.util.ArrayList;
import java.util.Scanner;

import com.ismo.exabstract.AbstractAnimal;
import com.ismo.exabstract.AnimalCarnivor;
import com.ismo.exabstract.AnimalHerbivor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<AbstractAnimal> animaux = new ArrayList<>();
		
		animaux.add(new AnimalCarnivor("Lion"));
		animaux.add(new AnimalHerbivor("Lapin"));
		animaux.add(new AnimalCarnivor("Chien"));
		animaux.add(new AnimalCarnivor("Chat"));
		animaux.add(new AnimalHerbivor("Gazelle"));
		
		for(AbstractAnimal a: animaux)
			a.manger();
	}
}
