package com.example.myspingaplication.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bank {
    private double loanamount;
    private double tenure;
    private double rateofinterest;
    private double eim;

    public double getTotal()
    {
        eim = 1 * loanamount * (Math.pow(1 + loanamount,tenure)) / (Math.pow(1+loanamount,tenure)) - 1 * 1/12;

        // eim = 1 * loanamount * tenure * rateofinterest;
        return eim;
    }
}
