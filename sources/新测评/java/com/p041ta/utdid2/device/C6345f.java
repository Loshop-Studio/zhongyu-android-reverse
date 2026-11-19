package com.p041ta.utdid2.device;

import p118i2.C7653a;
import p129j2.AbstractC7788h;

/* renamed from: com.ta.utdid2.device.f */
/* loaded from: classes4.dex */
public class C6345f {
    /* renamed from: a */
    public static boolean m4521a(C7653a c7653a) {
        String str;
        try {
            str = new String(c7653a.f12908d, "UTF-8");
        } catch (Exception e10) {
            AbstractC7788h.m13179e("", e10);
            str = "";
        }
        if (C7653a.m12708a(str, c7653a.f12907c)) {
            return C6341b.m4503b(C6341b.m4502a(str).f4826e);
        }
        return false;
    }
}
