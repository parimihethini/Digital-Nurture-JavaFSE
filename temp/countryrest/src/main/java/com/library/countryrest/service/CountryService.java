package com.library.countryrest.service;

import com.library.countryrest.model.Country;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {

    private List<Country> countries = new ArrayList<>();

    public CountryService() {
        countries.add(new Country("IN", "India"));
        countries.add(new Country("US", "United States"));
        countries.add(new Country("JP", "Japan"));
    }

    public List<Country> getAllCountries() {
        return countries;
    }

    public Country getCountryByCode(String code) {
        for (Country country : countries) {
            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }
        }
        return null;
    }

    public Country addCountry(Country country) {
        countries.add(country);
        return country;
    }

    public Country updateCountry(Country country) {
        for (Country c : countries) {
            if (c.getCode().equalsIgnoreCase(country.getCode())) {
                c.setName(country.getName());
                return c;
            }
        }
        return null;
    }

    public String deleteCountry(String code) {
        for (Country c : countries) {
            if (c.getCode().equalsIgnoreCase(code)) {
                countries.remove(c);
                return "Country Deleted";
            }
        }
        return "Country Not Found";
    }
}