package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.graphics.Path;
import android.view.animation.Interpolator;
import androidx.core.view.animation.PathInterpolatorCompat;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.m */
/* loaded from: classes2.dex */
public abstract class AbstractC3621m {

    /* renamed from: a */
    public static final Path f3902a;

    /* renamed from: b */
    public static final Interpolator f3903b;

    static {
        Path path = new Path();
        f3902a = path;
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.3665f, 0.0f);
        path.cubicTo(0.4725262f, 0.06240991f, 0.6154161f, 0.5f, 0.68325f, 0.5f);
        path.cubicTo(0.7547506f, 0.5f, 0.7572583f, 0.8145101f, 1.0f, 1.0f);
        f3903b = PathInterpolatorCompat.create(path);
    }
}
