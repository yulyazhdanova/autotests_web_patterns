package ru.training.at.absract_fabric;

public class Main {

    public static void main(String[] args) {

        InsuranceFactorySelector insuranceFactorySelector = new InsuranceFactorySelector();
        InsuranceFactory insuranceFactory = insuranceFactorySelector.getCode(CountryCode.EU);
        System.out.println(insuranceFactory.createAutoPolicy());
        System.out.println(insuranceFactory.createHealthPolicy());
    }
}
