package com.huawei.hms.framework.common;

import android.util.Base64;
import com.huawei.secure.android.common.util.SafeBase64;

/* loaded from: classes5.dex */
public class SecurityBase64Utils {

    /* renamed from: a */
    public static volatile boolean f11652a = false;

    /* renamed from: a */
    public static boolean m8604a(String str) throws ClassNotFoundException {
        ClassLoader classLoader = SecurityBase64Utils.class.getClassLoader();
        if (classLoader == null) {
            return false;
        }
        try {
            classLoader.loadClass(str);
            synchronized (SecurityBase64Utils.class) {
                f11652a = true;
            }
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static byte[] decode(String str, int i10) {
        if (f11652a || m8604a("com.huawei.secure.android.common.util.SafeBase64")) {
            return SafeBase64.decode(str, i10);
        }
        try {
            return Base64.decode(str, i10);
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    public static String encodeToString(byte[] bArr, int i10) {
        if (f11652a || m8604a("com.huawei.secure.android.common.util.SafeBase64")) {
            return SafeBase64.encodeToString(bArr, i10);
        }
        try {
            return Base64.encodeToString(bArr, i10);
        } catch (Exception unused) {
            return null;
        }
    }
}
