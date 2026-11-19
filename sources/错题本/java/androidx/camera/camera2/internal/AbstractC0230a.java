package androidx.camera.camera2.internal;

import android.graphics.Insets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.animation.Interpolator;

/* renamed from: androidx.camera.camera2.internal.a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0230a {
    /* renamed from: f */
    public static /* synthetic */ WindowInsetsAnimation.Bounds m446f(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    /* renamed from: g */
    public static /* synthetic */ WindowInsetsAnimation m447g(int i, Interpolator interpolator, long j7) {
        return new WindowInsetsAnimation(i, interpolator, j7);
    }

    /* renamed from: h */
    public static /* bridge */ /* synthetic */ WindowInsetsAnimationControlListener m448h(Object obj) {
        return (WindowInsetsAnimationControlListener) obj;
    }

    /* renamed from: i */
    public static /* bridge */ /* synthetic */ WindowInsetsAnimationController m449i(Object obj) {
        return (WindowInsetsAnimationController) obj;
    }
}
