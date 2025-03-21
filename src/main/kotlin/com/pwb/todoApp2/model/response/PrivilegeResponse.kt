//TODO ==== BUILT WITH QOONITY VERSION-1.0 - YINKA-ANTHONY-NKAY ON 2025-03-21T14:52:10.725246800
package com.pwb.todoApp2.model.response

import com.pwb.todoApp2.model.entity.Privilege


data class PrivilegeReadListResponse(
   	var responseCode: String,
	var responseMessage: String,
	var data: MutableList<Privilege>
)

data class PrivilegeReadSingleResponse(
   	var responseCode: String,
	var responseMessage: String,
	var data: Privilege
)
