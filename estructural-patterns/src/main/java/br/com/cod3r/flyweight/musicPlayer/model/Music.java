package br.com.cod3r.flyweight.musicPlayer.model;

import br.com.cod3r.flyweight.musicPlayer.musicFlywight.MusicFlyweight;

public class Music {
	private MusicFlyweight _musicFlywight;
	private Integer _playerQty;
	
	public Music(MusicFlyweight musicFlywight) {
		_musicFlywight = musicFlywight;
		_playerQty = 0;
	}
	
	public void listenning() {
		_playerQty++;
	}

	public Integer getPlayerQty() {
		return _playerQty;
	}

	public MusicFlyweight getMusicFlyweight() {
		return _musicFlywight;
	}
	
	@Override
	public String toString() {
		return "Music [name=" + _musicFlywight.getName() + ", artist=" + _musicFlywight.getArtist() + ", durationInSeconds=" + _musicFlywight.getDurationInSeconds()
				+ ", _playerQty=" + _playerQty + "]";
	}
}
