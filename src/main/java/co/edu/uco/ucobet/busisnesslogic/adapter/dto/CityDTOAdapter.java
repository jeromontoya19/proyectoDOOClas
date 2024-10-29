package co.edu.uco.ucobet.busisnesslogic.adapter.dto;

import co.edu.uco.crosscutting.helpers.ObjectHelper;
import co.edu.uco.crosscutting.helpers.TextHelper;
import co.edu.uco.crosscutting.helpers.UUIDHelper;
import co.edu.uco.ucobet.busisnesslogic.adapter.Adapter;
import co.edu.uco.ucobet.domain.CityDomain;
import co.edu.uco.ucobet.domain.CountryDomain;
import co.edu.uco.ucobet.dto.CityDTO;
import co.edu.uco.ucobet.dto.CountryDTO;

public class CityDTOAdapter implements Adapter<CityDomain, CityDTO>{
	
	private static final Adapter<CityDomain, CityDTO> instance = new CityDTOAdapter();
	
	private CityDTOAdapter() {
		
	}
	
	public static Adapter<CityDomain, CityDTO> getCityDTOAdapter() {
		return instance;
	}


	@Override
	public CityDomain adaptSource(CityDTO data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CityDTO adaptTarget(CityDomain data) {
		// TODO Auto-generated method stub
		return null;
	}


}
