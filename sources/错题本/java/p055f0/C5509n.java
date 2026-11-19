package p055f0;

import java.util.ArrayDeque;
import p180v0.AbstractC6664k;

/* renamed from: f0.n */
/* loaded from: classes2.dex */
public final class C5509n {

    /* renamed from: b */
    public static final ArrayDeque f8527b;

    /* renamed from: a */
    public Object f8528a;

    static {
        char[] cArr = AbstractC6664k.f11243a;
        f8527b = new ArrayDeque(0);
    }

    /* renamed from: a */
    public static C5509n m4887a(Object obj) {
        C5509n c5509n;
        ArrayDeque arrayDeque = f8527b;
        synchronized (arrayDeque) {
            c5509n = (C5509n) arrayDeque.poll();
        }
        if (c5509n == null) {
            c5509n = new C5509n();
        }
        c5509n.f8528a = obj;
        return c5509n;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5509n)) {
            return false;
        }
        C5509n c5509n = (C5509n) obj;
        c5509n.getClass();
        return this.f8528a.equals(c5509n.f8528a);
    }

    public final int hashCode() {
        return this.f8528a.hashCode();
    }
}
