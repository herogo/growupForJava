package com.jd.x.jsonTest;

/**
 * Created with IntelliJ IDEA.
 * Author: kongpeiling
 * Date: 2019/12/13
 * Time: 17:57
 * Description: com.jd.x.jsonTest
 * To change this template use File | Settings | File Templates.
 */
public class Acctpt {
    String receiveId;
    String materialId;
    String materialName;
    String printcode;
    String factoryid;
    String batchno;
    String type;

    public Acctpt(String receiveId, String materialId, String materialName, String printcode, String factoryid, String batchno, String type) {
        this.receiveId = receiveId;
        this.materialId = materialId;
        this.materialName = materialName;
        this.printcode = printcode;
        this.factoryid = factoryid;
        this.batchno = batchno;
        this.type = type;
    }

    public String getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(String receiveId) {
        this.receiveId = receiveId;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getPrintcode() {
        return printcode;
    }

    public void setPrintcode(String printcode) {
        this.printcode = printcode;
    }

    public String getFactoryid() {
        return factoryid;
    }

    public void setFactoryid(String factoryid) {
        this.factoryid = factoryid;
    }

    public String getBatchno() {
        return batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
