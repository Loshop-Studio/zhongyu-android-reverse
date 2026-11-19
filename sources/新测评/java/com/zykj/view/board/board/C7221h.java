package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC7222i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.view.board.board.h */
/* loaded from: classes5.dex */
public final class C7221h {

    /* renamed from: a */
    public final AbstractC7222i f11031a;

    public C7221h(AbstractC7222i expandStatus) {
        Intrinsics.checkNotNullParameter(expandStatus, "expandStatus");
        this.f11031a = expandStatus;
    }

    /* renamed from: a */
    public final C7221h m10979a(AbstractC7222i expandStatus) {
        Intrinsics.checkNotNullParameter(expandStatus, "expandStatus");
        return new C7221h(expandStatus);
    }

    /* renamed from: b */
    public final AbstractC7222i m10980b() {
        return this.f11031a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7221h) && Intrinsics.areEqual(this.f11031a, ((C7221h) obj).f11031a);
    }

    public int hashCode() {
        return this.f11031a.hashCode();
    }

    public String toString() {
        return "ExpandState(expandStatus=" + this.f11031a + ")";
    }

    public /* synthetic */ C7221h(AbstractC7222i abstractC7222i, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? AbstractC7222i.b.f11034b : abstractC7222i);
    }
}
