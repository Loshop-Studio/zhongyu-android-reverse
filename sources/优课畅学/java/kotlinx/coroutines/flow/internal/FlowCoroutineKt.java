package kotlinx.coroutines.flow.internal;

import p123h7.C8736p;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p180m8.C9334g;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9541f;
import p202o8.AbstractC9545b;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes5.dex */
public abstract class FlowCoroutineKt {

    /* renamed from: kotlinx.coroutines.flow.internal.FlowCoroutineKt$a */
    public static final class C9202a implements InterfaceC9266c {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10575q f18046a;

        public C9202a(InterfaceC10575q interfaceC10575q) {
            this.f18046a = interfaceC10575q;
        }

        @Override // p169l8.InterfaceC9266c
        public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
            Object objM16707a = FlowCoroutineKt.m16707a(new FlowCoroutineKt$scopedFlow$1$1(this.f18046a, interfaceC9267d, null), interfaceC9324c);
            return objM16707a == AbstractC9434a.m17291f() ? objM16707a : C8736p.f16368a;
        }
    }

    /* renamed from: a */
    public static final Object m16707a(InterfaceC10574p interfaceC10574p, InterfaceC9324c interfaceC9324c) {
        C9334g c9334g = new C9334g(interfaceC9324c.getContext(), interfaceC9324c);
        Object objM17820b = AbstractC9545b.m17820b(c9334g, c9334g, interfaceC10574p);
        if (objM17820b == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM17820b;
    }

    /* renamed from: b */
    public static final InterfaceC9266c m16708b(InterfaceC10575q interfaceC10575q) {
        return new C9202a(interfaceC10575q);
    }
}
