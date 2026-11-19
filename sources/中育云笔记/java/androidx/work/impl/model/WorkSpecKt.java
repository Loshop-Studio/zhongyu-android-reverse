package androidx.work.impl.model;

import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class WorkSpecKt {
    private static final long NOT_ENQUEUED = -1;

    public static final WorkGenerationalId generationalId(WorkSpec workSpec) {
        AbstractC9979u.m20294g(workSpec, "<this>");
        return new WorkGenerationalId(workSpec.f2164id, workSpec.getGeneration());
    }
}
