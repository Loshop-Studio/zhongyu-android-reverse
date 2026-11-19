package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.SolidColor;
import androidx.compose.p014ui.graphics.StrokeCap;
import androidx.compose.p014ui.graphics.StrokeJoin;
import androidx.compose.p014ui.graphics.vector.ImageVector;
import androidx.compose.p014ui.graphics.vector.PathBuilder;
import androidx.compose.p014ui.graphics.vector.VectorKt;
import androidx.compose.p014ui.unit.C3186Dp;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
public final class PanoramaHorizontalKt {
    private static ImageVector _panoramaHorizontal;

    public static final ImageVector getPanoramaHorizontal(Icons.Sharp sharp) {
        ImageVector imageVector = _panoramaHorizontal;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PanoramaHorizontal", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
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
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panoramaHorizontal = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
