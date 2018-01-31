package ga.morstudios.valence.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ga.morstudios.valence.Reference;

public class Utils {
	
	private static Logger logger;
	
	public static Logger getLogger() {
		if(logger == null) {
			logger = LogManager.getFormatterLogger(Reference.NAME);
		}
		
		return logger;
	}

}
