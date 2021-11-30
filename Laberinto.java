/*
 * Interface labyrinteille
 */
public interface Labyrinth {
	
	public abstract Square getSquare(int w, int l);
	
	public abstract Square getSquare(int w, int l, int h);
	
	public int getLengthW();

	public int getLengthH();

	public abstract boolean ratkaise(Player player);
	
	public long getSeed();

}

export NETHACKOPTIONS="name:Luis, number_pad:1,menucolors,color,!autopickup" 