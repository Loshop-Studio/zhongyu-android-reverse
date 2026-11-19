package p070b.p074b.p105b.p106a0.p108z;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import p070b.p074b.p105b.AbstractC0783x;
import p070b.p074b.p105b.C0768i;
import p070b.p074b.p105b.p106a0.p108z.C0745j;
import p070b.p074b.p105b.p110b0.C0757a;
import p070b.p074b.p105b.p111c0.C0759a;
import p070b.p074b.p105b.p111c0.C0761c;

/* renamed from: b.b.b.a0.z.n */
/* loaded from: classes.dex */
public final class C0749n<T> extends AbstractC0783x<T> {

    /* renamed from: a */
    public final C0768i f4315a;

    /* renamed from: b */
    public final AbstractC0783x<T> f4316b;

    /* renamed from: c */
    public final Type f4317c;

    public C0749n(C0768i c0768i, AbstractC0783x<T> abstractC0783x, Type type) {
        this.f4315a = c0768i;
        this.f4316b = abstractC0783x;
        this.f4317c = type;
    }

    @Override // p070b.p074b.p105b.AbstractC0783x
    /* renamed from: a */
    public T mo2370a(C0759a c0759a) {
        return this.f4316b.mo2370a(c0759a);
    }

    @Override // p070b.p074b.p105b.AbstractC0783x
    /* renamed from: b */
    public void mo2371b(C0761c c0761c, T t) {
        AbstractC0783x<T> abstractC0783xM2451c = this.f4316b;
        Type type = this.f4317c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.f4317c) {
            abstractC0783xM2451c = this.f4315a.m2451c(new C0757a<>(type));
            if (abstractC0783xM2451c instanceof C0745j.a) {
                AbstractC0783x<T> abstractC0783x = this.f4316b;
                if (!(abstractC0783x instanceof C0745j.a)) {
                    abstractC0783xM2451c = abstractC0783x;
                }
            }
        }
        abstractC0783xM2451c.mo2371b(c0761c, t);
    }
}
