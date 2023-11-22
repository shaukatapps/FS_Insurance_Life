package com.tdl.guaranteedsavings.plugins

import com.tdl.guaranteedsavings.route.configureFinancialGoalRoute
import io.ktor.server.application.Application

fun Application.configureRouting() {
    configureFinancialGoalRoute()
}
