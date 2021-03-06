package nl.ramonpeek.models.enums;

/**
 * Created on 08/05/2020.
 *
 * @author Vincent
 */
public enum CountryCode { // TODO  Look at Duplicate Codes
    AF("Afghanistan"),
    AL("Albania"),
    DZ("Algeria"),
    AS("American Samoa"),
    AD("Andorra"),
    AO("Angola"),
    AI("Anguilla"),
    AG("Antigua and Barbuda"),
    AR("Argentine"),
    AM("Armenia"),
    AW("Aruba"),
    // SH("Ascension"),
    AU("Australia"),
    AT("Austria"),
    AZ("Azerbaijan"),
    BS("Bahamas"),
    BH("Bahrain"),
    BD("Bangladesh"),
    BB("Barbados"),
    BY("Belarus"),
    BE("Belgium"),
    BZ("Belize"),
    BJ("Benin"),
    BM("Bermuda"),
    BT("Bhutan"),
    BO("Bolivia"),
    BA("Bosnia and Herzegovina"),
    BW("Botswana"),
    BR("Brazil"),
    BN("Brunei Darussalam"),
    BG("Bulgaria"),
    BF("Burkina Faso"),
    BI("Burundi"),
    KH("Cambodia"),
    CM("Cameroon"),
    CA("Canada"),
    CV("Cape Verde"),
    KY("Cayman Islands"),
    CF("Central African Republic"),
    TD("Chad"),
    CL("Chile"),
    CN("China, People's Republic"),
    TW("China, Taiwan"),
    CX("Christmas Island"),
    CC("Cocos (keeling) Islands"),
    CO("Colombia"),
    KM("Comoros"),
    CD("Congo, Democratic Republic"),
    CG("Congo, Republic"),
    CK("Cook Islands"),
    CR("Costa Rica"),
    CI("Côte d'Ivoire"),
    HR("Croatia"),
    CU("Cuba"),
    CY("Cyprus"),
    CZ("Czech Republic"),
    DK("Denmark"),
    DJ("Djibouti"),
    DM("Dominica"),
    DO("Dominican Republic"),
    TP("East Timor"),
    EC("Ecuador"),
    EG("Egypt"),
    SV("El Salvador"),
    GQ("Equatorial Guinea"),
    ER("Eritrea"),
    EE("Estonia"),
    ET("Ethiopia"),
    FK("Falkland Islands"),
    FO("Faroe Islands"),
    FJ("Fiji"),
    FI("Finland"),
    FR("France"),
    GF("French Guiana"),
    PF("French Polynesia"),
    TF("French Southern Territories"),
    GA("Gabon"),
    GM("Gambia"),
    GE("Georgia"),
    DE("Germany"),
    GH("Ghana"),
    GI("Gibraltar"),
    GB("Great Britain"),
    GR("Greece"),
    GL("Greenland"),
    GD("Grenada"),
    GP("Guadeloupe"),
    GU("Guam"),
    GT("Guatemala"),
    // GB("Guernsey"),
    GN("Guinea"),
    GW("Guinea-Bissau"),
    GY("Guyana"),
    HT("Haiti"),
    HN("Honduras"),
    HK("Hong Kong"),
    HU("Hungary"),
    IS("Iceland"),
    IN("India"),
    ID("Indonesia"),
    IR("Iran"),
    IQ("Iraq"),
    IE("Ireland"),
    IL("Israel"),
    IT("Italy"),
    JM("Jamaica"),
    // GB("Jersey"),
    JP("Japan"),
    JO("Jordan"),
    KZ("Kazakhstan"),
    KE("Kenya"),
    KI("Kiribati"),
    KP("Korea, Democratic People's Republic of"),
    KR("Korea, Republic of"),
    XZ("Kosovo (UN Interim Administration)"),
    KW("Kuwait"),
    KG("Kyrgyzstan"),
    LA("Laos People's Democratic Republic"),
    LV("Latvia"),
    LB("Lebanon"),
    LS("Lesotho"),
    LR("Liberia"),
    LY("Libyan Arab Jamahiriya"),
    LI("Liechtenstein"),
    LT("Lithuania"),
    LU("Luxembourg"),
    MO("Macao"),
    MK("Macedonia, the Former Yugoslav Republic"),
    MG("Madagascar"),
    MW("Malawi"),
    MY("Malaysia"),
    MV("Maldives"),
    ML("Mali"),
    MT("Malta"),
    // GB("Man, Isle of"),
    MP("Mariana Islands"),
    MH("Marshall Islands"),
    MQ("Martinique"),
    MR("Mauritania"),
    MU("Mauritius"),
    YT("Mayotte"),
    MX("Mexico"),
    MD("Moldova"),
    MC("Monaco"),
    MN("Mongolia"),
    MS("Montserrat"),
    MA("Morocco"),
    MZ("Mozambique"),
    MM("Myanmar (Union)"),
    NA("Namibia"),
    NR("Nauru"),
    NP("Nepal"),
    NL("Netherlands"),
    AN("Netherlands Antilles"),
    NC("New Caledonia"),
    NZ("New Zealand"),
    NI("Nicaragua"),
    NE("Niger"),
    NG("Nigeria"),
    NF("Norfolk Island"),
    NO("Norway"),
    OM("Oman"),
    PK("Pakistan"),
    PW("Palau"),
    PA("Panama"),
    PG("Papua New Guinea"),
    PY("Paraguay"),
    PE("Peru"),
    PH("Philippines"),
    PN("Pitcairn"),
    PL("Poland"),
    PT("Portugal"),
    PR("Puerto Rico"),
    QA("Qatar"),
    RE("Réunion"),
    RO("Romania"),
    RU("Russian Federation"),
    RW("Rwanda"),
    KN("Saint Christopher and Nevis"),
    SH("Saint Helena"),
    LC("Saint Lucia"),
    PM("Saint Pierre and Miquelon"),
    VC("Saint Vincent and the Grenadines"),
    SM("San Marino"),
    ST("São Tome and Principe"),
    SA("Saudi Arabia"),
    SN("Senegal"),
    CS("Serbia and Montenegro"),
    SC("Seychelles"),
    SL("Sierra Leone"),
    SG("Singapore"),
    SK("Slovakia , Republic of"),
    SI("Slovenia"),
    SB("Solomon Islands"),
    SO("Somalia"),
    ZA("South Africa"),
    GS("South Georgia and the south Sandwich Islands"),
    ES("Spain"),
    LK("Sri Lanka"),
    SD("Sudan"),
    SR("Suriname"),
    SZ("Swaziland"),
    SE("Sweden"),
    CH("Switzerland"),
    SY("Syria"),
    TJ("Tajikistan"),
    TZ("Tanzania"),
    TH("Thailand"),
    TG("Togo"),
    TK("Tokelau Islands"),
    TO("Tonga"),
    TT("Trinidad and Tobago"),
    // SH("Tristan da Cunha"),
    TN("Tunisia"),
    TR("Turkey"),
    TM("Turkmenistan"),
    TC("Turks and Caicos Islands"),
    TV("Tuvalu"),
    UG("Uganda"),
    UA("Ukraine"),
    AE("United Arab Emirates"),
    US("United States of America"),
    UM("United States Minor Outlying Islands"),
    UY("Uruguay"),
    UZ("Uzbekistan"),
    VU("Vanuatu"),
    VA("Vatican City State (Holy See)"),
    VE("Venezuela"),
    VN("Viet Nam"),
    VG("Virgin Islands"),
    VI("Virgin Islands (USA)"),
    WF("Wallis and Futuna Islands"),
    WS("Western Samoa"),
    YE("Yemen"),
    ZM("Zambia"),
    ZW("Zimbabwe"),
    ;
    private String countryName;

    CountryCode(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }
}
