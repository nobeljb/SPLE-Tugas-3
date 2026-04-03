package aisco.sponsor.finansial;

import aisco.sponsor.core.SponsorComponent;
import aisco.sponsor.core.SponsorDecorator;

public class SponsorImpl extends SponsorDecorator {
    private double fundingAmount;

    public SponsorImpl(SponsorComponent sponsor, double fundingAmount) {
        super(sponsor);
        this.fundingAmount = fundingAmount;
    }

    public double getFundingAmount() {
        return fundingAmount;
    }

    public void setFundingAmount(double fundingAmount) {
        this.fundingAmount = fundingAmount;
    }

    @Override
    public void processContribution() {
        sponsor.processContribution();
        System.out.println("Kontribusi finansial yang diproses: " + fundingAmount);
    }
}