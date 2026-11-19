package p090e0;

import coil3.util.C5347b;
import coil3.util.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p307z.C9975e;
import p307z.InterfaceC9971a;

/* renamed from: e0.o */
/* loaded from: classes3.dex */
public final class C7817o implements InterfaceC7813k {

    /* renamed from: a */
    public static final a f13127a = new a(null);

    /* renamed from: e0.o$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C7817o(Logger logger) {
    }

    @Override // p090e0.InterfaceC7813k
    /* renamed from: a */
    public boolean mo12196a() {
        return C5347b.f3157a.m2923b(null);
    }

    @Override // p090e0.InterfaceC7813k
    /* renamed from: b */
    public boolean mo12197b(C9975e c9975e) {
        InterfaceC9971a interfaceC9971aM17259b = c9975e.m17259b();
        if ((interfaceC9971aM17259b instanceof InterfaceC9971a.a ? ((InterfaceC9971a.a) interfaceC9971aM17259b).m17255f() : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        InterfaceC9971a interfaceC9971aM17258a = c9975e.m17258a();
        return (interfaceC9971aM17258a instanceof InterfaceC9971a.a ? ((InterfaceC9971a.a) interfaceC9971aM17258a).m17255f() : Integer.MAX_VALUE) > 100;
    }
}
