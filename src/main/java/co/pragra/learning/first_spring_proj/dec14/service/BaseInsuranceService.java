package co.pragra.learning.first_spring_proj.dec14.service;

import co.pragra.learning.first_spring_proj.dec14.domain.AutoInsurance;
import co.pragra.learning.first_spring_proj.dec14.domain.Insurance;

public class BaseInsuranceService implements InsuranceService {
    private Insurance insurance ;

    public BaseInsuranceService(Insurance insurance) {
        this.insurance = insurance;
    }

    public Insurance insure(){
        return this.insurance;
    }
}
