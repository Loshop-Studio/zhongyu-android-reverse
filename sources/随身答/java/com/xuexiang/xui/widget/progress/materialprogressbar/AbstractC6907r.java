package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Path;
import android.view.animation.Interpolator;
import androidx.core.view.animation.PathInterpolatorCompat;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.r */
/* loaded from: classes4.dex */
public abstract class AbstractC6907r {

    /* renamed from: a */
    public static final Path f7981a;

    /* renamed from: b */
    public static final Interpolator f7982b;

    static {
        Path path = new Path();
        f7981a = path;
        path.cubicTo(0.2f, 0.0f, 0.1f, 1.0f, 0.5f, 1.0f);
        path.lineTo(1.0f, 1.0f);
        f7982b = PathInterpolatorCompat.create(path);
    }
}
