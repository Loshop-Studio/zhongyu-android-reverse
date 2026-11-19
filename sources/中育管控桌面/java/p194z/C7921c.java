package p194z;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z.c */
/* loaded from: classes3.dex */
public final class C7921c implements InterfaceC7925g {

    /* renamed from: a */
    public final C7923e f10639a;

    public C7921c(C7923e c7923e) {
        this.f10639a = c7923e;
    }

    @Override // p194z.InterfaceC7925g
    /* renamed from: a */
    public Object mo1764a(Continuation continuation) {
        return this.f10639a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7921c) && Intrinsics.areEqual(this.f10639a, ((C7921c) obj).f10639a);
    }

    public int hashCode() {
        return this.f10639a.hashCode();
    }

    public String toString() {
        return "RealSizeResolver(size=" + this.f10639a + ')';
    }
}
