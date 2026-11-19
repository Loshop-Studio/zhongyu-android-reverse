package p168e.p169q.p174g;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import p160d.p161e.C0999e;
import p160d.p162f.p164b.C1011d;
import p168e.p169q.p174g.p175i.C1060a;
import p168e.p169q.p174g.p175i.C1061b;
import p168e.p169q.p174g.p175i.C1065f;
import p168e.p169q.p174g.p175i.C1066g;
import p168e.p169q.p174g.p175i.C1068i;
import p168e.p169q.p174g.p175i.C1069j;
import p168e.p169q.p174g.p175i.InterfaceC1070k;
import p168e.p169q.p177i.AbstractC1075c;

/* renamed from: e.q.g.a */
/* loaded from: classes.dex */
public final class C1052a extends C1059h {

    /* renamed from: d */
    public static final boolean f5607d;

    /* renamed from: e */
    public static final C1052a f5608e = null;

    static {
        f5607d = C1059h.f5628c.m2857a() && Build.VERSION.SDK_INT >= 29;
    }

    public C1052a() {
        InterfaceC1070k[] interfaceC1070kArr = new InterfaceC1070k[4];
        interfaceC1070kArr[0] = C1011d.m2805a("Dalvik", System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29 ? new C1060a() : null;
        C1065f.a aVar = C1065f.f5635c;
        interfaceC1070kArr[1] = new C1069j(C1065f.f5634b);
        interfaceC1070kArr[2] = new C1069j(C1068i.f5639a);
        interfaceC1070kArr[3] = new C1069j(C1066g.f5637a);
        List listM2796c = C0999e.m2796c(interfaceC1070kArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) listM2796c).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((InterfaceC1070k) next).mo2858a()) {
                arrayList.add(next);
            }
        }
    }

    @Override // p168e.p169q.p174g.C1059h
    /* renamed from: a */
    public AbstractC1075c mo2850a(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        C1011d.m2809e(x509TrustManager, "trustManager");
        C1011d.m2809e(x509TrustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        C1061b c1061b = x509TrustManagerExtensions != null ? new C1061b(x509TrustManager, x509TrustManagerExtensions) : null;
        return c1061b != null ? c1061b : super.mo2850a(x509TrustManager);
    }
}
