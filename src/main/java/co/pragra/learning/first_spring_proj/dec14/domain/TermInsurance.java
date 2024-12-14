package co.pragra.learning.first_spring_proj.dec14.domain;

import lombok.Data;

@Data
public class TermInsurance implements Insurance{
    @Override
    public double getQuote() {
        return 100;
    }
}
