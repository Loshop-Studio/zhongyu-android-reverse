package p070b.p113c.p114a.p116e.p144h.p145a;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: b.c.a.e.h.a.o */
/* loaded from: classes.dex */
public class C0869o {

    /* renamed from: a */
    public static final Path f4674a;

    /* renamed from: b */
    public static final Interpolator f4675b;

    static {
        Path path = new Path();
        f4674a = path;
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(0.0375f, 0.0f, 0.12876461f, 0.0895381f, 0.25f, 0.21855351f);
        path.cubicTo(0.32241032f, 0.2956106f, 0.43666667f, 0.41759142f, 0.48333332f, 0.48982617f);
        path.cubicTo(0.69f, 0.80972296f, 0.79333335f, 0.95001614f, 1.0f, 1.0f);
        f4675b = new PathInterpolator(path);
    }
}
