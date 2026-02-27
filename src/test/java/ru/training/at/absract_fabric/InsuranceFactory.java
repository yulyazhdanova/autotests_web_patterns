package ru.training.at.absract_fabric;

public interface InsuranceFactory {

    InsurancePolicy createAutoPolicy();

    InsurancePolicy createHealthPolicy();

    ClaimValidator createClaimValidator();
}
