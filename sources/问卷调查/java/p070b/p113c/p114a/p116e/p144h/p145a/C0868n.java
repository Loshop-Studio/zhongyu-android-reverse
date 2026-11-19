package p070b.p113c.p114a.p116e.p144h.p145a;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: b.c.a.e.h.a.n */
/* loaded from: classes.dex */
public class C0868n {

    /* renamed from: a */
    public static final Path f4672a;

    /* renamed from: b */
    public static final Interpolator f4673b;

    static {
        Path path = new Path();
        f4672a = path;
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(0.06834272f, 0.019925667f, 0.19220331f, 0.15855429f, 0.33333334f, 0.3492616f);
        path.cubicTo(0.38410434f, 0.41477913f, 0.5494579f, 0.6813603f, 0.6666667f, 0.68279964f);
        path.cubicTo(0.75258625f, 0.6817962f, 0.73725396f, 0.8788962f, 1.0f, 1.0f);
        f4673b = new PathInterpolator(path);
    }
}
