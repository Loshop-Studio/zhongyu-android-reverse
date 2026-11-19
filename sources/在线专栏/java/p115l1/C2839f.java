package p115l1;

import android.app.ActivityManager;
import android.content.Context;

/* renamed from: l1.f */
/* loaded from: classes.dex */
public class C2839f {
    /* renamed from: a */
    public static boolean m9534a(Context context) {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance == 100;
        } catch (Exception unused) {
            return false;
        }
    }
}
