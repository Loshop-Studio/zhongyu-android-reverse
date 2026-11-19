package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.InterfaceC5912g;
import p045d6.C5443s;
import p054e7.AbstractC5469a;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6473e;

/* renamed from: kotlinx.coroutines.flow.internal.r */
/* loaded from: classes4.dex */
public final class C5936r implements InterfaceC5912g {

    /* renamed from: a */
    public final InterfaceC5636h f9410a;

    /* renamed from: b */
    public final Object f9411b;

    /* renamed from: c */
    public final InterfaceC6473e f9412c;

    public C5936r(InterfaceC5912g interfaceC5912g, InterfaceC5636h interfaceC5636h) {
        this.f9410a = interfaceC5636h;
        this.f9411b = AbstractC5469a.m4837m(interfaceC5636h);
        this.f9412c = new UndispatchedContextCollector$emitRef$1(interfaceC5912g, null);
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5912g
    public final Object emit(Object obj, InterfaceC5631c interfaceC5631c) {
        Object objM5565c = AbstractC5920b.m5565c(this.f9410a, obj, this.f9411b, this.f9412c, interfaceC5631c);
        return objM5565c == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5565c : C5443s.f8405a;
    }
}
