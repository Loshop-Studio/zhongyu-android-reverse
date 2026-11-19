package p070b.p113c.p114a.p116e.p144h.p145a;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: b.c.a.e.h.a.q */
/* loaded from: classes.dex */
public class C0871q {

    /* renamed from: a */
    public static final Path f4677a;

    /* renamed from: b */
    public static final Interpolator f4678b;

    static {
        Path path = new Path();
        f4677a = path;
        path.cubicTo(0.2f, 0.0f, 0.1f, 1.0f, 0.5f, 1.0f);
        path.lineTo(1.0f, 1.0f);
        f4678b = new PathInterpolator(path);
    }
}
