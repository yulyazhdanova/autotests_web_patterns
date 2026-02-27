package ru.training.at.absract_fabric;

public class InsuranceFactorySelector {

    public InsuranceFactory getCode(CountryCode code) {
        switch (code){
            case EU:
                return new EUInsuranceFactory();
            case US:
                return new USInsuranceFactory();
            default:
                throw new NullPointerException();
        }
    }
}
