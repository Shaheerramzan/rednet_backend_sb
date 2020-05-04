package com.rednet.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Person {
    private int personId;
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String gender;
    private String bloodGroup;
    private Double longitude;
    private Double latitude;
    private String phone1;
    private String phone2;
    private String phone3;
    private Date createdOn;
    private String city;
    private String area;
    private Collection<Chat> chatsByPersonId;
    private Collection<Chat> chatsByPersonId_0;
    private Collection<Complain> complainsByPersonId;
    private Collection<Complain> complainsByPersonId_0;
    private Collection<ConveyanceProvider> conveyanceProvidersByPersonId;
    private Collection<Donor> donorsByPersonId;
    private Collection<Friend> friendsByPersonId;
    private Collection<Friend> friendsByPersonId_0;
    private Collection<History> historiesByPersonId;
    private Collection<ReportProblem> reportProblemsByPersonId;
    private Collection<Society> societiesByPersonId;
    private Collection<SocietyAdmin> societyAdminsByPersonId;
    private Collection<SocietyRequest> societyRequestsByPersonId;
    private Collection<SuperAdmin> superAdminsByPersonId;

    @Id
    @Column(name = "person_id", nullable = false)
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    @Basic
    @Column(name = "username", nullable = true, length = 45)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 45)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 70)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "first_name", nullable = true, length = 45)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name", nullable = true, length = 45)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "gender", nullable = true, length = 1)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "blood_group", nullable = true, length = 3)
    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    @Basic
    @Column(name = "longitude", nullable = true, precision = 0)
    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Basic
    @Column(name = "latitude", nullable = true, precision = 0)
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "phone1", nullable = true, length = 45)
    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    @Basic
    @Column(name = "phone2", nullable = true, length = 45)
    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    @Basic
    @Column(name = "phone3", nullable = true, length = 45)
    public String getPhone3() {
        return phone3;
    }

    public void setPhone3(String phone3) {
        this.phone3 = phone3;
    }

    @Basic
    @Column(name = "created_on", nullable = true)
    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    @Basic
    @Column(name = "city", nullable = true, length = 45)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "area", nullable = true, length = 60)
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return personId == person.personId &&
                Objects.equals(username, person.username) &&
                Objects.equals(password, person.password) &&
                Objects.equals(email, person.email) &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(gender, person.gender) &&
                Objects.equals(bloodGroup, person.bloodGroup) &&
                Objects.equals(longitude, person.longitude) &&
                Objects.equals(latitude, person.latitude) &&
                Objects.equals(phone1, person.phone1) &&
                Objects.equals(phone2, person.phone2) &&
                Objects.equals(phone3, person.phone3) &&
                Objects.equals(createdOn, person.createdOn) &&
                Objects.equals(city, person.city) &&
                Objects.equals(area, person.area);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, username, password, email, firstName, lastName, gender, bloodGroup, longitude, latitude, phone1, phone2, phone3, createdOn, city, area);
    }

    @OneToMany(mappedBy = "personBySender")
    @JsonIgnore
    public Collection<Chat> getChatsByPersonId() {
        return chatsByPersonId;
    }

    public void setChatsByPersonId(Collection<Chat> chatsByPersonId) {
        this.chatsByPersonId = chatsByPersonId;
    }

    @OneToMany(mappedBy = "personByReceiver")
    @JsonIgnore
    public Collection<Chat> getChatsByPersonId_0() {
        return chatsByPersonId_0;
    }

    public void setChatsByPersonId_0(Collection<Chat> chatsByPersonId_0) {
        this.chatsByPersonId_0 = chatsByPersonId_0;
    }

    @OneToMany(mappedBy = "personByComplainant")
    @JsonIgnore
    public Collection<Complain> getComplainsByPersonId() {
        return complainsByPersonId;
    }

    public void setComplainsByPersonId(Collection<Complain> complainsByPersonId) {
        this.complainsByPersonId = complainsByPersonId;
    }

    @OneToMany(mappedBy = "personByComplanie")
    @JsonIgnore
    public Collection<Complain> getComplainsByPersonId_0() {
        return complainsByPersonId_0;
    }

    public void setComplainsByPersonId_0(Collection<Complain> complainsByPersonId_0) {
        this.complainsByPersonId_0 = complainsByPersonId_0;
    }

    @OneToMany(mappedBy = "personByPersonId")
    @JsonIgnore
    public Collection<ConveyanceProvider> getConveyanceProvidersByPersonId() {
        return conveyanceProvidersByPersonId;
    }

    public void setConveyanceProvidersByPersonId(Collection<ConveyanceProvider> conveyanceProvidersByPersonId) {
        this.conveyanceProvidersByPersonId = conveyanceProvidersByPersonId;
    }

    @OneToMany(mappedBy = "personByPersonId")
    @JsonIgnore
    public Collection<Donor> getDonorsByPersonId() {
        return donorsByPersonId;
    }

    public void setDonorsByPersonId(Collection<Donor> donorsByPersonId) {
        this.donorsByPersonId = donorsByPersonId;
    }

    @OneToMany(mappedBy = "personByPersonOne")
    @JsonIgnore
    public Collection<Friend> getFriendsByPersonId() {
        return friendsByPersonId;
    }

    public void setFriendsByPersonId(Collection<Friend> friendsByPersonId) {
        this.friendsByPersonId = friendsByPersonId;
    }

    @OneToMany(mappedBy = "personByPersonTwo")
    @JsonIgnore
    public Collection<Friend> getFriendsByPersonId_0() {
        return friendsByPersonId_0;
    }

    public void setFriendsByPersonId_0(Collection<Friend> friendsByPersonId_0) {
        this.friendsByPersonId_0 = friendsByPersonId_0;
    }

    @OneToMany(mappedBy = "personByPersonId")
    @JsonIgnore
    public Collection<History> getHistoriesByPersonId() {
        return historiesByPersonId;
    }

    public void setHistoriesByPersonId(Collection<History> historiesByPersonId) {
        this.historiesByPersonId = historiesByPersonId;
    }

    @OneToMany(mappedBy = "personByPersonId")
    @JsonIgnore
    public Collection<ReportProblem> getReportProblemsByPersonId() {
        return reportProblemsByPersonId;
    }

    public void setReportProblemsByPersonId(Collection<ReportProblem> reportProblemsByPersonId) {
        this.reportProblemsByPersonId = reportProblemsByPersonId;
    }

    @OneToMany(mappedBy = "personByHeadId")
    @JsonIgnore
    public Collection<Society> getSocietiesByPersonId() {
        return societiesByPersonId;
    }

    public void setSocietiesByPersonId(Collection<Society> societiesByPersonId) {
        this.societiesByPersonId = societiesByPersonId;
    }

    @OneToMany(mappedBy = "personByPersonId")
    @JsonIgnore
    public Collection<SocietyAdmin> getSocietyAdminsByPersonId() {
        return societyAdminsByPersonId;
    }

    public void setSocietyAdminsByPersonId(Collection<SocietyAdmin> societyAdminsByPersonId) {
        this.societyAdminsByPersonId = societyAdminsByPersonId;
    }

    @OneToMany(mappedBy = "personByHeadId")
    @JsonIgnore
    public Collection<SocietyRequest> getSocietyRequestsByPersonId() {
        return societyRequestsByPersonId;
    }

    public void setSocietyRequestsByPersonId(Collection<SocietyRequest> societyRequestsByPersonId) {
        this.societyRequestsByPersonId = societyRequestsByPersonId;
    }

    @OneToMany(mappedBy = "personByPersonId")
    @JsonIgnore
    public Collection<SuperAdmin> getSuperAdminsByPersonId() {
        return superAdminsByPersonId;
    }

    public void setSuperAdminsByPersonId(Collection<SuperAdmin> superAdminsByPersonId) {
        this.superAdminsByPersonId = superAdminsByPersonId;
    }
}
