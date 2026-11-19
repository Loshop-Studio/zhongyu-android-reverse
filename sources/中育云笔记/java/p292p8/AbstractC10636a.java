package p292p8;

import android.view.View;
import androidx.core.view.MotionEventCompat;

/* renamed from: p8.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10636a {
    /* renamed from: a */
    public static int m22502a(int i10) {
        return m22503b(i10);
    }

    /* renamed from: b */
    public static int m22503b(int i10) {
        return (i10 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
    }

    /* renamed from: c */
    public static void m22504c(View view, Runnable runnable) {
        m22505d(view, runnable);
    }

    /* renamed from: d */
    public static void m22505d(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }
}
