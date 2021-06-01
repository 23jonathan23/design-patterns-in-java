package br.com.cod3r.mediator.swing.mediator;

import br.com.cod3r.mediator.swing.components.AddButton;
import br.com.cod3r.mediator.swing.components.Label;
import br.com.cod3r.mediator.swing.components.State;

public class Mediator {
    private AddButton _button;
    private Label _label;
    private State _state;

    public void buttonClicked() {
        _state.addCount();
        _label.refresh();
    }

    public void stop() {
        _button.setEnabled(false);
    }

    public void reset() {
        _state.setCounter(0);
        _button.setEnabled(true);
        _label.refresh();
    }

    public int getCounterValue() {
		return _state.getCounter();
	}
	
	public void setButton(AddButton button) {
		_button = button;
	}

	public void setLabel(Label label) {
		_label = label;
	}

	public void setState(State state) {
		_state = state;
	}
}
