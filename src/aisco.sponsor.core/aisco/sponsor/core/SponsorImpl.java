package aisco.sponsor.core;

public class SponsorImpl extends SponsorComponent {
    public SponsorImpl(int id, String name, String type) {
        super(id, name, type);
    }

    @Override
    public void processContribution() {
        System.out.println("Sponsor " + name + " (" + type + ") berkontribusi untuk program.");
    }
}