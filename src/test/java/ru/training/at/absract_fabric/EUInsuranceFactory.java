package ru.training.at.absract_fabric;

public class EUInsuranceFactory implements InsuranceFactory{

    @Override
    public InsurancePolicy createAutoPolicy() {
        return new EUAutoPolicy();
    }

    @Override
    public InsurancePolicy createHealthPolicy() {
        return new EUHealthPolicy();
    }

    @Override
    public ClaimValidator createClaimValidator() {
        return new EUClaimValidator();
    }
}
