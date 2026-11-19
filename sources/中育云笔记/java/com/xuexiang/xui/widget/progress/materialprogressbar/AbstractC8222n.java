package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Path;
import android.view.animation.Interpolator;
import androidx.core.view.animation.PathInterpolatorCompat;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.n */
/* loaded from: classes5.dex */
public abstract class AbstractC8222n {

    /* renamed from: a */
    public static final Path f16850a;

    /* renamed from: b */
    public static final Interpolator f16851b;

    static {
        Path path = new Path();
        f16850a = path;
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.2f, 0.0f);
        path.cubicTo(0.39583334f, 0.0f, 0.47484508f, 0.20679761f, 0.59166664f, 0.41708294f);
        path.cubicTo(0.715161f, 0.6393796f, 0.81625f, 0.9745569f, 1.0f, 1.0f);
        f16851b = PathInterpolatorCompat.create(path);
    }
}
