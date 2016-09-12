/**
 * 
 */
package com.adaming.tpLocVoitures.service;

import java.util.List;

/**
 * @author inti0314
 *
 */
public interface IGenericService<T> {

	T add(T t);
	T update(T t);
	T find(Long id);
	List<T> getAll();
}
