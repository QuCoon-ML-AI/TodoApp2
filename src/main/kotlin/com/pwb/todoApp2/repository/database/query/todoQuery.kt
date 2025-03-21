//TODO ==== BUILT WITH QOONITY VERSION-1.0 - YINKA-ANTHONY-NKAY ON 2025-03-21T14:52:10.678443100
package com.pwb.todoApp2.repository.database.query

import com.pwb.todoApp2.utility.constant.PrefixConstant


object todoQuery{
   	const val INSERT = """
		INSERT INTO ${PrefixConstant.ENTITY}TODO(
			todoTitle,
			todoDescription,
			todoStatus,
			todoDueDate,
			todoUserId,
			todoCreatedAt,
			todoUpdatedAt
		) VALUES (
			:todoTitle,
			:todoDescription,
			COALESCE(:todoStatus,'ACTIVE'),
			:todoDueDate,
			:todoUserId,
			COALESCE(:todoCreatedAt,getdate()),
			COALESCE(:todoUpdatedAt,getdate())
		)
	"""

	const val UPDATE = """
		UPDATE ${PrefixConstant.ENTITY}TODO SET
			todoTitle=:todoTitle,
			todoDescription=:todoDescription,
			todoStatus=:todoStatus,
			todoDueDate=:todoDueDate,
			todoUserId=:todoUserId,
			todoCreatedAt=:todoCreatedAt,
			todoUpdatedAt=GETDATE()
		WHERE todoId=:todoId
	"""

	const val DELETE = """
		UPDATE ${PrefixConstant.ENTITY}TODO SET todoStatus = 'DELETED', todoUpdatedAt = GETDATE()
		WHERE todoId=:todoId
	"""

	const val TRUNCATE = """
		TRUNCATE TABLE ${PrefixConstant.ENTITY}TODO 
	"""

	const val READ = """
		SELECT * FROM ${PrefixConstant.ENTITY}TODO WHERE todoStatus<>'DELETED'
	"""

	const val READ_BY_TODO_ID = """
		SELECT * FROM ${PrefixConstant.ENTITY}TODO WHERE todoId=:todoId AND todoStatus<>'DELETED'
	"""

	const val READ_BY_TODO_TITLE = """
		SELECT * FROM ${PrefixConstant.ENTITY}TODO WHERE todoTitle=:todoTitle AND todoStatus<>'DELETED'
	"""

	const val READ_BY_TODO_DESCRIPTION = """
		SELECT * FROM ${PrefixConstant.ENTITY}TODO WHERE todoDescription=:todoDescription AND todoStatus<>'DELETED'
	"""

	const val READ_BY_TODO_STATUS = """
		SELECT * FROM ${PrefixConstant.ENTITY}TODO WHERE todoStatus=:todoStatus AND todoStatus<>'DELETED'
	"""

	const val READ_BY_TODO_DUE_DATE = """
		SELECT * FROM ${PrefixConstant.ENTITY}TODO WHERE todoDueDate=:todoDueDate AND todoStatus<>'DELETED'
	"""

	const val READ_BY_TODO_USER_ID = """
		SELECT * FROM ${PrefixConstant.ENTITY}TODO WHERE todoUserId=:todoUserId AND todoStatus<>'DELETED'
	"""

	const val READ_BY_TODO_CREATED_AT = """
		SELECT * FROM ${PrefixConstant.ENTITY}TODO WHERE todoCreatedAt=:todoCreatedAt AND todoStatus<>'DELETED'
	"""

	const val READ_BY_TODO_UPDATED_AT = """
		SELECT * FROM ${PrefixConstant.ENTITY}TODO WHERE todoUpdatedAt=:todoUpdatedAt AND todoStatus<>'DELETED'
	"""
}
