/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author User
 */
public class Necessary {

    private String name;
    private String surname;
    private String patronymic;
    private String gender;
    private String birthDate;
    private String documentType;
    private String documentNumber;
    private String documentIssueCountry;
    private String documentExpireDate;
    private String phoneNumber;
    private String email;

    public Necessary() {
    }

    public Necessary(String name, String surname, String patronymic, String gender, String birthDate, String documentType, String documentNumber, String documentIssueCountry, String documentExpireDate, String phoneNumber, String email) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.gender = gender;
        this.birthDate = birthDate;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.documentIssueCountry = documentIssueCountry;
        this.documentExpireDate = documentExpireDate;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname.toUpperCase();
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic.toUpperCase();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender.toUpperCase();
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType.toUpperCase();
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getDocumentIssueCountry() {
        return documentIssueCountry;
    }

    public void setDocumentIssueCountry(String documentIssueCountry) {
        this.documentIssueCountry = documentIssueCountry;
    }

    public String getDocumentExpireDate() {
        return documentExpireDate;
    }

    public void setDocumentExpireDate(String documentExpireDate) {
        this.documentExpireDate = documentExpireDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email.toLowerCase();
    }

    @Override
    public String toString() {
        return "name=" + name + ", surname=" + surname + ", patronymic=" + patronymic + ", gender=" + gender + ", birthDate=" + birthDate + ", documentType=" + documentType + ", documentNumber=" + documentNumber + ", documentIssueCountry=" + documentIssueCountry + ", documentExpireDate=" + documentExpireDate + ", phoneNumber=" + phoneNumber + ", email=" + email;
    }

}
