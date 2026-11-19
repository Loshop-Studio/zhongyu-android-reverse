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
public final class EmergencyRecordingKt {
    private static ImageVector _emergencyRecording;

    public static final ImageVector getEmergencyRecording(Icons.Rounded rounded) {
        ImageVector imageVector = _emergencyRecording;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.EmergencyRecording", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 10.48f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-4.48f);
        pathBuilder.lineToRelative(3.15f, 3.13f);
        pathBuilder.curveTo(21.46f, 16.97f, 22.0f, 16.74f, 22.0f, 16.3f);
        pathBuilder.verticalLineTo(7.7f);
        pathBuilder.curveToRelative(0.0f, -0.44f, -0.54f, -0.67f, -0.85f, -0.35f);
        pathBuilder.lineTo(18.0f, 10.48f);
        pathBuilder.close();
        pathBuilder.moveTo(14.5f, 14.6f);
        pathBuilder.curveToRelative(-0.28f, 0.48f, -0.89f, 0.64f, -1.37f, 0.37f);
        pathBuilder.lineTo(11.0f, 13.73f);
        pathBuilder.verticalLineTo(16.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-2.27f);
        pathBuilder.lineToRelative(-2.13f, 1.23f);
        pathBuilder.curveToRelative(-0.48f, 0.28f, -1.09f, 0.11f, -1.37f, -0.37f);
        pathBuilder.curveToRelative(-0.28f, -0.48f, -0.11f, -1.09f, 0.37f, -1.37f);
        pathBuilder.lineTo(8.0f, 12.0f);
        pathBuilder.lineToRelative(-2.13f, -1.23f);
        pathBuilder.curveTo(5.39f, 10.49f, 5.22f, 9.88f, 5.5f, 9.4f);
        pathBuilder.curveToRelative(0.28f, -0.48f, 0.89f, -0.64f, 1.37f, -0.37f);
        pathBuilder.lineTo(9.0f, 10.27f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(2.27f);
        pathBuilder.lineToRelative(2.13f, -1.23f);
        pathBuilder.curveToRelative(0.48f, -0.28f, 1.09f, -0.11f, 1.37f, 0.37f);
        pathBuilder.curveToRelative(0.28f, 0.48f, 0.11f, 1.09f, -0.37f, 1.37f);
        pathBuilder.lineTo(12.0f, 12.0f);
        pathBuilder.lineToRelative(2.13f, 1.23f);
        pathBuilder.curveTo(14.61f, 13.51f, 14.78f, 14.12f, 14.5f, 14.6f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emergencyRecording = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
