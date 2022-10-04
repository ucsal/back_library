package br.ucsal.grupo_D.util;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteObjetos<O, T> {
	
	public T converter(O object, Class<T> targetClass){
	    	ObjectMapper mapper = new ObjectMapper();
	    	mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
	    	return mapper.convertValue(object, targetClass);
	 }

}
