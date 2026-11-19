package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class StartStopToken {

    /* renamed from: id */
    private final WorkGenerationalId f2124id;

    public StartStopToken(WorkGenerationalId id2) {
        AbstractC9979u.m20294g(id2, "id");
        this.f2124id = id2;
    }

    public final WorkGenerationalId getId() {
        return this.f2124id;
    }
}
