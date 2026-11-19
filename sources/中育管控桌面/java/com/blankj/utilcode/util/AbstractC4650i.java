package com.blankj.utilcode.util;

import android.util.Base64;

/* renamed from: com.blankj.utilcode.util.i */
/* loaded from: classes3.dex */
public abstract class AbstractC4650i {
    /* renamed from: a */
    public static String m2194a(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? "" : Base64.encodeToString(bArr, 2);
    }
}
