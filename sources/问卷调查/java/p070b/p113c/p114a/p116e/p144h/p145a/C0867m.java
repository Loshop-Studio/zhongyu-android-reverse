package p070b.p113c.p114a.p116e.p144h.p145a;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: b.c.a.e.h.a.m */
/* loaded from: classes.dex */
public class C0867m {

    /* renamed from: a */
    public static final Path f4670a;

    /* renamed from: b */
    public static final Interpolator f4671b;

    static {
        Path path = new Path();
        f4670a = path;
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.2f, 0.0f);
        path.cubicTo(0.39583334f, 0.0f, 0.47484508f, 0.20679761f, 0.59166664f, 0.41708294f);
        path.cubicTo(0.715161f, 0.6393796f, 0.81625f, 0.9745569f, 1.0f, 1.0f);
        f4671b = new PathInterpolator(path);
    }
}
