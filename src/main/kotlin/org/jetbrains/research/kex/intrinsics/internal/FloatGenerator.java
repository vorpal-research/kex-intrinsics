package org.jetbrains.research.kex.intrinsics.internal;

@FunctionalInterface
public interface FloatGenerator {
    float apply(int index);
}
