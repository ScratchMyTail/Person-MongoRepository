package com.springapp.mvc;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by christerhansen on 28.09.15.
 */

public class Jobb {
    String tittel;
    String sted;

    public Jobb(String tittel, String sted) {
        this.tittel = tittel;
        this.sted = sted;
    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public String getSted() {
        return sted;
    }

    public void setSted(String sted) {
        this.sted = sted;
    }
}
