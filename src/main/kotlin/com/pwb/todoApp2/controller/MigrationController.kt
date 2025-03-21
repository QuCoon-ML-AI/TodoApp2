//TODO ==== BUILT WITH QOONITY VERSION-1.0 - YINKA-ANTHONY-NKAY ON 2025-03-21T14:52:10.475281600
package com.pwb.todoApp2.controller

import com.pwb.todoApp2.utility.Environment
import com.pwb.todoApp2.utility.constant.PrefixConstant
import org.pwb.utility.constant.ResponseConstant
import org.pwb.utility.database.GenerateQuery
import org.pwb.utility.model.response.BaseDataResponse
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/{stage}/migration")
class MigrationController(
    private val environment: Environment
) {

    @GetMapping("/execute")
    fun execute(@PathVariable stage: String): BaseDataResponse{
        return BaseDataResponse(
            responseCode = ResponseConstant.SUCCESS.responseCode,
            responseMessage = ResponseConstant.SUCCESS.responseMessage,
            data = GenerateQuery().createEntity(
                "com.pwb.todoApp2.model.entity",
                PrefixConstant.ENTITY,
                environment.databaseUtil?.sql2oConnection!!,
                environment.executeDatabaseMigration
            )
        )
    }
}
