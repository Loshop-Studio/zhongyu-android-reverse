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
public final class EarbudsBatteryKt {
    private static ImageVector _earbudsBattery;

    public static final ImageVector getEarbudsBattery(Icons.Rounded rounded) {
        ImageVector imageVector = _earbudsBattery;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.EarbudsBattery", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.curveTo(20.0f, 6.22f, 19.78f, 6.0f, 19.5f, 6.0f);
        pathBuilder.lineToRelative(-1.0f, 0.0f);
        pathBuilder.curveTo(18.22f, 6.0f, 18.0f, 6.22f, 18.0f, 6.5f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(9.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.curveTo(22.0f, 7.45f, 21.55f, 7.0f, 21.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 9.38f);
        pathBuilder.curveTo(14.0f, 7.51f, 12.49f, 6.0f, 10.62f, 6.0f);
        pathBuilder.reflectiveCurveTo(7.25f, 7.51f, 7.25f, 9.38f);
        pathBuilder.verticalLineToRelative(5.25f);
        pathBuilder.curveToRelative(0.0f, 1.04f, -0.84f, 1.88f, -1.88f, 1.88f);
        pathBuilder.reflectiveCurveTo(3.5f, 15.66f, 3.5f, 14.62f);
        pathBuilder.verticalLineToRelative(-4.7f);
        pathBuilder.curveTo(3.66f, 9.97f, 3.83f, 10.0f, 4.0f, 10.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(5.1f, 6.0f, 4.0f, 6.0f);
        pathBuilder.reflectiveCurveTo(2.0f, 6.9f, 2.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, 0.04f, 0.0f, 6.62f, 0.0f, 6.62f);
        pathBuilder.curveTo(2.0f, 16.49f, 3.51f, 18.0f, 5.38f, 18.0f);
        pathBuilder.reflectiveCurveToRelative(3.38f, -1.51f, 3.38f, -3.38f);
        pathBuilder.verticalLineTo(9.38f);
        pathBuilder.curveToRelative(0.0f, -1.04f, 0.84f, -1.88f, 1.88f, -1.88f);
        pathBuilder.reflectiveCurveToRelative(1.88f, 0.84f, 1.88f, 1.88f);
        pathBuilder.verticalLineToRelative(4.7f);
        pathBuilder.curveTo(12.34f, 14.03f, 12.17f, 14.0f, 12.0f, 14.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.curveTo(14.0f, 15.96f, 14.0f, 9.38f, 14.0f, 9.38f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _earbudsBattery = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
