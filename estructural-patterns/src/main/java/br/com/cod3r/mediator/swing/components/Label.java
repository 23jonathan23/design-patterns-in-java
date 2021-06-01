package br.com.cod3r.mediator.swing.components;

import java.awt.Font;

import javax.swing.JLabel;

import br.com.cod3r.mediator.swing.mediator.Mediator;

public class Label extends JLabel {
	private static final long _serialVersionUID = 4136663121512778435L;
	private Mediator _mediator;
	
	public Label(Mediator mediator) {
		super("Times Clicked: 0");
		setFont(new Font(getFont().getName(), Font.BOLD, 30));

		_mediator = mediator;
	}

	public void refresh() {
		super.setText("Times Clicked: " + _mediator.getCounterValue());
	}
}
