package com.blankj.utilcode.util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.blankj.utilcode.util.p */
/* loaded from: classes3.dex */
public abstract class AbstractC4664p {
    /* renamed from: a */
    public static String m2345a(String str) {
        return m2346b(str, 4);
    }

    /* renamed from: b */
    public static String m2346b(String str, int i6) {
        try {
            int length = str.length();
            for (int i7 = 0; i7 < length; i7++) {
                char cCharAt = str.charAt(i7);
                if (cCharAt == '{') {
                    return new JSONObject(str).toString(i6);
                }
                if (cCharAt == '[') {
                    return new JSONArray(str).toString(i6);
                }
                if (!Character.isWhitespace(cCharAt)) {
                    return str;
                }
            }
            return str;
        } catch (JSONException e6) {
            e6.printStackTrace();
            return str;
        }
    }
}
