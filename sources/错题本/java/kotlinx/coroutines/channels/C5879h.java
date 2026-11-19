package kotlinx.coroutines.channels;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: kotlinx.coroutines.channels.h */
/* loaded from: classes4.dex */
public final class C5879h {

    /* renamed from: b */
    public static final C5878g f9328b = new C5878g();

    /* renamed from: a */
    public final Object f9329a;

    /* renamed from: a */
    public static final Object m5504a(Object obj) {
        if (obj instanceof C5878g) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5879h) {
            return AbstractC5830k.m5325b(this.f9329a, ((C5879h) obj).f9329a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f9329a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f9329a;
        if (obj instanceof C5877f) {
            return ((C5877f) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
