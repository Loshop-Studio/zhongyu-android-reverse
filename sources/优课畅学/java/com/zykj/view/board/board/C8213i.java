package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC8214j;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: com.zykj.view.board.board.i */
/* loaded from: classes5.dex */
public final class C8213i {

    /* renamed from: a */
    public final AbstractC8214j f15033a;

    public C8213i(AbstractC8214j eraserType) {
        AbstractC9133u.m16133g(eraserType, "eraserType");
        this.f15033a = eraserType;
    }

    /* renamed from: a */
    public final C8213i m12854a(AbstractC8214j eraserType) {
        AbstractC9133u.m16133g(eraserType, "eraserType");
        return new C8213i(eraserType);
    }

    /* renamed from: b */
    public final AbstractC8214j m12855b() {
        return this.f15033a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8213i) && AbstractC9133u.m16128b(this.f15033a, ((C8213i) obj).f15033a);
    }

    public int hashCode() {
        return this.f15033a.hashCode();
    }

    public String toString() {
        return "EraserToolState(eraserType=" + this.f15033a + ")";
    }

    public /* synthetic */ C8213i(AbstractC8214j abstractC8214j, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? AbstractC8214j.b.f15037c : abstractC8214j);
    }
}
