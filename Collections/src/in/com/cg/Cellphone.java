package in.com.cg;

public class Cellphone implements Comparable<Cellphone>//class of type Cellphone
{
	private String Company;//instance member
	private String model;
	private String description;
	private String OS;
	private double price;
	
	public Cellphone(String company, String model, String description, String oS, double price)//constructor 
	{
		super();
		Company = company;
		this.model = model;
		this.description = description;
		OS = oS;
		this.price = price;
	}

	public String getCompany()//getter 
	{
		return Company;
	}

	public String getModel()//getter 
	{
		return model;
	}

	public String getDescription()//getter
	{
		return description;
	}

	public String getOS()//getter 
	{
		return OS;
	}

	public double getPrice()//getter
	{
		return price;
	}
	
	public String toString()//function to display
	{
		return "Cellphone [Company: "+getCompany()+", Model: "+getModel()+", Description: "+getDescription()+", OS: "+getOS()+", Price: "+getPrice()+" ]";
	}

	
	
	@Override
	public int hashCode() //hashcode function
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Company == null) ? 0 : Company.hashCode());
		result = prime * result + ((OS == null) ? 0 : OS.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
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
		Cellphone other = (Cellphone) obj;
		if (Company == null) {
			if (other.Company != null)
				return false;
		} else if (!Company.equals(other.Company))
			return false;
		if (OS == null) {
			if (other.OS != null)
				return false;
		} else if (!OS.equals(other.OS))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	@Override
	public int compareTo(Cellphone arg0)//compare to function 
	{
		// TODO Auto-generated method stub
		return 0;
	}
	
}
