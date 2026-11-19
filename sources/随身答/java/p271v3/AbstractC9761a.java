package p271v3;

import android.view.View;
import androidx.core.view.MotionEventCompat;

/* renamed from: v3.a */
/* loaded from: classes4.dex */
public abstract class AbstractC9761a {
    /* renamed from: a */
    public static int m16445a(int i9) {
        return m16446b(i9);
    }

    /* renamed from: b */
    public static int m16446b(int i9) {
        return (i9 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
    }

    /* renamed from: c */
    public static void m16447c(View view, Runnable runnable) {
        m16448d(view, runnable);
    }

    /* renamed from: d */
    public static void m16448d(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }
}
