package com.rhymes.game.entity.elements.arnold.stage.menu.setting.button;

import com.rhymes.game.entity.elements.arnold.stage.menu.mainmenu.MainMenuArnold;
import com.rhymes.game.entity.elements.ui.Button;
import com.rhymes.ge.core.data.GlobalVars;
import com.rhymes.ge.core.renderer.Point;
import com.rhymes.helpers.Helper;

public class BackToMainMenuArnold  extends Button{
	String imagePath_1, imagePath_2;

	public BackToMainMenuArnold(float x, float y, float width, float height,
			int zIndex, String imagePath_1, String imagePath_2) {
		super(x, y, width, height, zIndex, imagePath_1);

		this.imagePath_1 = imagePath_1;
		this.imagePath_2 = imagePath_2;
	}

	
	@Override
	public void onEvent(Point p) {

		if(this.checkHit(p)){
			
			this.image = Helper.getImageFromAssets(imagePath_2);
			GlobalVars.ge.loadStage(new MainMenuArnold());		

		}
	}

}