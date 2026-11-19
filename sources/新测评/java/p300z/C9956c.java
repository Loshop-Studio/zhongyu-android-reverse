package p300z;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z.c */
/* loaded from: classes3.dex */
public final class C9956c implements InterfaceC9960g {

    /* renamed from: a */
    public final C9958e f17796a;

    public C9956c(C9958e c9958e) {
        this.f17796a = c9958e;
    }

    @Override // p300z.InterfaceC9960g
    /* renamed from: a */
    public Object mo2933a(Continuation continuation) {
        return this.f17796a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9956c) && Intrinsics.areEqual(this.f17796a, ((C9956c) obj).f17796a);
    }

    public int hashCode() {
        return this.f17796a.hashCode();
    }

    public String toString() {
        return "RealSizeResolver(size=" + this.f17796a + ')';
    }
}
