package br.com.cod3r.mediator.swing.components;

import br.com.cod3r.mediator.swing.mediator.Mediator;

public class State {
	private int _counter;
	private Mediator _mediator;
	
	public State(Mediator mediator) {
		_counter = 0;
		_mediator = mediator;
	}
	
	public void addCount() {
		_counter++;
		if(_counter == 10) {
			_mediator.stop();
		}
	}

	public int getCounter() {
		return _counter;
	}

	public void setCounter(int counter) {
		_counter = counter;
	}
}
