package org.jetbrains.research.kex

class IntrinsicInvocationException : Throwable() {}

object ObjectIntrinsics {
    /**
     * string to boolean
     */
    @JvmStatic
    fun string2Boolean(string: String): Boolean {
        throw IntrinsicInvocationException()
    }

    /**
     * string to int
     */
    @JvmStatic
    fun string2Int(string: String, radix: Int): Int {
        throw IntrinsicInvocationException()
    }

    @JvmStatic
    fun string2UnsignedInt(string: String, radix: Int): Int {
        throw IntrinsicInvocationException()
    }

    @JvmStatic
    fun decodeString2Int(string: String): Int {
        throw IntrinsicInvocationException()
    }

    /**
     * string to long
     */
    @JvmStatic
    fun string2Long(string: String, radix: Int): Long {
        throw IntrinsicInvocationException()
    }

    @JvmStatic
    fun string2UnsignedLong(string: String, radix: Int): Long {
        throw IntrinsicInvocationException()
    }

    @JvmStatic
    fun decodeString2Long(string: String): Long {
        throw IntrinsicInvocationException()
    }

    /**
     * string to double
     */
    @JvmStatic
    fun string2Double(string: String): Double {
        throw IntrinsicInvocationException()
    }

    @JvmStatic
    fun string2Float(string: String): Float {
        throw IntrinsicInvocationException()
    }

    /**
     * double to string
     */
    @JvmStatic
    fun double2String(d: Double): String {
        throw IntrinsicInvocationException()
    }

    @JvmStatic
    fun float2String(f: Float): String {
        throw IntrinsicInvocationException()
    }

    /**
     * integer to string
     */
    @JvmStatic
    fun int2String(value: Int, radix: Int): String {
        throw IntrinsicInvocationException()
    }

    /**
     * long to string
     */
    @JvmStatic
    fun long2String(value: Long, radix: Int): String {
        throw IntrinsicInvocationException()
    }

    @JvmStatic
    fun long2UnsignedString(value: Long, radix: Int): String {
        throw IntrinsicInvocationException()
    }

    /**
     * any to string
     */
    @JvmStatic
    fun any2String(value: Any): String {
        throw IntrinsicInvocationException()
    }

    /**
     * equals
     */
    @JvmStatic
    fun equals(first: Any, second: Any?): Boolean {
        throw IntrinsicInvocationException()
    }
}