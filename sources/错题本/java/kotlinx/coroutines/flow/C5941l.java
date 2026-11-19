package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.internal.C5926h;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

/* renamed from: kotlinx.coroutines.flow.l */
/* loaded from: classes4.dex */
public final class C5941l implements InterfaceC5910f {

    /* renamed from: a */
    public final /* synthetic */ C5926h f9420a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6473e f9421b;

    public C5941l(C5926h c5926h, InterfaceC6473e interfaceC6473e) {
        this.f9420a = c5926h;
        this.f9421b = interfaceC6473e;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5910f
    public final Object collect(InterfaceC5912g interfaceC5912g, InterfaceC5631c interfaceC5631c) {
        Object objCollect = this.f9420a.collect(new C5943m(new Ref$BooleanRef(), interfaceC5912g, this.f9421b), interfaceC5631c);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : C5443s.f8405a;
    }
}
