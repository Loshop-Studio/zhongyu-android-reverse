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
public final class ShoppingBasketKt {
    private static ImageVector _shoppingBasket;

    public static final ImageVector getShoppingBasket(Icons.TwoTone twoTone) {
        ImageVector imageVector = _shoppingBasket;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ShoppingBasket", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.31f, 11.0f);
        pathBuilder.lineToRelative(2.2f, 8.01f);
        pathBuilder.lineTo(18.5f, 19.0f);
        pathBuilder.lineToRelative(2.2f, -8.0f);
        pathBuilder.horizontalLineTo(3.31f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 17.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(22.0f, 9.0f);
        pathBuilder2.horizontalLineToRelative(-4.79f);
        pathBuilder2.lineToRelative(-4.38f, -6.56f);
        pathBuilder2.curveToRelative(-0.19f, -0.28f, -0.51f, -0.42f, -0.83f, -0.42f);
        pathBuilder2.reflectiveCurveToRelative(-0.64f, 0.14f, -0.83f, 0.43f);
        pathBuilder2.lineTo(6.79f, 9.0f);
        pathBuilder2.horizontalLineTo(2.0f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder2.curveToRelative(0.0f, 0.09f, 0.01f, 0.18f, 0.04f, 0.27f);
        pathBuilder2.lineToRelative(2.54f, 9.27f);
        pathBuilder2.curveToRelative(0.23f, 0.84f, 1.0f, 1.46f, 1.92f, 1.46f);
        pathBuilder2.horizontalLineToRelative(13.0f);
        pathBuilder2.curveToRelative(0.92f, 0.0f, 1.69f, -0.62f, 1.93f, -1.46f);
        pathBuilder2.lineToRelative(2.54f, -9.27f);
        pathBuilder2.lineTo(23.0f, 10.0f);
        pathBuilder2.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 4.8f);
        pathBuilder2.lineTo(14.8f, 9.0f);
        pathBuilder2.horizontalLineTo(9.2f);
        pathBuilder2.lineTo(12.0f, 4.8f);
        pathBuilder2.close();
        pathBuilder2.moveTo(18.5f, 19.0f);
        pathBuilder2.lineToRelative(-12.99f, 0.01f);
        pathBuilder2.lineTo(3.31f, 11.0f);
        pathBuilder2.horizontalLineTo(20.7f);
        pathBuilder2.lineToRelative(-2.2f, 8.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 13.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder2.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shoppingBasket = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
