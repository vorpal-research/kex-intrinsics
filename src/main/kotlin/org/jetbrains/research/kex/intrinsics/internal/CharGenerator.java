package org.jetbrains.research.kex.intrinsics.internal;

@FunctionalInterface
public interface CharGenerator {
    char apply(int index);
}
