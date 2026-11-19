package com.alibaba.sdk.android.push.common.global;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public class MpsGlobalSetter {
    public static synchronized void setDebug(boolean z10) {
        C5653b.f4240g = z10;
    }

    public static synchronized void setMessageIntentService(Class<?> cls) {
        if (cls != null) {
            C5653b.f4236c = cls;
        }
    }

    public static synchronized void setNotificationId(int i10) {
        C5653b.f4239f = i10;
    }

    public static synchronized void setNotificationIntentRequestCode(int i10) {
        C5653b.f4238e = i10;
    }

    public static synchronized void setNotificationLargeIconBitmap(Bitmap bitmap) {
        C5653b.f4235b = bitmap;
    }

    public static synchronized void setNotificationSmallIconId(int i10) {
        C5653b.f4237d = i10;
    }

    public static synchronized void setNotificationSoundPath(String str) {
        if (str != null) {
            if (str.length() > 0) {
                C5653b.f4234a = str;
            }
        }
    }
}
