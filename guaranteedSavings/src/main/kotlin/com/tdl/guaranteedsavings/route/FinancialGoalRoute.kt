package com.tdl.guaranteedsavings.route

import com.tdl.guaranteedsavings.di.kodein
import com.tdl.guaranteedsavings.dto.FinancialGoalDTO
import com.tdl.guaranteedsavings.dto.FinancialRequestDTO
import com.tdl.guaranteedsavings.service.FinancialGoalService
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.kodein.di.instance

fun Application.configureFinancialGoalRoute(){
    routing {
        val financialGoalService by kodein.instance<FinancialGoalService>()
        route("/financialGoal") {

            post("/saveFinancialGoal") {
                val body = call.receive<FinancialGoalDTO>()
                financialGoalService.saveDetails(body)
                call.respond("ok")

            }

            post("/getFinancialGoal") {
                val body = call.receive<FinancialRequestDTO>()
                call.respond(financialGoalService.getDetails(body))
            }

            post("/updateFinancialGoal") {
                val body = call.receive<FinancialGoalDTO>()
                call.respond(financialGoalService.updateDetails(body))
            }
        }
    }
}
