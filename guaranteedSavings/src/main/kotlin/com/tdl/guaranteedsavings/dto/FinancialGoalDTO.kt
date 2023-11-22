package com.tdl.guaranteedsavings.dto

import io.konform.validation.Validation
import io.konform.validation.jsonschema.pattern
import java.sql.Date

data class FinancialGoalDTO(
    val custHash: String,
    val planType: String,
    val monthlyInvestmentAmount: Int,
    val minInvestmentAmount: Int,
    val maxInvestmentAmount: Int,
    val numberOfYears: Int,
    val dateOfBirth: String,
    val gender: String,
    val calculatedInvestAmount: Int,
    val accommodationExpenses: Double,
    val entertainmentExpenses: Double,
    val foodExpenses: Double,
    val utilitiesExpenses: Double,
    val minMonthlyExpenses: Double,
    val maxMonthlyExpenses: Double,
    val yearIncomeStart: Int,
    val monthlyEmi: Int,
    val currentMonthlyExpenses: Double,
    val futureMonthlyExpenses: Double,
    val yearIncomeReturns: Double,
    val expectedGoalAmount: Double,
    val educationStartYear: Int,
    val fieldOfStudy:String,
    val educationCost: Double,
    val currentEducationCost: Double,
    val futureEducationCost: Double,
    val investmentFrequency: String,
    val investmentAmount: Int,
    val investmentDuration: String,
    val incomeType: String,
    val incomeDuration: String,
    val customerAge: Int,
    val idealCoverage: Int,
    val coverageOption: Int,
    val graduated: Boolean,
    val smoke: Boolean,
    val occupationType: String,
    val incomeRange: String

)

val validateFinancialGoal = Validation<FinancialGoalDTO>{
    FinancialGoalDTO::custHash required {}
    FinancialGoalDTO::planType required {
        pattern("^[a-zA-Z\\s]+$") hint "Enter valid String"
    }
    FinancialGoalDTO::dateOfBirth required {
        pattern(
            "(((0[1-9])|([12][0-9])|(3[01]))\\" +
                    "/((0[1-9])|(1[012]))\\" +
                    "/(((20|19)[0-9][0-9])))"
        ) hint "Enter Valid Date Of Birth"
    }
    FinancialGoalDTO::gender required {
        pattern("(?:m|M|male|Male|f|F|female|Female|FEMALE|MALE|Not prefer to say)$"
        ) hint "Enter Valid Gender"
    }
    FinancialGoalDTO::monthlyInvestmentAmount required {}
    FinancialGoalDTO::maxInvestmentAmount required {}
    FinancialGoalDTO::minInvestmentAmount required {}
    FinancialGoalDTO::numberOfYears required {}
    FinancialGoalDTO::calculatedInvestAmount required {}
    FinancialGoalDTO::accommodationExpenses required {}
    FinancialGoalDTO::entertainmentExpenses required {}
    FinancialGoalDTO::foodExpenses required {}
    FinancialGoalDTO::utilitiesExpenses required {}
    FinancialGoalDTO::minMonthlyExpenses required {}
    FinancialGoalDTO::maxMonthlyExpenses required {}
    FinancialGoalDTO::yearIncomeStart required {}
    FinancialGoalDTO::monthlyEmi required {}
    FinancialGoalDTO::currentMonthlyExpenses required {}
    FinancialGoalDTO::futureMonthlyExpenses required {}
    FinancialGoalDTO::yearIncomeReturns required {}
    FinancialGoalDTO::expectedGoalAmount required {}
    FinancialGoalDTO::investmentFrequency required {}
    FinancialGoalDTO::investmentAmount required {}
    FinancialGoalDTO::investmentDuration required {}
    FinancialGoalDTO::customerAge required {}
    FinancialGoalDTO::idealCoverage required {}
    FinancialGoalDTO::coverageOption required {}
    FinancialGoalDTO::graduated required {}
    FinancialGoalDTO::smoke required {}
    FinancialGoalDTO::occupationType required {}
    FinancialGoalDTO::incomeRange required {}
}

