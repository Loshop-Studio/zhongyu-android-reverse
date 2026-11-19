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
public final class DriveEtaKt {
    private static ImageVector _driveEta;

    public static final ImageVector getDriveEta(Icons.Rounded rounded) {
        ImageVector imageVector = _driveEta;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DriveEta", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.92f, 5.01f);
        pathBuilder.curveTo(18.72f, 4.42f, 18.16f, 4.0f, 17.5f, 4.0f);
        pathBuilder.horizontalLineToRelative(-11.0f);
        pathBuilder.curveToRelative(-0.66f, 0.0f, -1.21f, 0.42f, -1.42f, 1.01f);
        pathBuilder.lineToRelative(-1.97f, 5.67f);
        pathBuilder.curveToRelative(-0.07f, 0.21f, -0.11f, 0.43f, -0.11f, 0.66f);
        pathBuilder.verticalLineToRelative(7.16f);
        pathBuilder.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(6.0f, 19.33f, 6.0f, 18.5f);
        pathBuilder.lineTo(6.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineToRelative(0.5f);
        pathBuilder.curveToRelative(0.0f, 0.82f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilder.curveToRelative(0.82f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.verticalLineToRelative(-7.16f);
        pathBuilder.curveToRelative(0.0f, -0.22f, -0.04f, -0.45f, -0.11f, -0.66f);
        pathBuilder.lineToRelative(-1.97f, -5.67f);
        pathBuilder.close();
        pathBuilder.moveTo(6.5f, 15.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(5.67f, 12.0f, 6.5f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(7.33f, 15.0f, 6.5f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.5f, 15.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 10.0f);
        pathBuilder.lineToRelative(1.27f, -3.82f);
        pathBuilder.curveToRelative(0.14f, -0.4f, 0.52f, -0.68f, 0.95f, -0.68f);
        pathBuilder.horizontalLineToRelative(9.56f);
        pathBuilder.curveToRelative(0.43f, 0.0f, 0.81f, 0.28f, 0.95f, 0.68f);
        pathBuilder.lineTo(19.0f, 10.0f);
        pathBuilder.lineTo(5.0f, 10.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _driveEta = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
