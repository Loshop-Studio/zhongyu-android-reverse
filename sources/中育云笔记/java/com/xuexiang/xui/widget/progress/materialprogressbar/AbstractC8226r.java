package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Path;
import android.view.animation.Interpolator;
import androidx.core.view.animation.PathInterpolatorCompat;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.r */
/* loaded from: classes5.dex */
public abstract class AbstractC8226r {

    /* renamed from: a */
    public static final Path f16857a;

    /* renamed from: b */
    public static final Interpolator f16858b;

    static {
        Path path = new Path();
        f16857a = path;
        path.cubicTo(0.2f, 0.0f, 0.1f, 1.0f, 0.5f, 1.0f);
        path.lineTo(1.0f, 1.0f);
        f16858b = PathInterpolatorCompat.create(path);
    }
}
