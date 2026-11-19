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
public final class HolidayVillageKt {
    private static ImageVector _holidayVillage;

    public static final ImageVector getHolidayVillage(Icons.Rounded rounded) {
        ImageVector imageVector = _holidayVillage;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HolidayVillage", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.0f, 20.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineTo(8.76f);
        pathBuilder.curveToRelative(0.0f, -0.27f, -0.11f, -0.52f, -0.29f, -0.71f);
        pathBuilder.lineToRelative(-3.76f, -3.76f);
        pathBuilder.curveTo(13.76f, 4.11f, 13.51f, 4.0f, 13.24f, 4.0f);
        pathBuilder.curveToRelative(-0.89f, 0.0f, -1.34f, 1.08f, -0.71f, 1.71f);
        pathBuilder.lineToRelative(3.32f, 3.32f);
        pathBuilder.curveTo(15.95f, 9.12f, 16.0f, 9.25f, 16.0f, 9.38f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.curveTo(16.0f, 19.55f, 16.45f, 20.0f, 17.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 20.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineTo(7.11f);
        pathBuilder.curveToRelative(0.0f, -0.26f, -0.11f, -0.52f, -0.29f, -0.71f);
        pathBuilder.lineToRelative(-2.1f, -2.11f);
        pathBuilder.curveTo(19.42f, 4.11f, 19.16f, 4.0f, 18.9f, 4.0f);
        pathBuilder.curveTo(18.0f, 4.0f, 17.56f, 5.08f, 18.19f, 5.71f);
        pathBuilder.lineToRelative(1.67f, 1.67f);
        pathBuilder.curveTo(19.95f, 7.47f, 20.0f, 7.6f, 20.0f, 7.73f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.curveTo(20.0f, 19.55f, 20.45f, 20.0f, 21.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 15.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-8.59f);
        pathBuilder.curveToRelative(0.0f, -0.27f, -0.11f, -0.52f, -0.29f, -0.71f);
        pathBuilder.lineToRelative(-5.0f, -5.0f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(-5.0f, 5.0f);
        pathBuilder.curveTo(2.11f, 9.89f, 2.0f, 10.15f, 2.0f, 10.41f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.curveTo(7.0f, 15.45f, 7.45f, 15.0f, 8.0f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 13.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(8.55f, 13.0f, 8.0f, 13.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _holidayVillage = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
