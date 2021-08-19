@file:Suppress("NOTHING_TO_INLINE", "UNUSED_PARAMETER")

package org.jetbrains.research.kex.intrinsics

object AssertIntrinsics {
    /**
     * Assumes that all the conditions are true without checking them
     * */
    @JvmStatic
    fun kexAssume(vararg conditions: Boolean) {}

    /**
     * Assumes that the given object @param is not null
     * */
    @JvmStatic
    fun <T> kexNotNull(value: T?): T {
        return value ?: throw NullPointerException()
    }

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