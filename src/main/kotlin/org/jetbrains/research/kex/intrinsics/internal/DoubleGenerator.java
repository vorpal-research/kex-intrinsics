package org.jetbrains.research.kex.intrinsics.internal;

@FunctionalInterface
public interface DoubleGenerator {
    double apply(int index);
}
