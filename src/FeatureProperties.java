package com.infCapraraZhou;

public class FeatureProperties {
    private String Name;
    private String description;
    private String Numero_Campionatore;
    private String Coord_X;
    private String Coord_Y;
    private String Numero_Circoscrizione;
    private String Nome_Circoscrizione;
    private String Comune;
    private String Via;
    private String Concentrazione_NO2_mese___g_m3;
    private String Concentrazione_NO2_anno___g_m3;
    private String __aumento_ricoveri_x_malattie_respiratorie_mese_oltre_40___g_m3;
    private String __aumento_mortalit___generale_anno_oltre_40___g_m3;
    private String __aumento_sintomi_bronchite_bambini_asmatici_anno_oltre_40___g_;
    private String Altezza_superiore_a_3m;
    private String Cortile;
    private String Classe_mese;
    private String Legenda_mese;
    private String Classe_anno;
    private String Legenda_anno;
    private String ZTL;

    public FeatureProperties(String name, String description, String numero_Campionatore, String coord_X, String coord_Y, String numero_Circoscrizione, String nome_Circoscrizione, String comune, String via, String concentrazione_NO2_mese___g_m3, String concentrazione_NO2_anno___g_m3, String __aumento_ricoveri_x_malattie_respiratorie_mese_oltre_40___g_m3, String __aumento_mortalit___generale_anno_oltre_40___g_m3, String __aumento_sintomi_bronchite_bambini_asmatici_anno_oltre_40___g_, String altezza_superiore_a_3m, String cortile, String classe_mese, String legenda_mese, String classe_anno, String legenda_anno, String ZTL) {
        this.Name = name;
        this.description = description;
        this.Numero_Campionatore = numero_Campionatore;
        this.Coord_X = coord_X;
        this.Coord_Y = coord_Y;
        this.Numero_Circoscrizione = numero_Circoscrizione;
        this.Nome_Circoscrizione = nome_Circoscrizione;
        this.Comune = comune;
        this.Via = via;
        this.Concentrazione_NO2_mese___g_m3 = concentrazione_NO2_mese___g_m3;
        this.Concentrazione_NO2_anno___g_m3 = concentrazione_NO2_anno___g_m3;
        this.__aumento_ricoveri_x_malattie_respiratorie_mese_oltre_40___g_m3 = __aumento_ricoveri_x_malattie_respiratorie_mese_oltre_40___g_m3;
        this.__aumento_mortalit___generale_anno_oltre_40___g_m3 = __aumento_mortalit___generale_anno_oltre_40___g_m3;
        this.__aumento_sintomi_bronchite_bambini_asmatici_anno_oltre_40___g_ = __aumento_sintomi_bronchite_bambini_asmatici_anno_oltre_40___g_;
        this.Altezza_superiore_a_3m = altezza_superiore_a_3m;
        this.Cortile = cortile;
        this.Classe_mese = classe_mese;
        this.Legenda_mese = legenda_mese;
        this.Classe_anno = classe_anno;
        this.Legenda_anno = legenda_anno;
        this.ZTL = ZTL;
    }

    @Override
    public String toString() {
        return "Stazione situata in " +
                Name +
                "\n Concentrazione NO2 media mensile = " + Concentrazione_NO2_mese___g_m3 + " g/m3" +
                "\n Concentrazione NO2 media annuale = " + Concentrazione_NO2_anno___g_m3 + " g/m3\n\n";
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return description;
    }

    public String getNumero_Campionatore() {
        return Numero_Campionatore;
    }

    public String getCoord_X() {
        return Coord_X;
    }

    public String getCoord_Y() {
        return Coord_Y;
    }

    public String getNumero_Circoscrizione() {
        return Numero_Circoscrizione;
    }

    public String getNome_Circoscrizione() {
        return Nome_Circoscrizione;
    }

    public String getComune() {
        return Comune;
    }

    public String getVia() {
        return Via;
    }

    public String getConcentrazione_NO2_mese___g_m3() {
        return Concentrazione_NO2_mese___g_m3;
    }

    public String getConcentrazione_NO2_anno___g_m3() {
        return Concentrazione_NO2_anno___g_m3;
    }

    public String get__aumento_ricoveri_x_malattie_respiratorie_mese_oltre_40___g_m3() {
        return __aumento_ricoveri_x_malattie_respiratorie_mese_oltre_40___g_m3;
    }

    public String get__aumento_mortalit___generale_anno_oltre_40___g_m3() {
        return __aumento_mortalit___generale_anno_oltre_40___g_m3;
    }

    public String get__aumento_sintomi_bronchite_bambini_asmatici_anno_oltre_40___g_() {
        return __aumento_sintomi_bronchite_bambini_asmatici_anno_oltre_40___g_;
    }

    public String getAltezza_superiore_a_3m() {
        return Altezza_superiore_a_3m;
    }

    public String getCortile() {
        return Cortile;
    }

    public String getClasse_mese() {
        return Classe_mese;
    }

    public String getLegenda_mese() {
        return Legenda_mese;
    }

    public String getClasse_anno() {
        return Classe_anno;
    }

    public String getLegenda_anno() {
        return Legenda_anno;
    }

    public String getZTL() {
        return ZTL;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNumero_Campionatore(String numero_Campionatore) {
        Numero_Campionatore = numero_Campionatore;
    }

    public void setCoord_X(String coord_X) {
        Coord_X = coord_X;
    }

    public void setCoord_Y(String coord_Y) {
        Coord_Y = coord_Y;
    }

    public void setNumero_Circoscrizione(String numero_Circoscrizione) {
        Numero_Circoscrizione = numero_Circoscrizione;
    }

    public void setNome_Circoscrizione(String nome_Circoscrizione) {
        Nome_Circoscrizione = nome_Circoscrizione;
    }

    public void setComune(String comune) {
        Comune = comune;
    }

    public void setVia(String via) {
        Via = via;
    }

    public void setConcentrazione_NO2_mese___g_m3(String concentrazione_NO2_mese___g_m3) {
        Concentrazione_NO2_mese___g_m3 = concentrazione_NO2_mese___g_m3;
    }

    public void setConcentrazione_NO2_anno___g_m3(String concentrazione_NO2_anno___g_m3) {
        Concentrazione_NO2_anno___g_m3 = concentrazione_NO2_anno___g_m3;
    }

    public void set__aumento_ricoveri_x_malattie_respiratorie_mese_oltre_40___g_m3(String __aumento_ricoveri_x_malattie_respiratorie_mese_oltre_40___g_m3) {
        this.__aumento_ricoveri_x_malattie_respiratorie_mese_oltre_40___g_m3 = __aumento_ricoveri_x_malattie_respiratorie_mese_oltre_40___g_m3;
    }

    public void set__aumento_mortalit___generale_anno_oltre_40___g_m3(String __aumento_mortalit___generale_anno_oltre_40___g_m3) {
        this.__aumento_mortalit___generale_anno_oltre_40___g_m3 = __aumento_mortalit___generale_anno_oltre_40___g_m3;
    }

    public void set__aumento_sintomi_bronchite_bambini_asmatici_anno_oltre_40___g_(String __aumento_sintomi_bronchite_bambini_asmatici_anno_oltre_40___g_) {
        this.__aumento_sintomi_bronchite_bambini_asmatici_anno_oltre_40___g_ = __aumento_sintomi_bronchite_bambini_asmatici_anno_oltre_40___g_;
    }

    public void setAltezza_superiore_a_3m(String altezza_superiore_a_3m) {
        Altezza_superiore_a_3m = altezza_superiore_a_3m;
    }

    public void setCortile(String cortile) {
        Cortile = cortile;
    }

    public void setClasse_mese(String classe_mese) {
        Classe_mese = classe_mese;
    }

    public void setLegenda_mese(String legenda_mese) {
        Legenda_mese = legenda_mese;
    }

    public void setClasse_anno(String classe_anno) {
        Classe_anno = classe_anno;
    }

    public void setLegenda_anno(String legenda_anno) {
        Legenda_anno = legenda_anno;
    }

    public void setZTL(String ZTL) {
        this.ZTL = ZTL;
    }
}
