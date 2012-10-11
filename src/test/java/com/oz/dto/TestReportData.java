package com.oz.dto;

import net.sf.jasperreports.engine.JRDataSource;

import java.util.Date;
import java.util.List;

/**
 * Created by Orbital Zero.
 * Date: 13/09/12
 * Time: 05:53 PM
 * Author: Lic. José Alberto Sánchez González
 * Twitter: @jaehoox
 * mail: <a href="mailto:jaehoo@gmail.com">jaehoo@gmail.com</a>
 */
public class TestReportData {

    private String title;
    private Date impressDate;
    private List<TestUser> users;

    private JRDataSource tableDataSource;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getImpressDate() {
        return impressDate;
    }

    public void setImpressDate(Date impressDate) {
        this.impressDate = impressDate;
    }

    public List<TestUser> getUsers() {
        return users;
    }

    public void setUsers(List<TestUser> users) {
        this.users = users;
    }

    public JRDataSource getTableDataSource() {
        return tableDataSource;
    }

    public void setTableDataSource(JRDataSource tableDataSource) {
        this.tableDataSource = tableDataSource;
    }
}
