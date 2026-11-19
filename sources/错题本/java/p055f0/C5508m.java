package p055f0;

import java.util.ArrayDeque;
import p180v0.C6660g;

/* renamed from: f0.m */
/* loaded from: classes2.dex */
public final class C5508m extends C6660g {
    @Override // p180v0.C6660g
    /* renamed from: c */
    public final void mo4798c(Object obj, Object obj2) {
        C5509n c5509n = (C5509n) obj;
        c5509n.getClass();
        ArrayDeque arrayDeque = C5509n.f8527b;
        synchronized (arrayDeque) {
            arrayDeque.offer(c5509n);
        }
    }
}
