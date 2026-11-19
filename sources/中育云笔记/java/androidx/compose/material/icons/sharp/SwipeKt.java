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
public final class SwipeKt {
    private static ImageVector _swipe;

    public static final ImageVector getSwipe(Icons.Sharp sharp) {
        ImageVector imageVector = _swipe;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Swipe", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.13f, 3.87f);
        pathBuilder.curveTo(18.69f, 2.17f, 15.6f, 1.0f, 12.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(5.31f, 2.17f, 3.87f, 3.87f);
        pathBuilder.lineTo(2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.lineTo(4.93f, 4.93f);
        pathBuilder.curveToRelative(1.0f, -1.29f, 3.7f, -2.43f, 7.07f, -2.43f);
        pathBuilder.reflectiveCurveToRelative(6.07f, 1.14f, 7.07f, 2.43f);
        pathBuilder.lineTo(17.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.lineTo(20.13f, 3.87f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(13.0f, 12.5f);
        pathBuilder2.verticalLineToRelative(-6.0f);
        pathBuilder2.curveTo(13.0f, 5.67f, 12.33f, 5.0f, 11.5f, 5.0f);
        pathBuilder2.reflectiveCurveTo(10.0f, 5.67f, 10.0f, 6.5f);
        pathBuilder2.verticalLineToRelative(10.74f);
        pathBuilder2.lineToRelative(-4.04f, -0.85f);
        pathBuilder2.lineToRelative(-1.21f, 1.23f);
        pathBuilder2.lineTo(10.13f, 23.0f);
        pathBuilder2.horizontalLineToRelative(8.97f);
        pathBuilder2.lineToRelative(1.09f, -7.64f);
        pathBuilder2.lineToRelative(-6.11f, -2.86f);
        pathBuilder2.horizontalLineTo(13.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipe = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
