package com.umeng.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.utils.UMUtils;

/* renamed from: com.umeng.common.a */
/* loaded from: classes2.dex */
public class C3421a {

    /* renamed from: a */
    private static String f2392a = null;

    /* renamed from: b */
    private static final String f2393b = "umeng+";

    /* renamed from: c */
    private static final String f2394c = "ek__id";

    /* renamed from: d */
    private static final String f2395d = "ek_key";

    /* renamed from: e */
    private static String f2396e = "";

    /* renamed from: f */
    private static final String f2397f = "umeng_subprocess_info";

    /* renamed from: g */
    private static String f2398g = "";

    /* renamed from: h */
    private static C3421a f2399h;

    private C3421a() {
    }

    /* renamed from: a */
    public static C3421a m3377a() {
        if (f2399h == null) {
            synchronized (C3421a.class) {
                if (f2399h == null) {
                    f2399h = new C3421a();
                }
            }
        }
        return f2399h;
    }

    /* renamed from: c */
    private String m3378c(String str) {
        String string = "";
        try {
            String strSubstring = str.substring(1, 9);
            StringBuilder sb = new StringBuilder();
            for (int i4 = 0; i4 < strSubstring.length(); i4++) {
                char cCharAt = strSubstring.charAt(i4);
                if (!Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                } else if (Integer.parseInt(Character.toString(cCharAt)) == 0) {
                    sb.append(0);
                } else {
                    sb.append(10 - Integer.parseInt(Character.toString(cCharAt)));
                }
            }
            string = sb.toString();
            return string + new StringBuilder(string).reverse().toString();
        } catch (Throwable unused) {
            return string;
        }
    }

    /* renamed from: b */
    public String m3381b(String str) {
        String str2;
        String str3;
        try {
            return TextUtils.isEmpty(f2392a) ? str : new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f2392a.getBytes()));
        } catch (Exception unused) {
            UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败!");
            String str4 = null;
            if (TextUtils.isEmpty(f2396e)) {
                return null;
            }
            UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，换老秘钥重试");
            try {
                str3 = new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f2396e.getBytes()));
            } catch (Exception unused2) {
            }
            try {
                UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，换老秘钥重试成功。");
                return str3;
            } catch (Exception unused3) {
                str4 = str3;
                UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，换老秘钥重试失败。换子进程备份key重试。");
                try {
                    String str5 = new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f2398g.getBytes()));
                    try {
                        UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，子进程备份key重试成功。");
                        return str5;
                    } catch (Throwable unused4) {
                        str2 = str5;
                        UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，子进程备份key重试失败。");
                        return str2;
                    }
                } catch (Throwable unused5) {
                    str2 = str4;
                }
            }
        }
    }

    /* renamed from: a */
    public void m3380a(Context context) {
        try {
            if (TextUtils.isEmpty(f2392a)) {
                String multiProcessSP = UMUtils.getMultiProcessSP(context, f2394c);
                if (!TextUtils.isEmpty(multiProcessSP)) {
                    f2396e = m3378c(multiProcessSP);
                    UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>>> primaryKey: " + f2396e);
                }
                SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f2397f, 0);
                if (sharedPreferences != null) {
                    f2398g = sharedPreferences.getString(f2394c, null);
                    UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> 子进程备份秘钥：主进程key: " + f2398g);
                }
                f2392a = m3378c(UMUtils.genId());
                UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>>> 正式秘钥：key: " + f2392a);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public String m3379a(String str) {
        try {
            return TextUtils.isEmpty(f2392a) ? str : Base64.encodeToString(DataHelper.encrypt(str.getBytes(), f2392a.getBytes()), 0);
        } catch (Exception unused) {
            return null;
        }
    }
}
