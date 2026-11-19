package com.p074ta.utdid2.device;

import anet.channel.request.Request;
import com.p074ta.p075a.p077b.C7572a;
import com.p074ta.p075a.p078c.C7585f;

/* renamed from: com.ta.utdid2.device.e */
/* loaded from: classes5.dex */
public class C7596e {
    /* renamed from: a */
    public static boolean m9835a(C7572a c7572a) {
        String str;
        try {
            str = new String(c7572a.data, Request.DEFAULT_CHARSET);
        } catch (Exception e10) {
            C7585f.m9796a("", e10);
            str = "";
        }
        if (C7572a.m9765a(str, c7572a.f12830a)) {
            return C7593b.m9820a(C7593b.m9819a(str).f12869d);
        }
        return false;
    }
}
