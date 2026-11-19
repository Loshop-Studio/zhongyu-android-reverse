package com.tencent.bugly.crashreport.inner;

import com.tencent.bugly.proguard.C6436al;
import com.tencent.bugly.proguard.C6445au;
import java.util.Map;

/* loaded from: classes4.dex */
public class InnerApi {
    public static void postCocos2dxCrashAsync(int i10, String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            C6436al.m4289e("post cocos2d-x fail args null", new Object[0]);
        } else if (i10 != 5 && i10 != 6) {
            C6436al.m4289e("post cocos2d-x fail category illeagle: %d", Integer.valueOf(i10));
        } else {
            C6436al.m4283a("post cocos2d-x crash %s %s", str, str2);
            C6445au.m4427a(Thread.currentThread(), i10, str, str2, str3, null);
        }
    }

    public static void postH5CrashAsync(Thread thread, String str, String str2, String str3, Map<String, String> map) {
        if (str == null || str2 == null || str3 == null) {
            C6436al.m4289e("post h5 fail args null", new Object[0]);
        } else {
            C6436al.m4283a("post h5 crash %s %s", str, str2);
            C6445au.m4427a(thread, 8, str, str2, str3, map);
        }
    }

    public static void postU3dCrashAsync(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            C6436al.m4289e("post u3d fail args null", new Object[0]);
        }
        C6436al.m4283a("post u3d crash %s %s", str, str2);
        C6445au.m4427a(Thread.currentThread(), 4, str, str2, str3, null);
    }
}
