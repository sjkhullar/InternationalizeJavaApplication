package org.learn;

import java.util.Locale;
import java.util.ResourceBundle;

public class DemoMultilingual {
    public static void main(String[] args) {

        ResourceBundle rd = ResourceBundle.getBundle("messages");

        //Display properties for language = english & Country = USA
        loadPropertiesByCountryAndLanguage("en","us");

        //Display properties for language = german & Country = germany
        loadPropertiesByCountryAndLanguage("de","DE");

        //Display properties for language = french & Country = france
        loadPropertiesByCountryAndLanguage("fr","FR");


        //Display properties for language = hindi & Country = india
        loadPropertiesByCountryAndLanguage("hi","in");
    }

    private static void loadPropertiesByCountryAndLanguage(String languageCode,
                                                            String countryCode) {

        Locale locale = new Locale(languageCode,countryCode);
        ResourceBundle rd = ResourceBundle.getBundle("messages",locale);

        String propDescription = rd.getString("description");
        String propLanguage = rd.getString("Language");
        String propCountry = rd.getString("Country");

        System.out.printf("Loading properties for CountryCode=%s,LanguageCode=%s",
                                                    countryCode,languageCode);
        System.out.println();
        System.out.printf("Description=%s, Language=%s, Country=%s",
                                            propDescription,propLanguage,propCountry);
        System.out.println();
        System.out.println();
    }
}
