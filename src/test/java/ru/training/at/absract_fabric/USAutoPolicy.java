package ru.training.at.absract_fabric;

public class USAutoPolicy implements InsurancePolicy{
    @Override
    public String getDescription() {
        return "Купили автостраховку US";
    }
}
