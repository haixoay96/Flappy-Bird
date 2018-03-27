package flappybird;

import java.awt.Rectangle;

import pkg2dgamesframework.Objects;

public class Bird extends Objects {
	private float vt = 0;
	private boolean isFlying;
	private Rectangle rect;
	private boolean isLive = true;
	
	public Bird(int x , int y , int w , int h){
		super(x,y,w,h);
		rect = new Rectangle(x, y, w, h);
		
		
	}
	public void setLive(boolean isLive){
		this.isLive = isLive;
	}
	public boolean getLive(){
		return isLive;
	}
	public void setVt(float vt){
		this.vt = vt;
	}
	public void update(long deltaTime){
		vt+=FlappyBird.g;
		this.setPosY(this.getPosY() + vt);
		this.rect.setLocation((int)this.getPosX(),(int)this.getPosY());
		if(vt<0){
			isFlying = true;
		}
		else {
			isFlying = false;
		}
	}
	public void fly(){
		vt=-3;
	}
	public boolean getIsFlying(){
		return isFlying;
	}
	public Rectangle getRect(){
		return rect;
	}


}
