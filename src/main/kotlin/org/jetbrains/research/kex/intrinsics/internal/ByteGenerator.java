package org.jetbrains.research.kex.intrinsics.internal;

@FunctionalInterface
public interface ByteGenerator {
    byte apply(int index);
}
