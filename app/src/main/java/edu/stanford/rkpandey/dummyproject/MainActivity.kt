package edu.stanford.rkpandey.dummyproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyboardShortcutGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.ContextCompat
import java.util.*

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    /**
     * (More) editing shortcuts:
     * 1. Optimize imports
     * 2. Delete whole line
     * 3. Duplicate line or selection
     * 4. Show hint for method parameters
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val employee = Employee(123, "John", "Smith", false)
        Log.i(TAG, "Created new employee")

        // Save the employee name in a local variable
        val fullName = employee.fullName()

        val sickDayManager = EmployeeSickDayManager()
        sickDayManager.rightMethod()
        // Define method which takes in employee name and id
        myMethod(fullName, employee.employeeId)

    }

    private fun myMethod(fullName: String, employeeId: Int) {

    }
}
