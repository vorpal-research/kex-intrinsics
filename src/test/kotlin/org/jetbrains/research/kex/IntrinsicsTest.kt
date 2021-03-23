package org.jetbrains.research.kex

import org.jetbrains.research.kex.Intrinsics.kexAssert
import org.jetbrains.research.kex.Intrinsics.kexUnreachable
import org.junit.Test

class IntrinsicsTest {
    @Test
    fun testKexAssert() {
        kexAssert(true)
        kexAssert("testAssert", true)
    }

    @Test
    fun testKexUnreachable() {
        kexUnreachable()
        kexUnreachable("testUnreachable")
    }
}