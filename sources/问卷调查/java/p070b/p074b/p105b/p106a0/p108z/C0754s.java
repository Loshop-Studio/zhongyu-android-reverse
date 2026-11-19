package p070b.p074b.p105b.p106a0.p108z;

import p070b.p071a.p072a.p073a.C0561a;
import p070b.p074b.p105b.AbstractC0783x;
import p070b.p074b.p105b.C0768i;
import p070b.p074b.p105b.C0781v;
import p070b.p074b.p105b.InterfaceC0784y;
import p070b.p074b.p105b.p110b0.C0757a;
import p070b.p074b.p105b.p111c0.C0759a;
import p070b.p074b.p105b.p111c0.C0761c;

/* renamed from: b.b.b.a0.z.s */
/* loaded from: classes.dex */
public class C0754s implements InterfaceC0784y {

    /* renamed from: b */
    public final /* synthetic */ Class f4381b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC0783x f4382c;

    /* JADX INFO: Add missing generic type declarations: [T1] */
    /* renamed from: b.b.b.a0.z.s$a */
    public class a<T1> extends AbstractC0783x<T1> {

        /* renamed from: a */
        public final /* synthetic */ Class f4383a;

        public a(Class cls) {
            this.f4383a = cls;
        }

        @Override // p070b.p074b.p105b.AbstractC0783x
        /* renamed from: a */
        public T1 mo2370a(C0759a c0759a) {
            T1 t1 = (T1) C0754s.this.f4382c.mo2370a(c0759a);
            if (t1 == null || this.f4383a.isInstance(t1)) {
                return t1;
            }
            StringBuilder sbM2079g = C0561a.m2079g("Expected a ");
            sbM2079g.append(this.f4383a.getName());
            sbM2079g.append(" but was ");
            sbM2079g.append(t1.getClass().getName());
            throw new C0781v(sbM2079g.toString());
        }

        @Override // p070b.p074b.p105b.AbstractC0783x
        /* renamed from: b */
        public void mo2371b(C0761c c0761c, T1 t1) {
            C0754s.this.f4382c.mo2371b(c0761c, t1);
        }
    }

    public C0754s(Class cls, AbstractC0783x abstractC0783x) {
        this.f4381b = cls;
        this.f4382c = abstractC0783x;
    }

    @Override // p070b.p074b.p105b.InterfaceC0784y
    /* renamed from: a */
    public <T2> AbstractC0783x<T2> mo2367a(C0768i c0768i, C0757a<T2> c0757a) {
        Class<? super T2> cls = c0757a.f4386a;
        if (this.f4381b.isAssignableFrom(cls)) {
            return new a(cls);
        }
        return null;
    }

    public String toString() {
        StringBuilder sbM2079g = C0561a.m2079g("Factory[typeHierarchy=");
        sbM2079g.append(this.f4381b.getName());
        sbM2079g.append(",adapter=");
        sbM2079g.append(this.f4382c);
        sbM2079g.append("]");
        return sbM2079g.toString();
    }
}
