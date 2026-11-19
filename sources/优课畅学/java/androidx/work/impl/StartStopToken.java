package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class StartStopToken {

    /* renamed from: id */
    private final WorkGenerationalId f2010id;

    public StartStopToken(WorkGenerationalId id) {
        AbstractC9133u.m16133g(id, "id");
        this.f2010id = id;
    }

    public final WorkGenerationalId getId() {
        return this.f2010id;
    }
}
