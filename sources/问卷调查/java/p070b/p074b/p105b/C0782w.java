package p070b.p074b.p105b;

import java.io.IOException;
import p070b.p074b.p105b.p111c0.C0759a;
import p070b.p074b.p105b.p111c0.C0761c;
import p070b.p074b.p105b.p111c0.EnumC0760b;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: b.b.b.w */
/* loaded from: classes.dex */
public class C0782w<T> extends AbstractC0783x<T> {

    /* renamed from: a */
    public final /* synthetic */ AbstractC0783x f4445a;

    public C0782w(AbstractC0783x abstractC0783x) {
        this.f4445a = abstractC0783x;
    }

    @Override // p070b.p074b.p105b.AbstractC0783x
    /* renamed from: a */
    public T mo2370a(C0759a c0759a) {
        if (c0759a.mo2403v() != EnumC0760b.NULL) {
            return (T) this.f4445a.mo2370a(c0759a);
        }
        c0759a.mo2401r();
        return null;
    }

    @Override // p070b.p074b.p105b.AbstractC0783x
    /* renamed from: b */
    public void mo2371b(C0761c c0761c, T t) throws IOException {
        if (t == null) {
            c0761c.mo2409h();
        } else {
            this.f4445a.mo2371b(c0761c, t);
        }
    }
}
