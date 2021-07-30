package org.jetbrains.research.kex.intrinsics

import org.jetbrains.research.kex.intrinsics.internal.IntConsumer

object CollectionIntrinsics {
    /**
     * for each, body takes current index
     * @start -- starting index, inclusive
     * @end -- ending index, exclusive
     */
    @JvmStatic
    fun forEach(start: Int, end: Int, body: IntConsumer) {
        for (i in start until end) {
            body.apply(i)
        }
    }

    /**
     * for each, body takes current index
     * @start -- starting index, inclusive
     * @end -- ending index, exclusive
     */
    @JvmStatic
    fun arrayCopy(src: Any, scrStart: Int, dest: Any, destStart: Int, length: Int) {
        System.arraycopy(src, scrStart, dest, destStart, length)
    }

    /**
     * contains
     */
    @JvmStatic
    fun containsBool(src: BooleanArray, element: Boolean): Boolean {
        return element in src
    }

    @JvmStatic
    fun containsByte(src: ByteArray, element: Byte): Boolean {
        return element in src
    }

    @JvmStatic
    fun containsChar(src: CharArray, element: Char): Boolean {
        return element in src
    }

    @JvmStatic
    fun containsShort(src: ShortArray, element: Short): Boolean {
        return element in src
    }

    @JvmStatic
    fun containsInt(src: IntArray, element: Int): Boolean {
        return element in src
    }

    @JvmStatic
    fun containsLong(src: LongArray, element: Long): Boolean {
        return element in src
    }

    @JvmStatic
    fun containsFloat(src: FloatArray, element: Float): Boolean {
        return element in src
    }

    @JvmStatic
    fun containsDouble(src: DoubleArray, element: Double): Boolean {
        return element in src
    }

    @JvmStatic
    fun containsRef(src: Array<Any>, element: Any): Boolean {
        for (elem in src) {
            if (elem === element) return true
        }
        return false
    }

    @JvmStatic
    fun contains(src: Array<Any>, element: Any): Boolean {
        return element in src
    }
}