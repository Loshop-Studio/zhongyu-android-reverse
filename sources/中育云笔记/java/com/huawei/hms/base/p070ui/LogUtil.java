package com.huawei.hms.base.p070ui;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public class LogUtil {

    /* renamed from: a */
    public static final Pattern f11437a = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    /* renamed from: a */
    public static String m8412a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i10 = 1;
        if (1 == length) {
            return String.valueOf('*');
        }
        StringBuilder sb2 = new StringBuilder(length);
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (f11437a.matcher(String.valueOf(cCharAt)).matches()) {
                if (i10 % 2 == 0) {
                    cCharAt = '*';
                }
                i10++;
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public static String m8413b(String str, boolean z10) {
        StringBuilder sb2 = new StringBuilder(512);
        if (!TextUtils.isEmpty(str)) {
            if (z10) {
                sb2.append(m8412a(str));
            } else {
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    /* renamed from: e */
    public static void m8415e(String str, String str2, boolean z10) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.e(str, m8413b(str2, z10));
    }

    /* renamed from: e */
    public static void m8414e(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.e(str, m8413b(str2, false));
    }
}
