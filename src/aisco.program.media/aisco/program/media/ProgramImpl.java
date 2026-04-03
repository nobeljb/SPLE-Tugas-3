package aisco.program.media;

import aisco.program.core.ProgramComponent;
import aisco.program.core.ProgramDecorator;

public class ProgramImpl extends ProgramDecorator {
    private String media;

    public ProgramImpl(ProgramComponent program, String media) {
        super(program);
        this.media = media;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String toString() {
        return program + ", Sponsor Media: " + media + " (Sponsor yang memberikan bantuan untuk mempromosikan program).";
    }
}