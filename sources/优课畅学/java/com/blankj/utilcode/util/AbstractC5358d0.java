package com.blankj.utilcode.util;

import android.content.res.Resources;
import java.util.IllegalFormatException;

/* renamed from: com.blankj.utilcode.util.d0 */
/* loaded from: classes3.dex */
public abstract class AbstractC5358d0 {
    /* renamed from: a */
    public static String m2441a(String str, Object... objArr) {
        if (str != null && objArr != null && objArr.length > 0) {
            try {
                return String.format(str, objArr);
            } catch (IllegalFormatException e10) {
                e10.printStackTrace();
            }
        }
        return str;
    }

    /* renamed from: b */
    public static String m2442b(int i10) {
        return m2443c(i10, null);
    }

    /* renamed from: c */
    public static String m2443c(int i10, Object... objArr) {
        try {
            return m2441a(AbstractC5366h0.m2478a().getString(i10), objArr);
        } catch (Resources.NotFoundException e10) {
            e10.printStackTrace();
            return String.valueOf(i10);
        }
    }

    /* renamed from: d */
    public static boolean m2444d(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isWhitespace(str.charAt(i10))) {
                return false;
            }
        }
        return true;
    }
}
