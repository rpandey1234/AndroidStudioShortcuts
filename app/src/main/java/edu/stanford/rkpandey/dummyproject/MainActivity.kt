package edu.stanford.rkpandey.dummyproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    /**
     * TODO: Navigation tips:
     * 1. Search everywhere - double shift
     * 2. Open tool windows
     * 3. Close tool windows
     * 4. Open file (use fuzzy smart search)
     * 5. Jump to declaration- Cmd + B
     * 6. Recent files- Cmd + E
     * 7. Find usages - Alt + F7
     * 8. Navigate between files: with tabs or by place of last edit
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvHelloWorld.text = "Updated text!"
        val employee = Employee(123, "John", "Smith", false)
        // Show toast of employee name
        employee.fullName()
        val sickDayManager = EmployeeSickDayManager()

        // Call method with many parameters and refactor method name

        // Difference between tab and enter for auto-complete
        sickDayManager.wrongMethod()

        // Create instance of vacation manager and save into a local variable
    }
}
