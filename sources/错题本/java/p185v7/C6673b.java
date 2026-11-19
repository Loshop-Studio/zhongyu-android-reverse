package p185v7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC5830k;
import p215z7.InterfaceC6842d;

/* renamed from: v7.b */
/* loaded from: classes4.dex */
public final class C6673b implements InterfaceC6842d {

    /* renamed from: a */
    public final X509TrustManager f11255a;

    /* renamed from: b */
    public final Method f11256b;

    public C6673b(X509TrustManager x509TrustManager, Method method) {
        this.f11255a = x509TrustManager;
        this.f11256b = method;
    }

    @Override // p215z7.InterfaceC6842d
    /* renamed from: a */
    public final X509Certificate mo6334a(X509Certificate x509Certificate) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objInvoke = this.f11256b.invoke(this.f11255a, x509Certificate);
            AbstractC5830k.m5328e(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) objInvoke).getTrustedCert();
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6673b)) {
            return false;
        }
        C6673b c6673b = (C6673b) obj;
        return AbstractC5830k.m5325b(this.f11255a, c6673b.f11255a) && AbstractC5830k.m5325b(this.f11256b, c6673b.f11256b);
    }

    public final int hashCode() {
        return this.f11256b.hashCode() + (this.f11255a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f11255a + ", findByIssuerAndSignatureMethod=" + this.f11256b + ')';
    }
}
