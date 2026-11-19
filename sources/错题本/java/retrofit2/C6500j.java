package retrofit2;

import java.lang.reflect.Type;

/* renamed from: retrofit2.j */
/* loaded from: classes4.dex */
public final class C6500j implements InterfaceC6494g {

    /* renamed from: a */
    public final /* synthetic */ int f10705a;

    /* renamed from: b */
    public final Type f10706b;

    public /* synthetic */ C6500j(int i, Type type) {
        this.f10705a = i;
        this.f10706b = type;
    }

    @Override // retrofit2.InterfaceC6494g
    /* renamed from: e */
    public final Type mo111e() {
        switch (this.f10705a) {
        }
        return this.f10706b;
    }

    @Override // retrofit2.InterfaceC6494g
    /* renamed from: i */
    public final Object mo115i(C6524x c6524x) {
        switch (this.f10705a) {
            case 0:
                C6502k c6502k = new C6502k(c6524x);
                c6524x.mo6144b(new C6498i(c6502k, 0));
                return c6502k;
            default:
                C6502k c6502k2 = new C6502k(c6524x);
                c6524x.mo6144b(new C6498i(c6502k2, 1));
                return c6502k2;
        }
    }
}
