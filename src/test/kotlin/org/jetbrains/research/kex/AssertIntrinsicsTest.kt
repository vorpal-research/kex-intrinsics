package org.vorpal.research.kex

import org.vorpal.research.kex.intrinsics.AssertIntrinsics.kexAssert
import org.vorpal.research.kex.intrinsics.AssertIntrinsics.kexUnreachable
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
        kexUnreachable("testUnreachable", true)
    }
}