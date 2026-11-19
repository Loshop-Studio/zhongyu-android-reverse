package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Path;
import android.view.animation.Interpolator;
import androidx.core.view.animation.PathInterpolatorCompat;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.q */
/* loaded from: classes3.dex */
public abstract class AbstractC4200q {

    /* renamed from: a */
    public static final Interpolator f4781a;

    static {
        Path path = new Path();
        path.lineTo(0.5f, 0.0f);
        path.cubicTo(0.7f, 0.0f, 0.6f, 1.0f, 1.0f, 1.0f);
        f4781a = PathInterpolatorCompat.create(path);
    }
}
