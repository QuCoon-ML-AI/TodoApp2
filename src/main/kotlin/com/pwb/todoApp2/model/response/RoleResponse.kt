//TODO ==== BUILT WITH QOONITY VERSION-1.0 - YINKA-ANTHONY-NKAY ON 2025-03-21T14:52:10.740857800
package com.pwb.todoApp2.model.response

import com.pwb.todoApp2.model.entity.Role


data class RoleReadListResponse(
   	var responseCode: String,
	var responseMessage: String,
	var data: MutableList<Role>
)

data class RoleReadSingleResponse(
   	var responseCode: String,
	var responseMessage: String,
	var data: Role
)
