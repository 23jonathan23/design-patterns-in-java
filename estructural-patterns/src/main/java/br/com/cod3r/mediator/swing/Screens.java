package br.com.cod3r.mediator.swing;

import javax.swing.JFrame;
import javax.swing.JLabel;

import br.com.cod3r.mediator.swing.components.AddButton;
import br.com.cod3r.mediator.swing.components.Label;
import br.com.cod3r.mediator.swing.components.ResetButton;
import br.com.cod3r.mediator.swing.components.State;
import br.com.cod3r.mediator.swing.mediator.Mediator;

import java.awt.BorderLayout;

public class Screens {
    private AddButton _button;
	private ResetButton _reset;
	private Label _label;
	private State _state;
	private Mediator _mediator;

	public Screens() {
		_mediator = new Mediator();
		_state = new State(_mediator);
		_label = new Label(_mediator);
		_button = new AddButton(_mediator);
		_reset = new ResetButton(_mediator);
		_mediator.setButton(_button);
		_mediator.setLabel(_label);
		_mediator.setState(_state);
	}

    private void initButtonScreen(Mediator mediator) {
		JFrame frame = new JFrame();  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Button's Screen");
		frame.setLayout(new BorderLayout());
		
		frame.add(_reset, BorderLayout.WEST);
		frame.add(_button, BorderLayout.CENTER);
		
		frame.setSize(400,200);  
		frame.setVisible(true);
	}
	
	private void initCounterScreen(Mediator mediator) {
		JFrame frame = new JFrame();  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Counter's Screen");
		
		frame.add(_label);
		
		frame.setSize(400,200);  
		frame.setVisible(true);
	}
	
	public void init() {
		initButtonScreen(_mediator);
		initCounterScreen(_mediator);
	}
}
