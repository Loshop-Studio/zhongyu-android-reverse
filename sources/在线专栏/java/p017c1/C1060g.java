package p017c1;

import android.content.Context;
import p012b1.C1027b;
import p075d1.C2451g;
import p085f1.C2520r;
import p095h1.InterfaceC2654a;
import p169x0.EnumC3446o;

/* renamed from: c1.g */
/* loaded from: classes.dex */
public class C1060g extends AbstractC1056c<C1027b> {
    public C1060g(Context context, InterfaceC2654a interfaceC2654a) {
        super(C2451g.m8190c(context, interfaceC2654a).m8193d());
    }

    @Override // p017c1.AbstractC1056c
    /* renamed from: b */
    boolean mo4932b(C2520r c2520r) {
        return c2520r.f10174j.m10463b() == EnumC3446o.UNMETERED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p017c1.AbstractC1056c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo4933c(C1027b c1027b) {
        return !c1027b.m4786a() || c1027b.m4787b();
    }
}
