package com.umeng.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.utils.UMUtils;

/* renamed from: com.umeng.common.a */
/* loaded from: classes.dex */
public class C1937a {

    /* renamed from: a */
    private static String f8984a = null;

    /* renamed from: b */
    private static final String f8985b = "umeng+";

    /* renamed from: c */
    private static final String f8986c = "ek__id";

    /* renamed from: d */
    private static final String f8987d = "ek_key";

    /* renamed from: e */
    private static String f8988e = "";

    /* renamed from: f */
    private static final String f8989f = "umeng_subprocess_info";

    /* renamed from: g */
    private static String f8990g = "";

    /* renamed from: h */
    private static C1937a f8991h;

    private C1937a() {
    }

    /* renamed from: a */
    public static C1937a m7300a() {
        if (f8991h == null) {
            synchronized (C1937a.class) {
                if (f8991h == null) {
                    f8991h = new C1937a();
                }
            }
        }
        return f8991h;
    }

    /* renamed from: c */
    private String m7301c(String str) {
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
    public String m7304b(String str) {
        String str2;
        String str3 = null;
        try {
            if (!TextUtils.isEmpty(f8984a)) {
                str = new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f8984a.getBytes()));
            }
            return str;
        } catch (Exception unused) {
            UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败!");
            if (TextUtils.isEmpty(f8988e)) {
                return null;
            }
            UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，换老秘钥重试");
            try {
                str2 = new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f8988e.getBytes()));
            } catch (Exception unused2) {
            }
            try {
                UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，换老秘钥重试成功。");
                return str2;
            } catch (Exception unused3) {
                str3 = str2;
                UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，换老秘钥重试失败。换子进程备份key重试。");
                try {
                    String str4 = new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f8990g.getBytes()));
                    try {
                        UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，子进程备份key重试成功。");
                        return str4;
                    } catch (Throwable unused4) {
                        str3 = str4;
                        UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，子进程备份key重试失败。");
                        return str3;
                    }
                } catch (Throwable unused5) {
                }
            }
        }
    }

    /* renamed from: a */
    public void m7303a(Context context) {
        try {
            if (TextUtils.isEmpty(f8984a)) {
                String multiProcessSP = UMUtils.getMultiProcessSP(context, f8986c);
                if (!TextUtils.isEmpty(multiProcessSP)) {
                    f8988e = m7301c(multiProcessSP);
                    UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>>> primaryKey: " + f8988e);
                }
                SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f8989f, 0);
                if (sharedPreferences != null) {
                    f8990g = sharedPreferences.getString(f8986c, null);
                    UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>> 子进程备份秘钥：主进程key: " + f8990g);
                }
                f8984a = m7301c(UMUtils.genId());
                UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>>> 正式秘钥：key: " + f8984a);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public String m7302a(String str) {
        try {
            return TextUtils.isEmpty(f8984a) ? str : Base64.encodeToString(DataHelper.encrypt(str.getBytes(), f8984a.getBytes()), 0);
        } catch (Exception unused) {
            return null;
        }
    }
}
