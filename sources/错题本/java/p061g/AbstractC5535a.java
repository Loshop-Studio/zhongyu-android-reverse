package p061g;

import androidx.compose.p011ui.graphics.vector.PathBuilder;
import java.util.List;
import okio.Path;

/* renamed from: g.a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC5535a {
    /* renamed from: a */
    public static PathBuilder m4894a(float f, float f7) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f, f7);
        return pathBuilder;
    }

    /* renamed from: b */
    public static String m4895b(Path path, String str) {
        return str + path;
    }

    /* renamed from: c */
    public static List m4896c(PathBuilder pathBuilder, float f, float f7, float f8, float f9) {
        pathBuilder.lineTo(f, f7);
        pathBuilder.lineTo(f8, f9);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    /* renamed from: d */
    public static void m4897d(PathBuilder pathBuilder, float f, float f7, float f8) {
        pathBuilder.lineTo(f, f7);
        pathBuilder.verticalLineToRelative(f8);
        pathBuilder.close();
    }

    /* renamed from: e */
    public static void m4898e(PathBuilder pathBuilder, float f, float f7, float f8, float f9) {
        pathBuilder.moveTo(f, f7);
        pathBuilder.horizontalLineToRelative(f8);
        pathBuilder.verticalLineToRelative(f9);
    }

    /* renamed from: f */
    public static /* synthetic */ void m4899f(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    /* renamed from: g */
    public static void m4900g(String str, String str2, StringBuilder sb, boolean z8, boolean z9) {
        sb.append(str);
        sb.append(z8);
        sb.append(str2);
        sb.append(z9);
    }

    /* renamed from: h */
    public static List m4901h(PathBuilder pathBuilder, float f, float f7, float f8, float f9) {
        pathBuilder.reflectiveCurveToRelative(f, f7, f8, f9);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }
}
