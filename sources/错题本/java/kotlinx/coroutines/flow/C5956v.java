package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.AbstractC5920b;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6474f;

/* renamed from: kotlinx.coroutines.flow.v */
/* loaded from: classes4.dex */
public final class C5956v implements InterfaceC5910f {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC5910f f9442a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC5910f f9443b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC6474f f9444c;

    public C5956v(InterfaceC5944m0 interfaceC5944m0, InterfaceC5944m0 interfaceC5944m02, InterfaceC6474f interfaceC6474f) {
        this.f9442a = interfaceC5944m0;
        this.f9443b = interfaceC5944m02;
        this.f9444c = interfaceC6474f;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5910f
    public final Object collect(InterfaceC5912g interfaceC5912g, InterfaceC5631c interfaceC5631c) {
        Object objM5563a = AbstractC5920b.m5563a(interfaceC5912g, new InterfaceC5910f[]{this.f9442a, this.f9443b}, new FlowKt__ZipKt$combine$1$1(this.f9444c, null), interfaceC5631c);
        return objM5563a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5563a : C5443s.f8405a;
    }
}
