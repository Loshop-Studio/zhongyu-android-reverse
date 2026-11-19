package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: okhttp3.k */
/* loaded from: classes4.dex */
public final class C6318k {

    /* renamed from: a */
    public boolean f10226a = true;

    /* renamed from: b */
    public String[] f10227b;

    /* renamed from: c */
    public String[] f10228c;

    /* renamed from: d */
    public boolean f10229d;

    /* renamed from: a */
    public final C6320l m5939a() {
        return new C6320l(this.f10226a, this.f10229d, this.f10227b, this.f10228c);
    }

    /* renamed from: b */
    public final void m5940b(String... cipherSuites) {
        AbstractC5830k.m5330g(cipherSuites, "cipherSuites");
        if (!this.f10226a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (cipherSuites.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f10227b = (String[]) cipherSuites.clone();
    }

    /* renamed from: c */
    public final void m5941c(C6316j... cipherSuites) {
        AbstractC5830k.m5330g(cipherSuites, "cipherSuites");
        if (!this.f10226a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(cipherSuites.length);
        for (C6316j c6316j : cipherSuites) {
            arrayList.add(c6316j.f10221a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        m5940b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: d */
    public final void m5942d(String... tlsVersions) {
        AbstractC5830k.m5330g(tlsVersions, "tlsVersions");
        if (!this.f10226a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (tlsVersions.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f10228c = (String[]) tlsVersions.clone();
    }

    /* renamed from: e */
    public final void m5943e(TlsVersion... tlsVersionArr) {
        if (!this.f10226a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(tlsVersionArr.length);
        for (TlsVersion tlsVersion : tlsVersionArr) {
            arrayList.add(tlsVersion.javaName());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        m5942d((String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
