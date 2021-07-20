package org.jetbrains.research.kex

import org.jetbrains.research.kex.internal.IntConsumer
import org.jetbrains.research.kex.internal.Int2BooleanFunction
import org.jetbrains.research.kex.internal.IntBoolean2BooleanFunction

object CollectionIntrinsics {
    /**
     * for each, body takes current index
     * @start -- starting index, inclusive
     * @end -- ending index, exclusive
     */
    @JvmStatic
    fun forEach(start: Int, end: Int, body: IntConsumer) {}

    /**
     * for each, body takes current index
     * @start -- starting index, inclusive
     * @end -- ending index, exclusive
     */
    @JvmStatic
    fun arrayCopy(src: Any, scrStart: Int, dest: Any, descStart: Int, length: Int) {}

    /**
     * contains
     */
    @JvmStatic
    fun contains(src: Array<Any>, element: Any): Boolean {
        throw IntrinsicInvocationException()
    }

    @JvmStatic
    fun contains(src: Collection<Any>, element: Any): Boolean {
        throw IntrinsicInvocationException()
    }
}