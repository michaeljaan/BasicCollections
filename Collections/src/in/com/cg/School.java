package in.com.cg;

public class School implements Comparable<School>
{
	private String Name;//instance member
	private String city;
	private String SchoolDistrict;
	private int GreatschoolRanking;
	
	public School(String name, String city, String schoolDistrict, int greatschoolRanking)//constructor 
	{
		super();
		Name = name;
		this.city = city;
		SchoolDistrict = schoolDistrict;
		GreatschoolRanking = greatschoolRanking;
	}

	public String getName()//getter
	{
		return Name;
	}

	public String getCity()//getter 
	{
		return city;
	}

	public String getSchoolDistrict()//getter
	{
		return SchoolDistrict;
	}

	public int getGreatschoolRanking()//getter 
	{
		return GreatschoolRanking;
	}
	
	public String toString()//function to display
	{
		return "School [School_Name: "+getName()+", City: "+getCity()+", SchoolDistrict: "+getSchoolDistrict()+", Ranking: "+getGreatschoolRanking()+" ]";
	}

	
	
	@Override
	public int hashCode()//hashcode function 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + ((SchoolDistrict == null) ? 0 : SchoolDistrict.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)//equals function 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (SchoolDistrict == null) {
			if (other.SchoolDistrict != null)
				return false;
		} else if (!SchoolDistrict.equals(other.SchoolDistrict))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		return true;
	}

	@Override
	public int compareTo(School arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
