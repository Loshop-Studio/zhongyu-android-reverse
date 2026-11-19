package p194w7;

import javax.net.ssl.SSLSocket;
import kotlin.text.AbstractC5862w;

/* renamed from: w7.e */
/* loaded from: classes4.dex */
public final class C6727e implements InterfaceC6733k {
    @Override // p194w7.InterfaceC6733k
    /* renamed from: a */
    public final boolean mo6414a(SSLSocket sSLSocket) {
        return AbstractC5862w.m5409C(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // p194w7.InterfaceC6733k
    /* renamed from: b */
    public final InterfaceC6735m mo6415b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new C6728f(superclass);
    }
}
