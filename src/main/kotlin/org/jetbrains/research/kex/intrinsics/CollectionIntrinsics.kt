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
    fun contains(src: Array<Any>, element: Any): Boolean {
        return element in src
    }
}