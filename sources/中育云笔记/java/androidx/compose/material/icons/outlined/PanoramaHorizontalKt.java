package androidx.compose.material.icons.outlined;

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

    public static final ImageVector getPanoramaHorizontal(Icons.Outlined outlined) {
        ImageVector imageVector = _panoramaHorizontal;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PanoramaHorizontal", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 6.54f);
        pathBuilder.verticalLineToRelative(10.91f);
        pathBuilder.curveToRelative(-2.6f, -0.77f, -5.28f, -1.16f, -8.0f, -1.16f);
        pathBuilder.reflectiveCurveToRelative(-5.4f, 0.39f, -8.0f, 1.16f);
        pathBuilder.verticalLineTo(6.54f);
        pathBuilder.curveToRelative(2.6f, 0.77f, 5.28f, 1.16f, 8.0f, 1.16f);
        pathBuilder.curveToRelative(2.72f, 0.01f, 5.4f, -0.38f, 8.0f, -1.16f);
        pathBuilder.moveTo(21.43f, 4.0f);
        pathBuilder.curveToRelative(-0.1f, 0.0f, -0.2f, 0.02f, -0.31f, 0.06f);
        pathBuilder.curveTo(18.18f, 5.16f, 15.09f, 5.7f, 12.0f, 5.7f);
        pathBuilder.reflectiveCurveToRelative(-6.18f, -0.55f, -9.12f, -1.64f);
        pathBuilder.curveTo(2.77f, 4.02f, 2.66f, 4.0f, 2.57f, 4.0f);
        pathBuilder.curveToRelative(-0.34f, 0.0f, -0.57f, 0.23f, -0.57f, 0.63f);
        pathBuilder.verticalLineToRelative(14.75f);
        pathBuilder.curveToRelative(0.0f, 0.39f, 0.23f, 0.62f, 0.57f, 0.62f);
        pathBuilder.curveToRelative(0.1f, 0.0f, 0.2f, -0.02f, 0.31f, -0.06f);
        pathBuilder.curveToRelative(2.94f, -1.1f, 6.03f, -1.64f, 9.12f, -1.64f);
        pathBuilder.reflectiveCurveToRelative(6.18f, 0.55f, 9.12f, 1.64f);
        pathBuilder.curveToRelative(0.11f, 0.04f, 0.21f, 0.06f, 0.31f, 0.06f);
        pathBuilder.curveToRelative(0.33f, 0.0f, 0.57f, -0.23f, 0.57f, -0.63f);
        pathBuilder.verticalLineTo(4.63f);
        pathBuilder.curveToRelative(0.0f, -0.4f, -0.24f, -0.63f, -0.57f, -0.63f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panoramaHorizontal = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
