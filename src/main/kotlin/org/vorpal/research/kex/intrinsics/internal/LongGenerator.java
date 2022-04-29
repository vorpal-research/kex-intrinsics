package org.vorpal.research.kex.intrinsics.internal;

@FunctionalInterface
public interface LongGenerator {
    long apply(int index);
}
