package Astronomy;

import General.Astro;

public class Astronomy {

    Astro astro;

    public Astro getAstro() {
        return astro;
    }

    public void setAstro(Astro astro) {
        this.astro = astro;
    }

    @Override
    public String toString() {
        return "Astronomy{" + "astro=" + astro + '}';
    }
}
