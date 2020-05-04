package com.rednet.entities;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.FetchProfile;

import javax.persistence.*;
import java.sql.Timestamp;
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
    private Timestamp joinDate;
    private String city;
    private String area;
    private Chat chatById;
    private Collection<Chat> chatsById;
    private Complain complainById;
    private Collection<Complain> complainsById;
    private ConveyanceProvider conveyanceProviderById;
    private Donor donorById;
    private Friend friendById;
    private Collection<Friend> friendsById;
    private History historyById;
    private ReportProblem reportProblemById;
    private Society societyById;
    private SocietyAdmin societyAdminById;
    private SocietyRequest societyRequestById;
    private SuperAdmin superAdminById;

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
    @Column(name = "join_date", nullable = true)
    public Timestamp getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Timestamp joinDate) {
        this.joinDate = joinDate;
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
        if (!Objects.equals(joinDate, person.joinDate)) return false;
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
        result = 31 * result + (joinDate != null ? joinDate.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        return result;
    }

    @OneToOne(mappedBy = "personBySender", fetch = FetchType.LAZY)
    public Chat getChatById() {
        return chatById;
    }

    public void setChatById(Chat chatById) {
        this.chatById = chatById;
    }

    @OneToMany(mappedBy = "personByReceiver", fetch = FetchType.LAZY)
    public Collection<Chat> getChatsById() {
        return chatsById;
    }

    public void setChatsById(Collection<Chat> chatsById) {
        this.chatsById = chatsById;
    }

    @OneToOne(mappedBy = "personByComplainant", fetch = FetchType.LAZY)
    public Complain getComplainById() {
        return complainById;
    }

    public void setComplainById(Complain complainById) {
        this.complainById = complainById;
    }

    @OneToMany(mappedBy = "personBySuspect", fetch = FetchType.LAZY)
    public Collection<Complain> getComplainsById() {
        return complainsById;
    }

    public void setComplainsById(Collection<Complain> complainsById) {
        this.complainsById = complainsById;
    }

    @OneToOne(mappedBy = "personByPersonId", fetch = FetchType.LAZY)
    public ConveyanceProvider getConveyanceProviderById() {
        return conveyanceProviderById;
    }

    public void setConveyanceProviderById(ConveyanceProvider conveyanceProviderById) {
        this.conveyanceProviderById = conveyanceProviderById;
    }

    @OneToOne(mappedBy = "personByPersonId", fetch = FetchType.LAZY)
    public Donor getDonorById() {
        return donorById;
    }

    public void setDonorById(Donor donorById) {
        this.donorById = donorById;
    }

    @OneToOne(mappedBy = "personByPersonId", fetch = FetchType.LAZY)
    public Friend getFriendById() {
        return friendById;
    }

    public void setFriendById(Friend friendById) {
        this.friendById = friendById;
    }

    @OneToMany(mappedBy = "personByFriendId", fetch = FetchType.LAZY)
    public Collection<Friend> getFriendsById() {
        return friendsById;
    }

    public void setFriendsById(Collection<Friend> friendsById) {
        this.friendsById = friendsById;
    }

    @OneToOne(mappedBy = "personByPersonId", fetch = FetchType.LAZY)
    public History getHistoryById() {
        return historyById;
    }

    public void setHistoryById(History historyById) {
        this.historyById = historyById;
    }

    @OneToOne(mappedBy = "personByPersonId", fetch = FetchType.LAZY)
    public ReportProblem getReportProblemById() {
        return reportProblemById;
    }

    public void setReportProblemById(ReportProblem reportProblemById) {
        this.reportProblemById = reportProblemById;
    }

    @OneToOne(mappedBy = "personByHeadId", fetch = FetchType.LAZY)
    public Society getSocietyById() {
        return societyById;
    }

    public void setSocietyById(Society societyById) {
        this.societyById = societyById;
    }

    @OneToOne(mappedBy = "personByPersonId", fetch = FetchType.LAZY)
    public SocietyAdmin getSocietyAdminById() {
        return societyAdminById;
    }

    public void setSocietyAdminById(SocietyAdmin societyAdminById) {
        this.societyAdminById = societyAdminById;
    }

    @OneToOne(mappedBy = "personByHeadId", fetch = FetchType.LAZY)
    public SocietyRequest getSocietyRequestById() {
        return societyRequestById;
    }

    public void setSocietyRequestById(SocietyRequest societyRequestById) {
        this.societyRequestById = societyRequestById;
    }

    @OneToOne(mappedBy = "personByPersonId", fetch = FetchType.LAZY)
    public SuperAdmin getSuperAdminById() {
        return superAdminById;
    }

    public void setSuperAdminById(SuperAdmin superAdminById) {
        this.superAdminById = superAdminById;
    }
}
