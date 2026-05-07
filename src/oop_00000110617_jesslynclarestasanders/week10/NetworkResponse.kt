package oop_00000110617_jesslynclarestasanders.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)