//TODO ==== BUILT WITH QOONITY VERSION-1.0 - YINKA-ANTHONY-NKAY ON 2025-03-21T14:52:10.740857800
package com.pwb.todoApp2.model.response

import com.pwb.todoApp2.model.entity.RolePrivilege


data class RolePrivilegeReadListResponse(
   	var responseCode: String,
	var responseMessage: String,
	var data: MutableList<RolePrivilege>
)

data class RolePrivilegeReadSingleResponse(
   	var responseCode: String,
	var responseMessage: String,
	var data: RolePrivilege
)
