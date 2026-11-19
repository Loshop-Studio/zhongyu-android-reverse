package p135w0;

import android.view.View;
import androidx.core.view.MotionEventCompat;

/* renamed from: w0.a */
/* loaded from: classes2.dex */
public abstract class AbstractC4638a {
    /* renamed from: a */
    public static int m6459a(int i4) {
        return m6460b(i4);
    }

    /* renamed from: b */
    public static int m6460b(int i4) {
        return (i4 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
    }

    /* renamed from: c */
    public static void m6461c(View view, Runnable runnable) {
        m6462d(view, runnable);
    }

    /* renamed from: d */
    public static void m6462d(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }
}
