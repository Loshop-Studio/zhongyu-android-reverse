package p098n;

import java.util.Queue;
import p062g0.AbstractC3750j;

/* renamed from: n.c */
/* loaded from: classes2.dex */
public abstract class AbstractC4394c {

    /* renamed from: a */
    public final Queue f4897a = AbstractC3750j.m4774e(20);

    /* renamed from: a */
    public abstract InterfaceC4403l mo5387a();

    /* renamed from: b */
    public InterfaceC4403l m5388b() {
        InterfaceC4403l interfaceC4403l = (InterfaceC4403l) this.f4897a.poll();
        return interfaceC4403l == null ? mo5387a() : interfaceC4403l;
    }

    /* renamed from: c */
    public void m5389c(InterfaceC4403l interfaceC4403l) {
        if (this.f4897a.size() < 20) {
            this.f4897a.offer(interfaceC4403l);
        }
    }
}
