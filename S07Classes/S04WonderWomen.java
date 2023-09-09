/* TODO: 04B 
 * Implement code 
 * Wonder Women's name is always "Wonder Women"
 * Wonder Women's super power is that she is an "Amazon"
 * Wonder Women is only from multiverse 1.
 * Wonder Women is always a hero.
 */

public class S04WonderWomen extends S04DCCharacter {

	public S04WonderWomen(){
		super("Wonder Women", "Amazon", true, 1);
	}


	public int getMultiverse() {
		return 1;
	}

	public boolean isHero() {
		return true;
	}

	public String getSuperpower() {
		return "Amazon";
	}
	public String getName() {
		return "Wonder Women";
	}
}
