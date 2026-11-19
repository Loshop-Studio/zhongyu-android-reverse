package anet.channel.util;

import android.util.Base64;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: anet.channel.util.g */
/* loaded from: classes3.dex */
public class C5089g {

    /* renamed from: a */
    public static C5089g f2762a;

    /* renamed from: b */
    private final Proxy f2763b;

    /* renamed from: c */
    private final String f2764c;

    /* renamed from: d */
    private final String f2765d;

    public C5089g(String str, int i10, String str2, String str3) {
        this.f2763b = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str, i10));
        this.f2764c = str2;
        this.f2765d = str3;
    }

    /* renamed from: a */
    public static C5089g m2550a() {
        return f2762a;
    }

    /* renamed from: b */
    public Proxy m2551b() {
        return this.f2763b;
    }

    /* renamed from: c */
    public String m2552c() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f2764c);
        sb2.append(":");
        sb2.append(this.f2765d);
        String strEncodeToString = Base64.encodeToString(sb2.toString().getBytes(), 0);
        StringBuilder sb3 = new StringBuilder(64);
        sb3.append("Basic ");
        sb3.append(strEncodeToString);
        return sb3.toString();
    }
}
