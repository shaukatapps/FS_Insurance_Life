package finance.shared.entities.plMarketplace.schemas

import org.jetbrains.exposed.dao.id.EntityID
import org.jetbrains.exposed.dao.id.IdTable
import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.javatime.date
import org.jetbrains.exposed.sql.javatime.datetime

object QikPlCustomerInfoSchema : IdTable<String>("lending_pl.customerinfo") {
    var customerhash = varchar("customerhash", 255).uniqueIndex()
    var address = varchar("address", 255).nullable()
    var adharUploaded = bool("adharuploaded").nullable()
    var approvaltype = varchar("approvaltype", 255).nullable()
    var approvedAmount = double("approvedamount").nullable()
    var createdAt = date("createdat").nullable()
    var deviceId = varchar("deviceid", 255).nullable()
    var dob = date("dob").nullable()
    var eamilAddress = varchar("emailaddress", 255).nullable()
    var employmenttyp = varchar("employmenttype", 255).nullable()
    var gender = varchar("gender", 255).nullable()
    var geoAddress = varchar("geoaddress", 255).nullable()
    var isgrprofileupdated = bool("isgrprofileupdated").nullable()
    var istncchecked = bool("istncchecked").nullable()
    var kycreq = varchar("kycreq", 255).nullable()
    var kycThrough = varchar("kycthrough", 255).nullable()
    var lastupdatedtimestamp=datetime("lastupdatedtimestamp").nullable()
    var mandateReq = varchar("mandatereq", 255).nullable()
    var mobileno = varchar("mobileno", 255).nullable()
    var name = varchar("name", 255).nullable()
    var pan = varchar("pan", 255).nullable()
    var pincode = varchar("pincode", 255).nullable()
    var platfrom = varchar("platform", 255).nullable()
    var preapprovedamount = double("preapprovedamount").nullable()
    var tnctimestamp = datetime("tnctimestamp").nullable()
    var tncversion = varchar("tncversion", 255).nullable()
    var utmcampaign = varchar("utm_campaign", 255).nullable()
    var utmcontent = varchar("utm_content", 255).nullable()
    var utmmedium = varchar("utm_medium", 255).nullable()
    var utmpostonboaringreturnurl = varchar("utm_post_onboarding_return_url", 255).nullable()
    var utmsource = varchar("utm_source", 255).nullable()
    var utmterm = varchar("utm_term", 255).nullable()
    var companyName = varchar("comapny_name", 255).nullable()
    var companybasecotegary = varchar("company_base_category", 255).nullable()
    var companyCotegary = varchar("company_category", 255).nullable()
    var companyCode = integer("company_code").nullable()
    var companyCodeBancs = varchar("company_code_bancs", 255).nullable()
    var companyemailId = varchar("company_email_id", 255).nullable()
    var companyfinnone = varchar("company_finn_one", 255).nullable()
    var comapanyGruop = varchar("company_group", 255).nullable()
    var nscore = double("n_score").nullable()
    var emicardpreapprovedflag = bool("emicardpreapprovedflag").nullable()
    var plpreapprovedamount = double("plpreapprovedamount").nullable()
    var plpreapprovedflag = bool("plpreapprovedflag").nullable()
    var plleadid = varchar("pl_lead_id", 255).nullable()
    var plmaxtenure = integer("pl_max_tenure").nullable()
    var plopportunityid = varchar("pl_opportunity_id", 255).nullable()
    var plwebtopid = varchar("pl_webtop_id", 255).nullable()
    var contractNumber = varchar("contract_number", 255).nullable()
    var plApprovalType = varchar("pl_approval_type", 255).nullable()
    var rejectionReason = varchar("rejection_reason", 255).nullable()
    var leadId = varchar("lead_id", 255).nullable()
    var webtopId = varchar("webtop_id", 255).nullable()
    var plApprovedAmount = double("pl_approved_amount").nullable()
    var plkycRequired = varchar("pl_kyc_required", 255).nullable()
    var plMandateRequired = varchar("pl_mandate_required", 255).nullable()
    var campaignType = varchar("campaign_type", 255).nullable()
    var userType = varchar("user_type", 255).nullable()
    var ipAddress = varchar("ip_address", 255).nullable()
    var offerType = varchar("offer_type", 255).nullable()
    var offercreatedate = date("offercreatedate").nullable()
    var offerExpiryDate = date("offerexpirydate").nullable()
    var isvalidated = bool("is_validated").nullable()
    var validationTimestamp = datetime("validation_timestamp").nullable()
    var dobMatchFailedCount = integer("dob_match_failed_count").nullable()
    var invalidPanUsedCount = integer("invalid_pan_used_count").nullable()
    var isTataEmployee =  bool("is_tata_employee").nullable()
    var nameMatchScore =  double("name_match_score").nullable()
    var nameAsPerPan = varchar("name_as_per_pan", 255).nullable()
    var idv_band = varchar("idv_band", 255).nullable()
    var kycStatus = varchar("kyc_status", 255).nullable()
    var nachStatus = varchar("nach_status", 255).nullable()
    var finBoxSource = bool("finbox_source").nullable()
    override val id: Column<EntityID<String>> = customerhash.entityId()
}

object PLMCustomerInfoSchema : IdTable<String>("lending_pl.pl_m_customer_info") {

    var customerInfoId = varchar("customer_info_id", 255).uniqueIndex()
    var customerHash = varchar("customer_hash",255)
    var partnerCustomerId = varchar("partner_customer_id",255)
    var mobile = varchar("mobile",255)
    var pan = varchar("pan", 255).nullable()
    var dob = varchar("dob", 255).nullable()
    var email = varchar("email", 255).nullable()
    var gender = varchar("gender", 255).nullable()
    var pin = varchar("pin", 255).nullable()
    var status = varchar("status",255).nullable()
    var createdOn = datetime("created_on")
    var createdBy = varchar("created_by", 255)
    var updatedOn = datetime("updated_on").nullable()
    var updatedBy = varchar("updated_by", 255).nullable()
    val dataHash = varchar("data_hash",255).nullable()
    var firstName = varchar("first_name", 255).nullable()
    var middleName = varchar("middle_name", 255).nullable()
    var lastName = varchar("last_name", 255).nullable()
    var occupation= varchar("occupation", 255).nullable()
    var monthlySalary = varchar("monthly_salary", 255).nullable()
    var purpose = varchar("purpose", 255).nullable()
    var companyCode = integer("company_Code").nullable()
    var deviceId = varchar("device_Id", 255).nullable()
    var platform = varchar("platform", 255).nullable()
    var companyEmail = varchar("company_email",255).nullable()
    var nameAsPerPan = varchar("name_as_per_pan", 255).nullable()
    var finBoxEligibilityStatus = varchar("finbox_eligibility_status", 255).nullable()
    var rejectionReason = varchar("rejection_reason", 255).nullable()
    var consentData = text("consent_data").nullable()
    var companyName = varchar("company_name", 255).nullable()
    var companyCategory = varchar("company_category", 255).nullable()
    override val id: Column<EntityID<String>> = customerInfoId.entityId()

}

object PlOffersSchema : IdTable<String>("lending_pl.pl_offers") {
    var transactionId = varchar("transaction_id", 255).uniqueIndex()
    var plOfferId = varchar("pl_offer_id", 255)
    var lenderId = varchar("lender_id", 255).nullable()
    var tenureType = varchar("tenure_type", 255).nullable()
    var type = varchar("type", 255).nullable()
    var customerHash = varchar("customer_hash", 255).nullable()
    var offerAmount = integer("offer_amount").nullable()
    var tenure = double("tenure").nullable()
    var rateOfInterest = double("rate_of_interest").nullable()
    var status = varchar("status", 255).nullable()
    var memberReferenceId = varchar("member_reference_id", 255).nullable()
    var dob = date("dob").nullable()
    var lenderName = varchar("lender_name", 255).nullable()
    var limitType = varchar("limit_type", 255).nullable()
    var offerType = varchar("offer_type", 255).nullable()
    var sanctionedAmount = double("sanctioned_amount").nullable()
    var validFrom = date("valid_from").nullable()
    var validTill = date("valid_till").nullable()
    var graceDaysAfterApplication = integer("grace_days_after_application").nullable()
    var createdOn = datetime("created_on")
    var createdBy = varchar("created_by", 255)
    var updatedOn = datetime("updated_on").nullable()
    var updatedBy = varchar("updated_by", 255).nullable()
    override val id: Column<EntityID<String>> = transactionId.entityId()
}

object PlApplicationEventSchema : IdTable<String>("lending_pl.pl_application_events") {
    var plApplicationEventId = varchar("pl_application_event_id", 255).uniqueIndex()
    var partnerCustomerId = varchar("partner_customer_id", 255).nullable()
    var eventType = varchar("event_type", 255).nullable()
    var partnerLoanApplicationId = varchar("partner_loan_application_id", 255).nullable()
    var eventSource = varchar("source", 255).nullable()
    var journeyType = varchar("journey_type",255).nullable()
    var status = varchar("status", 255).nullable()
    var event_descr = varchar("event_descr", 255).nullable()
    var entityType = varchar("entity_type", 255).nullable()
    var createdOn = datetime("created_on")
    var createdBy = varchar("created_by", 255)
    var updatedOn = datetime("updated_on").nullable()
    var updatedBy = varchar("updated_by", 255).nullable()
    override val id: Column<EntityID<String>> = plApplicationEventId.entityId()
}

object QikPlAvailedSchema : IdTable<Long> ("lending_pl.personal_loan_availed") {
    var plAvailedId = long("pl_availed_id").uniqueIndex()
    var brokenPeriodDays = integer("broken_period_days").nullable()
    var brokenPeriodInterest = double("broken_period_interest").nullable()
    var customerHash = varchar("customerhash", 255).nullable()
    var deductionExtra1 = double("deduction_extra1").nullable()
    var deductionExtra2 = double("deduction_extra2").nullable()
    var deviceId = varchar("device_id", 255).nullable()
    var disbursalAmount = double("disbursal_amount").nullable()
    var disbursalDate = date("disbursal_date").nullable()
    var emiDueDate = date("emi_due_date").nullable()
    var firstEmiDate = date("first_emi_date").nullable()
    var healthDeclaration = varchar("health_declaration", 255).nullable()
    var insurancePlanId = integer("insurance_plan_id").nullable()
    var insurancePremium = integer("insurance_premium_amount").nullable()
    var isIplAvailed = varchar("is_ipl_availed", 255).nullable()
    var lastUpdatedTimestamp = datetime("lastupdatedtimestamp").nullable()
    var plAmount = double("pl_amount").nullable()
    var plEmi = double("pl_emi").nullable()
    var plLeadId = varchar("pl_lead_id", 255).nullable()
    var plProcessingFee = double("pl_processing_fee").nullable()
    var plRoi = double("pl_roi").nullable()
    var plTenure = integer("pl_tenure").nullable()
    var tncVersion = varchar("tnc_version", 255).nullable()
    var instantCreditStatus = varchar("instant_credit_status", 255).nullable()
    var isCalculatorProceed = varchar("is_calculator_proceed", 255).nullable()
    var isConfirmAddressProceed = varchar("is_confirm_address_proceed", 255).nullable()
    var isInputVariableProceed = varchar("is_input_variable_proceed", 255).nullable()
    var isKycModeProceed = varchar("is_kyc_mode_proceed", 255).nullable()
    var isOfferProceed = varchar("is_offer_proceed", 255).nullable()
    var isOtpProceed = varchar("is_otp_proceed", 255).nullable()
    var isReviewProceed = varchar("is_review_proceed", 255).nullable()
    var isTcProceed = varchar("is_tc_proceed", 255).nullable()
    var loanAccountNumber = varchar("loan_account_number", 255).nullable()
    var maskedBank = varchar("maskedbank", 255).nullable()
    var plLoanRefNumber = varchar("pl_loan_ref_number", 255).nullable()
    var rejection = varchar("rejection", 255).nullable()
    var rejectionReason = varchar("rejection_reason", 255).nullable()
    var loanAgreementUrl = varchar("loan_agreement_url", 255).nullable()
    var loanDetailsUrl = varchar("loan_details_url", 255).nullable()
    var termsAndConditionsUrl = varchar("terms_and_conditions_url", 255).nullable()
    var loanApplicationUrl = varchar("loan_application_url", 255).nullable()
    var plWebtopId = varchar("pl_webtop_id", 255).nullable()
    var gcid = varchar("gcid", 255).nullable()
    var loanAccountNumberDate = datetime("loan_account_number_date").nullable()
    var emiEndDate = date("emi_end_date").nullable()
    var agreementDate = date("aggrement_date").nullable()
    var amountCreditedInBank = double("amount_credited_in_bank").nullable()
    var offerType = varchar("offer_type", 255).nullable()
    var apr = double("apr").nullable()
    override val id: Column<EntityID<Long>> = plAvailedId.entityId()
}

object PlTransactionSchema : IdTable<String>("lending_pl.pl_transaction") {
    var plTransactionId = varchar("pl_transaction_id", 255).uniqueIndex()
    var customerInfoId = varchar("customer_info_id", 255).nullable()
    var partnerLoanApplicationNum = varchar("partner_loan_application_num", 255).nullable()
    var partnerLoanApplicationId = varchar("partner_loan_application_id", 255).nullable()
    var lenderId = varchar("lender_id", 255).nullable()
    var type = varchar("type",255).nullable()
    var appliedAmount = double("applied_amount").nullable()
    var tenure = double("tenure").nullable()
    var rateOfInterest = varchar("rate_of_interest", 255).nullable()
    var status = varchar("status",255).nullable()
    var name = varchar("name",255).nullable()
    var createdAt = datetime("created_at").nullable()
    var email = varchar("email",255).nullable()
    var mobile = varchar("mobile",255).nullable()
    var gender = varchar("gender",255).nullable()
    var dob = varchar("dob",255).nullable()
    var pan = varchar("pan",255).nullable()
    var addressLine1 = varchar("address_lin1",255).nullable()
    var addressLine2 = varchar("address_lin2",255).nullable()
    var city = varchar("city",255).nullable()
    var pincode = varchar("pincode",255).nullable()
    var state = varchar("state",255).nullable()
    var educationLevel = varchar("education_level",255).nullable()
    var dependents = integer("dependents").nullable()
    var expenses = varchar("expenses",255).nullable()
    var fathersName = varchar("fathers_name",255).nullable()
    var income = varchar("income",255).nullable()
    var loanPurpose = varchar("loan_purpose",255).nullable()
    var maritalStatus = varchar("marital_status",255).nullable()
    var referenceContact = varchar("reference_contact",255).nullable()
    var referenceContactName = varchar("reference_contact_name",255).nullable()
    var referenceName = varchar("reference_name",255).nullable()
    var referenceRelationship = varchar("reference_relationship",255).nullable()
    var residenceType = varchar("residence_type",255).nullable()
    var accountNumber = varchar("account_number",255).nullable()
    var ifscCode = varchar("ifsc_code",255).nullable()
    var bankName = varchar("bank_name",255).nullable()
    var accountHolderName = varchar("account_holder_name",255).nullable()
    var insurancePremium = double("insurance_premium").nullable()
    var insurancePlanName = varchar("insurance_plan_name",255).nullable()
    var processingFee = double("processing_fee").nullable()
    var disbursalAmount = double("disbursal_amount").nullable()
    var advanceEmi = double("advance_emi").nullable()
    var emiAmount = double("emi_amount").nullable()
    var stampDutyCharge = double("stamp_duty_charge").nullable()
    var createdOn = datetime("created_on").nullable()
    var createdBy = varchar("created_by", 255).nullable()
    var updatedOn = datetime("updated_on").nullable()
    var updatedBy = varchar("updated_by", 255).nullable()
    override val id: Column<EntityID<String>> = plTransactionId.entityId()
}

object PlEventAuditSchema : IdTable<String>("lending_pl.pl_events_audit") {
    var eventTypeId = varchar("event_type_id", 255).uniqueIndex()
    var partnerCustomerId = varchar("partner_customer_id", 255).nullable()
    var eventType = varchar("event_type", 255).nullable()
    var partnerLoanApplicationId = varchar("partner_loan_application_id", 255).nullable()
    var createdOn = datetime("created_on")
    var createdBy = varchar("created_by", 255)
    var updatedOn = datetime("updated_on").nullable()
    var updatedBy = varchar("updated_by", 255).nullable()
    override val id: Column<EntityID<String>> = eventTypeId.entityId()
}

object CustomerConsentSchema: IdTable<Long>("lending_pl.customer_consent") {
    var consentId = long("consent_id").uniqueIndex().autoIncrement("lending_pl.consent_id_seq")
    var customerHash = varchar("customer_hash", 255)
    var consentType = varchar("consent_type", 255)
    var ipAddress = varchar("ip_address", 255)
    var deviceId = varchar("device_id", 255)
    var version = varchar("version", 255)
    var consentTimestamp = datetime("consent_timestamp")
    var lastUpdatedTimestamp = datetime("last_updated_timestamp")
    var finBoxSource = bool("finbox_source").nullable()
    override val id: Column<EntityID<Long>> = consentId.entityId()
}
