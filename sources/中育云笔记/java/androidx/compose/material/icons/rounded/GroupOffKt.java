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
public final class GroupOffKt {
    private static ImageVector _groupOff;

    public static final ImageVector getGroupOff(Icons.Rounded rounded) {
        ImageVector imageVector = _groupOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.GroupOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, -1.42f, -0.5f, -2.73f, -1.33f, -3.76f);
        pathBuilder.curveTo(14.09f, 4.1f, 14.53f, 4.0f, 15.0f, 4.0f);
        pathBuilder.curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f);
        pathBuilder.curveToRelative(-0.06f, 0.0f, -0.12f, 0.0f, -0.18f, 0.0f);
        pathBuilder.lineToRelative(-0.77f, -0.77f);
        pathBuilder.curveTo(14.65f, 10.29f, 15.0f, 9.18f, 15.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.24f, 4.41f);
        pathBuilder.curveTo(7.77f, 4.15f, 8.37f, 4.0f, 9.0f, 4.0f);
        pathBuilder.curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, 0.63f, -0.15f, 1.23f, -0.41f, 1.76f);
        pathBuilder.lineTo(7.24f, 4.41f);
        pathBuilder.close();
        pathBuilder.moveTo(21.19f, 21.19f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.reflectiveCurveToRelative(-1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(-2.99f, -2.99f);
        pathBuilder.curveTo(16.6f, 19.85f, 16.32f, 20.0f, 16.0f, 20.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.0f, -2.66f, 5.33f, -4.0f, 8.0f, -4.0f);
        pathBuilder.curveToRelative(0.37f, 0.0f, 0.8f, 0.03f, 1.25f, 0.08f);
        pathBuilder.lineTo(9.17f, 12.0f);
        pathBuilder.curveTo(9.11f, 12.0f, 9.06f, 12.0f, 9.0f, 12.0f);
        pathBuilder.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilder.curveToRelative(0.0f, -0.06f, 0.0f, -0.11f, 0.0f, -0.17f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.curveTo(1.0f, 3.83f, 1.0f, 3.2f, 1.39f, 2.81f);
        pathBuilder.reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilder.lineTo(21.19f, 21.19f);
        pathBuilder.close();
        pathBuilder.moveTo(18.89f, 16.07f);
        pathBuilder.curveToRelative(-0.29f, -1.22f, -1.13f, -2.19f, -2.23f, -2.94f);
        pathBuilder.curveTo(19.42f, 13.53f, 23.0f, 14.82f, 23.0f, 17.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, 0.32f, -0.15f, 0.6f, -0.38f, 0.79f);
        pathBuilder.lineTo(18.89f, 16.07f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _groupOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
