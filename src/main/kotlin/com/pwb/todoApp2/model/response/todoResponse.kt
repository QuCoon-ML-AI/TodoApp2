//TODO ==== BUILT WITH QOONITY VERSION-1.0 - YINKA-ANTHONY-NKAY ON 2025-03-21T14:52:10.678443100
package com.pwb.todoApp2.model.response

import com.pwb.todoApp2.model.entity.todo


data class TodoReadListResponse(
   	var responseCode: String,
	var responseMessage: String,
	var data: MutableList<todo>
)

data class TodoReadSingleResponse(
   	var responseCode: String,
	var responseMessage: String,
	var data: todo
)
