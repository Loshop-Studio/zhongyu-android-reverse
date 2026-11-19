package p083e2;

import android.view.View;
import androidx.core.view.MotionEventCompat;

/* renamed from: e2.a */
/* loaded from: classes4.dex */
public abstract class AbstractC8349a {
    /* renamed from: a */
    public static int m13591a(int i10) {
        return m13592b(i10);
    }

    /* renamed from: b */
    public static int m13592b(int i10) {
        return (i10 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
    }

    /* renamed from: c */
    public static void m13593c(View view, Runnable runnable) {
        m13594d(view, runnable);
    }

    /* renamed from: d */
    public static void m13594d(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }
}
