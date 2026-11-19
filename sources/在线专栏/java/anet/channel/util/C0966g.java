package anet.channel.util;

import android.util.Base64;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: anet.channel.util.g */
/* loaded from: classes.dex */
public class C0966g {

    /* renamed from: a */
    public static C0966g f5484a;

    /* renamed from: b */
    private final Proxy f5485b;

    /* renamed from: c */
    private final String f5486c;

    /* renamed from: d */
    private final String f5487d;

    public C0966g(String str, int i4, String str2, String str3) {
        this.f5485b = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str, i4));
        this.f5486c = str2;
        this.f5487d = str3;
    }

    /* renamed from: a */
    public static C0966g m4659a() {
        return f5484a;
    }

    /* renamed from: b */
    public Proxy m4660b() {
        return this.f5485b;
    }

    /* renamed from: c */
    public String m4661c() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f5486c);
        sb.append(":");
        sb.append(this.f5487d);
        String strEncodeToString = Base64.encodeToString(sb.toString().getBytes(), 0);
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("Basic ");
        sb2.append(strEncodeToString);
        return sb2.toString();
    }
}
