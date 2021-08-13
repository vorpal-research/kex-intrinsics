package org.jetbrains.research.kex.intrinsics.internal;

@FunctionalInterface
public interface IntGenerator {
    int apply(int index);
}
