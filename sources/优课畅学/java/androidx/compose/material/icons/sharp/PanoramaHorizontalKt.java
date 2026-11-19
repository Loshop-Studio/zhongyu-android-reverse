package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;
import androidx.compose.p013ui.graphics.vector.ImageVector;
import androidx.compose.p013ui.graphics.vector.PathBuilder;
import androidx.compose.p013ui.graphics.vector.VectorKt;
import androidx.compose.p013ui.unit.C3156Dp;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
public final class PanoramaHorizontalKt {
    private static ImageVector _panoramaHorizontal;

    public static final ImageVector getPanoramaHorizontal(Icons.Sharp sharp) {
        ImageVector imageVector = _panoramaHorizontal;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PanoramaHorizontal", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.0f, 6.55f);
        pathBuilder.curveToRelative(2.6f, 0.77f, 5.28f, 1.16f, 8.0f, 1.16f);
        pathBuilder.curveToRelative(2.72f, 0.0f, 5.41f, -0.39f, 8.0f, -1.16f);
        pathBuilder.verticalLineToRelative(10.91f);
        pathBuilder.curveToRelative(-2.6f, -0.77f, -5.28f, -1.16f, -8.0f, -1.16f);
        pathBuilder.curveToRelative(-2.72f, 0.0f, -5.41f, 0.39f, -8.0f, 1.16f);
        pathBuilder.verticalLineTo(6.55f);
        pathBuilder.moveTo(2.0f, 3.77f);
        pathBuilder.verticalLineToRelative(16.47f);
        pathBuilder.reflectiveCurveToRelative(0.77f, -0.26f, 0.88f, -0.3f);
        pathBuilder.curveTo(5.82f, 18.85f, 8.91f, 18.3f, 12.0f, 18.3f);
        pathBuilder.curveToRelative(3.09f, 0.0f, 6.18f, 0.55f, 9.12f, 1.64f);
        pathBuilder.curveToRelative(0.11f, 0.04f, 0.88f, 0.3f, 0.88f, 0.3f);
        pathBuilder.verticalLineTo(3.77f);
        pathBuilder.reflectiveCurveToRelative(-0.77f, 0.26f, -0.88f, 0.3f);
        pathBuilder.curveTo(18.18f, 5.15f, 15.09f, 5.71f, 12.0f, 5.71f);
        pathBuilder.reflectiveCurveToRelative(-6.18f, -0.56f, -9.12f, -1.64f);
        pathBuilder.curveToRelative(-0.11f, -0.05f, -0.88f, -0.3f, -0.88f, -0.3f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panoramaHorizontal = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
