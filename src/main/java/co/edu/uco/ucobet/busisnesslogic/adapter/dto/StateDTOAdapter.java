package co.edu.uco.ucobet.busisnesslogic.adapter.dto;

import co.edu.uco.ucobet.busisnesslogic.adapter.Adapter;
import co.edu.uco.ucobet.busisnesslogic.adapter.entity.CityEntityAdapter;
import co.edu.uco.ucobet.domain.CityDomain;
import co.edu.uco.ucobet.domain.StateDomain;
import co.edu.uco.ucobet.dto.StateDTO;
import co.edu.uco.ucobet.entity.CityEntity;

public class StateDTOAdapter implements Adapter<StateDomain, StateDTO>{
	
	private static final Adapter<StateDomain, StateDTO> instance = new StateDTOAdapter();
	
	private StateDTOAdapter() {
		
	}
	
	public static Adapter<StateDomain, StateDTO> getStateDTOAdapter() {
		return instance;
	}


	@Override
	public StateDomain adaptSource(StateDTO data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StateDTO adaptTarget(StateDomain data) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
