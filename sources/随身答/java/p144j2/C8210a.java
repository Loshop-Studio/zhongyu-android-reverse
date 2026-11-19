package p144j2;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import p176m2.AbstractC8959h;
import p270v2.AbstractC9753a;
import p310z2.AbstractC9993d;

/* renamed from: j2.a */
/* loaded from: classes4.dex */
public class C8210a {

    /* renamed from: a */
    public static String f14227a = null;

    /* renamed from: b */
    public static String f14228b = "";

    /* renamed from: c */
    public static String f14229c = "";

    /* renamed from: d */
    public static C8210a f14230d;

    /* renamed from: a */
    public static C8210a m13221a() {
        if (f14230d == null) {
            synchronized (C8210a.class) {
                try {
                    if (f14230d == null) {
                        f14230d = new C8210a();
                    }
                } finally {
                }
            }
        }
        return f14230d;
    }

    /* renamed from: b */
    public String m13222b(String str) {
        try {
            return TextUtils.isEmpty(f14227a) ? str : Base64.encodeToString(AbstractC9753a.m16340f(str.getBytes(), f14227a.getBytes()), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public void m13223c(Context context) {
        try {
            if (TextUtils.isEmpty(f14227a)) {
                String strM17328m = AbstractC9993d.m17328m(context, "ek__id");
                if (!TextUtils.isEmpty(strM17328m)) {
                    f14228b = m13225e(strM17328m);
                    AbstractC8959h.m14292b("MobclickRT", "--->>>> primaryKey: " + f14228b);
                }
                SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("umeng_subprocess_info", 0);
                if (sharedPreferences != null) {
                    f14229c = sharedPreferences.getString("ek__id", null);
                    AbstractC8959h.m14292b("MobclickRT", "--->>> 子进程备份秘钥：主进程key: " + f14229c);
                }
                f14227a = m13225e(AbstractC9993d.m17318c());
                AbstractC8959h.m14292b("MobclickRT", "--->>>> 正式秘钥：key: " + f14227a);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    public String m13224d(String str) {
        String str2;
        try {
            return TextUtils.isEmpty(f14227a) ? str : new String(AbstractC9753a.m16339e(Base64.decode(str.getBytes(), 0), f14227a.getBytes()));
        } catch (Exception unused) {
            AbstractC8959h.m14292b("MobclickRT", "--->>> 子进程事件数据解密失败!");
            String str3 = null;
            if (TextUtils.isEmpty(f14228b)) {
                return null;
            }
            AbstractC8959h.m14292b("MobclickRT", "--->>> 子进程事件数据解密失败，换老秘钥重试");
            try {
                str2 = new String(AbstractC9753a.m16339e(Base64.decode(str.getBytes(), 0), f14228b.getBytes()));
            } catch (Exception unused2) {
            }
            try {
                AbstractC8959h.m14292b("MobclickRT", "--->>> 子进程事件数据解密失败，换老秘钥重试成功。");
                return str2;
            } catch (Exception unused3) {
                str3 = str2;
                AbstractC8959h.m14292b("MobclickRT", "--->>> 子进程事件数据解密失败，换老秘钥重试失败。换子进程备份key重试。");
                try {
                    String str4 = new String(AbstractC9753a.m16339e(Base64.decode(str.getBytes(), 0), f14229c.getBytes()));
                    try {
                        AbstractC8959h.m14292b("MobclickRT", "--->>> 子进程事件数据解密失败，子进程备份key重试成功。");
                        return str4;
                    } catch (Throwable unused4) {
                        str3 = str4;
                        AbstractC8959h.m14292b("MobclickRT", "--->>> 子进程事件数据解密失败，子进程备份key重试失败。");
                        return str3;
                    }
                } catch (Throwable unused5) {
                }
            }
        }
    }

    /* renamed from: e */
    public final String m13225e(String str) {
        String string = "";
        try {
            String strSubstring = str.substring(1, 9);
            StringBuilder sb = new StringBuilder();
            for (int i9 = 0; i9 < strSubstring.length(); i9++) {
                char cCharAt = strSubstring.charAt(i9);
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
}
