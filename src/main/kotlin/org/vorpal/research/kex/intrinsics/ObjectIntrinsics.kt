package org.vorpal.research.kex.intrinsics

class IntrinsicInvocationException : Throwable() {}

object ObjectIntrinsics {
    /**
     * string to boolean
     */
    @JvmStatic
    fun string2Boolean(string: String): Boolean = string.toBoolean()

    /**
     * string to int
     */
    @JvmStatic
    fun string2Int(string: String, radix: Int): Int = string.toInt(radix)

    @JvmStatic
    fun string2UnsignedInt(string: String, radix: Int): Int = Integer.parseUnsignedInt(string, radix)

    @JvmStatic
    fun decodeString2Int(string: String): Int = Integer.decode(string).toInt()

    /**
     * string to long
     */
    @JvmStatic
    fun string2Long(string: String, radix: Int): Long = string.toLong(radix)

    @JvmStatic
    fun string2UnsignedLong(string: String, radix: Int): Long = java.lang.Long.parseUnsignedLong(string, radix)

    @JvmStatic
    fun decodeString2Long(string: String): Long = java.lang.Long.decode(string).toLong()

    /**
     * string to double
     */
    @JvmStatic
    fun string2Double(string: String): Double = string.toDouble()

    @JvmStatic
    fun string2Float(string: String): Float = string.toFloat()

    /**
     * double to string
     */
    @JvmStatic
    fun double2String(d: Double): String = d.toString()

    @JvmStatic
    fun float2String(f: Float): String = f.toString()

    /**
     * integer to string
     */
    @JvmStatic
    fun int2String(value: Int, radix: Int): String = value.toString(radix)

    /**
     * long to string
     */
    @JvmStatic
    fun long2String(value: Long, radix: Int): String = value.toString(radix)

    @JvmStatic
    fun long2UnsignedString(value: Long, radix: Int): String = value.toString(radix)

    /**
     * any to string
     */
    @JvmStatic
    fun any2String(value: Any): String = value.toString()

    /**
     * equals
     */
    @JvmStatic
    fun equals(first: Any, second: Any?): Boolean = first == second
}