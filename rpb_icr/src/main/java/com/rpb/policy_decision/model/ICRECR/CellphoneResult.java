package com.rpb.policy_decision.model.ICRECR;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "LMSRETAIL_T_CIF_PROFILE_MATCHING_RESULTS")
public class CellphoneResult {
    @Id
    @Column(name = "ID", nullable = false)
    private String id;

    @Column(name = "ALAMAT_DOMISILI")
    private String alamatDomisili;

    @Column(name = "ALAMAT_KANTOR")
    private String alamatKantor;

    @Column(name = "ALAMAT_KTP")
    private String alamatKtp;

    @Column(name = "CREATED_AT")
    private String createdAt;

    @Column(name = "CUSTOMER_NO")
    private String customerNo;

    @Column(name = "CUSTOMER_PROFILE_DECISION_ID")
    private Long customerProfileDecisionId;

    @Column(name = "DATE_OF_BIRTH")
    private String dateOfBirth;

    @Column(name = "EDUCATION")
    private String education;

    @Column(name = "ENTERPRISE_ID")
    private String enterpriseId;

    @Column(name = "ENTITY_TYPE")
    private String entityType;

    @Column(name = "FULL_NAME")
    private String fullName;

    @Column(name = "FUZZY_RESULT_DOB", nullable = false)
    private Double fuzzyResultDob;

    @Column(name = "FUZZY_RESULT_POB", nullable = false)
    private Double fuzzyResultPob;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "GROUP_BY")
    private String groupBy;

    @Column(name = "HANDPHONE_CARDLINK")
    private String handphoneCardlink;

    @Column(name = "HANDPHONE_ICONS")
    private String handphoneIcons;

    @Column(name = "HANDPHONE_MBANK")
    private String handphoneMbank;

    @Column(name = "HANDPHONE_NUMBER")
    private String handphoneNumber;

    @Column(name = "HANDPHONE_NUMBER_MBANK")
    private String handphoneNumberMbank;

    @Column(name = "HANDPHONE_NUMBER_SOURCE")
    private String handphoneNumberSource;

    @Column(name = "JARO_RESULT_DOB", nullable = false)
    private Double jaroResultDob;

    @Column(name = "JARO_RESULT_NAME", nullable = false)
    private Double jaroResultName;

    @Column(name = "JARO_RESULT_POB", nullable = false)
    private Double jaroResultPob;

    @Column(name = "MAP_ID")
    private String mapId;

    @Column(name = "MARTIAL_STATUS")
    private String martialStatus;

    @Column(name = "MATCHING_RESULT")
    private String matchingResult;

    @Column(name = "MATRIX_COUNT")
    private Long matrixCount;

    @Column(name = "MOTHER_MDN_NAME")
    private String motherMdnName;

    @Column(name = "NIK")
    private String nik;

    @Column(name = "NPWP")
    private String npwp;

    @Column(name = "NUM_OF_DEPENDENTS")
    private String numOfDependents;

    @Column(name = "OCCUPATION")
    private String occupation;

    @Column(name = "PLACE_OF_BIRTH")
    private String placeOfBirth;

    @Column(name = "PRODUCT_TYPE")
    private String productType;

    @Column(name = "REFF_NUMBER")
    private String reffNumber;

    @Column(name = "UPDATED_AT")
    private String updatedAt;

    @Column(name = "COMPANY_ADDRESS")
    private String companyAddress;

    @Column(name = "TIPE_DEBITUR")
    private String tipeDebitur;

    @Column(name = "ICR_ID")
    private String icrId;

    @Column(name = "SCHEMA")
    private String schema;

    @Column(name = "CC_STATUS_RULE")
    private String ccStatusRule;

    @Column(name = "AUTO_DEBET_REKENING")
    private Boolean autoDebetRekening;

    @Column(name = "INSERTION_ORDER_ID")
    private Integer insertionOrderId;

    @Column(name = "ENTITY_COUNT")
    private Integer entityCount;

    @Column(name = "IS_CHECKLIST")
    private Boolean isChecklist;

    @Column(name = "DATA_TYPE")
    private String dataType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlamatDomisili() {
        return alamatDomisili;
    }

    public void setAlamatDomisili(String alamatDomisili) {
        this.alamatDomisili = alamatDomisili;
    }

    public String getAlamatKantor() {
        return alamatKantor;
    }

    public void setAlamatKantor(String alamatKantor) {
        this.alamatKantor = alamatKantor;
    }

    public String getAlamatKtp() {
        return alamatKtp;
    }

    public void setAlamatKtp(String alamatKtp) {
        this.alamatKtp = alamatKtp;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public Long getCustomerProfileDecisionId() {
        return customerProfileDecisionId;
    }

    public void setCustomerProfileDecisionId(Long customerProfileDecisionId) {
        this.customerProfileDecisionId = customerProfileDecisionId;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Double getFuzzyResultDob() {
        return fuzzyResultDob;
    }

    public void setFuzzyResultDob(Double fuzzyResultDob) {
        this.fuzzyResultDob = fuzzyResultDob;
    }

    public Double getFuzzyResultPob() {
        return fuzzyResultPob;
    }

    public void setFuzzyResultPob(Double fuzzyResultPob) {
        this.fuzzyResultPob = fuzzyResultPob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    public String getHandphoneCardlink() {
        return handphoneCardlink;
    }

    public void setHandphoneCardlink(String handphoneCardlink) {
        this.handphoneCardlink = handphoneCardlink;
    }

    public String getHandphoneIcons() {
        return handphoneIcons;
    }

    public void setHandphoneIcons(String handphoneIcons) {
        this.handphoneIcons = handphoneIcons;
    }

    public String getHandphoneMbank() {
        return handphoneMbank;
    }

    public void setHandphoneMbank(String handphoneMbank) {
        this.handphoneMbank = handphoneMbank;
    }

    public String getHandphoneNumber() {
        return handphoneNumber;
    }

    public void setHandphoneNumber(String handphoneNumber) {
        this.handphoneNumber = handphoneNumber;
    }

    public String getHandphoneNumberMbank() {
        return handphoneNumberMbank;
    }

    public void setHandphoneNumberMbank(String handphoneNumberMbank) {
        this.handphoneNumberMbank = handphoneNumberMbank;
    }

    public String getHandphoneNumberSource() {
        return handphoneNumberSource;
    }

    public void setHandphoneNumberSource(String handphoneNumberSource) {
        this.handphoneNumberSource = handphoneNumberSource;
    }

    public Double getJaroResultDob() {
        return jaroResultDob;
    }

    public void setJaroResultDob(Double jaroResultDob) {
        this.jaroResultDob = jaroResultDob;
    }

    public Double getJaroResultName() {
        return jaroResultName;
    }

    public void setJaroResultName(Double jaroResultName) {
        this.jaroResultName = jaroResultName;
    }

    public Double getJaroResultPob() {
        return jaroResultPob;
    }

    public void setJaroResultPob(Double jaroResultPob) {
        this.jaroResultPob = jaroResultPob;
    }

    public String getMapId() {
        return mapId;
    }

    public void setMapId(String mapId) {
        this.mapId = mapId;
    }

    public String getMartialStatus() {
        return martialStatus;
    }

    public void setMartialStatus(String martialStatus) {
        this.martialStatus = martialStatus;
    }

    public String getMatchingResult() {
        return matchingResult;
    }

    public void setMatchingResult(String matchingResult) {
        this.matchingResult = matchingResult;
    }

    public Long getMatrixCount() {
        return matrixCount;
    }

    public void setMatrixCount(Long matrixCount) {
        this.matrixCount = matrixCount;
    }

    public String getMotherMdnName() {
        return motherMdnName;
    }

    public void setMotherMdnName(String motherMdnName) {
        this.motherMdnName = motherMdnName;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public String getNumOfDependents() {
        return numOfDependents;
    }

    public void setNumOfDependents(String numOfDependents) {
        this.numOfDependents = numOfDependents;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getReffNumber() {
        return reffNumber;
    }

    public void setReffNumber(String reffNumber) {
        this.reffNumber = reffNumber;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getTipeDebitur() {
        return tipeDebitur;
    }

    public void setTipeDebitur(String tipeDebitur) {
        this.tipeDebitur = tipeDebitur;
    }

    public String getIcrId() {
        return icrId;
    }

    public void setIcrId(String icrId) {
        this.icrId = icrId;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getCcStatusRule() {
        return ccStatusRule;
    }

    public void setCcStatusRule(String ccStatusRule) {
        this.ccStatusRule = ccStatusRule;
    }

    public Boolean getAutoDebetRekening() {
        return autoDebetRekening;
    }

    public void setAutoDebetRekening(Boolean autoDebetRekening) {
        this.autoDebetRekening = autoDebetRekening;
    }

    public Integer getInsertionOrderId() {
        return insertionOrderId;
    }

    public void setInsertionOrderId(Integer insertionOrderId) {
        this.insertionOrderId = insertionOrderId;
    }

    public Integer getEntityCount() {
        return entityCount;
    }

    public void setEntityCount(Integer entityCount) {
        this.entityCount = entityCount;
    }

    public Boolean getIsChecklist() {
        return isChecklist;
    }

    public void setIsChecklist(Boolean isChecklist) {
        this.isChecklist = isChecklist;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }
}
