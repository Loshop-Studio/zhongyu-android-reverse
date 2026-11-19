package com.p074ta.p075a.p076a;

import android.text.TextUtils;
import anet.channel.request.Request;
import com.p074ta.p075a.p078c.C7584e;
import com.p074ta.p075a.p078c.C7585f;
import com.p074ta.utdid2.p079a.p080a.C7586a;

/* renamed from: com.ta.a.a.b */
/* loaded from: classes5.dex */
public class C7571b {
    /* renamed from: b */
    public static String m9764b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new String(C7586a.encode(C7584e.m9791b(str.getBytes()), 2), Request.DEFAULT_CHARSET);
        } catch (Exception e10) {
            C7585f.m9795a("", e10, new Object[0]);
            return "";
        }
    }
}
