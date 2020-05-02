package com.rednet.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "report_problem", schema = "rednet")
public class ReportProblem {
    private int id;
    private String problem;
    private Person personByPersonId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "problem", nullable = true, length = 500)
    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReportProblem that = (ReportProblem) o;

        if (id != that.id) return false;
        return Objects.equals(problem, that.problem);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (problem != null ? problem.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "id", nullable = false)
    public Person getPersonByPersonId() {
        return personByPersonId;
    }

    public void setPersonByPersonId(Person personByPersonId) {
        this.personByPersonId = personByPersonId;
    }
}
