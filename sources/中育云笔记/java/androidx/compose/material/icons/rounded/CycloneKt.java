package androidx.compose.material.icons.rounded;

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
public final class CycloneKt {
    private static ImageVector _cyclone;

    public static final ImageVector getCyclone(Icons.Rounded rounded) {
        ImageVector imageVector = _cyclone;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Cyclone", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 8.0f);
        pathBuilder.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder.curveTo(16.0f, 9.79f, 14.21f, 8.0f, 12.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 14.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.curveTo(14.0f, 13.1f, 13.1f, 14.0f, 12.0f, 14.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(22.0f, 6.11f);
        pathBuilder2.lineTo(22.0f, 6.11f);
        pathBuilder2.curveToRelative(0.0f, -0.46f, -0.3f, -0.86f, -0.74f, -0.97f);
        pathBuilder2.curveTo(19.23f, 4.6f, 16.03f, 4.0f, 12.0f, 4.0f);
        pathBuilder2.curveTo(9.85f, 4.0f, 7.89f, 4.86f, 6.46f, 6.24f);
        pathBuilder2.curveToRelative(0.1f, -0.65f, 0.28f, -1.69f, 0.62f, -2.96f);
        pathBuilder2.curveTo(7.25f, 2.64f, 6.78f, 2.0f, 6.11f, 2.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.curveTo(5.66f, 2.0f, 5.26f, 2.3f, 5.14f, 2.74f);
        pathBuilder2.curveTo(4.6f, 4.77f, 4.0f, 7.97f, 4.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, 2.15f, 0.86f, 4.11f, 2.24f, 5.54f);
        pathBuilder2.curveToRelative(-0.65f, -0.1f, -1.69f, -0.28f, -2.96f, -0.62f);
        pathBuilder2.curveTo(2.64f, 16.75f, 2.0f, 17.22f, 2.0f, 17.89f);
        pathBuilder2.verticalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.0f, 0.46f, 0.3f, 0.86f, 0.74f, 0.97f);
        pathBuilder2.curveTo(4.77f, 19.4f, 7.97f, 20.0f, 12.0f, 20.0f);
        pathBuilder2.curveToRelative(2.15f, 0.0f, 4.11f, -0.86f, 5.54f, -2.24f);
        pathBuilder2.curveToRelative(-0.1f, 0.65f, -0.28f, 1.69f, -0.62f, 2.96f);
        pathBuilder2.curveToRelative(-0.17f, 0.64f, 0.3f, 1.28f, 0.97f, 1.28f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.46f, 0.0f, 0.86f, -0.3f, 0.97f, -0.74f);
        pathBuilder2.curveTo(19.4f, 19.23f, 20.0f, 16.03f, 20.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, -2.15f, -0.86f, -4.11f, -2.24f, -5.54f);
        pathBuilder2.curveToRelative(0.65f, 0.1f, 1.69f, 0.28f, 2.96f, 0.62f);
        pathBuilder2.curveTo(21.36f, 7.25f, 22.0f, 6.78f, 22.0f, 6.11f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 18.0f);
        pathBuilder2.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilder2.reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f);
        pathBuilder2.reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f);
        pathBuilder2.reflectiveCurveTo(15.31f, 18.0f, 12.0f, 18.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cyclone = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
