package com.p053ta.utdid2.p058a.p059a;

import android.content.Context;
import android.text.TextUtils;
import java.util.Random;

/* renamed from: com.ta.utdid2.a.a.c */
/* loaded from: classes.dex */
public class C1691c {
    /* renamed from: b */
    public static String m5777b(Context context) {
        String strM5779i = C1692d.m5783b(null) ? m5779i() : null;
        return C1692d.m5783b(strM5779i) ? m5778h() : strM5779i;
    }

    /* renamed from: h */
    public static String m5778h() {
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int iNanoTime = (int) System.nanoTime();
        int iNextInt = new Random().nextInt();
        int iNextInt2 = new Random().nextInt();
        byte[] bytes = C1690b.getBytes(iCurrentTimeMillis);
        byte[] bytes2 = C1690b.getBytes(iNanoTime);
        byte[] bytes3 = C1690b.getBytes(iNextInt);
        byte[] bytes4 = C1690b.getBytes(iNextInt2);
        byte[] bArr = new byte[16];
        System.arraycopy(bytes, 0, bArr, 0, 4);
        System.arraycopy(bytes2, 0, bArr, 4, 4);
        System.arraycopy(bytes3, 0, bArr, 8, 4);
        System.arraycopy(bytes4, 0, bArr, 12, 4);
        return C1689a.encodeToString(bArr, 2);
    }

    /* renamed from: i */
    private static String m5779i() throws ClassNotFoundException {
        String str = C1693e.get("ro.aliyun.clouduuid", "");
        if (TextUtils.isEmpty(str)) {
            str = C1693e.get("ro.sys.aliyun.clouduuid", "");
        }
        return TextUtils.isEmpty(str) ? m5780j() : str;
    }

    /* renamed from: j */
    private static String m5780j() {
        try {
            return (String) Class.forName("com.yunos.baseservice.clouduuid.CloudUUID").getMethod("getCloudUUID", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return "";
        }
    }
}
