package com.rednet.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Person {
    private int id;
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
    private Date timastamp;
    private String city;
    private String area;
    private Collection<Chat> chatsById;
    private Collection<Chat> chatsById_0;
    private Collection<Complain> complainsById;
    private Collection<Complain> complainsById_0;
    private Collection<ConveyanceProvider> conveyanceProvidersById;
    private Collection<Donor> donorsById;
    private Collection<Friend> friendsById;
    private Collection<Friend> friendsById_0;
    private Collection<History> historiesById;
    private Collection<ReportProblem> reportProblemsById;
    private Collection<Society> societiesById;
    private Collection<SocietyAdmin> societyAdminsById;
    private Collection<SocietyRequest> societyRequestsById;
    private Collection<SuperAdmin> superAdminsById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "timastamp", nullable = true)
    public Date getTimastamp() {
        return timastamp;
    }

    public void setTimastamp(Date timastamp) {
        this.timastamp = timastamp;
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

        if (id != person.id) return false;
        if (!Objects.equals(username, person.username)) return false;
        if (!Objects.equals(password, person.password)) return false;
        if (!Objects.equals(email, person.email)) return false;
        if (!Objects.equals(firstName, person.firstName)) return false;
        if (!Objects.equals(lastName, person.lastName)) return false;
        if (!Objects.equals(gender, person.gender)) return false;
        if (!Objects.equals(bloodGroup, person.bloodGroup)) return false;
        if (!Objects.equals(longitude, person.longitude)) return false;
        if (!Objects.equals(latitude, person.latitude)) return false;
        if (!Objects.equals(phone1, person.phone1)) return false;
        if (!Objects.equals(phone2, person.phone2)) return false;
        if (!Objects.equals(phone3, person.phone3)) return false;
        if (!Objects.equals(timastamp, person.timastamp)) return false;
        if (!Objects.equals(city, person.city)) return false;
        return Objects.equals(area, person.area);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (bloodGroup != null ? bloodGroup.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (phone1 != null ? phone1.hashCode() : 0);
        result = 31 * result + (phone2 != null ? phone2.hashCode() : 0);
        result = 31 * result + (phone3 != null ? phone3.hashCode() : 0);
        result = 31 * result + (timastamp != null ? timastamp.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "personBySender")
    public Collection<Chat> getChatsById() {
        return chatsById;
    }

    public void setChatsById(Collection<Chat> chatsById) {
        this.chatsById = chatsById;
    }

    @OneToMany(mappedBy = "personByReceiver")
    public Collection<Chat> getChatsById_0() {
        return chatsById_0;
    }

    public void setChatsById_0(Collection<Chat> chatsById_0) {
        this.chatsById_0 = chatsById_0;
    }

    @OneToMany(mappedBy = "personByComplainant")
    public Collection<Complain> getComplainsById() {
        return complainsById;
    }

    public void setComplainsById(Collection<Complain> complainsById) {
        this.complainsById = complainsById;
    }

    @OneToMany(mappedBy = "personByComplanie")
    public Collection<Complain> getComplainsById_0() {
        return complainsById_0;
    }

    public void setComplainsById_0(Collection<Complain> complainsById_0) {
        this.complainsById_0 = complainsById_0;
    }

    @OneToMany(mappedBy = "personByPersonId")
    public Collection<ConveyanceProvider> getConveyanceProvidersById() {
        return conveyanceProvidersById;
    }

    public void setConveyanceProvidersById(Collection<ConveyanceProvider> conveyanceProvidersById) {
        this.conveyanceProvidersById = conveyanceProvidersById;
    }

    @OneToMany(mappedBy = "personByPersonId")
    public Collection<Donor> getDonorsById() {
        return donorsById;
    }

    public void setDonorsById(Collection<Donor> donorsById) {
        this.donorsById = donorsById;
    }

    @OneToMany(mappedBy = "personByPersonId")
    public Collection<Friend> getFriendsById() {
        return friendsById;
    }

    public void setFriendsById(Collection<Friend> friendsById) {
        this.friendsById = friendsById;
    }

    @OneToMany(mappedBy = "personByFriendId")
    public Collection<Friend> getFriendsById_0() {
        return friendsById_0;
    }

    public void setFriendsById_0(Collection<Friend> friendsById_0) {
        this.friendsById_0 = friendsById_0;
    }

    @OneToMany(mappedBy = "personByPersonId")
    public Collection<History> getHistoriesById() {
        return historiesById;
    }

    public void setHistoriesById(Collection<History> historiesById) {
        this.historiesById = historiesById;
    }

    @OneToMany(mappedBy = "personByPersonId")
    public Collection<ReportProblem> getReportProblemsById() {
        return reportProblemsById;
    }

    public void setReportProblemsById(Collection<ReportProblem> reportProblemsById) {
        this.reportProblemsById = reportProblemsById;
    }

    @OneToMany(mappedBy = "personByHeadId")
    public Collection<Society> getSocietiesById() {
        return societiesById;
    }

    public void setSocietiesById(Collection<Society> societiesById) {
        this.societiesById = societiesById;
    }

    @OneToMany(mappedBy = "personByPersonId")
    public Collection<SocietyAdmin> getSocietyAdminsById() {
        return societyAdminsById;
    }

    public void setSocietyAdminsById(Collection<SocietyAdmin> societyAdminsById) {
        this.societyAdminsById = societyAdminsById;
    }

    @OneToMany(mappedBy = "personByHeadId")
    public Collection<SocietyRequest> getSocietyRequestsById() {
        return societyRequestsById;
    }

    public void setSocietyRequestsById(Collection<SocietyRequest> societyRequestsById) {
        this.societyRequestsById = societyRequestsById;
    }

    @OneToMany(mappedBy = "personByPersonId")
    public Collection<SuperAdmin> getSuperAdminsById() {
        return superAdminsById;
    }

    public void setSuperAdminsById(Collection<SuperAdmin> superAdminsById) {
        this.superAdminsById = superAdminsById;
    }
}
