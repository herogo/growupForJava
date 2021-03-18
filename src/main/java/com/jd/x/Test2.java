package com.jd.x;

import com.jd.x.jsonTest.JsonHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: kongpeiling
 * Date: 2021/1/9
 * Time: 17:58
 * Description: com.jd.x
 * To change this template use File | Settings | File Templates.
 */
public class Test2 {

    public static void main(String[] args) {
        ReturnOrderDetail returnOrderDetail1 = new ReturnOrderDetail("materialId1","materDescri1","grade1",
                "wbs1","mark1","supplyBatchNo1","sn1","softwareV1","softN1",
                "validity1","replaceMN1","stL1","rM1","wP1","Qu1",
                "U1","INs1");
        ReturnOrderDetail returnOrderDetail2 = new ReturnOrderDetail("materialId1","materDescri1","grade1",
                "wbs1","mark1","supplyBatchNo1","sn1","softwareV1","softN1",
                "validity1","replaceMN1","stL1","rM1","wP1","Qu1",
                "U1","INs1");
        ReturnOrderDetail returnOrderDetail3 = new ReturnOrderDetail("materialId1","materDescri1","grade1",
                "wbs1","mark1","supplyBatchNo1","sn1","softwareV1","softN1",
                "validity1","replaceMN1","stL1","rM1","wP1","Qu1",
                "U1","INs1");
        ReturnOrderDetail returnOrderDetail4 = new ReturnOrderDetail("materialId1","materDescri1","grade1",
                "wbs1","mark1","supplyBatchNo1","sn1","softwareV1","softN1",
                "validity1","replaceMN1","stL1","rM1","wP1","Qu1",
                "U1","INs1");
        ReturnOrderDetail returnOrderDetail5 = new ReturnOrderDetail("materialId1","materDescri1","grade1",
                "wbs1","mark1","supplyBatchNo1","sn1","softwareV1","softN1",
                "validity1","replaceMN1","stL1","rM1","wP1","Qu1",
                "U1","INs1");
        ReturnOrderDetail returnOrderDetail6 = new ReturnOrderDetail("materialId1","materDescri1","grade1",
                "wbs1","mark1","supplyBatchNo1","sn1","softwareV1","softN1",
                "validity1","replaceMN1","stL1","rM1","wP1","Qu1",
                "U1","INs1");
        List<ReturnOrderDetail> returnOrderDetails = new ArrayList<>();
        returnOrderDetails.add(returnOrderDetail1);
        returnOrderDetails.add(returnOrderDetail2);
        returnOrderDetails.add(returnOrderDetail3);
        returnOrderDetails.add(returnOrderDetail4);
        returnOrderDetails.add(returnOrderDetail5);
        returnOrderDetails.add(returnOrderDetail6);

    ReturnOrder returnOrder = new ReturnOrder("2020-12-12 19:30:51","cargoReceiver","1000000000",
    "retru1","returnBasis","mark","shipNo1",returnOrderDetails);
    List<ReturnOrder> returnOrderList = new ArrayList<>();
    returnOrderList.add(returnOrder);
    Dto printdto = new Dto("ReturnOrder", JsonHelper.toJson(returnOrderList));
    System.out.println("退库单:"+JsonHelper.toJson(printdto));

       TransferDetail transferDetail1 = new TransferDetail("materialId1","materialName1","systemBatchNo1",
           "sn1","supplyBatch1","unit1","quantiy1","stocl1","fo1",
           "wbs1","sourceCon1","targetCon1","sourceW1","targetW1",
           "createtime1","shelfDead1","createUser1");
        TransferDetail transferDetail2 = new TransferDetail("materialId1","materialName1","systemBatchNo1",
                "sn1","supplyBatch1","unit1","quantiy1","stocl1","fo1",
                "wbs1","sourceCon1","targetCon1","sourceW1","targetW1",
                "createtime1","shelfDead1","createUser1");
        TransferDetail transferDetail3 = new TransferDetail("materialId1","materialName1","systemBatchNo1",
                "sn1","supplyBatch1","unit1","quantiy1","stocl1","fo1",
                "wbs1","sourceCon1","targetCon1","sourceW1","targetW1",
                "createtime1","shelfDead1","createUser1");
        TransferDetail transferDetail4 = new TransferDetail("materialId1","materialName1","systemBatchNo1",
                "sn1","supplyBatch1","unit1","quantiy1","stocl1","fo1",
                "wbs1","sourceCon1","targetCon1","sourceW1","targetW1",
                "createtime1","shelfDead1","createUser1");
        TransferDetail transferDetail5 = new TransferDetail("materialId1","materialName1","systemBatchNo1",
                "sn1","supplyBatch1","unit1","quantiy1","stocl1","fo1",
                "wbs1","sourceCon1","targetCon1","sourceW1","targetW1",
                "createtime1","shelfDead1","createUser1");
        TransferDetail transferDetail6 = new TransferDetail("materialId1","materialName1","systemBatchNo1",
                "sn1","supplyBatch1","unit1","quantiy1","stocl1","fo1",
                "wbs1","sourceCon1","targetCon1","sourceW1","targetW1",
                "createtime1","shelfDead1","createUser1");
        TransferDetail transferDetail7 = new TransferDetail("materialId1","materialName1","systemBatchNo1",
                "sn1","supplyBatch1","unit1","quantiy1","stocl1","fo1",
                "wbs1","sourceCon1","targetCon1","sourceW1","targetW1",
                "createtime1","shelfDead1","createUser1");
        List<TransferDetail> transferDetails = new ArrayList<>();
       transferDetails.add(transferDetail1);
       transferDetails.add(transferDetail2);
       transferDetails.add(transferDetail3);
       transferDetails.add(transferDetail4);
       transferDetails.add(transferDetail5);
       transferDetails.add(transferDetail6);
       transferDetails.add(transferDetail7);
       transferDetails.add(transferDetail1);
       transferDetails.add(transferDetail2);
       transferDetails.add(transferDetail3);
       transferDetails.add(transferDetail4);
       transferDetails.add(transferDetail5);
       transferDetails.add(transferDetail6);
       transferDetails.add(transferDetail7);
       Transfer transfer = new Transfer("tranferNo","billtype","京东乾石",transferDetails);
       List<Transfer> transferList = new ArrayList<>();
       transferList.add(transfer);
       Dto printTranfer = new Dto("Transfer",JsonHelper.toJson(transferList));
       System.out.println("转移单:"+JsonHelper.toJson(printTranfer));








        AdjustDetail adjustDetail1 = new AdjustDetail("materialId1","materialName1","systemBatch1",
                "wbs1","sn1","volume1","quantity1","certificateStatus1","targetContainerNo1",
                "createTime1","createUser1");
      List<AdjustDetail> adjustDetailList = new ArrayList<>();
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);
      adjustDetailList.add(adjustDetail1);

      Adjust adjust = new Adjust("adjustOrderNo1","billType",adjustDetailList);

      List<Adjust> adjustList = new ArrayList<>();
      adjustList.add(adjust);

      Dto adjustPrint = new Dto("AdjustOrder",JsonHelper.toJson(adjustList));

        System.out.println("adjust:"+JsonHelper.toJson(adjustPrint));



        DrugInboundDetail drugInboundDetail1 = new DrugInboundDetail("id1","drugNo1","inboundType1","quantity1"
        ,"unit1","phyCha1","mark1");

        List<DrugInboundDetail> drugInboundDetailList = new ArrayList<>();
        drugInboundDetailList.add(drugInboundDetail1);
        drugInboundDetailList.add(drugInboundDetail1);
        drugInboundDetailList.add(drugInboundDetail1);
        drugInboundDetailList.add(drugInboundDetail1);
        drugInboundDetailList.add(drugInboundDetail1);
        drugInboundDetailList.add(drugInboundDetail1);
        drugInboundDetailList.add(drugInboundDetail1);
        drugInboundDetailList.add(drugInboundDetail1);
        drugInboundDetailList.add(drugInboundDetail1);




        DrugInbound drugInbound = new DrugInbound("re1","tra1","ca1","appp1",
                "tranf1","cargor1","reT1",drugInboundDetailList);

        List<DrugInbound> drugInboundList = new ArrayList<>();
        drugInboundList.add(drugInbound);

        Dto drugInboundPrint = new Dto("drugInbound",JsonHelper.toJson(drugInboundList));
        System.out.println("缉毒入库:"+JsonHelper.toJson(JsonHelper.toJson(drugInboundPrint)));





        DrugOutboundDetail drugOutboundDetail = new DrugOutboundDetail("id1","caseNo1","drugNo1","outBoundType1",
                "quantity1","unit1","是","固体","mark1");
        List<DrugOutboundDetail> drugOutboundDetailList = new ArrayList<>();
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);
        drugOutboundDetailList.add(drugOutboundDetail);


        DrugOutbound drugOutbound = new DrugOutbound("京东","任涛","吸毒","禹青平","禹青平",
        "2020-12-12 19:30:51",drugOutboundDetailList);
        List<DrugOutbound> drugOutboundList = new ArrayList<>();
        drugOutboundList.add(drugOutbound);
        Dto drugOutboundPrint = new Dto("drugOutbound",JsonHelper.toJson(drugOutboundList));
        System.out.println("缉毒出库:"+JsonHelper.toJson(JsonHelper.toJson(drugOutboundPrint)));





        PickDetail pickDetail1 = new PickDetail("o1","type1","ship1","mes1","zone1","dsLot1","lineNo1",
                "site1","2019-10-1");
        List<PickDetail> pickDetailList = new ArrayList<>();
        pickDetailList.add(pickDetail1);
        pickDetailList.add(pickDetail1);

       PickDetailList pickDetailListAll = new PickDetailList(pickDetailList);
       List<PickDetailList> pickDetailListList =new ArrayList<>();
       pickDetailListList.add(pickDetailListAll);


        Dto pickListPrint = new Dto("pickList",JsonHelper.toJson(pickDetailListList));
        System.out.println(JsonHelper.toJson(pickListPrint));
    }
}


class Dto {
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

class ReturnOrderDetail{

    //物料编码Material Coding
    public String materialId;

    //物料描述Material Description
    public String materialDescription ;

    //牌号Grade
    public String grade ;

    //WBS
    public String wbs ;

    //批次/MPN物料号/图号/件号
    public String mark ;

    //供应商批次Supplier Batch
    public String supplyBatchNo ;

    //序列号
    public String serialNo ;

    //软件版本Software Version
    public String softwareVersion ;

    //软件件号Software Number
    public String softwareNumber ;

    //有效期Term of Validity
    public String validity ;

    //被替代物料图号/件号Drawing No. / Part No. of Replaced Material
    public String replaceMaterialNo ;

    //库存地点Stock Location
    public String stockLocation ;

    //需求量Requirement
    public String requirement ;

    //仓位Warehouse Position
    public String warehousePosition ;

    //数量Quantity
    public String quantity ;

    //单位Unit
    public String unit ;

    //库存结余Inventory Surplus
    public String inventorySurplus ;


    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public String getMaterialDescription() {
        return materialDescription;
    }

    public void setMaterialDescription(String materialDescription) {
        this.materialDescription = materialDescription;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getWbs() {
        return wbs;
    }

    public void setWbs(String wbs) {
        this.wbs = wbs;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getSupplyBatchNo() {
        return supplyBatchNo;
    }

    public void setSupplyBatchNo(String supplyBatchNo) {
        this.supplyBatchNo = supplyBatchNo;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public String getSoftwareNumber() {
        return softwareNumber;
    }

    public void setSoftwareNumber(String softwareNumber) {
        this.softwareNumber = softwareNumber;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public String getReplaceMaterialNo() {
        return replaceMaterialNo;
    }

    public void setReplaceMaterialNo(String replaceMaterialNo) {
        this.replaceMaterialNo = replaceMaterialNo;
    }

    public String getStockLocation() {
        return stockLocation;
    }

    public void setStockLocation(String stockLocation) {
        this.stockLocation = stockLocation;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getWarehousePosition() {
        return warehousePosition;
    }

    public void setWarehousePosition(String warehousePosition) {
        this.warehousePosition = warehousePosition;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getInventorySurplus() {
        return inventorySurplus;
    }

    public void setInventorySurplus(String inventorySurplus) {
        this.inventorySurplus = inventorySurplus;
    }


    public ReturnOrderDetail(String materialId, String materialDescription, String grade, String wbs, String mark, String supplyBatchNo, String serialNo, String softwareVersion, String softwareNumber, String validity, String replaceMaterialNo, String stockLocation, String requirement, String warehousePosition, String quantity, String unit, String inventorySurplus) {
        this.materialId = materialId;
        this.materialDescription = materialDescription;
        this.grade = grade;
        this.wbs = wbs;
        this.mark = mark;
        this.supplyBatchNo = supplyBatchNo;
        this.serialNo = serialNo;
        this.softwareVersion = softwareVersion;
        this.softwareNumber = softwareNumber;
        this.validity = validity;
        this.replaceMaterialNo = replaceMaterialNo;
        this.stockLocation = stockLocation;
        this.requirement = requirement;
        this.warehousePosition = warehousePosition;
        this.quantity = quantity;
        this.unit = unit;
        this.inventorySurplus = inventorySurplus;
    }
}




class ReturnOrder{
    //退库时间
    public String returnTime ;

    //收货人Cargo Receiver
    public String cargoReceiver ;

    //退料单号/物料凭证
    public String materialIssueNo ;

    //退库人returnPerson
    public String returnPerson ;

    //退库依据 
    public String returnBasis ;

    //AO/AAO/FO
    public String mark ;

    //架次Ship(s) No
    public String shipNo ;
    //明细
    public List<ReturnOrderDetail> returnOrderDetailList ;


    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }

    public String getCargoReceiver() {
        return cargoReceiver;
    }

    public void setCargoReceiver(String cargoReceiver) {
        this.cargoReceiver = cargoReceiver;
    }

    public String getMaterialIssueNo() {
        return materialIssueNo;
    }

    public void setMaterialIssueNo(String materialIssueNo) {
        this.materialIssueNo = materialIssueNo;
    }

    public String getReturnPerson() {
        return returnPerson;
    }

    public void setReturnPerson(String returnPerson) {
        this.returnPerson = returnPerson;
    }

    public String getReturnBasis() {
        return returnBasis;
    }

    public void setReturnBasis(String returnBasis) {
        this.returnBasis = returnBasis;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getShipNo() {
        return shipNo;
    }

    public void setShipNo(String shipNo) {
        this.shipNo = shipNo;
    }

    public List<ReturnOrderDetail> getReturnOrderDetailList() {
        return returnOrderDetailList;
    }

    public void setReturnOrderDetailList(List<ReturnOrderDetail> returnOrderDetailList) {
        this.returnOrderDetailList = returnOrderDetailList;
    }


    public ReturnOrder(String returnTime, String cargoReceiver, String materialIssueNo, String returnPerson, String returnBasis, String mark, String shipNo, List<ReturnOrderDetail> returnOrderDetailList) {
        this.returnTime = returnTime;
        this.cargoReceiver = cargoReceiver;
        this.materialIssueNo = materialIssueNo;
        this.returnPerson = returnPerson;
        this.returnBasis = returnBasis;
        this.mark = mark;
        this.shipNo = shipNo;
        this.returnOrderDetailList = returnOrderDetailList;
    }
}



class TransferDetail{

    /**
     * 物料编码
     */
    public String materialId ;

    /**
     * 物料名称
     */
    public String materialName ;

    //系统批次 
    public String systemBatchNo ;

    //序列号
    public String serialNo ;

    //供应商批次Supplier Batch
    public String supplyBatchNo ;

    //单位Unit
    public String unit ;
    //数量Quantity
    public String quantity ;

    //库存地点Stock Location
    public String stockLocation ;

    //fo
    public String fo ;

    //WBS
    public String wbs ;

    //源容器
    public String sourceContainerNo ;

    //目标容器
    public String targetContainerNo ;

    //源仓位
    public String sourceWarehousePosition ;

    //目标仓位
    public String targetWarehousePosition ;

    //创建时间
    public String createTime ;

    //货架到期日
    public String shelfDeadline ;

    //创建人
    public String createUser ;


    public TransferDetail(String materialId, String materialName, String systemBatchNo, String serialNo, String supplyBatchNo, String unit, String quantity, String stockLocation, String fo, String wbs, String sourceContainerNo, String targetContainerNo, String sourceWarehousePosition, String targetWarehousePosition, String createTime, String shelfDeadline, String createUser) {
        this.materialId = materialId;
        this.materialName = materialName;
        this.systemBatchNo = systemBatchNo;
        this.serialNo = serialNo;
        this.supplyBatchNo = supplyBatchNo;
        this.unit = unit;
        this.quantity = quantity;
        this.stockLocation = stockLocation;
        this.fo = fo;
        this.wbs = wbs;
        this.sourceContainerNo = sourceContainerNo;
        this.targetContainerNo = targetContainerNo;
        this.sourceWarehousePosition = sourceWarehousePosition;
        this.targetWarehousePosition = targetWarehousePosition;
        this.createTime = createTime;
        this.shelfDeadline = shelfDeadline;
        this.createUser = createUser;
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

    public String getSystemBatchNo() {
        return systemBatchNo;
    }

    public void setSystemBatchNo(String systemBatchNo) {
        this.systemBatchNo = systemBatchNo;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getSupplyBatchNo() {
        return supplyBatchNo;
    }

    public void setSupplyBatchNo(String supplyBatchNo) {
        this.supplyBatchNo = supplyBatchNo;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getStockLocation() {
        return stockLocation;
    }

    public void setStockLocation(String stockLocation) {
        this.stockLocation = stockLocation;
    }

    public String getFo() {
        return fo;
    }

    public void setFo(String fo) {
        this.fo = fo;
    }

    public String getWbs() {
        return wbs;
    }

    public void setWbs(String wbs) {
        this.wbs = wbs;
    }

    public String getSourceContainerNo() {
        return sourceContainerNo;
    }

    public void setSourceContainerNo(String sourceContainerNo) {
        this.sourceContainerNo = sourceContainerNo;
    }

    public String getTargetContainerNo() {
        return targetContainerNo;
    }

    public void setTargetContainerNo(String targetContainerNo) {
        this.targetContainerNo = targetContainerNo;
    }

    public String getSourceWarehousePosition() {
        return sourceWarehousePosition;
    }

    public void setSourceWarehousePosition(String sourceWarehousePosition) {
        this.sourceWarehousePosition = sourceWarehousePosition;
    }

    public String getTargetWarehousePosition() {
        return targetWarehousePosition;
    }

    public void setTargetWarehousePosition(String targetWarehousePosition) {
        this.targetWarehousePosition = targetWarehousePosition;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getShelfDeadline() {
        return shelfDeadline;
    }

    public void setShelfDeadline(String shelfDeadline) {
        this.shelfDeadline = shelfDeadline;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
}


class Transfer{
    //转移单号
    public String transferNo ;

    //单据类型
    public String billType ;

    //抬头
    public String title ;

    public List<TransferDetail> transferDetails ;

    public Transfer(String transferNo, String billType, String title, List<TransferDetail> transferDetails) {
        this.transferNo = transferNo;
        this.billType = billType;
        this.title = title;
        this.transferDetails = transferDetails;
    }

    public String getTransferNo() {
        return transferNo;
    }

    public void setTransferNo(String transferNo) {
        this.transferNo = transferNo;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<TransferDetail> getTransferDetails() {
        return transferDetails;
    }

    public void setTransferDetails(List<TransferDetail> transferDetails) {
        this.transferDetails = transferDetails;
    }
}

class AdjustDetail{
    /**
     * 物料编码
     */
    public String materialId ;
    /**
     * 物料名称
     */
    public String materialName ;
    //系统批次
    public String systemBatchNo ;
    //WBS
    public String wbs ;
    //序列号
    public String serialNo ;
    //卷号volume
    public String volume ;
    //数量Quantity
    public String quantity ;
    //目标质检状态
    public String certificateStatus ;
    //目标容器
    public String targetContainerNo ;
    //创建时间
    public String createTime ;
    //创建人
    public String createUser ;

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

    public String getSystemBatchNo() {
        return systemBatchNo;
    }

    public void setSystemBatchNo(String systemBatchNo) {
        this.systemBatchNo = systemBatchNo;
    }

    public String getWbs() {
        return wbs;
    }

    public void setWbs(String wbs) {
        this.wbs = wbs;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getCertificateStatus() {
        return certificateStatus;
    }

    public void setCertificateStatus(String certificateStatus) {
        this.certificateStatus = certificateStatus;
    }

    public String getTargetContainerNo() {
        return targetContainerNo;
    }

    public void setTargetContainerNo(String targetContainerNo) {
        this.targetContainerNo = targetContainerNo;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public AdjustDetail(String materialId, String materialName, String systemBatchNo, String wbs, String serialNo, String volume, String quantity, String certificateStatus, String targetContainerNo, String createTime, String createUser) {
        this.materialId = materialId;
        this.materialName = materialName;
        this.systemBatchNo = systemBatchNo;
        this.wbs = wbs;
        this.serialNo = serialNo;
        this.volume = volume;
        this.quantity = quantity;
        this.certificateStatus = certificateStatus;
        this.targetContainerNo = targetContainerNo;
        this.createTime = createTime;
        this.createUser = createUser;
    }
}


class Adjust{
    public String adjustOrderNo ;


    //单据类型
    public String billType ;

    public List<AdjustDetail> adjustDetails ;


    public Adjust(String adjustOrderNo, String billType, List<AdjustDetail> adjustDetails) {
        this.adjustOrderNo = adjustOrderNo;
        this.billType = billType;
        this.adjustDetails = adjustDetails;
    }

    public String getAdjustOrderNo() {
        return adjustOrderNo;
    }

    public void setAdjustOrderNo(String adjustOrderNo) {
        this.adjustOrderNo = adjustOrderNo;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public List<AdjustDetail> getAdjustDetails() {
        return adjustDetails;
    }

    public void setAdjustDetails(List<AdjustDetail> adjustDetails) {
        this.adjustDetails = adjustDetails;
    }
}


class DrugInboundDetail
{
    //序号
    public String id ;

    //毒品编号
    public String drugNo ;

    //入库类型
    public String inboundType ;

    //数量Quantity
    public String quantity ;

    //单位Unit
    public String unit ;

    //物理特征
    public String physicalCharacteristics ;

    //备注
    public String mark ;

    public DrugInboundDetail(String id, String drugNo, String inboundType, String quantity, String unit, String physicalCharacteristics, String mark) {
        this.id = id;
        this.drugNo = drugNo;
        this.inboundType = inboundType;
        this.quantity = quantity;
        this.unit = unit;
        this.physicalCharacteristics = physicalCharacteristics;
        this.mark = mark;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDrugNo() {
        return drugNo;
    }

    public void setDrugNo(String drugNo) {
        this.drugNo = drugNo;
    }

    public String getInboundType() {
        return inboundType;
    }

    public void setInboundType(String inboundType) {
        this.inboundType = inboundType;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPhysicalCharacteristics() {
        return physicalCharacteristics;
    }

    public void setPhysicalCharacteristics(String physicalCharacteristics) {
        this.physicalCharacteristics = physicalCharacteristics;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}


class DrugInbound
{
    //委托鉴定编号
    public String reconginzdNo ;

    //移交单位
    public String transferCompany ;

    //案件号
    public String caseNo ;

    //申请人
    public String applyPerson ;

    //移交人
    public String transferPerson ;

    //入库交接时间
    public String cargoReceiver ;

    //接收人
    public String receiveTime ;

    //明细
    public List<DrugInboundDetail> drugInboundDetails ;

    public DrugInbound(String reconginzdNo, String transferCompany, String caseNo, String applyPerson, String transferPerson, String cargoReceiver, String receiveTime, List<DrugInboundDetail> drugInboundDetails) {
        this.reconginzdNo = reconginzdNo;
        this.transferCompany = transferCompany;
        this.caseNo = caseNo;
        this.applyPerson = applyPerson;
        this.transferPerson = transferPerson;
        this.cargoReceiver = cargoReceiver;
        this.receiveTime = receiveTime;
        this.drugInboundDetails = drugInboundDetails;
    }

    public String getReconginzdNo() {
        return reconginzdNo;
    }

    public void setReconginzdNo(String reconginzdNo) {
        this.reconginzdNo = reconginzdNo;
    }

    public String getTransferCompany() {
        return transferCompany;
    }

    public void setTransferCompany(String transferCompany) {
        this.transferCompany = transferCompany;
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    public String getApplyPerson() {
        return applyPerson;
    }

    public void setApplyPerson(String applyPerson) {
        this.applyPerson = applyPerson;
    }

    public String getTransferPerson() {
        return transferPerson;
    }

    public void setTransferPerson(String transferPerson) {
        this.transferPerson = transferPerson;
    }

    public String getCargoReceiver() {
        return cargoReceiver;
    }

    public void setCargoReceiver(String cargoReceiver) {
        this.cargoReceiver = cargoReceiver;
    }

    public String getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(String receiveTime) {
        this.receiveTime = receiveTime;
    }

    public List<DrugInboundDetail> getDrugInboundDetails() {
        return drugInboundDetails;
    }

    public void setDrugInboundDetails(List<DrugInboundDetail> drugInboundDetails) {
        this.drugInboundDetails = drugInboundDetails;
    }
}

class DrugOutboundDetail
{
    //序号
    public String id ;

    //案件编号
    public String caseNo ;

    //毒品编号
    public String drugNo ;

    //出库类型
    public String outboundType ;

    //数量Quantity
    public String quantity ;

    //单位Unit
    public String unit ;
    //是否回库
    public String isBack ;

    //物理特征
    public String physicalCharacteristics ;

    //备注
    public String mark ;

    public DrugOutboundDetail(String id, String caseNo, String drugNo, String outboundType, String quantity, String unit, String isBack, String physicalCharacteristics, String mark) {
        this.id = id;
        this.caseNo = caseNo;
        this.drugNo = drugNo;
        this.outboundType = outboundType;
        this.quantity = quantity;
        this.unit = unit;
        this.isBack = isBack;
        this.physicalCharacteristics = physicalCharacteristics;
        this.mark = mark;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    public String getDrugNo() {
        return drugNo;
    }

    public void setDrugNo(String drugNo) {
        this.drugNo = drugNo;
    }

    public String getOutboundType() {
        return outboundType;
    }

    public void setOutboundType(String outboundType) {
        this.outboundType = outboundType;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getIsBack() {
        return isBack;
    }

    public void setIsBack(String isBack) {
        this.isBack = isBack;
    }

    public String getPhysicalCharacteristics() {
        return physicalCharacteristics;
    }

    public void setPhysicalCharacteristics(String physicalCharacteristics) {
        this.physicalCharacteristics = physicalCharacteristics;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}

class DrugOutbound
{
    //申请单位
    public String applyCompany ;

    //申请人
    public String applyPerson ;

    //出库理由
    public String outBoundMark ;

    //移交人
    public String transferPerson ;

    //入库交接时间
    public String cargoReceiver ;

    //接收人
    public String receiveTime ;

    //明细
    public List<DrugOutboundDetail> drugOutboundDetails ;

    public DrugOutbound(String applyCompany, String applyPerson, String outBoundMark, String transferPerson, String cargoReceiver, String receiveTime, List<DrugOutboundDetail> drugOutboundDetails) {
        this.applyCompany = applyCompany;
        this.applyPerson = applyPerson;
        this.outBoundMark = outBoundMark;
        this.transferPerson = transferPerson;
        this.cargoReceiver = cargoReceiver;
        this.receiveTime = receiveTime;
        this.drugOutboundDetails = drugOutboundDetails;
    }

    public String getApplyCompany() {
        return applyCompany;
    }

    public void setApplyCompany(String applyCompany) {
        this.applyCompany = applyCompany;
    }

    public String getApplyPerson() {
        return applyPerson;
    }

    public void setApplyPerson(String applyPerson) {
        this.applyPerson = applyPerson;
    }

    public String getOutBoundMark() {
        return outBoundMark;
    }

    public void setOutBoundMark(String outBoundMark) {
        this.outBoundMark = outBoundMark;
    }

    public String getTransferPerson() {
        return transferPerson;
    }

    public void setTransferPerson(String transferPerson) {
        this.transferPerson = transferPerson;
    }

    public String getCargoReceiver() {
        return cargoReceiver;
    }

    public void setCargoReceiver(String cargoReceiver) {
        this.cargoReceiver = cargoReceiver;
    }

    public String getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(String receiveTime) {
        this.receiveTime = receiveTime;
    }

    public List<DrugOutboundDetail> getDrugOutboundDetails() {
        return drugOutboundDetails;
    }

    public void setDrugOutboundDetails(List<DrugOutboundDetail> drugOutboundDetails) {
        this.drugOutboundDetails = drugOutboundDetails;
    }
}

class PickDetail
{
    public String outboundNo ;
    public String outboundType ;
    public String shipNo ;
    public String mesId ;
    public String zoneNo ;
    public String dsLot ;
    public String lineNo ;
    public String siteName ;
    public String estDate ;

    public PickDetail(String outboundNo, String outboundType, String shipNo, String mesId, String zoneNo, String dsLot, String lineNo, String siteName, String estDate) {
        this.outboundNo = outboundNo;
        this.outboundType = outboundType;
        this.shipNo = shipNo;
        this.mesId = mesId;
        this.zoneNo = zoneNo;
        this.dsLot = dsLot;
        this.lineNo = lineNo;
        this.siteName = siteName;
        this.estDate = estDate;
    }

    public String getOutboundNo() {
        return outboundNo;
    }

    public void setOutboundNo(String outboundNo) {
        this.outboundNo = outboundNo;
    }

    public String getOutboundType() {
        return outboundType;
    }

    public void setOutboundType(String outboundType) {
        this.outboundType = outboundType;
    }

    public String getShipNo() {
        return shipNo;
    }

    public void setShipNo(String shipNo) {
        this.shipNo = shipNo;
    }

    public String getMesId() {
        return mesId;
    }

    public void setMesId(String mesId) {
        this.mesId = mesId;
    }

    public String getZoneNo() {
        return zoneNo;
    }

    public void setZoneNo(String zoneNo) {
        this.zoneNo = zoneNo;
    }

    public String getDsLot() {
        return dsLot;
    }

    public void setDsLot(String dsLot) {
        this.dsLot = dsLot;
    }

    public String getLineNo() {
        return lineNo;
    }

    public void setLineNo(String lineNo) {
        this.lineNo = lineNo;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getEstDate() {
        return estDate;
    }

    public void setEstDate(String estDate) {
        this.estDate = estDate;
    }
}


class PickDetailList
{


    public PickDetailList(List<PickDetail> pickDetails) {
        this.pickDetails = pickDetails;
    }

    //明细
    public List<PickDetail> pickDetails ;


    public List<PickDetail> getPickDetails() {
        return pickDetails;
    }

    public void setPickDetails(List<PickDetail> pickDetails) {
        this.pickDetails = pickDetails;
    }
}