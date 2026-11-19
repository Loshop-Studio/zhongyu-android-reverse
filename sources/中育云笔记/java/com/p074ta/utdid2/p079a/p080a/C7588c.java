package com.p074ta.utdid2.p079a.p080a;

import android.content.Context;
import android.text.TextUtils;
import java.util.Random;

/* renamed from: com.ta.utdid2.a.a.c */
/* loaded from: classes5.dex */
public class C7588c {
    /* renamed from: b */
    public static String m9803b(Context context) {
        String strM9805i = C7589d.m9809b(null) ? m9805i() : null;
        return C7589d.m9809b(strM9805i) ? m9804h() : strM9805i;
    }

    /* renamed from: h */
    public static String m9804h() {
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int iNanoTime = (int) System.nanoTime();
        int iNextInt = new Random().nextInt();
        int iNextInt2 = new Random().nextInt();
        byte[] bytes = C7587b.getBytes(iCurrentTimeMillis);
        byte[] bytes2 = C7587b.getBytes(iNanoTime);
        byte[] bytes3 = C7587b.getBytes(iNextInt);
        byte[] bytes4 = C7587b.getBytes(iNextInt2);
        byte[] bArr = new byte[16];
        System.arraycopy(bytes, 0, bArr, 0, 4);
        System.arraycopy(bytes2, 0, bArr, 4, 4);
        System.arraycopy(bytes3, 0, bArr, 8, 4);
        System.arraycopy(bytes4, 0, bArr, 12, 4);
        return C7586a.encodeToString(bArr, 2);
    }

    /* renamed from: i */
    private static String m9805i() throws ClassNotFoundException {
        String str = C7590e.get("ro.aliyun.clouduuid", "");
        if (TextUtils.isEmpty(str)) {
            str = C7590e.get("ro.sys.aliyun.clouduuid", "");
        }
        return TextUtils.isEmpty(str) ? m9806j() : str;
    }

    /* renamed from: j */
    private static String m9806j() {
        try {
            return (String) Class.forName("com.yunos.baseservice.clouduuid.CloudUUID").getMethod("getCloudUUID", null).invoke(null, null);
        } catch (Exception unused) {
            return "";
        }
    }
}
