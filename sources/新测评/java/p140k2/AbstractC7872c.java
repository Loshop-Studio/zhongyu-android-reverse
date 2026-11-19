package p140k2;

import android.os.Build;

/* renamed from: k2.c */
/* loaded from: classes4.dex */
public abstract class AbstractC7872c {
    /* renamed from: a */
    public static boolean m13400a() {
        if (Build.VERSION.SDK_INT < 29) {
            String str = Build.VERSION.CODENAME;
            if (str.length() != 1 || str.charAt(0) < 'Q' || str.charAt(0) > 'Z') {
                return false;
            }
        }
        return true;
    }
}
