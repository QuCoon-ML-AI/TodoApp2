//TODO ==== BUILT WITH QOONITY VERSION-1.0 - YINKA-ANTHONY-NKAY ON 2025-03-21T14:52:10.600711600
package com.pwb.todoApp2.model.response

import com.pwb.todoApp2.model.entity.user


data class UserReadListResponse(
   	var responseCode: String,
	var responseMessage: String,
	var data: MutableList<user>
)

data class UserReadSingleResponse(
   	var responseCode: String,
	var responseMessage: String,
	var data: user
)
