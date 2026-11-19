package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class ScreenLockRotationKt {
    private static ImageVector _screenLockRotation;

    public static final ImageVector getScreenLockRotation(Icons.TwoTone twoTone) {
        ImageVector imageVector = _screenLockRotation;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ScreenLockRotation", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.3f, 13.77f);
        pathBuilder.lineToRelative(-2.57f, -2.57f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineToRelative(2.22f, 2.22f);
        pathBuilder.lineToRelative(-5.66f, 5.66f);
        pathBuilder.lineTo(3.56f, 9.17f);
        pathBuilder.lineToRelative(5.66f, -5.66f);
        pathBuilder.lineToRelative(2.1f, 2.1f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineToRelative(-2.45f, -2.45f);
        pathBuilder.curveToRelative(-0.59f, -0.59f, -1.54f, -0.59f, -2.12f, 0.0f);
        pathBuilder.lineTo(1.8f, 8.11f);
        pathBuilder.curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0.0f, 2.12f);
        pathBuilder.lineToRelative(12.02f, 12.02f);
        pathBuilder.curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0.0f);
        pathBuilder.lineToRelative(6.36f, -6.36f);
        pathBuilder.curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0.0f, -2.12f);
        pathBuilder.close();
        pathBuilder.moveTo(7.52f, 21.48f);
        pathBuilder.curveTo(4.25f, 19.94f, 1.91f, 16.76f, 1.55f, 13.0f);
        pathBuilder.lineTo(0.05f, 13.0f);
        pathBuilder.curveTo(0.56f, 19.16f, 5.71f, 24.0f, 12.0f, 24.0f);
        pathBuilder.lineToRelative(0.66f, -0.03f);
        pathBuilder.lineToRelative(-3.81f, -3.82f);
        pathBuilder.lineToRelative(-1.33f, 1.33f);
        pathBuilder.close();
        pathBuilder.moveTo(15.05f, 10.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.lineTo(21.05f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-0.5f);
        pathBuilder.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        pathBuilder.reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f);
        pathBuilder.lineTo(15.05f, 4.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.85f, 3.5f);
        pathBuilder.curveToRelative(0.0f, -0.94f, 0.76f, -1.7f, 1.7f, -1.7f);
        pathBuilder.reflectiveCurveToRelative(1.7f, 0.76f, 1.7f, 1.7f);
        pathBuilder.lineTo(19.25f, 4.0f);
        pathBuilder.horizontalLineToRelative(-3.4f);
        pathBuilder.verticalLineToRelative(-0.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _screenLockRotation = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
