package ge;

import gd.AbstractC9293a;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p280od.InterfaceC10469c;

/* renamed from: ge.t */
/* loaded from: classes6.dex */
public final class C9380t implements InterfaceC9363o2 {

    /* renamed from: a */
    public final InterfaceC9540l f21801a;

    /* renamed from: b */
    public final C9388v f21802b;

    /* renamed from: ge.t$a */
    public static final class a implements InterfaceC9529a {

        /* renamed from: d */
        public final /* synthetic */ InterfaceC10469c f21804d;

        public a(InterfaceC10469c interfaceC10469c) {
            this.f21804d = interfaceC10469c;
        }

        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return new C9352m((InterfaceC5432b) C9380t.this.m18543b().invoke(this.f21804d));
        }
    }

    public C9380t(InterfaceC9540l compute) {
        AbstractC9979u.m20294g(compute, "compute");
        this.f21801a = compute;
        this.f21802b = new C9388v();
    }

    @Override // ge.InterfaceC9363o2
    /* renamed from: a */
    public InterfaceC5432b mo18508a(InterfaceC10469c key) {
        AbstractC9979u.m20294g(key, "key");
        Object obj = this.f21802b.get(AbstractC9293a.m18324a(key));
        AbstractC9979u.m20293f(obj, "get(...)");
        C9341j1 c9341j1 = (C9341j1) obj;
        Object objM18469a = c9341j1.f21748a.get();
        if (objM18469a == null) {
            objM18469a = c9341j1.m18469a(new a(key));
        }
        return ((C9352m) objM18469a).f21763a;
    }

    /* renamed from: b */
    public final InterfaceC9540l m18543b() {
        return this.f21801a;
    }
}
