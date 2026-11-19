package com.canhub.cropper;

import android.graphics.Bitmap;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC5830k;
import okhttp3.C6300i;
import okhttp3.C6316j;
import okhttp3.C6318k;
import okhttp3.C6320l;
import p060f6.C5534a;
import p139p7.AbstractC6396c;

/* renamed from: com.canhub.cropper.f */
/* loaded from: classes2.dex */
public final class C3433f {

    /* renamed from: a */
    public int f2591a;

    /* renamed from: b */
    public boolean f2592b;

    /* renamed from: c */
    public boolean f2593c;

    /* renamed from: d */
    public final Object f2594d;

    public C3433f(List connectionSpecs) {
        AbstractC5830k.m5330g(connectionSpecs, "connectionSpecs");
        this.f2594d = connectionSpecs;
    }

    /* renamed from: a */
    public C6320l m2463a(SSLSocket sSLSocket) throws UnknownServiceException {
        C6320l c6320l;
        int i;
        boolean z8;
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        int i8 = this.f2591a;
        List list = (List) this.f2594d;
        int size = list.size();
        while (true) {
            if (i8 >= size) {
                c6320l = null;
                break;
            }
            c6320l = (C6320l) list.get(i8);
            if (c6320l.m5945b(sSLSocket)) {
                this.f2591a = i8 + 1;
                break;
            }
            i8++;
        }
        if (c6320l == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f2593c);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            AbstractC5830k.m5327d(enabledProtocols);
            String string = Arrays.toString(enabledProtocols);
            AbstractC5830k.m5329f(string, "toString(this)");
            sb.append(string);
            throw new UnknownServiceException(sb.toString());
        }
        int i9 = this.f2591a;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i9 >= size2) {
                z8 = false;
                break;
            }
            if (((C6320l) list.get(i9)).m5945b(sSLSocket)) {
                z8 = true;
                break;
            }
            i9++;
        }
        this.f2592b = z8;
        boolean z9 = this.f2593c;
        String[] strArr = c6320l.f10239d;
        String[] strArr2 = c6320l.f10238c;
        if (strArr2 != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            AbstractC5830k.m5329f(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = AbstractC6396c.m6054n(enabledCipherSuites, strArr2, C6316j.f10203c);
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (strArr != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            AbstractC5830k.m5329f(enabledProtocols2, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = AbstractC6396c.m6054n(enabledProtocols2, strArr, C5534a.f8575b);
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        AbstractC5830k.m5329f(supportedCipherSuites, "supportedCipherSuites");
        C6300i c6300i = C6316j.f10203c;
        byte[] bArr = AbstractC6396c.f10486a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (c6300i.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z9 && i != -1) {
            AbstractC5830k.m5329f(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i];
            AbstractC5830k.m5329f(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] objArrCopyOf = Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length + 1);
            AbstractC5830k.m5329f(objArrCopyOf, "copyOf(this, newSize)");
            cipherSuitesIntersection = (String[]) objArrCopyOf;
            cipherSuitesIntersection[cipherSuitesIntersection.length - 1] = str;
        }
        C6318k c6318k = new C6318k();
        c6318k.f10226a = c6320l.f10236a;
        c6318k.f10227b = strArr2;
        c6318k.f10228c = strArr;
        c6318k.f10229d = c6320l.f10237b;
        AbstractC5830k.m5329f(cipherSuitesIntersection, "cipherSuitesIntersection");
        c6318k.m5940b((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        AbstractC5830k.m5329f(tlsVersionsIntersection, "tlsVersionsIntersection");
        c6318k.m5942d((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
        C6320l c6320lM5939a = c6318k.m5939a();
        if (c6320lM5939a.m5946c() != null) {
            sSLSocket.setEnabledProtocols(c6320lM5939a.f10239d);
        }
        if (c6320lM5939a.m5944a() != null) {
            sSLSocket.setEnabledCipherSuites(c6320lM5939a.f10238c);
        }
        return c6320l;
    }

    public C3433f(Bitmap bitmap, int i, boolean z8, boolean z9) {
        this.f2594d = bitmap;
        this.f2591a = i;
        this.f2592b = z8;
        this.f2593c = z9;
    }
}
