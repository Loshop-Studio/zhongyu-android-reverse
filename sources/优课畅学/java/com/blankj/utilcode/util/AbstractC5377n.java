package com.blankj.utilcode.util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.blankj.utilcode.util.n */
/* loaded from: classes3.dex */
public abstract class AbstractC5377n {
    /* renamed from: a */
    public static String m2587a(String str) {
        return m2588b(str, 4);
    }

    /* renamed from: b */
    public static String m2588b(String str, int i10) {
        try {
            int length = str.length();
            for (int i11 = 0; i11 < length; i11++) {
                char cCharAt = str.charAt(i11);
                if (cCharAt == '{') {
                    return new JSONObject(str).toString(i10);
                }
                if (cCharAt == '[') {
                    return new JSONArray(str).toString(i10);
                }
                if (!Character.isWhitespace(cCharAt)) {
                    return str;
                }
            }
            return str;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return str;
        }
    }
}
