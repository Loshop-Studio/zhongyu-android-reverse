package p001a0;

import coil3.util.C5489b;
import coil3.util.Logger;
import kotlin.jvm.internal.AbstractC9972n;
import p396x.C11749e;
import p396x.InterfaceC11745a;

/* renamed from: a0.p */
/* loaded from: classes3.dex */
public final class C0019p implements InterfaceC0015l {

    /* renamed from: a */
    public static final a f5a = new a(null);

    /* renamed from: a0.p$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    public C0019p(Logger logger) {
    }

    @Override // p001a0.InterfaceC0015l
    /* renamed from: a */
    public boolean mo29a(C11749e c11749e) {
        InterfaceC11745a interfaceC11745aM26000b = c11749e.m26000b();
        if ((interfaceC11745aM26000b instanceof InterfaceC11745a.a ? ((InterfaceC11745a.a) interfaceC11745aM26000b).m25995f() : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        InterfaceC11745a interfaceC11745aM25999a = c11749e.m25999a();
        return (interfaceC11745aM25999a instanceof InterfaceC11745a.a ? ((InterfaceC11745a.a) interfaceC11745aM25999a).m25995f() : Integer.MAX_VALUE) > 100;
    }

    @Override // p001a0.InterfaceC0015l
    /* renamed from: b */
    public boolean mo30b() {
        return C5489b.f3950a.m3300b(null);
    }
}
