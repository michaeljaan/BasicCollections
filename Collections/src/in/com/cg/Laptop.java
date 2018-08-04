package in.com.cg;

public class Laptop implements Comparable<Laptop>
{
	private String Company;//instance member
	private int model;
	private String OS;
	private String Processor;
	
	public Laptop(String company, int model, String oS, String processor) //constructor
	{
		super();
		Company = company;
		this.model = model;
		OS = oS;
		Processor = processor;
	}

	public String getCompany()//getter 
	{
		return Company;
	}

	public int getModel()//getter 
	{
		return model;
	}

	public String getOS()//getter 
	{
		return OS;
	}

	public String getProcessor()//getter 
	{
		return Processor;
	}
	
	public String toString()//function to display
	{
		return "Laptop [Company: "+getCompany()+", Model: "+getModel()+", OS: "+getOS()+", Processor: "+getProcessor()+" ]";
	}
	
	
	@Override
	public int hashCode()//hashcode function 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Company == null) ? 0 : Company.hashCode());
		result = prime * result + model;
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
		Laptop other = (Laptop) obj;
		if (Company == null) {
			if (other.Company != null)
				return false;
		} else if (!Company.equals(other.Company))
			return false;
		if (model != other.model)
			return false;
		return true;
	}

	@Override
	public int compareTo(Laptop arg0)//compare to function 
	{
		// TODO Auto-generated method stub
		return 0;
	}
	
}
