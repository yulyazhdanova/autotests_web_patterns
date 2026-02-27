package ru.training.at.absract_fabric;

public class EUHealthPolicy implements InsurancePolicy{
    @Override
    public String getDescription() {
        return "Купили медицинскую страховку EU";
    }
}
