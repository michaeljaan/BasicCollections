package in.com.cg;

public class Television implements Comparable<Television>
{
	private String Company;//instance member
	private String type;
	private String features;
	private double price;
	
	public Television(String company, String type, String features, double price)//constructor
	{
		super();
		this.Company = company;
		this.type = type;
		this.features = features;
		this.price = price;
	}

	public String getCompany()//getter 
	{
		return Company;
	}

	public String getType()//getter 
	{
		return type;
	}

	public String getFeatures()//getter 
	{
		return features;
	}

	public double getPrice()//getter
	{
		return price;
	}
	
	public String toString()//function to display 
	{
		return "Television [Company: "+getCompany()+", Type: "+getType()+", Features: "+getFeatures()+", Price: "+getPrice()+" ]";
	}
	
	
	
	@Override
	public int hashCode()//hashcode function 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Company == null) ? 0 : Company.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)//equal function
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Television other = (Television) obj;
		if (Company == null) {
			if (other.Company != null)
				return false;
		} else if (!Company.equals(other.Company))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public int compareTo(Television arg0)//compare to function
	{
		// TODO Auto-generated method stub
		return 0;
	}
}
