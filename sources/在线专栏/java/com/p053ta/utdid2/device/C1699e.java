package com.p053ta.utdid2.device;

import com.p053ta.p054a.p056b.C1675a;
import com.p053ta.p054a.p057c.C1688f;

/* renamed from: com.ta.utdid2.device.e */
/* loaded from: classes.dex */
public class C1699e {
    /* renamed from: a */
    public static boolean m5809a(C1675a c1675a) {
        String str = "";
        try {
            str = new String(c1675a.data, "UTF-8");
        } catch (Exception e4) {
            C1688f.m5770a("", e4);
        }
        if (C1675a.m5739a(str, c1675a.f7432a)) {
            return C1696b.m5794a(C1696b.m5793a(str).f7471d);
        }
        return false;
    }
}
