package p124e0;

import android.app.ActivityManager;
import android.content.Context;

/* renamed from: e0.h */
/* loaded from: classes3.dex */
public abstract class AbstractC9068h {
    /* renamed from: a */
    public static boolean m17854a(Context context) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        try {
            runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
        } catch (Exception unused) {
        }
        return runningAppProcessInfo.importance == 100;
    }
}
