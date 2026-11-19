package p185v7;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import io.reactivex.internal.operators.observable.C5707c;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.internal.AbstractC5830k;
import p083i6.C5683c;
import p194w7.C6724b;
import p194w7.C6728f;
import p194w7.C6730h;
import p194w7.C6732j;
import p194w7.C6734l;
import p194w7.C6736n;
import p194w7.InterfaceC6735m;
import p204y1.AbstractC6768a;
import p215z7.C6839a;
import p215z7.InterfaceC6842d;

/* renamed from: v7.c */
/* loaded from: classes4.dex */
public final class C6674c extends C6685n {

    /* renamed from: e */
    public static final boolean f11257e;

    /* renamed from: c */
    public final ArrayList f11258c;

    /* renamed from: d */
    public final C5683c f11259d;

    static {
        boolean z8 = false;
        if (C5707c.m5079n() && Build.VERSION.SDK_INT < 30) {
            z8 = true;
        }
        f11257e = z8;
    }

    public C6674c() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        C6736n c6736n;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            c6736n = new C6736n(cls);
        } catch (Exception e) {
            C6685n.f11276a.getClass();
            C6685n.m6380i("unable to load android socket classes", 5, e);
            c6736n = null;
        }
        int i = 0;
        ArrayList arrayListM5190Q = AbstractC5802q.m5190Q(new InterfaceC6735m[]{c6736n, new C6734l(C6728f.f11345f), new C6734l(C6732j.f11352a), new C6734l(C6730h.f11351a)});
        ArrayList arrayList = new ArrayList();
        int size = arrayListM5190Q.size();
        while (i < size) {
            Object obj = arrayListM5190Q.get(i);
            i++;
            if (((InterfaceC6735m) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f11258c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f11259d = new C5683c(method3, method2, method);
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
    /* renamed from: c */
    public final InterfaceC6842d mo6335c(X509TrustManager x509TrustManager) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new C6673b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo6335c(x509TrustManager);
        }
    }

    @Override // p185v7.C6685n
    /* renamed from: d */
    public final void mo6331d(SSLSocket sSLSocket, String str, List protocols) {
        Object obj;
        AbstractC5830k.m5330g(protocols, "protocols");
        ArrayList arrayList = this.f11258c;
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
    /* renamed from: e */
    public final void mo6336e(Socket socket, InetSocketAddress address, int i) throws IOException {
        AbstractC5830k.m5330g(address, "address");
        try {
            socket.connect(address, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e;
            }
            throw new IOException("Exception in connect", e);
        }
    }

    @Override // p185v7.C6685n
    /* renamed from: f */
    public final String mo6332f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f11258c;
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
    /* renamed from: g */
    public final Object mo6337g() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C5683c c5683c = this.f11259d;
        c5683c.getClass();
        Method method = c5683c.f8856a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                Method method2 = c5683c.f8857b;
                AbstractC5830k.m5327d(method2);
                method2.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // p185v7.C6685n
    /* renamed from: h */
    public final boolean mo6333h(String hostname) {
        AbstractC5830k.m5330g(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // p185v7.C6685n
    /* renamed from: j */
    public final void mo6338j(Object obj, String message) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC5830k.m5330g(message, "message");
        C5683c c5683c = this.f11259d;
        c5683c.getClass();
        if (obj != null) {
            try {
                Method method = c5683c.f8858c;
                AbstractC5830k.m5327d(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        C6685n.m6380i(message, 5, null);
    }
}
