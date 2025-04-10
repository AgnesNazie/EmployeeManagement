package com.agnes.practice;

import java.time.LocalDate;

public class SystemDeveloper extends Employee {
    //fields
    private String[] certificates;
    private String[] languages;
    private int certificateCount;
    private int languageCount;

    //constructor

    public SystemDeveloper(String name, double salary, LocalDate dateHired, int maxCertificates, int maxLanguages) {
        super(name, salary, dateHired);
        this.certificates = new String[maxCertificates];
        this.languages = new String[maxLanguages];
    }
    //getter for certificates

    public void addCertificates(String certificate) {
        if (certificateCount < certificates.length) {
            certificates[certificateCount++] = certificate;
            calculateSalary();
        } else {
            System.out.println("Max certificates reached");
        }

    }
    //add languages

    public void addLanguages(String language) {
        if (languageCount < languages.length) {
            languages[languageCount++] = language;
            calculateSalary();
        } else {
            System.out.println("Max Languages reached");
            this.languages = languages;
        }
    }

    @Override
    public void calculateSalary() {
        double newSalary = 25000 + (certificateCount * 1000) + (languageCount * 1500);
        setSalary(newSalary);
    }

    @Override
    public String toString() {
        String certificateList = String.join(",", certificates);
        String LanguagesList = String.join(",", languages);
        return super.toString() + ", Certificates: " + certificateList + ", Languages: " + LanguagesList;
    }
}
