package ru.training.at.absract_fabric;

public class USHealthPolicy implements InsurancePolicy{
    @Override
    public String getDescription() {
        return "Купили медицинскую страховку US";
    }
}
