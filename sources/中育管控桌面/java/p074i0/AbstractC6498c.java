package p074i0;

import java.util.Queue;
import p016b1.AbstractC4409k;

/* renamed from: i0.c */
/* loaded from: classes3.dex */
public abstract class AbstractC6498c {

    /* renamed from: a */
    public final Queue f8300a = AbstractC4409k.m1445f(20);

    /* renamed from: a */
    public abstract InterfaceC6507l mo7192a();

    /* renamed from: b */
    public InterfaceC6507l m7193b() {
        InterfaceC6507l interfaceC6507l = (InterfaceC6507l) this.f8300a.poll();
        return interfaceC6507l == null ? mo7192a() : interfaceC6507l;
    }

    /* renamed from: c */
    public void m7194c(InterfaceC6507l interfaceC6507l) {
        if (this.f8300a.size() < 20) {
            this.f8300a.offer(interfaceC6507l);
        }
    }
}
