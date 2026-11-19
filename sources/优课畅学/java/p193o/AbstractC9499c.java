package p193o;

import java.util.Queue;
import p116h0.AbstractC8707k;

/* renamed from: o.c */
/* loaded from: classes3.dex */
public abstract class AbstractC9499c {

    /* renamed from: a */
    public final Queue f18848a = AbstractC8707k.m14188f(20);

    /* renamed from: a */
    public abstract InterfaceC9508l mo17616a();

    /* renamed from: b */
    public InterfaceC9508l m17617b() {
        InterfaceC9508l interfaceC9508l = (InterfaceC9508l) this.f18848a.poll();
        return interfaceC9508l == null ? mo17616a() : interfaceC9508l;
    }

    /* renamed from: c */
    public void m17618c(InterfaceC9508l interfaceC9508l) {
        if (this.f18848a.size() < 20) {
            this.f18848a.offer(interfaceC9508l);
        }
    }
}
