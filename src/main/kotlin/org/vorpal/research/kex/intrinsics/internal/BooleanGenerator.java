package org.vorpal.research.kex.intrinsics.internal;

@FunctionalInterface
public interface BooleanGenerator {
    boolean apply(int index);
}