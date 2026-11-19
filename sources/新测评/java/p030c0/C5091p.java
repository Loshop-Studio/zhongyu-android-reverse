package p030c0;

import coil3.util.C5212b;
import coil3.util.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p300z.C9958e;
import p300z.InterfaceC9954a;

/* renamed from: c0.p */
/* loaded from: classes3.dex */
public final class C5091p implements InterfaceC5087l {

    /* renamed from: a */
    public static final a f2655a = new a(null);

    /* renamed from: c0.p$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C5091p(Logger logger) {
    }

    @Override // p030c0.InterfaceC5087l
    /* renamed from: a */
    public boolean mo2688a() {
        return C5212b.f3275a.m3206b(null);
    }

    @Override // p030c0.InterfaceC5087l
    /* renamed from: b */
    public boolean mo2689b(C9958e c9958e) {
        InterfaceC9954a interfaceC9954aM16772b = c9958e.m16772b();
        if ((interfaceC9954aM16772b instanceof InterfaceC9954a.a ? ((InterfaceC9954a.a) interfaceC9954aM16772b).m16768f() : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        InterfaceC9954a interfaceC9954aM16771a = c9958e.m16771a();
        return (interfaceC9954aM16771a instanceof InterfaceC9954a.a ? ((InterfaceC9954a.a) interfaceC9954aM16771a).m16768f() : Integer.MAX_VALUE) > 100;
    }
}
