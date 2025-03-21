//TODO ==== BUILT WITH QOONITY VERSION-1.0 - YINKA-ANTHONY-NKAY ON 2025-03-21T14:52:10.709634200
package com.pwb.todoApp2.model.response

import com.pwb.todoApp2.model.entity.LoginHistory


data class LoginHistoryReadListResponse(
   	var responseCode: String,
	var responseMessage: String,
	var data: MutableList<LoginHistory>
)

data class LoginHistoryReadSingleResponse(
   	var responseCode: String,
	var responseMessage: String,
	var data: LoginHistory
)
