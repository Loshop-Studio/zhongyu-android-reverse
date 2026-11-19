package p070b.p074b.p105b.p106a0.p108z;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import p070b.p074b.p105b.AbstractC0783x;
import p070b.p074b.p105b.C0768i;
import p070b.p074b.p105b.InterfaceC0784y;
import p070b.p074b.p105b.p106a0.C0729s;
import p070b.p074b.p105b.p110b0.C0757a;
import p070b.p074b.p105b.p111c0.C0759a;
import p070b.p074b.p105b.p111c0.C0761c;

/* renamed from: b.b.b.a0.z.h */
/* loaded from: classes.dex */
public final class C0743h extends AbstractC0783x<Object> {

    /* renamed from: b */
    public static final InterfaceC0784y f4287b = new a();

    /* renamed from: a */
    public final C0768i f4288a;

    /* renamed from: b.b.b.a0.z.h$a */
    public class a implements InterfaceC0784y {
        @Override // p070b.p074b.p105b.InterfaceC0784y
        /* renamed from: a */
        public <T> AbstractC0783x<T> mo2367a(C0768i c0768i, C0757a<T> c0757a) {
            if (c0757a.f4386a == Object.class) {
                return new C0743h(c0768i);
            }
            return null;
        }
    }

    public C0743h(C0768i c0768i) {
        this.f4288a = c0768i;
    }

    @Override // p070b.p074b.p105b.AbstractC0783x
    /* renamed from: a */
    public Object mo2370a(C0759a c0759a) {
        int iOrdinal = c0759a.mo2403v().ordinal();
        if (iOrdinal == 0) {
            ArrayList arrayList = new ArrayList();
            c0759a.mo2390a();
            while (c0759a.mo2395i()) {
                arrayList.add(mo2370a(c0759a));
            }
            c0759a.mo2392e();
            return arrayList;
        }
        if (iOrdinal == 2) {
            C0729s c0729s = new C0729s();
            c0759a.mo2391b();
            while (c0759a.mo2395i()) {
                c0729s.put(c0759a.mo2400p(), mo2370a(c0759a));
            }
            c0759a.mo2393f();
            return c0729s;
        }
        if (iOrdinal == 5) {
            return c0759a.mo2402t();
        }
        if (iOrdinal == 6) {
            return Double.valueOf(c0759a.mo2397m());
        }
        if (iOrdinal == 7) {
            return Boolean.valueOf(c0759a.mo2396l());
        }
        if (iOrdinal != 8) {
            throw new IllegalStateException();
        }
        c0759a.mo2401r();
        return null;
    }

    @Override // p070b.p074b.p105b.AbstractC0783x
    /* renamed from: b */
    public void mo2371b(C0761c c0761c, Object obj) throws IOException {
        if (obj == null) {
            c0761c.mo2409h();
            return;
        }
        C0768i c0768i = this.f4288a;
        Class<?> cls = obj.getClass();
        Objects.requireNonNull(c0768i);
        AbstractC0783x abstractC0783xM2451c = c0768i.m2451c(new C0757a(cls));
        if (!(abstractC0783xM2451c instanceof C0743h)) {
            abstractC0783xM2451c.mo2371b(c0761c, obj);
        } else {
            c0761c.mo2405c();
            c0761c.mo2407f();
        }
    }
}
