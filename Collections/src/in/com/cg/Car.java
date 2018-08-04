package in.com.cg;

public class Car implements Comparable<Car>//class of type Car
{
	
	private String make;//instance member
	private String model;
	private int year;
	private double price; 
	
	public Car(String string, String string2, int i, double j)//constructor 
	{
		super();
		this.make=string;
		this.model=string2;
		this.year=i;
		this.price=j;
	}

	public String getMake()//getter 
	{
		return make;
	}

	public String getModel()//getter 
	{
		return model;
	}

	public int getYear()//getter 
	{
		return year;
	}

	public double getPrice()//getter 
	{
		return price;
	}
	
	public String toString()//Function to display
	{
		return "Car [Company: "+getMake()+", Model: "+getModel()+", Year: "+getYear()+", Price: "+getPrice()+" ]";
	}

	
	
	@Override
	public int hashCode()//Hashcode 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)//equals
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	@Override
	public int compareTo(Car arg0) //compareTo function
	{
		// TODO Auto-generated method stub
		return 0;
	}
}
