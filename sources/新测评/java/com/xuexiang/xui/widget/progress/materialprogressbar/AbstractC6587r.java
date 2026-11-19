package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Path;
import android.view.animation.Interpolator;
import androidx.core.view.animation.PathInterpolatorCompat;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.r */
/* loaded from: classes4.dex */
public abstract class AbstractC6587r {

    /* renamed from: a */
    public static final Path f6723a;

    /* renamed from: b */
    public static final Interpolator f6724b;

    static {
        Path path = new Path();
        f6723a = path;
        path.cubicTo(0.2f, 0.0f, 0.1f, 1.0f, 0.5f, 1.0f);
        path.lineTo(1.0f, 1.0f);
        f6724b = PathInterpolatorCompat.create(path);
    }
}
