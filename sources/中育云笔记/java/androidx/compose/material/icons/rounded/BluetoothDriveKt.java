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
public final class BluetoothDriveKt {
    private static ImageVector _bluetoothDrive;

    public static final ImageVector getBluetoothDrive(Icons.Rounded rounded) {
        ImageVector imageVector = _bluetoothDrive;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BluetoothDrive", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.85f, 6.0f);
        pathBuilder.lineToRelative(1.8f, -1.8f);
        pathBuilder.curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        pathBuilder.lineTo(19.5f, 1.36f);
        pathBuilder.curveToRelative(-0.32f, -0.31f, -0.85f, -0.09f, -0.85f, 0.35f);
        pathBuilder.verticalLineToRelative(3.08f);
        pathBuilder.lineTo(16.7f, 2.85f);
        pathBuilder.curveToRelative(-0.19f, -0.19f, -0.51f, -0.19f, -0.7f, 0.0f);
        pathBuilder.curveToRelative(-0.19f, 0.19f, -0.19f, 0.51f, 0.0f, 0.7f);
        pathBuilder.lineTo(18.44f, 6.0f);
        pathBuilder.lineTo(16.0f, 8.44f);
        pathBuilder.curveToRelative(-0.19f, 0.19f, -0.19f, 0.5f, 0.0f, 0.7f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.19f, 0.2f, 0.51f, 0.2f, 0.7f, 0.0f);
        pathBuilder.lineToRelative(1.95f, -1.95f);
        pathBuilder.verticalLineToRelative(3.09f);
        pathBuilder.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        pathBuilder.lineToRelative(2.14f, -2.15f);
        pathBuilder.curveToRelative(0.2f, -0.2f, 0.19f, -0.51f, 0.0f, -0.71f);
        pathBuilder.lineTo(19.85f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.65f, 2.91f);
        pathBuilder.lineToRelative(0.94f, 0.94f);
        pathBuilder.lineToRelative(-0.94f, 0.94f);
        pathBuilder.verticalLineTo(2.91f);
        pathBuilder.close();
        pathBuilder.moveTo(19.65f, 9.08f);
        pathBuilder.verticalLineTo(7.2f);
        pathBuilder.lineToRelative(0.94f, 0.94f);
        pathBuilder.lineTo(19.65f, 9.08f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(15.0f, 10.0f);
        pathBuilder2.horizontalLineTo(4.81f);
        pathBuilder2.lineToRelative(1.04f, -3.0f);
        pathBuilder2.horizontalLineTo(15.0f);
        pathBuilder2.verticalLineTo(5.0f);
        pathBuilder2.horizontalLineTo(5.5f);
        pathBuilder2.curveTo(4.84f, 5.0f, 4.29f, 5.42f, 4.08f, 6.01f);
        pathBuilder2.lineTo(2.0f, 12.0f);
        pathBuilder2.verticalLineToRelative(7.5f);
        pathBuilder2.curveTo(2.0f, 20.33f, 2.67f, 21.0f, 3.5f, 21.0f);
        pathBuilder2.reflectiveCurveTo(5.0f, 20.33f, 5.0f, 19.5f);
        pathBuilder2.verticalLineTo(19.0f);
        pathBuilder2.horizontalLineToRelative(12.0f);
        pathBuilder2.verticalLineToRelative(0.5f);
        pathBuilder2.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilder2.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder2.verticalLineTo(12.0f);
        pathBuilder2.horizontalLineToRelative(-3.0f);
        pathBuilder2.curveTo(15.9f, 12.0f, 15.0f, 11.1f, 15.0f, 10.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(6.5f, 16.0f);
        pathBuilder2.curveTo(5.67f, 16.0f, 5.0f, 15.33f, 5.0f, 14.5f);
        pathBuilder2.reflectiveCurveTo(5.67f, 13.0f, 6.5f, 13.0f);
        pathBuilder2.reflectiveCurveTo(8.0f, 13.67f, 8.0f, 14.5f);
        pathBuilder2.reflectiveCurveTo(7.33f, 16.0f, 6.5f, 16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.5f, 16.0f);
        pathBuilder2.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder2.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder2.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder2.reflectiveCurveTo(16.33f, 16.0f, 15.5f, 16.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bluetoothDrive = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
