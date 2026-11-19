package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.InterfaceC5884m;
import kotlinx.coroutines.channels.InterfaceC5887p;
import kotlinx.coroutines.flow.InterfaceC5912g;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;

/* renamed from: kotlinx.coroutines.flow.internal.o */
/* loaded from: classes4.dex */
public final class C5933o implements InterfaceC5912g {

    /* renamed from: a */
    public final InterfaceC5887p f9407a;

    public C5933o(InterfaceC5884m interfaceC5884m) {
        this.f9407a = interfaceC5884m;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5912g
    public final Object emit(Object obj, InterfaceC5631c interfaceC5631c) {
        Object objMo5494q = this.f9407a.mo5494q(interfaceC5631c, obj);
        return objMo5494q == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo5494q : C5443s.f8405a;
    }
}
