package com.blankj.utilcode.util;

import android.content.res.Resources;
import java.util.IllegalFormatException;

/* renamed from: com.blankj.utilcode.util.h0 */
/* loaded from: classes3.dex */
public abstract class AbstractC4649h0 {
    /* renamed from: a */
    public static String m2190a(String str, Object... objArr) {
        if (str != null && objArr != null && objArr.length > 0) {
            try {
                return String.format(str, objArr);
            } catch (IllegalFormatException e6) {
                e6.printStackTrace();
            }
        }
        return str;
    }

    /* renamed from: b */
    public static String m2191b(int i6) {
        return m2192c(i6, null);
    }

    /* renamed from: c */
    public static String m2192c(int i6, Object... objArr) {
        try {
            return m2190a(AbstractC4657l0.m2250a().getString(i6), objArr);
        } catch (Resources.NotFoundException e6) {
            e6.printStackTrace();
            return String.valueOf(i6);
        }
    }

    /* renamed from: d */
    public static boolean m2193d(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            if (!Character.isWhitespace(str.charAt(i6))) {
                return false;
            }
        }
        return true;
    }
}
