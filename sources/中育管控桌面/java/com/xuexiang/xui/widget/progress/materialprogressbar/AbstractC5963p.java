package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Path;
import android.view.animation.Interpolator;
import androidx.core.view.animation.PathInterpolatorCompat;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.p */
/* loaded from: classes3.dex */
public abstract class AbstractC5963p {

    /* renamed from: a */
    public static final Path f5429a;

    /* renamed from: b */
    public static final Interpolator f5430b;

    static {
        Path path = new Path();
        f5429a = path;
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(0.0375f, 0.0f, 0.12876461f, 0.0895381f, 0.25f, 0.21855351f);
        path.cubicTo(0.32241032f, 0.2956106f, 0.43666667f, 0.41759142f, 0.48333332f, 0.48982617f);
        path.cubicTo(0.69f, 0.80972296f, 0.79333335f, 0.95001614f, 1.0f, 1.0f);
        f5430b = PathInterpolatorCompat.create(path);
    }
}
