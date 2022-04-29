package org.vorpal.research.kex.intrinsics

import org.vorpal.research.kex.intrinsics.internal.*

object CollectionIntrinsics {
    /**
     * for all, body takes current index
     * @start -- starting index, inclusive
     * @end -- ending index, exclusive
     */
    @JvmStatic
    fun forAll(start: Int, end: Int, body: IntConsumer): Boolean {
        var result = true
        for (i in start until end) {
            result = body.apply(i)
        }
        return result
    }

    /**
     * generate array, body takes an index generates an element for given index
     * @length -- length of resulting array
     */
    @JvmStatic
    fun generateBoolArray(length: Int, body: BooleanGenerator): BooleanArray {
        val result = BooleanArray(length) { false }
        for (i in 0 until length) {
            result[i] = body.apply(i)
        }
        return result
    }

    @JvmStatic
    fun generateByteArray(length: Int, body: ByteGenerator): ByteArray {
        val result = ByteArray(length) { 0 }
        for (i in 0 until length) {
            result[i] = body.apply(i)
        }
        return result
    }

    @JvmStatic
    fun generateCharArray(length: Int, body: CharGenerator): CharArray {
        val result = CharArray(length) { 0.toChar() }
        for (i in 0 until length) {
            result[i] = body.apply(i)
        }
        return result
    }

    @JvmStatic
    fun generateShortArray(length: Int, body: ShortGenerator): ShortArray {
        val result = ShortArray(length) { 0 }
        for (i in 0 until length) {
            result[i] = body.apply(i)
        }
        return result
    }

    @JvmStatic
    fun generateIntArray(length: Int, body: IntGenerator): IntArray {
        val result = IntArray(length) { 0 }
        for (i in 0 until length) {
            result[i] = body.apply(i)
        }
        return result
    }

    @JvmStatic
    fun generateLongArray(length: Int, body: LongGenerator): LongArray {
        val result = LongArray(length) { 0 }
        for (i in 0 until length) {
            result[i] = body.apply(i)
        }
        return result
    }

    @JvmStatic
    fun generateFloatArray(length: Int, body: FloatGenerator): FloatArray {
        val result = FloatArray(length) { 0.0f }
        for (i in 0 until length) {
            result[i] = body.apply(i)
        }
        return result
    }

    @JvmStatic
    fun generateDoubleArray(length: Int, body: DoubleGenerator): DoubleArray {
        val result = DoubleArray(length) { 0.0 }
        for (i in 0 until length) {
            result[i] = body.apply(i)
        }
        return result
    }

    @Suppress("UNCHECKED_CAST")
    @JvmStatic
    fun <T : Any?> generateObjectArray(length: Int, body: ObjectGenerator<T>): Array<T> {
        val result = Array<Any?>(length) { null }
        for (i in 0 until length) {
            result[i] = body.apply(i)
        }
        return result as Array<T>
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
        return src.any { it == element }
    }

    @JvmStatic
    fun containsDouble(src: DoubleArray, element: Double): Boolean {
        return src.any { it == element }
    }

    @JvmStatic
    fun containsRef(src: Array<Any>, element: Any?): Boolean {
        for (elem in src) {
            if (elem === element) return true
        }
        return false
    }

    @JvmStatic
    fun contains(src: Array<Any>, element: Any?): Boolean {
        return element in src
    }
}