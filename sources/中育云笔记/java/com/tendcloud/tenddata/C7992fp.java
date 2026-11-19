package com.tendcloud.tenddata;

import com.taobao.accs.utl.UtilityImpl;

/* renamed from: com.tendcloud.tenddata.fp */
/* loaded from: classes5.dex */
public class C7992fp extends AbstractC7987fk {

    /* renamed from: a */
    public static C7991fo f14962a = null;

    /* renamed from: c */
    private static final String f14963c = "type";

    /* renamed from: d */
    private static final String f14964d = "deviceId";

    /* renamed from: e */
    private static final String f14965e = "runtimeConfig";

    /* renamed from: f */
    private static final String f14966f = "hardwareConfig";

    /* renamed from: g */
    private static final String f14967g = "softwareConfig";

    /* renamed from: h */
    private C7993fq f14968h = new C7993fq();

    /* renamed from: i */
    private C7990fn f14969i = new C7990fn();

    public C7992fp() {
        m11989d();
    }

    /* renamed from: d */
    private void m11989d() {
        m11979a("type", UtilityImpl.NET_TYPE_MOBILE);
        C7991fo c7991fo = new C7991fo();
        f14962a = c7991fo;
        m11979a("deviceId", c7991fo.mo11973b());
        m11979a(f14965e, new C7995fs().mo11973b());
        m11979a(f14966f, this.f14969i.mo11973b());
        m11979a(f14967g, this.f14968h.mo11973b());
    }

    /* renamed from: a */
    public C7993fq m11990a() {
        return this.f14968h;
    }

    /* renamed from: c */
    public C7990fn m11991c() {
        return this.f14969i;
    }
}
