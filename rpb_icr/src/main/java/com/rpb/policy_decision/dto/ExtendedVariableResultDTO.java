package com.rpb.policy_decision.dto;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class ExtendedVariableResultDTO {

  // Debitur Details
  private String mapId; // P_MAP_ID
  private String kpName; // P_KP_NAME
  private String kpTitleBefore; // P_KP_TITLE_BEFORE
  private String kpTitleAfter; // P_KP_TITLE_AFTER
  private String kpNik; // P_KP_NIK
  private String kpBirthPlace; // P_KP_BIRTH_PLACE
  private Date kpBirthDate; // P_KP_BIRTH_DATE
  private String kpGender; // P_KP_GENDER
  private String kpMaritalStatus; // P_KP_MARITAL_STATUS
  private String kpKtpAddress; // P_KP_KTP_ADDRESS
  private String kpProvince; // P_KP_PROVINCE
  private String kpCity; // P_KP_CITY
  private String kpDistrict; // P_KP_DISTRICT
  private String kpSubdistrict; // P_KP_SUBDISTRICT
  private String kpPostalCode; // P_KP_POSTAL_CODE
  private String kpPhoneNumber; // P_KP_PHONE_NUMBER
  private String kpEmail; // P_KP_EMAIL
  private String kpNationality; // P_KP_NATIONALITY
  private String kpMmName; // P_KP_MM_NAME
  private String kpJob; // P_KP_JOB
  private String kpEducation; // P_KP_EDUCATION
  private String status; // P_STATUS

  // Pasangan Details
  private String spouseTitleBefore; // SPOUSE_TITLE_BEFORE
  private String spouseName; // SPOUSE_NAME
  private String spouseTitleAfter; // SPOUSE_TITLE_AFTER
  private String spouseNik; // SPOUSE_NIK
  private String spouseBirthPlace; // SPOUSE_BIRTH_PLACE
  private Date spouseBirthDate; // SPOUSE_BIRTH_DATE
  private String spouseGender; // SPOUSE_GENDER
  private String spouseMobileNumber; // SPOUSE_MOBILE_NUMBER
  private String spouseNationality; // SPOUSE_NATIONALITY
  private String spouseKtpAddress; // SPOUSE_KTP_ADDRESS
  private String spouseProvince; // SPOUSE_PROVINCE
  private String spouseCity; // SPOUSE_CITY
  private String spouseDistrict; // SPOUSE_DISTRICT
  private String spouseVillage; // SPOUSE_VILLAGE
  private String spousePostalCode; // SPOUSE_POSTAL_CODE
  private String spouseJobTitle; // SPOUSE_JOB_TITLE

  // Badan Usaha Details
  private String noBeNpwp; // P_BUSINESS_NPWP
  private String companyName; // P_BUSINESS_NAME
  private Date foundingDate; // P_BUSINESS_FOUNDING_DATE
  private String beEmailAddress; // P_BUSINESS_EMAIL_ADDRESS

  // Jenis Debitur
  private String debtorType; // P_DEBTOR_TYPE

  // New Applicant Details
  private String applicantTitleBefore; // P_APPLICANT_TITLE_BEFORE
  private String applicantTitle; // P_APPLICANT_TITLE
  private String applicantFullName; // P_APPLICANT_FULL_NAME
  private Date applicationDate; // P_APPLICATION_DATE
  private String applicantStatus; // P_APPLICANT_STATUS
  private String applicantProvince; // P_APPLICANT_PROVINCE
  private String applicantDistrict; // P_APPLICANT_DISTRICT
  private String applicantPostalCode; // P_APPLICANT_POSTAL_CODE
  private String applicantPhoneNumber; // P_APPLICANT_PHONE_NUMBER
  private String applicantEmail; // P_APPLICANT_EMAIL
  private String applicantNationality; // P_APPLICANT_NATIONALITY
  private String applicantMmName; // P_APPLICANT_MM_NAME
  private String applicantJob; // P_APPLICANT_JOB
  private String applicantEducation; // P_APPLICANT_EDUCATION
  private String applicantNpwpNumber; // P_APPLICANT_NPWP_NUMBER

  private String loanId;
  private String maritalStatus;

}
