package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Path;
import android.view.animation.Interpolator;
import androidx.core.view.animation.PathInterpolatorCompat;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.r */
/* loaded from: classes2.dex */
public abstract class AbstractC3626r {

    /* renamed from: a */
    public static final Path f3911a;

    /* renamed from: b */
    public static final Interpolator f3912b;

    static {
        Path path = new Path();
        f3911a = path;
        path.cubicTo(0.2f, 0.0f, 0.1f, 1.0f, 0.5f, 1.0f);
        path.lineTo(1.0f, 1.0f);
        f3912b = PathInterpolatorCompat.create(path);
    }
}
