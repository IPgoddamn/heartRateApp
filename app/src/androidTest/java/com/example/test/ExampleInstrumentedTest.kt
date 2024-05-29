package com.example.test

import android.util.Log
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    private val TAG = "MyActivity"
    @Test
    fun useAppContext() {
        // Context of the app under test.
        Log.v(TAG, "hi")
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.test", appContext.packageName)
    }
}