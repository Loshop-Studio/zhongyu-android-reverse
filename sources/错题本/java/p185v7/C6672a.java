package p185v7;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import io.reactivex.internal.operators.observable.C5707c;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.internal.AbstractC5830k;
import p194w7.C6723a;
import p194w7.C6724b;
import p194w7.C6728f;
import p194w7.C6730h;
import p194w7.C6732j;
import p194w7.C6734l;
import p194w7.InterfaceC6735m;
import p204y1.AbstractC6768a;
import p215z7.C6839a;

/* renamed from: v7.a */
/* loaded from: classes4.dex */
public final class C6672a extends C6685n {

    /* renamed from: d */
    public static final boolean f11253d;

    /* renamed from: c */
    public final ArrayList f11254c;

    static {
        f11253d = C5707c.m5079n() && Build.VERSION.SDK_INT >= 29;
    }

    public C6672a() {
        int i = 0;
        ArrayList arrayListM5190Q = AbstractC5802q.m5190Q(new InterfaceC6735m[]{(!C5707c.m5079n() || Build.VERSION.SDK_INT < 29) ? null : new C6723a(), new C6734l(C6728f.f11345f), new C6734l(C6732j.f11352a), new C6734l(C6730h.f11351a)});
        ArrayList arrayList = new ArrayList();
        int size = arrayListM5190Q.size();
        while (i < size) {
            Object obj = arrayListM5190Q.get(i);
            i++;
            if (((InterfaceC6735m) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f11254c = arrayList;
    }

    @Override // p185v7.C6685n
    /* renamed from: b */
    public final AbstractC6768a mo6330b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        C6724b c6724b = x509TrustManagerExtensions != null ? new C6724b(x509TrustManager, x509TrustManagerExtensions) : null;
        return c6724b != null ? c6724b : new C6839a(mo6335c(x509TrustManager));
    }

    @Override // p185v7.C6685n
    /* renamed from: d */
    public final void mo6331d(SSLSocket sSLSocket, String str, List protocols) {
        Object obj;
        AbstractC5830k.m5330g(protocols, "protocols");
        ArrayList arrayList = this.f11254c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((InterfaceC6735m) obj).mo6410a(sSLSocket)) {
                break;
            }
        }
        InterfaceC6735m interfaceC6735m = (InterfaceC6735m) obj;
        if (interfaceC6735m != null) {
            interfaceC6735m.mo6412c(sSLSocket, str, protocols);
        }
    }

    @Override // p185v7.C6685n
    /* renamed from: f */
    public final String mo6332f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f11254c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((InterfaceC6735m) obj).mo6410a(sSLSocket)) {
                break;
            }
        }
        InterfaceC6735m interfaceC6735m = (InterfaceC6735m) obj;
        if (interfaceC6735m != null) {
            return interfaceC6735m.mo6411b(sSLSocket);
        }
        return null;
    }

    @Override // p185v7.C6685n
    /* renamed from: h */
    public final boolean mo6333h(String hostname) {
        AbstractC5830k.m5330g(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
