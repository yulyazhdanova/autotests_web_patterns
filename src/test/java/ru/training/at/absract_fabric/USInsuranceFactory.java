package ru.training.at.absract_fabric;

public class USInsuranceFactory implements InsuranceFactory{

    @Override
    public InsurancePolicy createAutoPolicy() {
        return new USAutoPolicy();
    }

    @Override
    public InsurancePolicy createHealthPolicy() {
        return new USHealthPolicy();
    }

    @Override
    public ClaimValidator createClaimValidator() {
        return new USClaimValidator();
    }
}
