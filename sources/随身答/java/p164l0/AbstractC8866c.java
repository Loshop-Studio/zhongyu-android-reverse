package p164l0;

import java.util.Queue;
import p091e1.AbstractC7838j;

/* renamed from: l0.c */
/* loaded from: classes3.dex */
public abstract class AbstractC8866c {

    /* renamed from: a */
    public final Queue f14636a = AbstractC7838j.m12262e(20);

    /* renamed from: a */
    public abstract InterfaceC8875l mo13727a();

    /* renamed from: b */
    public InterfaceC8875l m13728b() {
        InterfaceC8875l interfaceC8875l = (InterfaceC8875l) this.f14636a.poll();
        return interfaceC8875l == null ? mo13727a() : interfaceC8875l;
    }

    /* renamed from: c */
    public void m13729c(InterfaceC8875l interfaceC8875l) {
        if (this.f14636a.size() < 20) {
            this.f14636a.offer(interfaceC8875l);
        }
    }
}
