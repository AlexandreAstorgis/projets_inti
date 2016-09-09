package com.adaming.tpLocVoitures.dao;

import java.util.List;

/**
 * @author inti0314
 *
 */
public interface IGenericDAO<T> {

	T add(T t);
	T update(T t);
	T find(Long id);
	List<T> getAll();
	T delete(T t);
}
