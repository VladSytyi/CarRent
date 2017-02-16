package main.java.com.art.entity;

import java.io.Serializable;

/**
 * Created by Admin on 16/02/2017.
 */
public class ClientDataEntity implements Serializable{

    private  int clientDataId;
    private  String passportNumber;
    private String firstName;
    private String LastName;
    private String Mail;

    public ClientDataEntity() {
    }

    public int getClientDataId() {
        return clientDataId;
    }

    public void setClientDataId(int clientDataId) {
        this.clientDataId = clientDataId;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClientDataEntity that = (ClientDataEntity) o;

        if (clientDataId != that.clientDataId) return false;
        if (passportNumber != null ? !passportNumber.equals(that.passportNumber) : that.passportNumber != null)
            return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (LastName != null ? !LastName.equals(that.LastName) : that.LastName != null) return false;
        return Mail != null ? Mail.equals(that.Mail) : that.Mail == null;
    }

    public int hashCode() {
        int result = clientDataId;
        result = 31 * result + (passportNumber != null ? passportNumber.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (LastName != null ? LastName.hashCode() : 0);
        result = 31 * result + (Mail != null ? Mail.hashCode() : 0);
        return result;
    }

    public String toString() {
        return "ClientDataEntity{" +
                "clientDataId=" + clientDataId +
                ", passportNumber='" + passportNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Mail='" + Mail + '\'' +
                '}';
    }
}
