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
public final class PinEndKt {
    private static ImageVector _pinEnd;

    public static final ImageVector getPinEnd(Icons.Rounded rounded) {
        ImageVector imageVector = _pinEnd;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PinEnd", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 12.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.lineToRelative(0.0f, 2.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 14.0f);
        pathBuilder.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder.reflectiveCurveTo(20.66f, 14.0f, 19.0f, 14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.66f, 13.66f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineToRelative(-2.12f, -2.12f);
        pathBuilder.lineToRelative(1.27f, -1.27f);
        pathBuilder.curveTo(14.12f, 8.54f, 13.9f, 8.0f, 13.45f, 8.0f);
        pathBuilder.horizontalLineTo(9.5f);
        pathBuilder.curveTo(9.22f, 8.0f, 9.0f, 8.22f, 9.0f, 8.5f);
        pathBuilder.verticalLineToRelative(3.95f);
        pathBuilder.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        pathBuilder.lineToRelative(1.27f, -1.27f);
        pathBuilder.lineToRelative(2.12f, 2.12f);
        pathBuilder.curveTo(13.63f, 14.05f, 14.27f, 14.05f, 14.66f, 13.66f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pinEnd = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
