package model;

import java.io.Serializable;
import java.util.List;

public class Developer implements Serializable {
  long id;
  String firstName;
  String lastName;
  List<Skill> skills;
  Specialty specialty;

  Status status = Status.ACTIVE;

  public Developer() {

  }

  public Developer(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public Developer(String firstName, String lastName, List<Skill> skills, Specialty specialty) {
    generateId();
    this.firstName = firstName;
    this.lastName = lastName;
    this.skills = skills;
    this.specialty = specialty;
  }

  private long generateId() {
    this.id++;
    return id;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public List<Skill> getSkills() {
    return skills;
  }

  public void setSkills(List<Skill> skills) {
    this.skills = skills;
  }

  public Specialty getSpecialty() {
    return specialty;
  }

  public void setSpecialty(Specialty specialty) {
    this.specialty = specialty;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "Developer{" +
            "id=" + id +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", skills=" + skills +
            ", specialty=" + specialty +
            ", status=" + status +
            '}';
  }
}


