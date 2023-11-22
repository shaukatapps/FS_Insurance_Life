package com.tdl.guaranteedsavings.di

import com.tdl.guaranteedsavings.repository.FinancialGoalRepository
import com.tdl.guaranteedsavings.service.FinancialGoalService
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.singleton

val kodein = DI {
    bind<FinancialGoalService>() with singleton { FinancialGoalService() }
    bind<FinancialGoalRepository>() with singleton { FinancialGoalRepository()   }

}
