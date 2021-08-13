package org.jetbrains.research.kex.intrinsics.internal;

@FunctionalInterface
public interface ObjectGenerator<T> {
    T apply(int index);
}
