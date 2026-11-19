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
public final class CurrencyLiraKt {
    private static ImageVector _currencyLira;

    public static final ImageVector getCurrencyLira(Icons.Rounded rounded) {
        ImageVector imageVector = _currencyLira;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CurrencyLira", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 15.84f);
        pathBuilder.lineToRelative(-1.47f, 0.92f);
        pathBuilder.curveTo(6.86f, 17.18f, 6.0f, 16.7f, 6.0f, 15.91f);
        pathBuilder.curveToRelative(0.0f, -0.34f, 0.18f, -0.66f, 0.47f, -0.85f);
        pathBuilder.lineTo(9.0f, 13.48f);
        pathBuilder.verticalLineToRelative(-2.36f);
        pathBuilder.lineToRelative(-1.47f, 0.92f);
        pathBuilder.curveTo(6.86f, 12.46f, 6.0f, 11.98f, 6.0f, 11.19f);
        pathBuilder.curveToRelative(0.0f, -0.34f, 0.18f, -0.66f, 0.47f, -0.85f);
        pathBuilder.lineTo(9.0f, 8.76f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(3.51f);
        pathBuilder.lineToRelative(2.47f, -1.55f);
        pathBuilder.curveTo(14.14f, 5.54f, 15.0f, 6.02f, 15.0f, 6.81f);
        pathBuilder.curveToRelative(0.0f, 0.34f, -0.18f, 0.66f, -0.47f, 0.85f);
        pathBuilder.lineTo(11.0f, 9.87f);
        pathBuilder.lineToRelative(0.01f, 2.35f);
        pathBuilder.lineToRelative(2.46f, -1.54f);
        pathBuilder.curveToRelative(0.67f, -0.42f, 1.53f, 0.06f, 1.53f, 0.85f);
        pathBuilder.curveToRelative(0.0f, 0.34f, -0.18f, 0.66f, -0.47f, 0.85f);
        pathBuilder.lineTo(11.0f, 14.59f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.curveToRelative(2.47f, 0.0f, 4.52f, -1.79f, 4.93f, -4.15f);
        pathBuilder.curveToRelative(0.08f, -0.49f, 0.49f, -0.85f, 0.98f, -0.85f);
        pathBuilder.curveToRelative(0.61f, 0.0f, 1.09f, 0.54f, 1.0f, 1.14f);
        pathBuilder.curveTo(17.37f, 18.46f, 14.48f, 21.0f, 11.0f, 21.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineTo(15.84f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _currencyLira = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
