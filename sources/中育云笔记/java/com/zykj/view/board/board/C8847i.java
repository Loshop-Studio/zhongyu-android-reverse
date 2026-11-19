package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC8848j;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: com.zykj.view.board.board.i */
/* loaded from: classes6.dex */
public final class C8847i {

    /* renamed from: a */
    public final AbstractC8848j f20249a;

    public C8847i(AbstractC8848j eraserType) {
        AbstractC9979u.m20294g(eraserType, "eraserType");
        this.f20249a = eraserType;
    }

    /* renamed from: a */
    public final C8847i m16970a(AbstractC8848j eraserType) {
        AbstractC9979u.m20294g(eraserType, "eraserType");
        return new C8847i(eraserType);
    }

    /* renamed from: b */
    public final AbstractC8848j m16971b() {
        return this.f20249a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8847i) && AbstractC9979u.m20289b(this.f20249a, ((C8847i) obj).f20249a);
    }

    public int hashCode() {
        return this.f20249a.hashCode();
    }

    public String toString() {
        return "EraserToolState(eraserType=" + this.f20249a + ")";
    }

    public /* synthetic */ C8847i(AbstractC8848j abstractC8848j, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? AbstractC8848j.b.f20253c : abstractC8848j);
    }
}
