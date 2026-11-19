package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Path;
import android.view.animation.Interpolator;
import androidx.core.view.animation.PathInterpolatorCompat;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.o */
/* loaded from: classes3.dex */
public abstract class AbstractC5962o {

    /* renamed from: a */
    public static final Path f5427a;

    /* renamed from: b */
    public static final Interpolator f5428b;

    static {
        Path path = new Path();
        f5427a = path;
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(0.06834272f, 0.019925667f, 0.19220331f, 0.15855429f, 0.33333334f, 0.3492616f);
        path.cubicTo(0.38410434f, 0.41477913f, 0.5494579f, 0.6813603f, 0.6666667f, 0.68279964f);
        path.cubicTo(0.75258625f, 0.6817962f, 0.73725396f, 0.8788962f, 1.0f, 1.0f);
        f5428b = PathInterpolatorCompat.create(path);
    }
}
