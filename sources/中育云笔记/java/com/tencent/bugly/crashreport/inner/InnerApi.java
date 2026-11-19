package com.tencent.bugly.crashreport.inner;

import com.tencent.bugly.proguard.C7779al;
import com.tencent.bugly.proguard.C7788au;
import java.util.Map;

/* loaded from: classes5.dex */
public class InnerApi {
    public static void postCocos2dxCrashAsync(int i10, String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            C7779al.m10619e("post cocos2d-x fail args null", new Object[0]);
        } else if (i10 != 5 && i10 != 6) {
            C7779al.m10619e("post cocos2d-x fail category illeagle: %d", Integer.valueOf(i10));
        } else {
            C7779al.m10613a("post cocos2d-x crash %s %s", str, str2);
            C7788au.m10757a(Thread.currentThread(), i10, str, str2, str3, null);
        }
    }

    public static void postH5CrashAsync(Thread thread, String str, String str2, String str3, Map<String, String> map) {
        if (str == null || str2 == null || str3 == null) {
            C7779al.m10619e("post h5 fail args null", new Object[0]);
        } else {
            C7779al.m10613a("post h5 crash %s %s", str, str2);
            C7788au.m10757a(thread, 8, str, str2, str3, map);
        }
    }

    public static void postU3dCrashAsync(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            C7779al.m10619e("post u3d fail args null", new Object[0]);
        }
        C7779al.m10613a("post u3d crash %s %s", str, str2);
        C7788au.m10757a(Thread.currentThread(), 4, str, str2, str3, null);
    }
}
