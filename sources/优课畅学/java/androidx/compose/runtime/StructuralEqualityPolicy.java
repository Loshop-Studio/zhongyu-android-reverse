package androidx.compose.runtime;

import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
final class StructuralEqualityPolicy implements SnapshotMutationPolicy<Object> {
    public static final StructuralEqualityPolicy INSTANCE = new StructuralEqualityPolicy();

    private StructuralEqualityPolicy() {
    }

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public boolean equivalent(Object obj, Object obj2) {
        return AbstractC9133u.m16128b(obj, obj2);
    }

    public String toString() {
        return "StructuralEqualityPolicy";
    }
}
