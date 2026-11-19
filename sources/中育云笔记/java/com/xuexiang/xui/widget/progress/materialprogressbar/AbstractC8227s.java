package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Path;
import android.view.animation.Interpolator;
import androidx.core.view.animation.PathInterpolatorCompat;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.s */
/* loaded from: classes5.dex */
public abstract class AbstractC8227s {

    /* renamed from: a */
    public static final Path f16859a;

    /* renamed from: b */
    public static final Interpolator f16860b;

    static {
        Path path = new Path();
        f16859a = path;
        path.lineTo(0.5f, 0.0f);
        path.cubicTo(0.7f, 0.0f, 0.6f, 1.0f, 1.0f, 1.0f);
        f16860b = PathInterpolatorCompat.create(path);
    }
}
