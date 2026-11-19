package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Path;
import android.view.animation.Interpolator;
import androidx.core.view.animation.PathInterpolatorCompat;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.s */
/* loaded from: classes3.dex */
public abstract class AbstractC5966s {

    /* renamed from: a */
    public static final Path f5434a;

    /* renamed from: b */
    public static final Interpolator f5435b;

    static {
        Path path = new Path();
        f5434a = path;
        path.lineTo(0.5f, 0.0f);
        path.cubicTo(0.7f, 0.0f, 0.6f, 1.0f, 1.0f, 1.0f);
        f5435b = PathInterpolatorCompat.create(path);
    }
}
