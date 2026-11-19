package p168e;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p070b.p071a.p072a.p073a.C0561a;
import p160d.p161e.C0999e;
import p160d.p162f.p164b.C1010c;
import p160d.p162f.p164b.C1011d;
import p168e.p169q.C1045b;
import p168e.p169q.p174g.C1059h;
import p168e.p169q.p176h.C1072a;
import p168e.p169q.p177i.AbstractC1075c;

/* renamed from: e.n */
/* loaded from: classes.dex */
public class C1041n implements Cloneable {

    /* renamed from: b */
    public final List<Object> f5551b;

    /* renamed from: c */
    public final List<Object> f5552c;

    /* renamed from: d */
    public final InterfaceC1029b f5553d;

    /* renamed from: e */
    public final InterfaceC1035h f5554e;

    /* renamed from: f */
    public final InterfaceC1038k f5555f;

    /* renamed from: g */
    public final InterfaceC1029b f5556g;

    /* renamed from: h */
    public final SSLSocketFactory f5557h;

    /* renamed from: i */
    public final X509TrustManager f5558i;

    /* renamed from: j */
    public final List<C1033f> f5559j;

    /* renamed from: k */
    public final C1030c f5560k;

    /* renamed from: l */
    public final AbstractC1075c f5561l;

    /* renamed from: o */
    public static final a f5550o = new a(null);

    /* renamed from: m */
    public static final List<EnumC1042o> f5548m = C1045b.m2839b(EnumC1042o.HTTP_2, EnumC1042o.HTTP_1_1);

    /* renamed from: n */
    public static final List<C1033f> f5549n = C1045b.m2839b(C1033f.f5534g, C1033f.f5535h);

    /* renamed from: e.n$a */
    public static final class a {
        public a(C1010c c1010c) {
        }
    }

    public C1041n() {
        boolean z;
        C1030c c1030cM2830a;
        boolean z2;
        new C1036i();
        new C1032e();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C1011d.m2809e(AbstractC1039l.f5546a, "$this$asFactory");
        InterfaceC1029b interfaceC1029b = InterfaceC1029b.f5509a;
        InterfaceC1035h interfaceC1035h = InterfaceC1035h.f5544a;
        InterfaceC1038k interfaceC1038k = InterfaceC1038k.f5545a;
        C1011d.m2808d(SocketFactory.getDefault(), "SocketFactory.getDefault()");
        List<C1033f> list = f5549n;
        C1030c c1030c = C1030c.f5510c;
        C1011d.m2809e(arrayList, "$this$toImmutableList");
        List<Object> listUnmodifiableList = Collections.unmodifiableList(C0999e.m2800g(arrayList));
        C1011d.m2808d(listUnmodifiableList, "Collections.unmodifiableList(toMutableList())");
        this.f5551b = listUnmodifiableList;
        C1011d.m2809e(arrayList2, "$this$toImmutableList");
        List<Object> listUnmodifiableList2 = Collections.unmodifiableList(C0999e.m2800g(arrayList2));
        C1011d.m2808d(listUnmodifiableList2, "Collections.unmodifiableList(toMutableList())");
        this.f5552c = listUnmodifiableList2;
        this.f5553d = interfaceC1029b;
        this.f5554e = interfaceC1035h;
        this.f5555f = interfaceC1038k;
        if (ProxySelector.getDefault() == null) {
            C1072a c1072a = C1072a.f5642a;
        }
        this.f5556g = interfaceC1029b;
        this.f5559j = list;
        new LinkedHashSet();
        if ((list instanceof Collection) && list.isEmpty()) {
            z = true;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C1033f) it.next()).f5536a) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        if (z) {
            this.f5557h = null;
            this.f5561l = null;
            this.f5558i = null;
            c1030cM2830a = C1030c.f5510c;
        } else {
            C1059h.a aVar = C1059h.f5628c;
            X509TrustManager x509TrustManagerMo2853f = C1059h.f5626a.mo2853f();
            this.f5558i = x509TrustManagerMo2853f;
            C1059h c1059h = C1059h.f5626a;
            C1011d.m2807c(x509TrustManagerMo2853f);
            this.f5557h = c1059h.mo2854e(x509TrustManagerMo2853f);
            C1011d.m2807c(x509TrustManagerMo2853f);
            C1011d.m2809e(x509TrustManagerMo2853f, "trustManager");
            AbstractC1075c abstractC1075cMo2850a = C1059h.f5626a.mo2850a(x509TrustManagerMo2853f);
            this.f5561l = abstractC1075cMo2850a;
            C1011d.m2807c(abstractC1075cMo2850a);
            c1030cM2830a = c1030c.m2830a(abstractC1075cMo2850a);
        }
        this.f5560k = c1030cM2830a;
        Objects.requireNonNull(this.f5551b, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!(!r0.contains(null))) {
            StringBuilder sbM2079g = C0561a.m2079g("Null interceptor: ");
            sbM2079g.append(this.f5551b);
            throw new IllegalStateException(sbM2079g.toString().toString());
        }
        Objects.requireNonNull(this.f5552c, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!(!r0.contains(null))) {
            StringBuilder sbM2079g2 = C0561a.m2079g("Null network interceptor: ");
            sbM2079g2.append(this.f5552c);
            throw new IllegalStateException(sbM2079g2.toString().toString());
        }
        List<C1033f> list2 = this.f5559j;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z2 = true;
        } else {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((C1033f) it2.next()).f5536a) {
                    z2 = false;
                    break;
                }
            }
            z2 = true;
        }
        if (!z2) {
            if (this.f5557h == null) {
                throw new IllegalStateException("sslSocketFactory == null".toString());
            }
            if (this.f5561l == null) {
                throw new IllegalStateException("certificateChainCleaner == null".toString());
            }
            if (this.f5558i == null) {
                throw new IllegalStateException("x509TrustManager == null".toString());
            }
            return;
        }
        if (!(this.f5557h == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.f5561l == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.f5558i == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!C1011d.m2805a(this.f5560k, C1030c.f5510c)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public Object clone() {
        return super.clone();
    }
}
