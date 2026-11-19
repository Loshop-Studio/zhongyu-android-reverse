package com.zykj.study.bean;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class Paging {
    public static final int $stable = 0;
    private final int startId;
    private final int take;

    public Paging(int i10, int i11) {
        this.startId = i10;
        this.take = i11;
    }

    public static /* synthetic */ Paging copy$default(Paging paging, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = paging.startId;
        }
        if ((i12 & 2) != 0) {
            i11 = paging.take;
        }
        return paging.copy(i10, i11);
    }

    public final int component1() {
        return this.startId;
    }

    public final int component2() {
        return this.take;
    }

    public final Paging copy(int i10, int i11) {
        return new Paging(i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Paging)) {
            return false;
        }
        Paging paging = (Paging) obj;
        return this.startId == paging.startId && this.take == paging.take;
    }

    public final int getStartId() {
        return this.startId;
    }

    public final int getTake() {
        return this.take;
    }

    public int hashCode() {
        return (Integer.hashCode(this.startId) * 31) + Integer.hashCode(this.take);
    }

    public String toString() {
        return "Paging(startId=" + this.startId + ", take=" + this.take + ")";
    }
}
