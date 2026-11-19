package p213k0;

import java.util.Queue;
import p109d1.AbstractC8910k;

/* renamed from: k0.c */
/* loaded from: classes3.dex */
public abstract class AbstractC9771c {

    /* renamed from: a */
    public final Queue f22931a = AbstractC8910k.m17475f(20);

    /* renamed from: a */
    public abstract InterfaceC9780l mo19705a();

    /* renamed from: b */
    public InterfaceC9780l m19706b() {
        InterfaceC9780l interfaceC9780l = (InterfaceC9780l) this.f22931a.poll();
        return interfaceC9780l == null ? mo19705a() : interfaceC9780l;
    }

    /* renamed from: c */
    public void m19707c(InterfaceC9780l interfaceC9780l) {
        if (this.f22931a.size() < 20) {
            this.f22931a.offer(interfaceC9780l);
        }
    }
}
