package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbstractC5920b;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

/* renamed from: kotlinx.coroutines.flow.e */
/* loaded from: classes4.dex */
public final class C5908e implements InterfaceC5910f {

    /* renamed from: a */
    public final InterfaceC5910f f9361a;

    /* renamed from: b */
    public final InterfaceC6473e f9362b;

    public C5908e(InterfaceC5910f interfaceC5910f, InterfaceC6473e interfaceC6473e) {
        this.f9361a = interfaceC5910f;
        this.f9362b = interfaceC6473e;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, e7.r] */
    @Override // kotlinx.coroutines.flow.InterfaceC5910f
    public final Object collect(InterfaceC5912g interfaceC5912g, InterfaceC5631c interfaceC5631c) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = AbstractC5920b.f9388b;
        Object objCollect = this.f9361a.collect(new C5906d(this, ref$ObjectRef, interfaceC5912g), interfaceC5631c);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : C5443s.f8405a;
    }
}
