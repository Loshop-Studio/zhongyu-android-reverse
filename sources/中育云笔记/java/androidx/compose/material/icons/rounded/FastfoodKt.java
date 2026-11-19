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
public final class FastfoodKt {
    private static ImageVector _fastfood;

    public static final ImageVector getFastfood(Icons.Rounded rounded) {
        ImageVector imageVector = _fastfood;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Fastfood", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.9f, 5.0f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(-3.9f);
        pathBuilder.curveToRelative(-0.59f, 0.0f, -1.05f, 0.51f, -1.0f, 1.1f);
        pathBuilder.lineToRelative(0.12f, 1.21f);
        pathBuilder.curveTo(14.9f, 8.16f, 18.0f, 10.77f, 18.0f, 15.0f);
        pathBuilder.lineToRelative(0.02f, 8.0f);
        pathBuilder.horizontalLineToRelative(1.7f);
        pathBuilder.curveToRelative(0.84f, 0.0f, 1.53f, -0.65f, 1.63f, -1.47f);
        pathBuilder.lineTo(22.89f, 6.1f);
        pathBuilder.curveToRelative(0.06f, -0.59f, -0.4f, -1.1f, -0.99f, -1.1f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 21.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(13.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(2.1f, 15.0f);
        pathBuilder.horizontalLineToRelative(12.8f);
        pathBuilder.curveToRelative(0.62f, 0.0f, 1.11f, -0.56f, 0.99f, -1.16f);
        pathBuilder.curveToRelative(-0.65f, -3.23f, -4.02f, -4.85f, -7.39f, -4.85f);
        pathBuilder.reflectiveCurveToRelative(-6.73f, 1.62f, -7.39f, 4.85f);
        pathBuilder.curveToRelative(-0.12f, 0.6f, 0.38f, 1.16f, 0.99f, 1.16f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 17.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(13.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fastfood = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
