package edu.stanford.rkpandey.dummyproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    /**
     * Editing shortcuts:
     * 1. Project quick fix
     * 2. Move cursor one word at a time
     * 3. Reformat code
     * 4. Comment/uncomment code block
     * 5. Autocomplete
     * 6. Move code block up/down
     * 7. Rename a variable or method
     * 8. Select multiple occurrences
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val employee = Employee(123, "John", "Smith", false)
        Log.i(TAG, "Created new employee")

        // Save the employee name in a local variable
        employee.fullName()

        // Define method which takes in employee name and id

        val sickDayManager = EmployeeSickDayManager()
        sickDayManager.wrongMethod()
    }
}
