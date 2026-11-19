package com.alibaba.sdk.android.push.common.global;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class MpsGlobalSetter {
    public static synchronized void setDebug(boolean z3) {
        C1162b.f6716g = z3;
    }

    public static synchronized void setMessageIntentService(Class<?> cls) {
        if (cls != null) {
            C1162b.f6712c = cls;
        }
    }

    public static synchronized void setNotificationId(int i4) {
        C1162b.f6715f = i4;
    }

    public static synchronized void setNotificationIntentRequestCode(int i4) {
        C1162b.f6714e = i4;
    }

    public static synchronized void setNotificationLargeIconBitmap(Bitmap bitmap) {
        C1162b.f6711b = bitmap;
    }

    public static synchronized void setNotificationSmallIconId(int i4) {
        C1162b.f6713d = i4;
    }

    public static synchronized void setNotificationSoundPath(String str) {
        if (str != null) {
            if (str.length() > 0) {
                C1162b.f6710a = str;
            }
        }
    }
}
