package vacation.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Destination {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String country;
	private String province;
	private String city;
	@Autowired
	private Duration duration;

	// default no args
	public Destination() {
		super();
	}

	// if you want to roam and don't know exact destinations yet
	public Destination(String country) {
		super();
		this.country = country;
	}

//who knows ids? frankly, who cares if you're goin on vacaaaaa?!
	public Destination(String country, String province, String city) {
		super();
		this.country = country;
		this.province = province;
		this.city = city;
	}

//fine heres one with id as well	
	public Destination(long id, String country, String province, String city) {
		super();
		this.id = id;
		this.country = country;
		this.province = province;
		this.city = city;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Destination [id=" + id + ", country=" + country + ", province=" + province + ", city=" + city
				+ ", duration=" + duration + "]";
	}

	

}
