@file:Suppress("NOTHING_TO_INLINE", "UNUSED_PARAMETER")

package org.vorpal.research.kex.intrinsics

object AssertIntrinsics {
    /**
     * Assumes that the condition is true without checking them
     * */
    @JvmStatic
    fun kexAssume(condition: Boolean) {}

    /**
     * Assumes that the given object @param is not null
     * */
    @JvmStatic
    fun <T> kexNotNull(value: T?): T {
        return value ?: throw NullPointerException()
    }

    /**
     * Checks if the call cite is reachable with the condition being true
     * */
    @JvmStatic
    fun kexAssert(condition: Boolean) {}

    /**
     * Checks if the call cite is reachable with the condition being true
     * @id -- string identifier to track the results of checking
     * */
    @JvmStatic
    inline fun kexAssert(id: String, condition: Boolean) {}


    /**
     * Checks if the call cite is unreachable
     */
    @JvmStatic
    inline fun kexUnreachable() {}

    /**
     * Checks if the call cite is unreachable with the condition being true
     */
    @JvmStatic
    inline fun kexUnreachable(condition: Boolean) {}

    /**
     * Checks if the call cite is unreachable with the condition being true
     * @id -- string identifier to track the results of checking
     */
    @JvmStatic
    inline fun kexUnreachable(id: String, condition: Boolean) {}
}