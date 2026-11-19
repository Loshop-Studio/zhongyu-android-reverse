package com.tendcloud.tenddata;

import java.net.InetAddress;
import java.net.URL;
import java.util.HashMap;

/* renamed from: com.tendcloud.tenddata.cy */
/* loaded from: classes5.dex */
public final class C7920cy {

    /* renamed from: a */
    private static volatile HashMap<String, C7920cy> f14653a = new HashMap<>();

    /* renamed from: b */
    private static final String f14654b = "TD_IP_CACHE";

    /* renamed from: c */
    private String f14655c = null;

    /* renamed from: d */
    private String f14656d = null;

    /* renamed from: e */
    private String f14657e = null;

    /* renamed from: f */
    private String f14658f = null;

    /* renamed from: g */
    private String f14659g = null;

    /* renamed from: com.tendcloud.tenddata.cy$a */
    public static class a {
        static final int resolvedIp = 1;
        static final int savedIp = 3;
        static final int staticIp = 4;
        static final int successIp = 2;
    }

    /* renamed from: a */
    public static URL m11659a(URL url, String str) {
        return C7903ch.m11528b() ? url : new URL(url.getProtocol(), str, url.getPort(), url.getFile());
    }

    /* renamed from: b */
    public static synchronized void m11664b(String str, String str2) {
        if (!C7912cq.m11608b(str) && !f14653a.containsKey(str)) {
            if (f14653a == null) {
                return;
            }
            try {
                C7920cy c7920cy = new C7920cy();
                c7920cy.f14659g = str;
                c7920cy.f14655c = str2;
                c7920cy.f14657e = C7906ck.m11569b(C7843ab.f14307g, f14654b, C7912cq.m11618e(str), (String) null);
                c7920cy.f14656d = m11663b(c7920cy.f14659g);
                f14653a.put(c7920cy.f14659g, c7920cy);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m11660a(String str) {
        String strM11658a = m11658a(str, 1);
        if (strM11658a == null || strM11658a.equalsIgnoreCase(m11658a(str, 3)) || C7843ab.f14307g == null) {
            return;
        }
        C7906ck.m11567a(C7843ab.f14307g, f14654b, C7912cq.m11618e(str), m11658a(str, 1));
        m11662a(str, m11658a(str, 1), 3);
    }

    /* renamed from: a */
    public static void m11661a(String str, String str2) {
        if (C7843ab.f14307g != null) {
            C7906ck.m11567a(C7843ab.f14307g, f14654b, C7912cq.m11618e(str), str2);
            m11662a(str, str2, 2);
        }
    }

    /* renamed from: b */
    public static String m11663b(String str) {
        try {
            return InetAddress.getByName(str).getHostAddress();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static synchronized void m11662a(String str, String str2, int i10) {
        try {
            if (!C7912cq.m11608b(str) && f14653a.containsKey(str)) {
                if (f14653a == null) {
                    return;
                }
                C7920cy c7920cy = f14653a.get(str);
                if (i10 == 1) {
                    c7920cy.f14656d = str2;
                } else if (i10 == 2) {
                    c7920cy.f14658f = str2;
                } else if (i10 == 3) {
                    c7920cy.f14657e = str2;
                } else if (i10 == 4) {
                    c7920cy.f14655c = str2;
                }
            }
        } finally {
        }
    }

    /* renamed from: a */
    public static synchronized String m11658a(String str, int i10) {
        if (!C7912cq.m11608b(str) && f14653a.containsKey(str)) {
            if (f14653a == null) {
                return null;
            }
            C7920cy c7920cy = f14653a.get(str);
            if (c7920cy == null) {
                return null;
            }
            if (i10 == 1) {
                return c7920cy.f14656d;
            }
            if (i10 == 2) {
                return c7920cy.f14658f;
            }
            if (i10 == 3) {
                return c7920cy.f14657e;
            }
            if (i10 != 4) {
                return null;
            }
            return c7920cy.f14655c;
        }
        return null;
    }
}
