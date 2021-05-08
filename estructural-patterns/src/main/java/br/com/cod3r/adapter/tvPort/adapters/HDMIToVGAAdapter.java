package br.com.cod3r.adapter.tvPort.adapters;

import br.com.cod3r.adapter.tvPort.intefaces.HDMI;
import br.com.cod3r.adapter.tvPort.intefaces.VGA;

public class HDMIToVGAAdapter implements HDMI {
    private VGA _vga;

    public HDMIToVGAAdapter(VGA vga) {
        System.out.println("Conecting the HDMI/VGA adapter...");
        _vga = vga;
    }

    @Override
    public void setImage(String image) {
        System.out.println("Coverting the image from HDMI to VGA");
        _vga.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Sorry, We don't work with sound");
    }
}
