package models.core;

import java.sql.Date;
import java.util.List;

import models.auxiliary.Project;

public class Experience {
    private String companyName;
    private Date fromDate;
    private Date toDate;
    private String responsibilities;
    private List<Project> projects;
}
