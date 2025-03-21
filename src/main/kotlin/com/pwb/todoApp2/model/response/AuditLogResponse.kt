//TODO ==== BUILT WITH QOONITY VERSION-1.0 - YINKA-ANTHONY-NKAY ON 2025-03-21T14:52:10.772132
package com.pwb.todoApp2.model.response

import com.pwb.todoApp2.model.entity.AuditLog


data class AuditLogReadListResponse(
   	var responseCode: String,
	var responseMessage: String,
	var data: MutableList<AuditLog>
)

data class AuditLogReadSingleResponse(
   	var responseCode: String,
	var responseMessage: String,
	var data: AuditLog
)
