package org.vorpal.research.kex.intrinsics.internal;

@FunctionalInterface
public interface IntBoolean2BooleanFunction {
    boolean apply(int index, boolean cond);
}
