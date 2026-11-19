package com.tencent.bugly.crashreport.inner;

import com.tencent.bugly.proguard.C6674al;
import com.tencent.bugly.proguard.C6683au;
import java.util.Map;

/* loaded from: classes4.dex */
public class InnerApi {
    public static void postCocos2dxCrashAsync(int i9, String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            C6674al.m5108e("post cocos2d-x fail args null", new Object[0]);
        } else if (i9 != 5 && i9 != 6) {
            C6674al.m5108e("post cocos2d-x fail category illeagle: %d", Integer.valueOf(i9));
        } else {
            C6674al.m5102a("post cocos2d-x crash %s %s", str, str2);
            C6683au.m5246a(Thread.currentThread(), i9, str, str2, str3, null);
        }
    }

    public static void postH5CrashAsync(Thread thread, String str, String str2, String str3, Map<String, String> map) {
        if (str == null || str2 == null || str3 == null) {
            C6674al.m5108e("post h5 fail args null", new Object[0]);
        } else {
            C6674al.m5102a("post h5 crash %s %s", str, str2);
            C6683au.m5246a(thread, 8, str, str2, str3, map);
        }
    }

    public static void postU3dCrashAsync(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            C6674al.m5108e("post u3d fail args null", new Object[0]);
        }
        C6674al.m5102a("post u3d crash %s %s", str, str2);
        C6683au.m5246a(Thread.currentThread(), 4, str, str2, str3, null);
    }
}
