/* TODO: 04C
 * Implement code
 * Batman's super power is strength is that he is "Rich"
 * Batman is always a hero no matter what universe.
 */

public class S04Batman extends S04DCCharacter {

	int multiverse;
	String name;

	public S04Batman(String name, int multiverse){
		super(name, null, true, multiverse);
		this.multiverse = multiverse;
		this.name = name;
	}


	public int getMultiverse() {
		return multiverse;
	}

	public boolean isHero() {
		return true;
	}

	public String getSuperpower() {
		return "Rich";
	}
}
