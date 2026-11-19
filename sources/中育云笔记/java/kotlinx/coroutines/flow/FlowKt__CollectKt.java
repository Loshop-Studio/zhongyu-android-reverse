package kotlinx.coroutines.flow;

import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.AbstractC11597f;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p394wd.C11736k;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class FlowKt__CollectKt {
    /* renamed from: a */
    public static final Object m20768a(InterfaceC11594c interfaceC11594c, InterfaceC11588c interfaceC11588c) {
        Object objCollect = interfaceC11594c.collect(C11736k.f27895c, interfaceC11588c);
        return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
    }

    /* renamed from: b */
    public static final Object m20769b(InterfaceC11594c interfaceC11594c, InterfaceC9544p interfaceC9544p, InterfaceC11588c interfaceC11588c) {
        Object objM25558h = AbstractC11596e.m25558h(AbstractC11597f.m25578b(AbstractC11596e.m25536G(interfaceC11594c, interfaceC9544p), 0, null, 2, null), interfaceC11588c);
        return objM25558h == AbstractC11725a.m25952f() ? objM25558h : C10786q.f26013a;
    }

    /* renamed from: c */
    public static final Object m20770c(InterfaceC11595d interfaceC11595d, InterfaceC11594c interfaceC11594c, InterfaceC11588c interfaceC11588c) {
        AbstractC11596e.m25571u(interfaceC11595d);
        Object objCollect = interfaceC11594c.collect(interfaceC11595d, interfaceC11588c);
        return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
    }

    /* renamed from: d */
    public static final InterfaceC10045g m20771d(InterfaceC11594c interfaceC11594c, InterfaceC11122i0 interfaceC11122i0) {
        return AbstractC11117h.m24726d(interfaceC11122i0, null, null, new FlowKt__CollectKt$launchIn$1(interfaceC11594c, null), 3, null);
    }
}
