package com.p053ta.p054a.p056b;

import android.text.TextUtils;
import com.p053ta.p054a.p057c.C1684b;
import com.p053ta.p054a.p057c.C1688f;
import com.p053ta.utdid2.p058a.p059a.C1689a;

/* renamed from: com.ta.a.b.a */
/* loaded from: classes.dex */
public class C1675a {

    /* renamed from: a */
    public int f7431a = -1;
    public long timestamp = 0;

    /* renamed from: a */
    public String f7432a = "";
    public byte[] data = null;

    /* renamed from: b */
    public long f7433b = 0;

    /* renamed from: a */
    public static boolean m5739a(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                C1688f.m5773b("", "result", str, "signature", str2);
                if (str2.equals(C1689a.encodeToString(C1684b.m5758d(str).getBytes(), 2))) {
                    C1688f.m5770a("", "signature is ok");
                    return true;
                }
                C1688f.m5770a("", "signature is error");
            }
        } catch (Exception e4) {
            C1688f.m5770a("", e4);
        }
        return false;
    }
}
