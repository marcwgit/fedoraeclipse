package TurtleGraphics;

import java.util.Random;

public class drawcards 
{
	public void Drawcard (StandardPen pen)
	{
		pen.down();
		Random generator=new Random();
		String cardValue="";
		int number, suit;

		number=generator.nextInt(13)+1;

		pen.setDirection(0);
		pen.move(150);
		pen.setDirection(90);
		pen.move(250);
		pen.setDirection(180);
		pen.move(150);
		pen.setDirection(270);
		pen.move(250);
		pen.up();
		pen.setDirection(0);
		pen.move(10);
		pen.setDirection(90);
		pen.move(10);
		


		cardValue=cardValue+number;
		pen.drawString(cardValue);

		//move to where other 10 is drawn
		pen.up();
		pen.setDirection(0);
		pen.move(120);
		pen.setDirection(90);
		pen.move(230);
		pen.drawString(cardValue);


		//move to where each suit will be drawn
		pen.up();
		pen.setDirection(d);
		

		
		
		
		suit=generator.nextInt(4)+1;
		suit=1;
		if(suit==1)
			DrawDiamond(pen);
		if(suit==2)
			DrawHeart(pen);
		if(suit==3)
			DrawClubs(pen);
		if(suit==4)
			DrawSpades(pen);





	}
	public void DrawDiamond(StandardPen pen)
	{
		//DIAMOND
		
		pen.down();
		pen.setWidth(60);
		pen.setDirection(30);
		pen.move(30);
		//move to where next card is drawn


	}

	public void DrawHeart(StandardPen pen)
	{
		//HEARTS
		pen.up();
		pen.setDirection(90);
		pen.move(120);
		pen.setDirection(0);
		pen.move(45);
		pen.down();
		pen.setDirection(57);
		for(int count=1; count<=80; count++){
			pen.move(1);
			pen.turn(3);}
		pen.setDirection(300);
		pen.move(67);
		pen.setDirection(53);
		pen.move(68);
		pen.setDirection(57);
		for(int count=1; count<=80; count++){
			pen.move(1);
			pen.turn(3);}
		pen.up();
		pen.setDirection(0);
		pen.move(100);
		pen.up();
		pen.setDirection(0);
		pen.move(100);
		pen.setDirection(270);
		pen.move(70);

	}
	public void DrawClubs(StandardPen pen)
	{
		//CLUBS



	}

	public void DrawSpades(StandardPen pen)
	{
	}
}