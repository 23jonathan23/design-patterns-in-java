package br.com.cod3r.flyweight.musicPlayer.musicFlywight;

public class MusicFlyweight {
    private final String _name;
	private final String _artist;
	private final Integer _durationInSeconds;

    public MusicFlyweight(String name, String artist, Integer durationInSeconds) {
		_name = name;
		_artist = artist;
		_durationInSeconds = durationInSeconds;
	}

    public String getName() {
		return _name;
	}

	public String getArtist() {
		return _artist;
	}

	public Integer getDurationInSeconds() {
		return _durationInSeconds;
	}
}
