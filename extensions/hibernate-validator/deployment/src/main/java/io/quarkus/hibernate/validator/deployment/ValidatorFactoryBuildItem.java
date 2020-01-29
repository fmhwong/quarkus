package io.quarkus.hibernate.validator.deployment;

import javax.validation.ValidatorFactory;

import io.quarkus.builder.item.SimpleBuildItem;
import io.quarkus.runtime.RuntimeValue;

public final class ValidatorFactoryBuildItem extends SimpleBuildItem {

    private final RuntimeValue<ValidatorFactory> validatorFactory;

    public ValidatorFactoryBuildItem(RuntimeValue<ValidatorFactory> validatorFactory) {
        this.validatorFactory = validatorFactory;
    }

    public RuntimeValue<ValidatorFactory> getValidatorFactory() {
        return validatorFactory;
    }

}
