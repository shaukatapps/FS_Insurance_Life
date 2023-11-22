package com.tdl.guaranteedsavings.service

import com.tdl.guaranteedsavings.di.kodein
import com.tdl.guaranteedsavings.dto.FinancialGoalDTO
import com.tdl.guaranteedsavings.dto.FinancialRequestDTO
import com.tdl.guaranteedsavings.dto.validateFinancialGoal
import com.tdl.guaranteedsavings.exception.GSValidationException
import com.tdl.guaranteedsavings.repository.FinancialGoalRepository
import io.konform.validation.Invalid
import org.kodein.di.instance

class FinancialGoalService {
    private val financialGoalRepository by kodein.instance<FinancialGoalRepository>()

    suspend fun saveDetails(body: FinancialGoalDTO) {
        val invalidData = mutableListOf<String>()
        val validationResult = validateFinancialGoal.validate(body)
        if (validationResult is Invalid) {
            validationResult.errors.map {
                invalidData.add(
                    "${it.dataPath.substring(1)} : ${it.message}"
                )
            }
            throw GSValidationException(invalidData.toString())
        }
        return financialGoalRepository.saveDetails(body)
    }

    suspend fun getDetails(body: FinancialRequestDTO): Any {
        return financialGoalRepository.getDetails(body)
    }

    suspend fun updateDetails(body: FinancialGoalDTO) {
        return financialGoalRepository.updateDetails(body)
    }

    /*suspend fun getByHash(body: String?): Int {
        return financialGoalRepository.deleteByHash(body)
    }*/
}
