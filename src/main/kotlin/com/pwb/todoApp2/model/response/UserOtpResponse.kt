//TODO ==== BUILT WITH QOONITY VERSION-1.0 - YINKA-ANTHONY-NKAY ON 2025-03-21T14:52:10.694035900
package com.pwb.todoApp2.model.response

import com.pwb.todoApp2.model.entity.UserOtp


data class UserOtpReadListResponse(
   	var responseCode: String,
	var responseMessage: String,
	var data: MutableList<UserOtp>
)

data class UserOtpReadSingleResponse(
   	var responseCode: String,
	var responseMessage: String,
	var data: UserOtp
)
