package org.fxformgenerator.core;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

import java.util.Set;

/**
 * Created by giovanni on 5/2/16.
 */
public class FFGModelValidator {
	private static final ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
	private static final Validator        validator        = validatorFactory.getValidator();

	public static boolean isModelValid(Object object) {
		return (validator.validate(object).size() == 0);
	}

	public static Set<ConstraintViolation<Object>> getViolatedConstraints(Object object) {
		return validator.validate(object);
	}
}
