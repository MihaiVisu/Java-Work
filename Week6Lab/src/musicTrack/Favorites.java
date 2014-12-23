package musicTrack;

public class Favorites {

	MusicTrack[] tracks;
	int count = 0;
	public Favorites() {
		tracks = new MusicTrack[5];
	}
	
	public void addTrack (String artist, String title) {
		MusicTrack x = new MusicTrack(artist, title);
		if (count == 5) {
			System.out.println("TrackList is FULL ! Cannot add "+x+"\n");
			return;
		}
		tracks[count++] = x;
	}
	
	public void showFavourites () {
		for (MusicTrack x : tracks) {
			if(x != null)
				System.out.println(x);
		}
	}
	
	public static void main(String[] args) {
		Favorites favourites = new Favorites();
		favourites.addTrack("Fun", "Some Nights");
		favourites.addTrack("Oliver Tank", "Help You Breathe");
		favourites.addTrack("Horse Feathers", "Fit Against the Country");
		favourites.addTrack("Emile Sande", "Country House");
		favourites.addTrack("Fun", "Walking the Dog");
		favourites.addTrack("Porcelain Raft", "Put Me To Sleep");
		favourites.showFavourites();
	}
	
}
