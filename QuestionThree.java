class Shape
{
	void draw()
	{
		System.out.println("Shape drawn...");
	}
	
	void erase()
	{
		System.out.println("Shape erased...");
	}
}

class Circle extends Shape
{
	@Override
	void draw()
	{
		System.out.println("Circle drawn...");
	}
	
	@Override
	void erase()
	{
		System.out.println("Circle erased...");
	}
}

class Triangle extends Shape
{
	@Override
	void draw()
	{
		System.out.println("Triangle drawn...");
	}
	
	@Override
	void erase()
	{
		System.out.println("Triangle erased...");
	}
}

class Square extends Shape
{
	@Override
	void draw()
	{
		System.out.println("Square drawn...");
	}
	
	@Override
	void erase()
	{
		System.out.println("Square erased...");
	}
}

class QuestionThree
{
	public static void main(String args[])
	{
		Shape s = new Shape(); //early binding: Shape object is bound to Shape reference "s" during compile time
		s.draw();
		s.erase();
		System.out.println();
		Shape c = new Circle(); //late binding: Circle object is bound to Shape reference "c" type by the JVM (upcasting)
		c.draw();
		c.erase();
		System.out.println();
		Shape t = new Triangle(); //late binding: Triangle object is bound to Shape reference "t" type by the JVM (upcasting)
		t.draw();
		t.erase();
		System.out.println();
		Shape sq = new Square(); //late binding: Square object is bound to Shape reference "sq" type by the JVM (upcasting)
		sq.draw();
		sq.erase();
		System.out.println();
	}
}
		