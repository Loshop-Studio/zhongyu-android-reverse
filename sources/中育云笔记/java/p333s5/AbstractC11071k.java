package p333s5;

import android.text.TextUtils;

/* renamed from: s5.k */
/* loaded from: classes5.dex */
public abstract class AbstractC11071k {
    /* renamed from: a */
    public static boolean m24564a(String... strArr) {
        for (String str : strArr) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
        }
        return true;
    }
}
