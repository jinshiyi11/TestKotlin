package com.seagle.testkotlin

/**
 *
 */
class TestJvm {

    var data :Int=0

    companion object{
        @JvmStatic
        val INSTANCE:TestJvm = TestJvm();
    }
}