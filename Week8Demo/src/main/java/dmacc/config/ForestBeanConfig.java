/**
 * @author lscha - lrschanus
 * CIS175 - Fall 2021
 * Oct 11, 2023
 */
package dmacc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Forest;

/**
 * @author lscha
 *
 */
@Configuration
public class ForestBeanConfig {

	@Bean
	public Forest forest() {
		Forest forest = new Forest();
		return forest;
	}
}
