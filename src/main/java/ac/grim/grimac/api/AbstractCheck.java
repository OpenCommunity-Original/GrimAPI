package ac.grim.grimac.api;

import ac.grim.grimac.api.common.BasicStatus;

public interface AbstractCheck extends AbstractProcessor, BasicStatus {

    String getCheckName();

    default String getAlternativeName() {
        return getCheckName();
    }

    double getViolations();

    double getDecay();

    double getSetbackVL();

    boolean isExperimental();

}
