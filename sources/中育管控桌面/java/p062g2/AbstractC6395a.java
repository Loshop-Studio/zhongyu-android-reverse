package p062g2;

import android.view.View;
import androidx.core.view.MotionEventCompat;

/* renamed from: g2.a */
/* loaded from: classes3.dex */
public abstract class AbstractC6395a {
    /* renamed from: a */
    public static int m6913a(int i6) {
        return m6914b(i6);
    }

    /* renamed from: b */
    public static int m6914b(int i6) {
        return (i6 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
    }

    /* renamed from: c */
    public static void m6915c(View view, Runnable runnable) {
        m6916d(view, runnable);
    }

    /* renamed from: d */
    public static void m6916d(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }
}
