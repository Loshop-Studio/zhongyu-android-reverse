package androidx.compose.material.icons.filled;

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
public final class EarbudsBatteryKt {
    private static ImageVector _earbudsBattery;

    public static final ImageVector getEarbudsBattery(Icons.Filled filled) {
        ImageVector imageVector = _earbudsBattery;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.EarbudsBattery", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(9.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.curveTo(22.0f, 7.45f, 21.55f, 7.0f, 21.0f, 7.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(10.62f, 6.0f);
        pathBuilder2.curveTo(8.76f, 6.0f, 7.25f, 7.51f, 7.25f, 9.38f);
        pathBuilder2.verticalLineToRelative(5.25f);
        pathBuilder2.curveToRelative(0.0f, 1.04f, -0.84f, 1.88f, -1.88f, 1.88f);
        pathBuilder2.reflectiveCurveTo(3.5f, 15.66f, 3.5f, 14.62f);
        pathBuilder2.verticalLineToRelative(-4.7f);
        pathBuilder2.curveTo(3.66f, 9.97f, 3.83f, 10.0f, 4.0f, 10.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.reflectiveCurveTo(5.1f, 6.0f, 4.0f, 6.0f);
        pathBuilder2.reflectiveCurveTo(2.0f, 6.9f, 2.0f, 8.0f);
        pathBuilder2.curveToRelative(0.0f, 0.04f, 0.0f, 6.62f, 0.0f, 6.62f);
        pathBuilder2.curveTo(2.0f, 16.49f, 3.51f, 18.0f, 5.38f, 18.0f);
        pathBuilder2.reflectiveCurveToRelative(3.38f, -1.51f, 3.38f, -3.38f);
        pathBuilder2.verticalLineTo(9.38f);
        pathBuilder2.curveToRelative(0.0f, -1.04f, 0.84f, -1.88f, 1.88f, -1.88f);
        pathBuilder2.reflectiveCurveToRelative(1.88f, 0.84f, 1.88f, 1.88f);
        pathBuilder2.verticalLineToRelative(4.7f);
        pathBuilder2.curveTo(12.34f, 14.03f, 12.17f, 14.0f, 12.0f, 14.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder2.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.curveToRelative(0.0f, -0.04f, 0.0f, -6.62f, 0.0f, -6.62f);
        pathBuilder2.curveTo(14.0f, 7.51f, 12.49f, 6.0f, 10.62f, 6.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _earbudsBattery = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
