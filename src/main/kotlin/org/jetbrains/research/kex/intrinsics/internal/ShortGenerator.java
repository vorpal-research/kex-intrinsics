package org.jetbrains.research.kex.intrinsics.internal;

@FunctionalInterface
public interface ShortGenerator {
    short apply(int index);
}
