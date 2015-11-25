package springsim;

import controlP5.ControlP5;
import controlP5.DropdownList;
import controlP5.Textfield;
import processing.core.PApplet;

public class ExperimentSettings implements Component {
	
	int x;
	int y;
	int w;
	int h;
	DropdownList d1;
	Textfield tf1;
	
	PApplet parent;

	public ExperimentSettings(Main main, ControlP5 cp5, int _x, int _y, int _w, int _h) {
		this.x = _x;
		this.y = _y;
		this.w = _w;
		this.h = _h;
		parent = main;
		
		  d1 = cp5.addDropdownList("myList-d1")
		          .setPosition(this.x+60, this.y+50)
		          .setSize(80,40)
		          .setItemHeight(20)
		  		  .setBarHeight(20)
		          ;
		  
		  d1.addItem("Earth", 1);
		  
	}

	@Override
	public void step() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {
		//adjust for the fact rect() uses center, not top-left, xy coordinates
		int xRect = x+(w/2);
		int yRect = y+(h/2);
		
		parent.fill(255);
		parent.rect(xRect, yRect, w, h);
		parent.fill(0);
		parent.text("Experiment Settings", x+10, y+15);
		
	}

}