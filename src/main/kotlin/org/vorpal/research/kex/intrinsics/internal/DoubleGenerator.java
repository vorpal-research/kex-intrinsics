package org.vorpal.research.kex.intrinsics.internal;

@FunctionalInterface
public interface DoubleGenerator {
    double apply(int index);
}
