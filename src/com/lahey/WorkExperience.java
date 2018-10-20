package com.lahey;

import java.util.ArrayList;

/**
 * @author jack lahey
 */

public class WorkExperience {

    //class variables
    private String companyName;
    private String jobTitle;
    private String jobDateStart;
    private String jobDateEnd;
    private ArrayList<String > jobResponsibilityList;


    /**
     * Constructor
     * @param companyName
     * @param jobTitle
     * @param jobDateStart
     * @param jobDateEnd
     */
    public WorkExperience(String companyName, String jobTitle, String jobDateStart, String jobDateEnd) {

        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.jobDateStart = jobDateStart;
        this.jobDateEnd = jobDateEnd;
        jobResponsibilityList = new ArrayList<String>();

    }//end public WorkExperience(String companyName, String jobTitle, String johDescription, String jobDateStart, String jobDateEnd)


    //*********************************************************************
    //* getters & Setters
    //*********************************************************************

    /**
     * Get company name
     * @return
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Set company name
     * @param companyName
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * Get job title
     * @return
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Set job title
     * @param jobTitle
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * Get job start date
     * @return
     */
    public String getJobDateStart() {
        return jobDateStart;
    }

    /**
     * Set job start date
     * @param jobDateStart
     */
    public void setJobDateStart(String jobDateStart) {
        this.jobDateStart = jobDateStart;
    }

    /**
     * get job end date
     * @return
     */
    public String getJobDateEnd() {
        return jobDateEnd;
    }

    /**
     * set job end date
     * @param jobDateEnd
     */
    public void setJobDateEnd(String jobDateEnd) {
        this.jobDateEnd = jobDateEnd;
    }

    //*********************************************************************
    //* other methods
    //*********************************************************************

    /**
     * Get list of job responsibilities
     * @return
     */
    public ArrayList<String> getjobResponsibilities(){

        return jobResponsibilityList;
    }


    /**
     * add a job respnsibility to a work experience
     * @param responsibility
     */
    public void addJobResponsibility(String responsibility){

        jobResponsibilityList.add(responsibility);
    }

}//end public class WorkExperience
