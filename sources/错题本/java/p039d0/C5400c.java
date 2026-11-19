package p039d0;

import java.util.ArrayDeque;
import p180v0.AbstractC6664k;
import p195x.C6739c;

/* renamed from: d0.c */
/* loaded from: classes2.dex */
public final class C5400c {

    /* renamed from: a */
    public final ArrayDeque f8347a;

    public C5400c(int i) {
        switch (i) {
            case 1:
                char[] cArr = AbstractC6664k.f11243a;
                this.f8347a = new ArrayDeque(0);
                break;
            default:
                this.f8347a = new ArrayDeque();
                break;
        }
    }

    /* renamed from: a */
    public synchronized void m4795a(C6739c c6739c) {
        c6739c.f11378b = null;
        c6739c.f11379c = null;
        this.f8347a.offer(c6739c);
    }
}
