/**
 * @author lscha - lrschanus
 * CIS175 - Fall 2021
 * Oct 11, 2023
 */
package dmacc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Forest;

/**
 * @author lscha
 *
 */

@Repository
public interface IForestRepo extends JpaRepository<Forest, Long>{
	

}
