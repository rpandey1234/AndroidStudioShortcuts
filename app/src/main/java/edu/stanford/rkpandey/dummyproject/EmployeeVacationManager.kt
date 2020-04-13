package edu.stanford.rkpandey.dummyproject

private const val TAG = "EmployeeVacationManager"
class EmployeeVacationManager : EmployeeManager() {

    var vacationDays: Int

    init {
        Log.i(TAG, "constructing EmployeeVacationManager")
    }

    fun addVacationDays(days: Int) {
        Log.i(TAG, "addVacationDays $days")
        vacationDays += days
    }

    fun subtractVacationDays(days: Int) {
        vacationDays -= days
    }
}