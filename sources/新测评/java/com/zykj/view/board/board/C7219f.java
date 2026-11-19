package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC7220g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.zykj.view.board.board.f */
/* loaded from: classes5.dex */
public final class C7219f {

    /* renamed from: a */
    public final AbstractC7220g f11025a;

    public C7219f(AbstractC7220g eraserType) {
        Intrinsics.checkNotNullParameter(eraserType, "eraserType");
        this.f11025a = eraserType;
    }

    /* renamed from: a */
    public final C7219f m10975a(AbstractC7220g eraserType) {
        Intrinsics.checkNotNullParameter(eraserType, "eraserType");
        return new C7219f(eraserType);
    }

    /* renamed from: b */
    public final AbstractC7220g m10976b() {
        return this.f11025a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7219f) && Intrinsics.areEqual(this.f11025a, ((C7219f) obj).f11025a);
    }

    public int hashCode() {
        return this.f11025a.hashCode();
    }

    public String toString() {
        return "EraserToolState(eraserType=" + this.f11025a + ")";
    }

    public /* synthetic */ C7219f(AbstractC7220g abstractC7220g, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? AbstractC7220g.b.f11029c : abstractC7220g);
    }
}
