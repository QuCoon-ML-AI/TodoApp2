//TODO ==== BUILT WITH QOONITY VERSION-1.0 - YINKA-ANTHONY-NKAY ON 2025-03-21T14:52:10.834606100
package com.pwb.todoApp2.model.response


data class LoginResponse(
   	var userId: Int?=null,
	var userEmail: String?=null,
	var userName: String?=null,
	var userStatus: String?=null,
	var userCreatedAt: String?=null,
	var userUpdatedAt: String?=null,
	var privileges: List<String> = mutableListOf(),
	var token: String?=null,
	var responseCode: String?=null,
	var responseMessage: String?=null
)
