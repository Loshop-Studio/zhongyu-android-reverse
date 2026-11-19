package p195p0;

import java.util.Queue;
import p117i1.AbstractC7652k;

/* renamed from: p0.c */
/* loaded from: classes3.dex */
public abstract class AbstractC8803c {

    /* renamed from: a */
    public final Queue f14946a = AbstractC7652k.m12690f(20);

    /* renamed from: a */
    public abstract InterfaceC8812l mo14707a();

    /* renamed from: b */
    public InterfaceC8812l m14708b() {
        InterfaceC8812l interfaceC8812l = (InterfaceC8812l) this.f14946a.poll();
        return interfaceC8812l == null ? mo14707a() : interfaceC8812l;
    }

    /* renamed from: c */
    public void m14709c(InterfaceC8812l interfaceC8812l) {
        if (this.f14946a.size() < 20) {
            this.f14946a.offer(interfaceC8812l);
        }
    }
}
