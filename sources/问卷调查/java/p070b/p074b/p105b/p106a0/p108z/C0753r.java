package p070b.p074b.p105b.p106a0.p108z;

import p070b.p071a.p072a.p073a.C0561a;
import p070b.p074b.p105b.AbstractC0783x;
import p070b.p074b.p105b.C0768i;
import p070b.p074b.p105b.InterfaceC0784y;
import p070b.p074b.p105b.p110b0.C0757a;

/* renamed from: b.b.b.a0.z.r */
/* loaded from: classes.dex */
public class C0753r implements InterfaceC0784y {

    /* renamed from: b */
    public final /* synthetic */ Class f4378b;

    /* renamed from: c */
    public final /* synthetic */ Class f4379c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC0783x f4380d;

    public C0753r(Class cls, Class cls2, AbstractC0783x abstractC0783x) {
        this.f4378b = cls;
        this.f4379c = cls2;
        this.f4380d = abstractC0783x;
    }

    @Override // p070b.p074b.p105b.InterfaceC0784y
    /* renamed from: a */
    public <T> AbstractC0783x<T> mo2367a(C0768i c0768i, C0757a<T> c0757a) {
        Class<? super T> cls = c0757a.f4386a;
        if (cls == this.f4378b || cls == this.f4379c) {
            return this.f4380d;
        }
        return null;
    }

    public String toString() {
        StringBuilder sbM2079g = C0561a.m2079g("Factory[type=");
        sbM2079g.append(this.f4378b.getName());
        sbM2079g.append("+");
        sbM2079g.append(this.f4379c.getName());
        sbM2079g.append(",adapter=");
        sbM2079g.append(this.f4380d);
        sbM2079g.append("]");
        return sbM2079g.toString();
    }
}
