package co.edu.uco.ucobet.busisnesslogic.usecase;

public interface UseWithReturn<D, R> {
	
	R excecute(D data);

}
