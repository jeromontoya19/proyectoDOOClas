package co.edu.uco.ucobet.busisnesslogic.usecase.city.impl;

import co.edu.uco.crosscutting.helpers.ObjectHelper;
import co.edu.uco.ucobet.busisnesslogic.adapter.entity.CityEntityAdapter;
import co.edu.uco.ucobet.busisnesslogic.usecase.city.UpdateCity;
import co.edu.uco.ucobet.crosscutting.exceptions.BusinessLogicUcoBetException;
import co.edu.uco.ucobet.data.dao.DAOFactory;
import co.edu.uco.ucobet.domain.CityDomain;

public final class UpdateCityImpl implements UpdateCity {
	
	private DAOFactory daoFactory;
	
	public UpdateCityImpl(DAOFactory daoFactory) {
		
	}

	@Override
	public void excecute(final CityDomain data) {
		// validate policies 
		
		var cityEntity = CityEntityAdapter.getCityEntityAdapter().adaptSource(data);
		daoFactory.getCityDAO().update(null);
	}

	private void setDaoFactory(final DAOFactory daoFactory) {
		if(ObjectHelper.isNull(daoFactory)) {
			var userMessage = "se ha presentado un error tratando de llevar a cabo..";
			var technicalMessage = "el dao factory requerido para crear la clase que actualiza la ciudad llego nula";
			throw BusinessLogicUcoBetException.crear(userMessage, technicalMessage);
		}
		
		this.daoFactory = daoFactory;
	}
	
	
	
}
