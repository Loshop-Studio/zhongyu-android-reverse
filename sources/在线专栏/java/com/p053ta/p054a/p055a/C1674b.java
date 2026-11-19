package com.p053ta.p054a.p055a;

import android.text.TextUtils;
import com.p053ta.p054a.p057c.C1687e;
import com.p053ta.p054a.p057c.C1688f;
import com.p053ta.utdid2.p058a.p059a.C1689a;

/* renamed from: com.ta.a.a.b */
/* loaded from: classes.dex */
public class C1674b {
    /* renamed from: b */
    public static String m5738b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new String(C1689a.encode(C1687e.m5765b(str.getBytes()), 2), "UTF-8");
        } catch (Exception e4) {
            C1688f.m5769a("", e4, new Object[0]);
            return "";
        }
    }
}
