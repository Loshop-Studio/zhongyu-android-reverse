package com.p074ta.p075a.p077b;

import android.text.TextUtils;
import com.p074ta.p075a.p078c.C7581b;
import com.p074ta.p075a.p078c.C7585f;
import com.p074ta.utdid2.p079a.p080a.C7586a;

/* renamed from: com.ta.a.b.a */
/* loaded from: classes5.dex */
public class C7572a {

    /* renamed from: a */
    public int f12829a = -1;
    public long timestamp = 0;

    /* renamed from: a */
    public String f12830a = "";
    public byte[] data = null;

    /* renamed from: b */
    public long f12831b = 0;

    /* renamed from: a */
    public static boolean m9765a(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return false;
            }
            C7585f.m9799b("", "result", str, "signature", str2);
            if (str2.equals(C7586a.encodeToString(C7581b.m9784d(str).getBytes(), 2))) {
                C7585f.m9796a("", "signature is ok");
                return true;
            }
            C7585f.m9796a("", "signature is error");
            return false;
        } catch (Exception e10) {
            C7585f.m9796a("", e10);
            return false;
        }
    }
}
