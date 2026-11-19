package kotlinx.coroutines;

import p152r6.InterfaceC6471c;

/* renamed from: kotlinx.coroutines.e */
/* loaded from: classes4.dex */
public final class C5892e implements InterfaceC5969i1 {

    /* renamed from: a */
    public final /* synthetic */ int f9339a;

    /* renamed from: b */
    public final Object f9340b;

    public /* synthetic */ C5892e(Object obj, int i) {
        this.f9339a = i;
        this.f9340b = obj;
    }

    public final String toString() {
        switch (this.f9339a) {
            case 0:
                return "CancelHandler.UserSupplied[" + ((InterfaceC6471c) this.f9340b).getClass().getSimpleName() + '@' + AbstractC6014x.m5642m(this) + ']';
            default:
                return "DisposeOnCancel[" + ((InterfaceC5962g0) this.f9340b) + ']';
        }
    }
}
