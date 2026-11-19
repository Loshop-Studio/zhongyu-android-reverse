package p086f3;

import android.view.View;
import androidx.core.view.MotionEventCompat;

/* renamed from: f3.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7435a {
    /* renamed from: a */
    public static int m11987a(int i10) {
        return m11988b(i10);
    }

    /* renamed from: b */
    public static int m11988b(int i10) {
        return (i10 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
    }

    /* renamed from: c */
    public static void m11989c(View view, Runnable runnable) {
        m11990d(view, runnable);
    }

    /* renamed from: d */
    public static void m11990d(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }
}
