package ru.training.at.absract_fabric;

public class EUAutoPolicy implements InsurancePolicy{
    @Override
    public String getDescription() {
        return "Купили автостраховку EU";
    }
}
