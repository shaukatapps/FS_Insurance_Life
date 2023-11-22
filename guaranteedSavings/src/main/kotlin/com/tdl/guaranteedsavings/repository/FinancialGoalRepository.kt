package com.tdl.guaranteedsavings.repository

import com.tdl.guaranteedsavings.config.DBConfig
import com.tdl.guaranteedsavings.dto.FinancialGoalDTO
import com.tdl.guaranteedsavings.dto.FinancialRequestDTO
import com.tdl.guaranteedsavings.entities.FinancialGoalEntities
import com.tdl.guaranteedsavings.exception.GSBadRequestException
import org.ktorm.dsl.*

class FinancialGoalRepository {

    suspend fun saveDetails(body: FinancialGoalDTO) {
        val check = getDetails(FinancialRequestDTO(body.custHash))
        if (check.isEmpty()) {
            return DBConfig.dbQuery {
                DBConfig.getDatabase().insert(FinancialGoalEntities) {
                    set(it.custHash, body.custHash)
                    set(it.planType, body.planType)
                    set(it.maxInvestmentAmount, body.maxInvestmentAmount)
                    set(it.minInvestmentAmount, body.minInvestmentAmount)
                    set(it.monthlyInvestmentAmount, body.monthlyInvestmentAmount)
                    set(it.numberOfYears, body.numberOfYears)
                    set(it.dateOfBirth, body.dateOfBirth)
                    set(it.gender, body.gender)
                    set(it.calculatedInvestAmount, body.calculatedInvestAmount)
                    set(it.accommodationExpenses, body.accommodationExpenses)
                    set(it.entertainmentExpenses, body.entertainmentExpenses)
                    set(it.foodExpenses, body.foodExpenses)
                    set(it.utilitiesExpenses, body.utilitiesExpenses)
                    set(it.minMonthlyExpenses, body.minMonthlyExpenses)
                    set(it.maxMonthlyExpenses, body.maxMonthlyExpenses)
                    set(it.yearIncomeStart, body.yearIncomeStart)
                    set(it.monthlyEmi, body.monthlyEmi)
                    set(it.currentMonthlyExpenses, body.currentMonthlyExpenses)
                    set(it.futureMonthlyExpenses, body.futureMonthlyExpenses)
                    set(it.yearIncomeReturns, body.yearIncomeReturns)
                    set(it.expectedGoalAmount, body.expectedGoalAmount)
                    set(it.educationStartYear, body.educationStartYear)
                    set(it.fieldOfStudy, body.fieldOfStudy)
                    set(it.educationCost, body.educationCost)
                    set(it.currentEducationCost, body.currentEducationCost)
                    set(it.futureEducationCost, body.futureEducationCost)
                    set(it.investmentFrequency, body.investmentFrequency)
                    set(it.investmentAmount, body.investmentAmount)
                    set(it.investmentDuration,body.investmentDuration)
                    set(it.incomeType,body.incomeType)
                    set(it.incomeDuration,body.incomeDuration)
                    set(it.customerAge, body.customerAge)
                    set(it.idealCoverage, body.idealCoverage)
                    set(it.coverageOption, body.coverageOption)
                    set(it.graduated, body.graduated)
                    set(it.smoke, body.smoke)
                    set(it.occupationType, body.occupationType)
                    set(it.incomeRange, body.incomeRange)
                }
            }
        } else {
            throw GSBadRequestException("${body.custHash} is Already present in Database.")
        }
    }
    suspend fun getDetails(body: FinancialRequestDTO): List<FinancialGoalDTO> {
        val result = DBConfig.dbQuery {
            DBConfig.getDatabase().from(FinancialGoalEntities).select()
                .where { FinancialGoalEntities.custHash eq body.custHash }
                .map { FinancialGoalEntities.createEntity(it) }.map {
                    FinancialGoalDTO(
                        it.custHash,
                        it.planType,
                        it.monthlyInvestmentAmount,
                        it.minInvestmentAmount,
                        it.maxInvestmentAmount,
                        it.numberOfYears,
                        it.dateOfBirth,
                        it.gender,
                        it.calculatedInvestAmount,
                        it.accommodationExpenses,
                        it.entertainmentExpenses,
                        it.foodExpenses,
                        it.utilitiesExpenses,
                        it.minMonthlyExpenses,
                        it.maxMonthlyExpenses,
                        it.yearIncomeStart,
                        it.monthlyEmi,
                        it.currentMonthlyExpenses,
                        it.futureMonthlyExpenses,
                        it.yearIncomeReturns,
                        it.expectedGoalAmount,
                        it.educationStartYear,
                        it.fieldOfStudy,
                        it.educationCost,
                        it.currentEducationCost,
                        it.futureEducationCost,
                        it.investmentFrequency,
                        it.investmentAmount,
                        it.investmentDuration,
                        it.incomeType,
                        it.incomeDuration,
                        it.customerAge,
                        it.idealCoverage,
                        it.coverageOption,
                        it.graduated,
                        it.smoke,
                        it.occupationType,
                        it.incomeRange

                    )
                }
        }
            return result
    }

    suspend fun updateDetails(body: FinancialGoalDTO) {
        return DBConfig.dbQuery {
            DBConfig.getDatabase().update(FinancialGoalEntities) {
                where { it.custHash eq body.custHash }
                set(it.planType, body.planType)
                set(it.maxInvestmentAmount, body.maxInvestmentAmount)
                set(it.minInvestmentAmount, body.minInvestmentAmount)
                set(it.monthlyInvestmentAmount, body.monthlyInvestmentAmount)
                set(it.numberOfYears, body.numberOfYears)
                set(it.dateOfBirth, body.dateOfBirth)
                set(it.gender, body.gender)
                set(it.calculatedInvestAmount, body.calculatedInvestAmount)
                set(it.accommodationExpenses, body.accommodationExpenses)
                set(it.entertainmentExpenses, body.entertainmentExpenses)
                set(it.foodExpenses, body.foodExpenses)
                set(it.utilitiesExpenses, body.utilitiesExpenses)
                set(it.minMonthlyExpenses, body.minMonthlyExpenses)
                set(it.maxMonthlyExpenses, body.maxMonthlyExpenses)
                set(it.yearIncomeStart, body.yearIncomeStart)
                set(it.monthlyEmi, body.monthlyEmi)
                set(it.currentMonthlyExpenses, body.currentMonthlyExpenses)
                set(it.futureMonthlyExpenses, body.futureMonthlyExpenses)
                set(it.yearIncomeReturns, body.yearIncomeReturns)
                set(it.expectedGoalAmount, body.expectedGoalAmount)
                set(it.educationStartYear, body.educationStartYear)
                set(it.fieldOfStudy, body.fieldOfStudy)
                set(it.educationCost, body.educationCost)
                set(it.currentEducationCost, body.currentEducationCost)
                set(it.futureEducationCost, body.futureEducationCost)
                set(it.customerAge, body.customerAge)
                set(it.idealCoverage, body.idealCoverage)
                set(it.coverageOption, body.coverageOption)
                set(it.graduated, body.graduated)
                set(it.smoke, body.smoke)
                set(it.occupationType, body.occupationType)
                set(it.incomeRange, body.incomeRange)

            }
        }
    }

    /*suspend fun getAllDetails(): Any {
        val result = DBConfig.dbQuery {
            DBConfig.getDatabase().from(FinancialGoalEntities).select().map { FinancialGoalEntities.createEntity(it) }
                .map {
                    FinancialGoalDTO(
                        it.custHash,
                        it.planType,
                        it.monthlyInvestmentAmount,
                        it.maxInvestmentAmount,
                        it.minInvestmentAmount,
                        it.numberOfYears,
                        it.dateOfBirth,
                        it.gender,
                        it.calculatedInvestAmount,
                        it.accommodationExpenses,
                        it.entertainmentExpenses,
                        it.foodExpenses,
                        it.utilitiesExpenses,
                        it.minMonthlyExpenses,
                        it.maxMonthlyExpenses,
                        it.yearIncomeStart,
                        it.monthlyEmi,
                        it.currentMonthlyExpenses,
                        it.futureMonthlyExpenses,
                        it.yearIncomeReturns,
                        it.expectedGoalAmount,
                        it.educationStartYear,
                        it.fieldOfStudy,
                        it.educationCost,
                        it.currentEducationCost,
                        it.futureEducationCost,
                        it.investmentFrequency,
                        it.investmentAmount,
                        it.investmentDuration,
                        it.incomeType,
                        it.incomeDuration,
                        it.customerAge,
                        it.idealCoverage,
                        it.coverageOption,
                        it.graduated,
                        it.smoke,
                        it.occupationType,
                        it.incomeRange
                    )
                }
        }
        return result.ifEmpty {
            throw GSBadRequestException("Empty Database!!")
        }
    }
    suspend fun deleteByHash(body: String?): Int {
        val result = DBConfig.dbQuery {
            DBConfig.getDatabase().delete(FinancialGoalEntities) { it.custHash eq body!! }
        }
        return result
    }*/
}


