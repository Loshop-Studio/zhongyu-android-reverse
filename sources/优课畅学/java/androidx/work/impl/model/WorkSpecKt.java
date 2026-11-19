package androidx.work.impl.model;

import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class WorkSpecKt {
    private static final long NOT_ENQUEUED = -1;

    public static final WorkGenerationalId generationalId(WorkSpec workSpec) {
        AbstractC9133u.m16133g(workSpec, "<this>");
        return new WorkGenerationalId(workSpec.f2050id, workSpec.getGeneration());
    }
}
