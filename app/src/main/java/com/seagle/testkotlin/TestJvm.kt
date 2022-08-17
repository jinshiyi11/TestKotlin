package com.seagle.testkotlin

/**
 *
 */
class TestJvm {

    var data: Int = 0

    var isEnable: Boolean = false

    lateinit var ID:String

    companion object {
        @JvmStatic
        val INSTANCE: TestJvm = TestJvm();
    }
}