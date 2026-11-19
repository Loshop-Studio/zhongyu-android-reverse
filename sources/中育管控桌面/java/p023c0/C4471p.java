package p023c0;

import coil3.util.C4593b;
import coil3.util.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p194z.C7923e;
import p194z.InterfaceC7919a;

/* renamed from: c0.p */
/* loaded from: classes3.dex */
public final class C4471p implements InterfaceC4467l {

    /* renamed from: a */
    public static final a f1335a = new a(null);

    /* renamed from: c0.p$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C4471p(Logger logger) {
    }

    @Override // p023c0.InterfaceC4467l
    /* renamed from: a */
    public boolean mo1546a() {
        return C4593b.f1959a.m2032b(null);
    }

    @Override // p023c0.InterfaceC4467l
    /* renamed from: b */
    public boolean mo1547b(C7923e c7923e) {
        InterfaceC7919a interfaceC7919aM9720b = c7923e.m9720b();
        if ((interfaceC7919aM9720b instanceof InterfaceC7919a.a ? ((InterfaceC7919a.a) interfaceC7919aM9720b).m9716f() : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        InterfaceC7919a interfaceC7919aM9719a = c7923e.m9719a();
        return (interfaceC7919aM9719a instanceof InterfaceC7919a.a ? ((InterfaceC7919a.a) interfaceC7919aM9719a).m9716f() : Integer.MAX_VALUE) > 100;
    }
}
