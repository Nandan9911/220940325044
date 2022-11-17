import java.util.Scanner;
class GrandParent
{
	private String grandFatherName;
	private String grandMotherName;
	
	public GrandParent(){}
	
	public GrandParent(String grandFatherName,String grandMotherName)
	{
		this.grandFatherName = grandFatherName;
		this.grandMotherName = grandMotherName;
		System.out.println("Grand Father's name :"+this.grandFatherName);
		System.out.println("Grand Mother's name :"+this.grandMotherName);
	}
}

class Parent extends GrandParent
{
	private String fatherName;
	private String motherName;
	
	public Parent(){}
	
	public Parent(String grandFatherName,String grandMotherName)
	{
		super(grandFatherName,grandMotherName);
	}
	
	public Parent(String grandFatherName, String grandMotherName,String fatherName,String motherName)
	{
		this(grandFatherName,grandMotherName);
		this.fatherName = fatherName;
		this.motherName = motherName;
		System.out.println("Father's name :"+this.fatherName);
		System.out.println("Mother's name :"+this.motherName);
	}
}

class Child extends Parent
{
	public Child(){}
	
	public Child(String grandFatherName,String grandMotherName,String fatherName,String motherName)
	{
		super(grandFatherName,grandMotherName,fatherName,motherName);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter names in the following order: Grand Father ---> Grand Mother ---> Father ---> Mother");
		String gfName = sc.nextLine();
		String gmName = sc.nextLine();
		String fName = sc.nextLine();
		String mName = sc.nextLine();
		System.out.println();
		Child c = new Child(gfName,gmName,fName,mName);
	}
}
		
			
	
	