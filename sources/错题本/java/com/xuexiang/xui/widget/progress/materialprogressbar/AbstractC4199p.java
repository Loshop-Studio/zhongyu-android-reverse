package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Path;
import android.view.animation.Interpolator;
import androidx.core.view.animation.PathInterpolatorCompat;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.p */
/* loaded from: classes3.dex */
public abstract class AbstractC4199p {

    /* renamed from: a */
    public static final Interpolator f4780a;

    static {
        Path path = new Path();
        path.cubicTo(0.2f, 0.0f, 0.1f, 1.0f, 0.5f, 1.0f);
        path.lineTo(1.0f, 1.0f);
        f4780a = PathInterpolatorCompat.create(path);
    }
}
