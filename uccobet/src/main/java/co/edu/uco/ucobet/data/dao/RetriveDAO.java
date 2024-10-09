package co.edu.uco.ucobet.data.dao;

import java.util.List;

interface RetriveDAO<T, I> {
	
	T findByID(I id);
	List<T> findAll();
	
	List<T> findByFilter(T filter);

}
