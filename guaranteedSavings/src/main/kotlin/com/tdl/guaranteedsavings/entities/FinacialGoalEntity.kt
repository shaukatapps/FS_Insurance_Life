package com.tdl.guaranteedsavings.entities

import org.ktorm.entity.Entity
import org.ktorm.schema.*
import java.sql.Date

interface FinancialGoalEntity: Entity<FinancialGoalEntity> {
        val custHash: String
        val planType: String
        val monthlyInvestmentAmount: Int
        val minInvestmentAmount: Int
        val maxInvestmentAmount: Int
        val numberOfYears: Int
        val dateOfBirth: String
        val gender: String
        val calculatedInvestAmount: Int
        val accommodationExpenses: Double
        val entertainmentExpenses: Double
        val foodExpenses: Double
        val utilitiesExpenses: Double
        val minMonthlyExpenses: Double
        val maxMonthlyExpenses: Double
        val yearIncomeStart: Int
        val monthlyEmi: Int
        val currentMonthlyExpenses: Double
        val futureMonthlyExpenses: Double
        val yearIncomeReturns: Double
        val expectedGoalAmount: Double
        val educationStartYear: Int
        val fieldOfStudy:String
        val educationCost: Double
        val currentEducationCost: Double
        val futureEducationCost: Double
        val investmentFrequency: String
        val investmentAmount: Int
        val investmentDuration: String
        val incomeType: String
        val incomeDuration: String
        val customerAge: Int
        val idealCoverage: Int
        val coverageOption: Int
        val graduated: Boolean
        val smoke: Boolean
        val occupationType: String
        val incomeRange: String

    }

    object FinancialGoalEntities : Table<FinancialGoalEntity>("financial_goal_plan"){
        val custHash=varchar("cust_hash").bindTo { it.custHash }.primaryKey()
        val planType=varchar("plan_type").bindTo { it.planType }
        val monthlyInvestmentAmount=int("monthly_investment_amount").bindTo { it.monthlyInvestmentAmount }
        val minInvestmentAmount=int("min_investment_amount").bindTo { it.minInvestmentAmount }
        val maxInvestmentAmount=int("max_investment_amount").bindTo { it.maxInvestmentAmount }
        val numberOfYears=int("number_of_years").bindTo { it.numberOfYears }
        val dateOfBirth = varchar("date_of_birth").bindTo { it.dateOfBirth }
        val gender =varchar("gender").bindTo { it.gender}
        val calculatedInvestAmount = int("calculated_invest_amount").bindTo { it.calculatedInvestAmount}
        val accommodationExpenses = double("accommodation_expenses").bindTo { it.accommodationExpenses }
        val entertainmentExpenses = double("entertainment_expenses").bindTo { it.entertainmentExpenses }
        val foodExpenses = double("food_expenses").bindTo { it.foodExpenses }
        val utilitiesExpenses = double("utilities_expenses").bindTo { it.utilitiesExpenses }
        val minMonthlyExpenses = double("min_monthly_expenses").bindTo { it.minMonthlyExpenses }
        val maxMonthlyExpenses = double("max_monthly_expenses").bindTo { it.maxMonthlyExpenses }
        val yearIncomeStart = int("year_income_start").bindTo { it.yearIncomeStart }
        val monthlyEmi = int("monthly_emi").bindTo { it.monthlyEmi }
        val currentMonthlyExpenses = double("current_monthly_expenses").bindTo { it.currentMonthlyExpenses }
        val futureMonthlyExpenses = double("future_monthly_expenses").bindTo { it.futureMonthlyExpenses }
        val yearIncomeReturns = double("year_income_returns").bindTo { it.yearIncomeReturns }
        val expectedGoalAmount = double("expected_goal_amount").bindTo { it.expectedGoalAmount }
        val educationStartYear = int("education_start_year").bindTo { it.educationStartYear }
        val fieldOfStudy = varchar("feild_of_study").bindTo { it.fieldOfStudy }
        val educationCost = double("education_cost").bindTo { it.educationCost }
        val currentEducationCost = double("current_education_cost").bindTo { it.currentEducationCost }
        val futureEducationCost = double("future_education_cost").bindTo { it.futureEducationCost }
        val investmentFrequency = varchar("investment_frequency").bindTo { it.investmentFrequency }
        val investmentAmount = int("investment_amount").bindTo { it.investmentAmount }
        val investmentDuration = varchar("investment_duration").bindTo { it.investmentDuration }
        val incomeType = varchar("income_type").bindTo { it.incomeType }
        val incomeDuration = varchar("income_duration").bindTo { it.incomeDuration }
        val customerAge = int("customer_age").bindTo { it.customerAge }
        val idealCoverage = int("ideal_coverage").bindTo { it.idealCoverage }
        val coverageOption = int("coverage_option").bindTo { it.coverageOption }
        val graduated = boolean("graduated").bindTo { it.graduated }
        val smoke = boolean("smoke").bindTo { it.smoke }
        val occupationType = varchar("occupation_type").bindTo { it.occupationType }
        val incomeRange = varchar("income_range").bindTo { it.incomeRange }
    }
