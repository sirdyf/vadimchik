package com.example.vadimchik;

import com.vaadin.Application;
import com.vaadin.ui.*;

public class VadimchikApplication extends Application {
	private mWin myWin;
	@Override
	public void init() {
		Window mainWindow = new Window("Vadimchik Application");
		//Label label = new Label("Hello Vaadin user");
		//mainWindow.addComponent(label);
		myWin=new mWin();
		//mainWindow.addComponent(myWin);
		mainWindow.setContent(myWin);
		setMainWindow(mainWindow);
	}

}
