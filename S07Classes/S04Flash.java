/* TODO: 04B 
 * Implement code.
 * Flash's super power is that he is "Really Fast".
 */

public class S04Flash extends S04DCCharacter {

	int multiverse;
	String name;
	boolean isHero;
	public S04Flash(String name, int multiverse, boolean isHero){
		super(name, null, isHero, multiverse);
		this.multiverse = multiverse;
		this.name = name;
		this.isHero = isHero;
	}


	public int getMultiverse() {
		return multiverse;
	}

	public boolean isHero() {
		return isHero;
	}

	public String getSuperpower() {
		return "Really Fast";
	}
}
