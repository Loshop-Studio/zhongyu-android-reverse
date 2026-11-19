package androidx.work.impl.model;

import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class SystemIdInfoKt {
    public static final SystemIdInfo systemIdInfo(WorkGenerationalId generationalId, int i10) {
        AbstractC9133u.m16133g(generationalId, "generationalId");
        return new SystemIdInfo(generationalId.getWorkSpecId(), generationalId.getGeneration(), i10);
    }
}
