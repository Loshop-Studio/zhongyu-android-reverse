package androidx.compose.material.icons.sharp;

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

    public static final ImageVector getCurrencyLira(Icons.Sharp sharp) {
        ImageVector imageVector = _currencyLira;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.CurrencyLira", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 8.76f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(4.51f);
        pathBuilder.lineTo(15.0f, 5.0f);
        pathBuilder.verticalLineToRelative(2.36f);
        pathBuilder.lineToRelative(-4.0f, 2.51f);
        pathBuilder.lineToRelative(0.01f, 2.35f);
        pathBuilder.lineTo(15.0f, 9.72f);
        pathBuilder.verticalLineToRelative(2.36f);
        pathBuilder.lineToRelative(-4.0f, 2.51f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, 3.87f, -3.13f, 7.0f, -7.0f, 7.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.verticalLineToRelative(-5.16f);
        pathBuilder.lineToRelative(-3.0f, 1.88f);
        pathBuilder.lineToRelative(0.0f, -2.36f);
        pathBuilder.lineToRelative(3.0f, -1.88f);
        pathBuilder.verticalLineToRelative(-2.36f);
        pathBuilder.lineTo(6.0f, 13.0f);
        pathBuilder.lineToRelative(0.0f, -2.36f);
        pathBuilder.lineTo(9.0f, 8.76f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _currencyLira = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
