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
import lombok.Data;

/**
 * @author lscha
 *
 */
@Entity
@Data
public class Forest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int forestId;
	private String location;
	private String name;
}
