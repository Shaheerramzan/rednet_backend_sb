package com.rednet.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "report_problem", schema = "rednet", catalog = "")
public class ReportProblem {
    private int reportProblemId;
    private String problem;
    private Person personByPersonId;

    @Id
    @Column(name = "report_problem_id", nullable = false)
    public int getReportProblemId() {
        return reportProblemId;
    }

    public void setReportProblemId(int reportProblemId) {
        this.reportProblemId = reportProblemId;
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
        return reportProblemId == that.reportProblemId &&
                Objects.equals(problem, that.problem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportProblemId, problem);
    }

    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "person_id", nullable = false)
    public Person getPersonByPersonId() {
        return personByPersonId;
    }

    public void setPersonByPersonId(Person personByPersonId) {
        this.personByPersonId = personByPersonId;
    }
}
