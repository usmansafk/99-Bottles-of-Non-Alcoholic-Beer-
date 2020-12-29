//This is the classic attempt at the children favourite "99 bottles of beer"-- Halaal version; from the HF:Java book

public class NonAlcoholicBeerSong {

	public static void main (String[] args) {

		int beerNum = 99;
		String word = "bottles";

		while (beerNum > 0)
		{

			if (beerNum == 1 ) {
				word = "bottle";
			}

			System.out.println(beerNum + " " + word + " of non-alcoholic beer on the wall,");
			System.out.println(beerNum + " " + word + " of non-alcoholic beer.");
			System.out.println("Take one down..");
			System.out.println("Pass it around..");

			beerNum = beerNum - 1;

			if (beerNum > 0) {
				System.out.println(beerNum + " " + word + " of non-alcoholic beer on the wall,");
			}
		
			else {
				System.out.println("No more bottles of non-alcoholic beers left!");
			}
		

		}
	}

}
