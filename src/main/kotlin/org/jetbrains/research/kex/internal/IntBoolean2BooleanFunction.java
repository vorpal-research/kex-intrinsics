package org.jetbrains.research.kex.internal;

@FunctionalInterface
public interface IntBoolean2BooleanFunction {
    boolean apply(int index, boolean cond);
}
