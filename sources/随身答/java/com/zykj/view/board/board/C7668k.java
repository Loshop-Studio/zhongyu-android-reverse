package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC7669l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.view.board.board.k */
/* loaded from: classes5.dex */
public final class C7668k {

    /* renamed from: a */
    public final AbstractC7669l f12244a;

    public C7668k(AbstractC7669l eraserType) {
        Intrinsics.checkNotNullParameter(eraserType, "eraserType");
        this.f12244a = eraserType;
    }

    /* renamed from: a */
    public final C7668k m11405a(AbstractC7669l eraserType) {
        Intrinsics.checkNotNullParameter(eraserType, "eraserType");
        return new C7668k(eraserType);
    }

    /* renamed from: b */
    public final AbstractC7669l m11406b() {
        return this.f12244a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7668k) && Intrinsics.areEqual(this.f12244a, ((C7668k) obj).f12244a);
    }

    public int hashCode() {
        return this.f12244a.hashCode();
    }

    public String toString() {
        return "EraserToolState(eraserType=" + this.f12244a + ")";
    }

    public /* synthetic */ C7668k(AbstractC7669l abstractC7669l, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? AbstractC7669l.b.f12248c : abstractC7669l);
    }
}
