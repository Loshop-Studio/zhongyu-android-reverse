package com.tencent.liteav.network.p051a;

/* renamed from: com.tencent.liteav.network.a.d */
/* loaded from: classes4.dex */
public final class C6637d {

    /* renamed from: a */
    public static final C6637d f5781a = new C6637d(a.NO_NETWORK, 0);

    /* renamed from: b */
    public static final C6637d f5782b = new C6637d(a.WIFI, 0);

    /* renamed from: c */
    public final int f5783c;

    /* renamed from: d */
    public final a f5784d;

    /* renamed from: com.tencent.liteav.network.a.d$a */
    public enum a {
        NO_NETWORK,
        WIFI,
        MOBILE
    }

    public C6637d(a aVar, int i10) {
        this.f5784d = aVar;
        this.f5783c = i10;
    }
}
