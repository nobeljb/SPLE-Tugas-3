package aisco.sponsor.core;

public abstract class SponsorDecorator extends SponsorComponent {
    protected SponsorComponent sponsor;

    public SponsorDecorator(SponsorComponent sponsor) {
        this.sponsor = sponsor;
    }

    @Override
    public void processContribution() {
        sponsor.processContribution();
    }
}