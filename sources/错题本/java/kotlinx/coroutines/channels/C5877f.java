package kotlinx.coroutines.channels;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: kotlinx.coroutines.channels.f */
/* loaded from: classes4.dex */
public final class C5877f extends C5878g {

    /* renamed from: a */
    public final Throwable f9327a;

    public C5877f(Throwable th) {
        this.f9327a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5877f) {
            return AbstractC5830k.m5325b(this.f9327a, ((C5877f) obj).f9327a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f9327a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // kotlinx.coroutines.channels.C5878g
    public final String toString() {
        return "Closed(" + this.f9327a + ')';
    }
}
