package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import p089e8.InterfaceC8375c;
import p246s8.InterfaceC10052b;
import p289w7.AbstractC10360a;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* renamed from: w8.t */
/* loaded from: classes5.dex */
public final class C10447t implements InterfaceC10430o2 {

    /* renamed from: a */
    public final InterfaceC10570l f20774a;

    /* renamed from: b */
    public final C10455v f20775b;

    /* renamed from: w8.t$a */
    public static final class a implements InterfaceC10559a {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC8375c f20777b;

        public a(InterfaceC8375c interfaceC8375c) {
            this.f20777b = interfaceC8375c;
        }

        @Override // p300x7.InterfaceC10559a
        public final Object invoke() {
            return new C10419m((InterfaceC10052b) C10447t.this.m19517b().invoke(this.f20777b));
        }
    }

    public C10447t(InterfaceC10570l compute) {
        AbstractC9133u.m16133g(compute, "compute");
        this.f20774a = compute;
        this.f20775b = new C10455v();
    }

    @Override // p290w8.InterfaceC10430o2
    /* renamed from: a */
    public InterfaceC10052b mo19482a(InterfaceC8375c key) {
        AbstractC9133u.m16133g(key, "key");
        Object obj = this.f20775b.get(AbstractC10360a.m19298a(key));
        AbstractC9133u.m16132f(obj, "get(...)");
        C10408j1 c10408j1 = (C10408j1) obj;
        Object objM19443a = c10408j1.f20721a.get();
        if (objM19443a == null) {
            objM19443a = c10408j1.m19443a(new a(key));
        }
        return ((C10419m) objM19443a).f20736a;
    }

    /* renamed from: b */
    public final InterfaceC10570l m19517b() {
        return this.f20774a;
    }
}
