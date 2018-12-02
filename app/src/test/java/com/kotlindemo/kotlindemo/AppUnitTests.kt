package com.kotlindemo.kotlindemo

import org.junit.Test
import java.text.SimpleDateFormat
import java.util.*

class AppUnitTests {

    @Test
    fun checkDateFormat() {
        val activity: MainActivity = MainActivity();

        val expectedResult = SimpleDateFormat("hh:mm aa",
                Locale.getDefault()).format(Date())
        assert(expectedResult.equals(activity.timeNow()))
    }
}