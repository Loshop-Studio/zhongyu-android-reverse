package okhttp3;

import android.support.v4.media.AbstractC0037f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.collections.AbstractC5805t;
import p060f6.C5534a;
import p139p7.AbstractC6396c;

/* renamed from: okhttp3.l */
/* loaded from: classes4.dex */
public final class C6320l {

    /* renamed from: e */
    public static final C6320l f10234e;

    /* renamed from: f */
    public static final C6320l f10235f;

    /* renamed from: a */
    public final boolean f10236a;

    /* renamed from: b */
    public final boolean f10237b;

    /* renamed from: c */
    public final String[] f10238c;

    /* renamed from: d */
    public final String[] f10239d;

    static {
        C6316j c6316j = C6316j.f10218r;
        C6316j c6316j2 = C6316j.f10219s;
        C6316j c6316j3 = C6316j.f10220t;
        C6316j c6316j4 = C6316j.f10212l;
        C6316j c6316j5 = C6316j.f10214n;
        C6316j c6316j6 = C6316j.f10213m;
        C6316j c6316j7 = C6316j.f10215o;
        C6316j c6316j8 = C6316j.f10217q;
        C6316j c6316j9 = C6316j.f10216p;
        C6316j[] c6316jArr = {c6316j, c6316j2, c6316j3, c6316j4, c6316j5, c6316j6, c6316j7, c6316j8, c6316j9};
        C6316j[] c6316jArr2 = {c6316j, c6316j2, c6316j3, c6316j4, c6316j5, c6316j6, c6316j7, c6316j8, c6316j9, C6316j.f10210j, C6316j.f10211k, C6316j.f10208h, C6316j.f10209i, C6316j.f10206f, C6316j.f10207g, C6316j.f10205e};
        C6318k c6318k = new C6318k();
        c6318k.m5941c((C6316j[]) Arrays.copyOf(c6316jArr, 9));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        c6318k.m5943e(tlsVersion, tlsVersion2);
        if (!c6318k.f10226a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c6318k.f10229d = true;
        c6318k.m5939a();
        C6318k c6318k2 = new C6318k();
        c6318k2.m5941c((C6316j[]) Arrays.copyOf(c6316jArr2, 16));
        c6318k2.m5943e(tlsVersion, tlsVersion2);
        if (!c6318k2.f10226a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c6318k2.f10229d = true;
        f10234e = c6318k2.m5939a();
        C6318k c6318k3 = new C6318k();
        c6318k3.m5941c((C6316j[]) Arrays.copyOf(c6316jArr2, 16));
        c6318k3.m5943e(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
        if (!c6318k3.f10226a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c6318k3.f10229d = true;
        c6318k3.m5939a();
        f10235f = new C6320l(false, false, null, null);
    }

    public C6320l(boolean z8, boolean z9, String[] strArr, String[] strArr2) {
        this.f10236a = z8;
        this.f10237b = z9;
        this.f10238c = strArr;
        this.f10239d = strArr2;
    }

    /* renamed from: a */
    public final List m5944a() {
        String[] strArr = this.f10238c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C6316j.f10202b.m5882c(str));
        }
        return AbstractC5805t.m5217D0(arrayList);
    }

    /* renamed from: b */
    public final boolean m5945b(SSLSocket sSLSocket) {
        if (!this.f10236a) {
            return false;
        }
        String[] strArr = this.f10239d;
        if (strArr != null && !AbstractC6396c.m6048h(strArr, sSLSocket.getEnabledProtocols(), C5534a.f8575b)) {
            return false;
        }
        String[] strArr2 = this.f10238c;
        return strArr2 == null || AbstractC6396c.m6048h(strArr2, sSLSocket.getEnabledCipherSuites(), C6316j.f10203c);
    }

    /* renamed from: c */
    public final List m5946c() {
        String[] strArr = this.f10239d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            TlsVersion.Companion.getClass();
            arrayList.add(C6327o0.m5960a(str));
        }
        return AbstractC5805t.m5217D0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6320l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C6320l c6320l = (C6320l) obj;
        boolean z8 = c6320l.f10236a;
        boolean z9 = this.f10236a;
        if (z9 != z8) {
            return false;
        }
        if (z9) {
            return Arrays.equals(this.f10238c, c6320l.f10238c) && Arrays.equals(this.f10239d, c6320l.f10239d) && this.f10237b == c6320l.f10237b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f10236a) {
            return 17;
        }
        String[] strArr = this.f10238c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f10239d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f10237b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f10236a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(m5944a(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(m5946c(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return AbstractC0037f.m93r(sb, this.f10237b, ')');
    }
}
