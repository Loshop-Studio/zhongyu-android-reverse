package com.tencent.bugly.crashreport.inner;

import com.tencent.bugly.proguard.C5791al;
import com.tencent.bugly.proguard.C5800au;
import java.util.Map;

/* loaded from: classes3.dex */
public class InnerApi {
    public static void postCocos2dxCrashAsync(int i6, String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            C5791al.m3934e("post cocos2d-x fail args null", new Object[0]);
        } else if (i6 != 5 && i6 != 6) {
            C5791al.m3934e("post cocos2d-x fail category illeagle: %d", Integer.valueOf(i6));
        } else {
            C5791al.m3928a("post cocos2d-x crash %s %s", str, str2);
            C5800au.m4072a(Thread.currentThread(), i6, str, str2, str3, null);
        }
    }

    public static void postH5CrashAsync(Thread thread, String str, String str2, String str3, Map<String, String> map) {
        if (str == null || str2 == null || str3 == null) {
            C5791al.m3934e("post h5 fail args null", new Object[0]);
        } else {
            C5791al.m3928a("post h5 crash %s %s", str, str2);
            C5800au.m4072a(thread, 8, str, str2, str3, map);
        }
    }

    public static void postU3dCrashAsync(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            C5791al.m3934e("post u3d fail args null", new Object[0]);
        }
        C5791al.m3928a("post u3d crash %s %s", str, str2);
        C5800au.m4072a(Thread.currentThread(), 4, str, str2, str3, null);
    }
}
