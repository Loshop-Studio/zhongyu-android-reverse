package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC7671n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.view.board.board.m */
/* loaded from: classes5.dex */
public final class C7670m {

    /* renamed from: a */
    public final AbstractC7671n f12250a;

    public C7670m(AbstractC7671n expandStatus) {
        Intrinsics.checkNotNullParameter(expandStatus, "expandStatus");
        this.f12250a = expandStatus;
    }

    /* renamed from: a */
    public final C7670m m11409a(AbstractC7671n expandStatus) {
        Intrinsics.checkNotNullParameter(expandStatus, "expandStatus");
        return new C7670m(expandStatus);
    }

    /* renamed from: b */
    public final AbstractC7671n m11410b() {
        return this.f12250a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7670m) && Intrinsics.areEqual(this.f12250a, ((C7670m) obj).f12250a);
    }

    public int hashCode() {
        return this.f12250a.hashCode();
    }

    public String toString() {
        return "ExpandState(expandStatus=" + this.f12250a + ")";
    }

    public /* synthetic */ C7670m(AbstractC7671n abstractC7671n, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? AbstractC7671n.b.f12253b : abstractC7671n);
    }
}
