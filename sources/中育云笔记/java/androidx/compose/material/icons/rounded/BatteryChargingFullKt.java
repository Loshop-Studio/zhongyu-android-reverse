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
public final class BatteryChargingFullKt {
    private static ImageVector _batteryChargingFull;

    public static final ImageVector getBatteryChargingFull(Icons.Rounded rounded) {
        ImageVector imageVector = _batteryChargingFull;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BatteryChargingFull", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.67f, 4.0f);
        pathBuilder.lineTo(14.0f, 4.0f);
        pathBuilder.lineTo(14.0f, 3.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.lineTo(8.33f, 4.0f);
        pathBuilder.curveTo(7.6f, 4.0f, 7.0f, 4.6f, 7.0f, 5.33f);
        pathBuilder.verticalLineToRelative(15.33f);
        pathBuilder.curveTo(7.0f, 21.4f, 7.6f, 22.0f, 8.34f, 22.0f);
        pathBuilder.horizontalLineToRelative(7.32f);
        pathBuilder.curveToRelative(0.74f, 0.0f, 1.34f, -0.6f, 1.34f, -1.33f);
        pathBuilder.lineTo(17.0f, 5.33f);
        pathBuilder.curveTo(17.0f, 4.6f, 16.4f, 4.0f, 15.67f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.61f, 13.24f);
        pathBuilder.lineToRelative(-2.67f, 5.0f);
        pathBuilder.curveToRelative(-0.24f, 0.45f, -0.94f, 0.28f, -0.94f, -0.24f);
        pathBuilder.verticalLineToRelative(-3.5f);
        pathBuilder.lineTo(9.83f, 14.5f);
        pathBuilder.curveToRelative(-0.38f, 0.0f, -0.62f, -0.4f, -0.44f, -0.74f);
        pathBuilder.lineToRelative(2.67f, -5.0f);
        pathBuilder.curveToRelative(0.24f, -0.45f, 0.94f, -0.28f, 0.94f, 0.24f);
        pathBuilder.verticalLineToRelative(3.5f);
        pathBuilder.horizontalLineToRelative(1.17f);
        pathBuilder.curveToRelative(0.37f, 0.0f, 0.62f, 0.4f, 0.44f, 0.74f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _batteryChargingFull = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
