package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class PPTAnim {
    public static final int $stable = 0;
    private final int idx;
    private final int total;

    public PPTAnim(int i10, int i11) {
        this.idx = i10;
        this.total = i11;
    }

    public static /* synthetic */ PPTAnim copy$default(PPTAnim pPTAnim, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = pPTAnim.idx;
        }
        if ((i12 & 2) != 0) {
            i11 = pPTAnim.total;
        }
        return pPTAnim.copy(i10, i11);
    }

    public final int component1() {
        return this.idx;
    }

    public final int component2() {
        return this.total;
    }

    public final PPTAnim copy(int i10, int i11) {
        return new PPTAnim(i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PPTAnim)) {
            return false;
        }
        PPTAnim pPTAnim = (PPTAnim) obj;
        return this.idx == pPTAnim.idx && this.total == pPTAnim.total;
    }

    public final int getIdx() {
        return this.idx;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return (Integer.hashCode(this.idx) * 31) + Integer.hashCode(this.total);
    }

    public String toString() {
        return "PPTAnim(idx=" + this.idx + ", total=" + this.total + ")";
    }
}
