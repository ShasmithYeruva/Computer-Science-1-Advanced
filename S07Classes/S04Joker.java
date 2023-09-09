/* TODO: 04D 
 * Implement code
 * Joker is always a villain no matter what universe.
 */

public class S04Joker extends S04DCCharacter {

	int multiverse;
	String name;
	String superpower;

	public S04Joker(String name, int multiverse, String superpower){
		super(name, superpower, false, multiverse);
		this.multiverse = multiverse;
		this.name = name;
		this.superpower = superpower;
	}


	public int getMultiverse() {
		return multiverse;
	}

	public boolean isHero() {
		return false;
	}

	public String getSuperpower() {
		return superpower;
	}
}
