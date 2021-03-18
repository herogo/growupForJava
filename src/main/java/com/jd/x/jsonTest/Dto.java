package com.jd.x.jsonTest;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Author: kongpeiling
 * Date: 2019/12/13
 * Time: 17:55
 * Description: com.jd.x.jsonTest
 * To change this template use File | Settings | File Templates.
 */
public class Dto {
    String reportId;
    String printContent;

    public Dto(String reportId, String printContent) {
        this.reportId = reportId;
        this.printContent = printContent;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getPrintContent() {
        return printContent;
    }

    public void setPrintContent(String printContent) {
        this.printContent = printContent;
    }
}
