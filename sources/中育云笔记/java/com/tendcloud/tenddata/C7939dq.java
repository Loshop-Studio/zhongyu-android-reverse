package com.tendcloud.tenddata;

import java.util.Map;

/* renamed from: com.tendcloud.tenddata.dq */
/* loaded from: classes5.dex */
public class C7939dq {

    /* renamed from: a */
    private static volatile C7939dq f14741a;

    static {
        try {
            C7913cr.m11625a().register(m11754a());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static C7939dq m11754a() {
        if (f14741a == null) {
            synchronized (C7939dq.class) {
                try {
                    if (f14741a == null) {
                        f14741a = new C7939dq();
                    }
                } finally {
                }
            }
        }
        return f14741a;
    }

    /* renamed from: b */
    public void m11755b() {
        try {
            C7910co.f14599a.execute(new Runnable() { // from class: com.tendcloud.tenddata.dq.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Map<String, Object> mapM11505C = C7903ch.m11505C(C7843ab.f14307g);
                        if (mapM11505C != null) {
                            C7961el c7961el = new C7961el();
                            c7961el.f14869b = "env";
                            c7961el.f14870c = "arp";
                            c7961el.f14871d = mapM11505C;
                            c7961el.f14868a = AbstractC7841a.ENV;
                            C7913cr.m11625a().post(c7961el);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public final void onTDEBEventCommonEnvironment(C7959ej c7959ej) {
        try {
            if (c7959ej.f14862a != 3) {
                return;
            }
            m11755b();
        } catch (Throwable unused) {
        }
    }
}
