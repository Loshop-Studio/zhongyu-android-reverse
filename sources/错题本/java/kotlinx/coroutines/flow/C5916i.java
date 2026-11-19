package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$IntRef;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;

/* renamed from: kotlinx.coroutines.flow.i */
/* loaded from: classes4.dex */
public final class C5916i implements InterfaceC5910f {

    /* renamed from: a */
    public final /* synthetic */ int f9380a;

    /* renamed from: b */
    public final /* synthetic */ Object f9381b;

    public /* synthetic */ C5916i(Object obj, int i) {
        this.f9380a = i;
        this.f9381b = obj;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5910f
    public final Object collect(InterfaceC5912g interfaceC5912g, InterfaceC5631c interfaceC5631c) {
        switch (this.f9380a) {
            case 0:
                Object objEmit = interfaceC5912g.emit(this.f9381b, interfaceC5631c);
                if (objEmit != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect = ((InterfaceC5910f) this.f9381b).collect(new C5939k(new Ref$IntRef(), interfaceC5912g), interfaceC5631c);
                if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return C5443s.f8405a;
    }
}
