package p070b.p113c.p114a.p116e.p144h.p145a;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: b.c.a.e.h.a.l */
/* loaded from: classes.dex */
public class C0866l {

    /* renamed from: a */
    public static final Path f4668a;

    /* renamed from: b */
    public static final Interpolator f4669b;

    static {
        Path path = new Path();
        f4668a = path;
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.3665f, 0.0f);
        path.cubicTo(0.4725262f, 0.06240991f, 0.6154161f, 0.5f, 0.68325f, 0.5f);
        path.cubicTo(0.7547506f, 0.5f, 0.7572583f, 0.8145101f, 1.0f, 1.0f);
        f4669b = new PathInterpolator(path);
    }
}
