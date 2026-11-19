package p017c1;

import android.content.Context;
import android.os.Build;
import p012b1.C1027b;
import p075d1.C2451g;
import p085f1.C2520r;
import p095h1.InterfaceC2654a;
import p169x0.AbstractC3445n;
import p169x0.EnumC3446o;

/* renamed from: c1.e */
/* loaded from: classes.dex */
public class C1058e extends AbstractC1056c<C1027b> {

    /* renamed from: e */
    private static final String f6243e = AbstractC3445n.m10503f("NetworkMeteredCtrlr");

    public C1058e(Context context, InterfaceC2654a interfaceC2654a) {
        super(C2451g.m8190c(context, interfaceC2654a).m8193d());
    }

    @Override // p017c1.AbstractC1056c
    /* renamed from: b */
    boolean mo4932b(C2520r c2520r) {
        return c2520r.f10174j.m10463b() == EnumC3446o.METERED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p017c1.AbstractC1056c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo4933c(C1027b c1027b) {
        if (Build.VERSION.SDK_INT >= 26) {
            return (c1027b.m4786a() && c1027b.m4787b()) ? false : true;
        }
        AbstractC3445n.m10501c().mo10504a(f6243e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !c1027b.m4786a();
    }
}
