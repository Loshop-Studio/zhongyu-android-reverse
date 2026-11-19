package p000a.p058n.p059a;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Objects;
import p000a.p021e.C0137i;
import p000a.p031h.p032b.C0190e;
import p000a.p057m.AbstractC0367p;
import p000a.p057m.AbstractC0369r;
import p000a.p057m.C0363l;
import p000a.p057m.C0370s;
import p000a.p057m.C0371t;
import p000a.p057m.InterfaceC0358g;
import p000a.p057m.InterfaceC0364m;
import p000a.p057m.InterfaceC0368q;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.n.a.b */
/* loaded from: classes.dex */
public class C0374b extends AbstractC0373a {

    /* renamed from: a */
    public final InterfaceC0358g f2184a;

    /* renamed from: b */
    public final b f2185b;

    /* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<D>] */
    /* renamed from: a.n.a.b$a */
    public static class a<D> extends C0363l<D> {
        @Override // androidx.lifecycle.LiveData
        /* renamed from: d */
        public void mo1298d() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: e */
        public void mo1299e() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        /* renamed from: f */
        public void mo1300f(InterfaceC0364m<? super D> interfaceC0364m) {
            super.mo1300f(interfaceC0364m);
        }

        @Override // p000a.p057m.C0363l
        /* renamed from: g */
        public void mo1290g(D d2) {
            super.mo1290g(d2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(0);
            sb.append(" : ");
            C0190e.m708c(null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: a.n.a.b$b */
    public static class b extends AbstractC0367p {

        /* renamed from: c */
        public static final InterfaceC0368q f2186c = new a();

        /* renamed from: b */
        public C0137i<a> f2187b = new C0137i<>();

        /* renamed from: a.n.a.b$b$a */
        public static class a implements InterfaceC0368q {
            /* renamed from: a */
            public <T extends AbstractC0367p> T m1301a(Class<T> cls) {
                return new b();
            }
        }

        @Override // p000a.p057m.AbstractC0367p
        /* renamed from: a */
        public void mo1072a() {
            if (this.f2187b.m524g() > 0) {
                Objects.requireNonNull(this.f2187b.m525h(0));
                throw null;
            }
            C0137i<a> c0137i = this.f2187b;
            int i = c0137i.f954d;
            Object[] objArr = c0137i.f953c;
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = null;
            }
            c0137i.f954d = 0;
        }
    }

    public C0374b(InterfaceC0358g interfaceC0358g, C0371t c0371t) {
        this.f2184a = interfaceC0358g;
        Object obj = b.f2186c;
        String canonicalName = b.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        String strM2076d = C0561a.m2076d("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
        AbstractC0367p abstractC0367pM1294a = c0371t.f2183a.get(strM2076d);
        if (!b.class.isInstance(abstractC0367pM1294a)) {
            abstractC0367pM1294a = obj instanceof AbstractC0369r ? ((AbstractC0369r) obj).m1294a(strM2076d, b.class) : ((b.a) obj).m1301a(b.class);
            AbstractC0367p abstractC0367pPut = c0371t.f2183a.put(strM2076d, abstractC0367pM1294a);
            if (abstractC0367pPut != null) {
                abstractC0367pPut.mo1072a();
            }
        } else if (obj instanceof C0370s) {
        }
        this.f2185b = (b) abstractC0367pM1294a;
    }

    @Override // p000a.p058n.p059a.AbstractC0373a
    @Deprecated
    /* renamed from: a */
    public void mo1297a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        b bVar = this.f2185b;
        if (bVar.f2187b.m524g() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (bVar.f2187b.m524g() <= 0) {
                return;
            }
            a aVarM525h = bVar.f2187b.m525h(0);
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(bVar.f2187b.m522e(0));
            printWriter.print(": ");
            printWriter.println(aVarM525h.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            throw null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0190e.m708c(this.f2184a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
