package org.jetbrains.research.kex

import org.jetbrains.research.kex.AssertIntrinsics.kexAssert
import org.jetbrains.research.kex.AssertIntrinsics.kexUnreachable
import org.junit.Test

class AssertIntrinsicsTest {
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