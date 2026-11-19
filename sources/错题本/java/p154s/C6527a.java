package p154s;

import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.InterfaceC6013w0;

/* renamed from: s.a */
/* loaded from: classes2.dex */
public final class C6527a implements InterfaceC6539m {

    /* renamed from: a */
    public final InterfaceC6013w0 f10814a;

    public final boolean equals(Object obj) {
        if (obj instanceof C6527a) {
            return AbstractC5830k.m5325b(this.f10814a, ((C6527a) obj).f10814a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10814a.hashCode();
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.f10814a + ')';
    }
}
