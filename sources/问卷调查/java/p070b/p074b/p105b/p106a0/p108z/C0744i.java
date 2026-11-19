package p070b.p074b.p105b.p106a0.p108z;

import java.lang.reflect.Field;
import p070b.p074b.p105b.AbstractC0783x;
import p070b.p074b.p105b.C0768i;
import p070b.p074b.p105b.p106a0.p108z.C0745j;
import p070b.p074b.p105b.p110b0.C0757a;
import p070b.p074b.p105b.p111c0.C0759a;
import p070b.p074b.p105b.p111c0.C0761c;

/* renamed from: b.b.b.a0.z.i */
/* loaded from: classes.dex */
public class C0744i extends C0745j.b {

    /* renamed from: d */
    public final /* synthetic */ Field f4289d;

    /* renamed from: e */
    public final /* synthetic */ boolean f4290e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC0783x f4291f;

    /* renamed from: g */
    public final /* synthetic */ C0768i f4292g;

    /* renamed from: h */
    public final /* synthetic */ C0757a f4293h;

    /* renamed from: i */
    public final /* synthetic */ boolean f4294i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0744i(C0745j c0745j, String str, boolean z, boolean z2, Field field, boolean z3, AbstractC0783x abstractC0783x, C0768i c0768i, C0757a c0757a, boolean z4) {
        super(str, z, z2);
        this.f4289d = field;
        this.f4290e = z3;
        this.f4291f = abstractC0783x;
        this.f4292g = c0768i;
        this.f4293h = c0757a;
        this.f4294i = z4;
    }

    @Override // p070b.p074b.p105b.p106a0.p108z.C0745j.b
    /* renamed from: a */
    public void mo2417a(C0759a c0759a, Object obj) throws IllegalAccessException, IllegalArgumentException {
        Object objMo2370a = this.f4291f.mo2370a(c0759a);
        if (objMo2370a == null && this.f4294i) {
            return;
        }
        this.f4289d.set(obj, objMo2370a);
    }

    @Override // p070b.p074b.p105b.p106a0.p108z.C0745j.b
    /* renamed from: b */
    public void mo2418b(C0761c c0761c, Object obj) throws IllegalAccessException, IllegalArgumentException {
        (this.f4290e ? this.f4291f : new C0749n(this.f4292g, this.f4291f, this.f4293h.f4387b)).mo2371b(c0761c, this.f4289d.get(obj));
    }

    @Override // p070b.p074b.p105b.p106a0.p108z.C0745j.b
    /* renamed from: c */
    public boolean mo2419c(Object obj) {
        return this.f4303b && this.f4289d.get(obj) != obj;
    }
}
