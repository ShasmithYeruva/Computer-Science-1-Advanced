/* TODO: 04E
 * Implement code
 */
public class S04Phantom extends S04DCCharacter {

	int multiverse;
	String name;
	boolean isHero;
	String superpower;
	public S04Phantom(String name, int multiverse, boolean isHero, String superpower){
		super(name, superpower, isHero, multiverse);
		this.multiverse = multiverse;
		this.name = name;
		this.isHero = isHero;
		this.superpower = superpower;
	}


	public int getMultiverse() {
		return multiverse;
	}

	public boolean isHero() {
		return isHero;
	}

	public String getSuperpower() {
		return superpower;
	}
}
