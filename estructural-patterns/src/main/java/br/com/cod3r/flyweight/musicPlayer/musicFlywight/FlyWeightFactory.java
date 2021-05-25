package br.com.cod3r.flyweight.musicPlayer.musicFlywight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
	private static FlyWeightFactory _instance = new FlyWeightFactory();
    private static Map<String, MusicFlyweight> _musicFlyRepository;

    public FlyWeightFactory() {
		_musicFlyRepository = new HashMap<String, MusicFlyweight>();
	}

    public static FlyWeightFactory getInstance() {
		return _instance;
	}

	public MusicFlyweight getMusic(String desc) {
		MusicFlyweight mf = _musicFlyRepository.get(desc);
		if(mf == null) {
			System.out.println("Creating new Flyweight for " + desc);
			mf = getMusicByString(desc);
			_musicFlyRepository.put(desc, mf);
		}

		return mf;
	}

	private MusicFlyweight getMusicByString(String desc) {
		String[] musicData = desc.split(";");
		return new MusicFlyweight(musicData[0], musicData[1], Integer.parseInt(musicData[2]));
	}
}
