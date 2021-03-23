@file:Suppress("NOTHING_TO_INLINE", "UNUSED_PARAMETER")

package org.jetbrains.research.kex

object Intrinsics {
    /**
     * Checks if the call cite is reachable with all the conditions being true
     * */
    @JvmStatic
    fun kexAssert(vararg conditions: Boolean) {}

    /**
     * Checks if the call cite is reachable with all the conditions being true
     * @id -- string identifier to track the results of checking
     * */
    @JvmStatic
    inline fun kexAssert(id: String, vararg conditions: Boolean) {}

    /**
     * Checks if the call cite is unreachable with all the conditions being true
     */
    @JvmStatic
    inline fun kexUnreachable(vararg conditions: Boolean) {}

    /**
     * Checks if the call cite is unreachable with all the conditions being true
     * @id -- string identifier to track the results of checking
     */
    @JvmStatic
    inline fun kexUnreachable(id: String, vararg conditions: Boolean) {}
}