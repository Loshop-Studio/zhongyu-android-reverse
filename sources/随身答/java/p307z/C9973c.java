package p307z;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z.c */
/* loaded from: classes3.dex */
public final class C9973c implements InterfaceC9977g {

    /* renamed from: a */
    public final C9975e f17940a;

    public C9973c(C9975e c9975e) {
        this.f17940a = c9975e;
    }

    @Override // p307z.InterfaceC9977g
    /* renamed from: a */
    public Object mo2661a(Continuation continuation) {
        return this.f17940a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9973c) && Intrinsics.areEqual(this.f17940a, ((C9973c) obj).f17940a);
    }

    public int hashCode() {
        return this.f17940a.hashCode();
    }

    public String toString() {
        return "RealSizeResolver(size=" + this.f17940a + ')';
    }
}
