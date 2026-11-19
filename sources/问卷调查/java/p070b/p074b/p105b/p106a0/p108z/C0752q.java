package p070b.p074b.p105b.p106a0.p108z;

import p070b.p071a.p072a.p073a.C0561a;
import p070b.p074b.p105b.AbstractC0783x;
import p070b.p074b.p105b.C0768i;
import p070b.p074b.p105b.InterfaceC0784y;
import p070b.p074b.p105b.p110b0.C0757a;

/* renamed from: b.b.b.a0.z.q */
/* loaded from: classes.dex */
public class C0752q implements InterfaceC0784y {

    /* renamed from: b */
    public final /* synthetic */ Class f4375b;

    /* renamed from: c */
    public final /* synthetic */ Class f4376c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC0783x f4377d;

    public C0752q(Class cls, Class cls2, AbstractC0783x abstractC0783x) {
        this.f4375b = cls;
        this.f4376c = cls2;
        this.f4377d = abstractC0783x;
    }

    @Override // p070b.p074b.p105b.InterfaceC0784y
    /* renamed from: a */
    public <T> AbstractC0783x<T> mo2367a(C0768i c0768i, C0757a<T> c0757a) {
        Class<? super T> cls = c0757a.f4386a;
        if (cls == this.f4375b || cls == this.f4376c) {
            return this.f4377d;
        }
        return null;
    }

    public String toString() {
        StringBuilder sbM2079g = C0561a.m2079g("Factory[type=");
        sbM2079g.append(this.f4376c.getName());
        sbM2079g.append("+");
        sbM2079g.append(this.f4375b.getName());
        sbM2079g.append(",adapter=");
        sbM2079g.append(this.f4377d);
        sbM2079g.append("]");
        return sbM2079g.toString();
    }
}
