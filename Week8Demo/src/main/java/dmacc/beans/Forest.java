/**
 * @author lscha - lrschanus
 * CIS175 - Fall 2021
 * Oct 11, 2023
 */
package dmacc.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * @author lscha
 *
 */
@Entity
public class Forest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int forestId;
	private String location;
	private String name;

	public int getForestId() {
		return forestId;
	}

	public void setForestId(int forestId) {
		this.forestId = forestId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Forest [forestId=" + forestId + ", location=" + location + ", name=" + name + "]";
	}
	
	

}
