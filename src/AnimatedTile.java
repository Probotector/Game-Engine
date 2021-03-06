
public class AnimatedTile extends Tile{
	
	int animationState = 4;
	
	public AnimatedTile(int id, SpriteSheet sheet, int xPos, int yPos, boolean isSolid, boolean isAnimated, boolean isDamage) {
		super(id, sheet, xPos, yPos, isSolid, isAnimated, isDamage);
	}
	
	public void setState(int state){
		if (this.id == 3){
			if (state == 1){
				animationState = 1;
				tilePixelData = sheet.getTileData(4, 0, 8, 8);
			}
			else if (state == 2){
				animationState = 2;
				tilePixelData = sheet.getTileData(6, 0, 8, 8);
			}
			else if (state == 3){
				animationState = 3;
				tilePixelData = sheet.getTileData(10, 0, 8, 8);
			}
			else if (state == 4){
				animationState = 4;
				tilePixelData = sheet.getTileData(12, 0, 8, 8);
			}
		}
		
	}

}
