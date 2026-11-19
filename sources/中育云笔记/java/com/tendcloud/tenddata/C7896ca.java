package com.tendcloud.tenddata;

import android.util.Log;
import com.alibaba.android.arouter.utils.Consts;
import com.shuyu.gsyvideoplayer.video.base.GSYVideoView;

/* renamed from: com.tendcloud.tenddata.ca */
/* loaded from: classes5.dex */
public class C7896ca {

    /* renamed from: a */
    public static boolean f14478a = true;

    /* renamed from: a */
    public static void m11370a(String str, Throwable th) {
        if (f14478a) {
            m11369a(str, 4);
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    private static void m11371b(String str, int i10) {
        String strM11368a = m11368a();
        if (i10 == 4) {
            Log.i(strM11368a, str);
        } else if (i10 == 5) {
            Log.w(strM11368a, str);
        } else {
            if (i10 != 6) {
                return;
            }
            Log.e(strM11368a, str);
        }
    }

    public static void dForDeveloper(String str) {
        if (f14478a) {
            m11369a(str, 3);
        }
    }

    public static void dForInternal(String... strArr) {
    }

    public static void eForDeveloper(String str) {
        if (f14478a) {
            m11369a(str, 6);
        }
    }

    public static void eForInternal(Throwable th) {
    }

    public static void iForDeveloper(String str) {
        if (f14478a) {
            m11369a(str, 4);
        }
    }

    public static void iForInternal(String... strArr) {
    }

    public static void json(String str) {
    }

    public static void eForInternal(String... strArr) {
    }

    /* renamed from: a */
    private static void m11369a(String str, int i10) {
        if (str == null) {
            return;
        }
        try {
            int length = str.length();
            int i11 = GSYVideoView.CHANGE_DELAY_TIME;
            int i12 = 0;
            int i13 = 0;
            while (i12 < 100) {
                if (length > i11) {
                    m11371b(str.substring(i13, i11), i10);
                    i12++;
                    i13 = i11;
                    i11 += GSYVideoView.CHANGE_DELAY_TIME;
                } else {
                    m11371b(str.substring(i13, length), i10);
                    return;
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* renamed from: a */
    private static synchronized String m11368a() {
        try {
            new Exception().getStackTrace()[4].getClassName().lastIndexOf(Consts.DOT);
        } catch (Throwable unused) {
            return C7843ab.f14321u;
        }
        return C7843ab.f14321u;
    }
}
