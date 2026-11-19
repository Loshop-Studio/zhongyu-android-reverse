package com.tendcloud.tenddata;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.tendcloud.tenddata.ae */
/* loaded from: classes5.dex */
public class C7846ae {

    /* renamed from: a */
    private static List<C8018w> f14331a;

    /* renamed from: a */
    public static C8018w m11116a(View view, boolean z10) {
        if (view == null) {
            return null;
        }
        return C8017v.m12095a(view, f14331a, z10);
    }

    public static void addConfigFromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 0) {
                return;
            }
            if (f14331a == null) {
                f14331a = new ArrayList(jSONArray.length());
            }
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                C8018w c8018wM12111a = C8018w.m12111a(jSONArray.getJSONObject(i10));
                if (c8018wM12111a != null) {
                    f14331a.add(c8018wM12111a);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m11117a() {
        List<C8018w> list = f14331a;
        if (list != null) {
            list.clear();
        }
    }
}
