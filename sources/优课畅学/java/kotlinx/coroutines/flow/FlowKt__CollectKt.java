package kotlinx.coroutines.flow;

import kotlinx.coroutines.InterfaceC9212n;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.AbstractC9269f;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p180m8.C9338k;
import p190n7.AbstractC9434a;
import p300x7.InterfaceC10574p;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class FlowKt__CollectKt {
    /* renamed from: a */
    public static final Object m16580a(InterfaceC9266c interfaceC9266c, InterfaceC9324c interfaceC9324c) {
        Object objCollect = interfaceC9266c.collect(C9338k.f18394a, interfaceC9324c);
        return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
    }

    /* renamed from: b */
    public static final Object m16581b(InterfaceC9266c interfaceC9266c, InterfaceC10574p interfaceC10574p, InterfaceC9324c interfaceC9324c) {
        Object objM17018h = AbstractC9268e.m17018h(AbstractC9269f.m17038b(AbstractC9268e.m16996H(interfaceC9266c, interfaceC10574p), 0, null, 2, null), interfaceC9324c);
        return objM17018h == AbstractC9434a.m17291f() ? objM17018h : C8736p.f16368a;
    }

    /* renamed from: c */
    public static final Object m16582c(InterfaceC9267d interfaceC9267d, InterfaceC9266c interfaceC9266c, InterfaceC9324c interfaceC9324c) {
        AbstractC9268e.m17032v(interfaceC9267d);
        Object objCollect = interfaceC9266c.collect(interfaceC9267d, interfaceC9324c);
        return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
    }

    /* renamed from: d */
    public static final InterfaceC9212n m16583d(InterfaceC9266c interfaceC9266c, InterfaceC8822b0 interfaceC8822b0) {
        return AbstractC8839h.m14861d(interfaceC8822b0, null, null, new FlowKt__CollectKt$launchIn$1(interfaceC9266c, null), 3, null);
    }
}
