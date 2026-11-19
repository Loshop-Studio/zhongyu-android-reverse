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
public final class NoDrinksKt {
    private static ImageVector _noDrinks;

    public static final ImageVector getNoDrinks(Icons.TwoTone twoTone) {
        ImageVector imageVector = _noDrinks;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.NoDrinks", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.77f, 9.0f);
        pathBuilder.lineToRelative(-2.94f, 0.0f);
        pathBuilder.lineToRelative(1.55f, 1.56f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(21.19f, 21.19f);
        pathBuilder2.lineTo(2.81f, 2.81f);
        pathBuilder2.lineTo(1.39f, 4.22f);
        pathBuilder2.lineToRelative(8.23f, 8.23f);
        pathBuilder2.lineTo(11.0f, 14.0f);
        pathBuilder2.verticalLineToRelative(5.0f);
        pathBuilder2.horizontalLineTo(6.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(12.0f);
        pathBuilder2.verticalLineToRelative(-0.17f);
        pathBuilder2.lineToRelative(1.78f, 1.78f);
        pathBuilder2.lineTo(21.19f, 21.19f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.0f, 19.0f);
        pathBuilder2.verticalLineToRelative(-3.17f);
        pathBuilder2.lineTo(16.17f, 19.0f);
        pathBuilder2.horizontalLineTo(13.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(7.83f, 5.0f);
        pathBuilder2.lineToRelative(-2.0f, -2.0f);
        pathBuilder2.horizontalLineTo(21.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.lineToRelative(-6.2f, 6.97f);
        pathBuilder2.lineToRelative(-1.42f, -1.42f);
        pathBuilder2.lineTo(14.77f, 9.0f);
        pathBuilder2.horizontalLineToRelative(-2.94f);
        pathBuilder2.lineToRelative(-2.0f, -2.0f);
        pathBuilder2.horizontalLineToRelative(6.74f);
        pathBuilder2.lineToRelative(1.78f, -2.0f);
        pathBuilder2.horizontalLineTo(7.83f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noDrinks = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
