package org.jetbrains.research.kex.intrinsics.internal;

@FunctionalInterface
public interface BooleanGenerator {
    boolean apply(int index);
}