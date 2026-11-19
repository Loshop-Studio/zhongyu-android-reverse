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
public final class AdbKt {
    private static ImageVector _adb;

    public static final ImageVector getAdb(Icons.Rounded rounded) {
        ImageVector imageVector = _adb;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Adb", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 16.0f);
        pathBuilder.curveToRelative(0.0f, 3.87f, 3.13f, 7.0f, 7.0f, 7.0f);
        pathBuilder.reflectiveCurveToRelative(7.0f, -3.13f, 7.0f, -7.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.lineTo(5.0f, 12.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.12f, 4.37f);
        pathBuilder.lineToRelative(2.1f, -2.1f);
        pathBuilder.lineToRelative(-0.82f, -0.83f);
        pathBuilder.lineToRelative(-2.3f, 2.31f);
        pathBuilder.curveTo(14.16f, 3.28f, 13.12f, 3.0f, 12.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-2.16f, 0.28f, -3.09f, 0.75f);
        pathBuilder.lineTo(6.6f, 1.44f);
        pathBuilder.lineToRelative(-0.82f, 0.83f);
        pathBuilder.lineToRelative(2.1f, 2.1f);
        pathBuilder.curveTo(6.14f, 5.64f, 5.0f, 7.68f, 5.0f, 10.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.curveToRelative(0.0f, -2.32f, -1.14f, -4.36f, -2.88f, -5.63f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 9.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 9.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _adb = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
