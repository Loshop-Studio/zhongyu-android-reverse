package p070b.p074b.p105b.p106a0;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p070b.p074b.p105b.AbstractC0783x;
import p070b.p074b.p105b.C0768i;
import p070b.p074b.p105b.InterfaceC0707a;
import p070b.p074b.p105b.InterfaceC0784y;
import p070b.p074b.p105b.p110b0.C0757a;
import p070b.p074b.p105b.p111c0.C0759a;
import p070b.p074b.p105b.p111c0.C0761c;

/* renamed from: b.b.b.a0.o */
/* loaded from: classes.dex */
public final class C0725o implements InterfaceC0784y, Cloneable {

    /* renamed from: d */
    public static final C0725o f4223d = new C0725o();

    /* renamed from: b */
    public List<InterfaceC0707a> f4224b = Collections.emptyList();

    /* renamed from: c */
    public List<InterfaceC0707a> f4225c = Collections.emptyList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: b.b.b.a0.o$a */
    public class a<T> extends AbstractC0783x<T> {

        /* renamed from: a */
        public AbstractC0783x<T> f4226a;

        /* renamed from: b */
        public final /* synthetic */ boolean f4227b;

        /* renamed from: c */
        public final /* synthetic */ boolean f4228c;

        /* renamed from: d */
        public final /* synthetic */ C0768i f4229d;

        /* renamed from: e */
        public final /* synthetic */ C0757a f4230e;

        public a(boolean z, boolean z2, C0768i c0768i, C0757a c0757a) {
            this.f4227b = z;
            this.f4228c = z2;
            this.f4229d = c0768i;
            this.f4230e = c0757a;
        }

        @Override // p070b.p074b.p105b.AbstractC0783x
        /* renamed from: a */
        public T mo2370a(C0759a c0759a) throws IOException {
            if (this.f4227b) {
                c0759a.mo2385A();
                return null;
            }
            AbstractC0783x<T> abstractC0783xM2452d = this.f4226a;
            if (abstractC0783xM2452d == null) {
                abstractC0783xM2452d = this.f4229d.m2452d(C0725o.this, this.f4230e);
                this.f4226a = abstractC0783xM2452d;
            }
            return abstractC0783xM2452d.mo2370a(c0759a);
        }

        @Override // p070b.p074b.p105b.AbstractC0783x
        /* renamed from: b */
        public void mo2371b(C0761c c0761c, T t) throws IOException {
            if (this.f4228c) {
                c0761c.mo2409h();
                return;
            }
            AbstractC0783x<T> abstractC0783xM2452d = this.f4226a;
            if (abstractC0783xM2452d == null) {
                abstractC0783xM2452d = this.f4229d.m2452d(C0725o.this, this.f4230e);
                this.f4226a = abstractC0783xM2452d;
            }
            abstractC0783xM2452d.mo2371b(c0761c, t);
        }
    }

    @Override // p070b.p074b.p105b.InterfaceC0784y
    /* renamed from: a */
    public <T> AbstractC0783x<T> mo2367a(C0768i c0768i, C0757a<T> c0757a) {
        Class<? super T> cls = c0757a.f4386a;
        boolean zM2369c = m2369c(cls);
        boolean z = zM2369c || m2368b(cls, true);
        boolean z2 = zM2369c || m2368b(cls, false);
        if (z || z2) {
            return new a(z2, z, c0768i, c0757a);
        }
        return null;
    }

    /* renamed from: b */
    public final boolean m2368b(Class<?> cls, boolean z) {
        Iterator<InterfaceC0707a> it = (z ? this.f4224b : this.f4225c).iterator();
        while (it.hasNext()) {
            if (it.next().m2353a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m2369c(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    public Object clone() {
        try {
            return (C0725o) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }
}
