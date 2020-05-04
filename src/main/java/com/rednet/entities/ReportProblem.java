package com.rednet.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "report_problem", schema = "rednet")
public class ReportProblem {
    private String problem;
    private int personId;
    private Person personByPersonId;

    @Basic
    @Column(name = "problem", nullable = true, length = 500)
    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    @Id
    @Column(name = "person_id", nullable = false)
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReportProblem that = (ReportProblem) o;

        if (personId != that.personId) return false;
        return Objects.equals(problem, that.problem);
    }

    @Override
    public int hashCode() {
        int result = problem != null ? problem.hashCode() : 0;
        result = 31 * result + personId;
        return result;
    }

    @OneToOne
    @JoinColumn(name = "person_id", referencedColumnName = "id", nullable = false)
    public Person getPersonByPersonId() {
        return personByPersonId;
    }

    public void setPersonByPersonId(Person personByPersonId) {
        this.personByPersonId = personByPersonId;
    }
}
