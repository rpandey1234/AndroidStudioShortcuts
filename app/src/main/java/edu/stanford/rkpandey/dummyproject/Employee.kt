package edu.stanford.rkpandey.dummyproject

data class Employee(val employeeId: Int, val firstName: String, val lastName: String, val isManager: Boolean) {

    fun fullName(): String {
        return "$firstName $lastName"
    }
}
