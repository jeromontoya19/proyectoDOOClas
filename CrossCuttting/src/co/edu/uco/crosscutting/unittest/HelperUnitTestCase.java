package co.edu.uco.crosscutting.unittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.uco.crosscutting.helpers.ObjectHelper;

class HelperUnitTestCase {

	@Test
	void givenWantValidateIfObjectIsNullWhenObjectIsNullThenResultIsTrue() {
		// Arrange: initial context
		String object = null;
		
		// Act
		boolean result = ObjectHelper.isNull(object);
		
		// Assert
		assertTrue(result);
	}
	
	@Test
	void givenWantValidateIfObjectIsNotNullWhenObjectIsNotNullThenResultIsFalse() {
		// Arrange: initial context
		String object = "";
		
		// Act: execute, action
		boolean result = ObjectHelper.isNull(object);
		
		// Assert: validate result
		assertFalse(result);
	}
	
	@Test
	void givenWantGetOriginalValueWhenObjectIsNotNullThenResultIsTheSameObject() {
		// Arrange: initial context
		String object = "casa";
		var defaultValue = "Default";
		
		// Act
		var result = ObjectHelper.getDefault(object, defaultValue);
		
		// Assert
		assertEquals(object, result);
	}
	
	@Test
	void givenWantGetDefaultValueWhenObjectIsNullThenResultIsDefaultObject() {
		// Arrange: initial context
		String object = null;
		var defaultValue = "Default";
		
		// Act
		var result = ObjectHelper.getDefault(object, defaultValue);
		
		// Assert
		assertEquals(defaultValue, result);
	}

}
