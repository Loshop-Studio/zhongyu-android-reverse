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
public final class CurrencyPoundKt {
    private static ImageVector _currencyPound;

    public static final ImageVector getCurrencyPound(Icons.Rounded rounded) {
        ImageVector imageVector = _currencyPound;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CurrencyPound", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.21f, 17.61f);
        pathBuilder.curveToRelative(-0.47f, -0.24f, -1.03f, -0.05f, -1.31f, 0.4f);
        pathBuilder.curveTo(15.54f, 18.61f, 14.93f, 19.0f, 14.0f, 19.0f);
        pathBuilder.lineToRelative(-4.9f, 0.0f);
        pathBuilder.curveToRelative(0.83f, -1.0f, 1.5f, -2.34f, 1.5f, -4.0f);
        pathBuilder.curveToRelative(0.0f, -0.35f, -0.03f, -0.69f, -0.08f, -1.0f);
        pathBuilder.lineTo(13.0f, 14.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.lineToRelative(-3.18f, 0.0f);
        pathBuilder.curveTo(9.0f, 10.42f, 8.0f, 9.6f, 8.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f);
        pathBuilder.curveToRelative(1.2f, 0.0f, 2.26f, 0.61f, 2.89f, 1.53f);
        pathBuilder.curveToRelative(0.27f, 0.4f, 0.77f, 0.59f, 1.22f, 0.4f);
        pathBuilder.curveToRelative(0.6f, -0.25f, 0.8f, -0.99f, 0.43f, -1.53f);
        pathBuilder.curveToRelative(-0.99f, -1.45f, -2.66f, -2.4f, -4.54f, -2.4f);
        pathBuilder.curveTo(8.46f, 2.5f, 6.0f, 4.96f, 6.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, 1.78f, 0.79f, 2.9f, 1.49f, 4.0f);
        pathBuilder.lineTo(7.0f, 12.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.lineToRelative(1.47f, 0.0f);
        pathBuilder.curveToRelative(0.08f, 0.31f, 0.13f, 0.64f, 0.13f, 1.0f);
        pathBuilder.curveToRelative(0.0f, 1.9f, -1.29f, 3.11f, -2.06f, 3.66f);
        pathBuilder.curveTo(6.2f, 18.9f, 6.0f, 19.29f, 6.0f, 19.71f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveTo(6.0f, 20.42f, 6.58f, 21.0f, 7.29f, 21.0f);
        pathBuilder.horizontalLineTo(14.0f);
        pathBuilder.curveToRelative(1.55f, 0.0f, 2.95f, -0.76f, 3.63f, -2.0f);
        pathBuilder.curveTo(17.91f, 18.49f, 17.72f, 17.86f, 17.21f, 17.61f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _currencyPound = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
