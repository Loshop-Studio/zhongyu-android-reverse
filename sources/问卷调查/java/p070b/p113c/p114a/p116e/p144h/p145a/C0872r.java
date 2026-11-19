package p070b.p113c.p114a.p116e.p144h.p145a;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: b.c.a.e.h.a.r */
/* loaded from: classes.dex */
public class C0872r {

    /* renamed from: a */
    public static final Path f4679a;

    /* renamed from: b */
    public static final Interpolator f4680b;

    static {
        Path path = new Path();
        f4679a = path;
        path.lineTo(0.5f, 0.0f);
        path.cubicTo(0.7f, 0.0f, 0.6f, 1.0f, 1.0f, 1.0f);
        f4680b = new PathInterpolator(path);
    }
}
