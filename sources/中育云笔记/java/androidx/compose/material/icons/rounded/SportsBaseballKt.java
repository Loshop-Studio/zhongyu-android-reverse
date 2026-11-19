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
public final class SportsBaseballKt {
    private static ImageVector _sportsBaseball;

    public static final ImageVector getSportsBaseball(Icons.Rounded rounded) {
        ImageVector imageVector = _sportsBaseball;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SportsBaseball", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.81f, 6.28f);
        pathBuilder.curveTo(2.67f, 7.9f, 2.0f, 9.87f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(0.67f, 4.1f, 1.81f, 5.72f);
        pathBuilder.curveTo(6.23f, 16.95f, 8.0f, 14.68f, 8.0f, 12.0f);
        pathBuilder.reflectiveCurveTo(6.23f, 7.05f, 3.81f, 6.28f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.19f, 6.28f);
        pathBuilder2.curveTo(17.77f, 7.05f, 16.0f, 9.32f, 16.0f, 12.0f);
        pathBuilder2.reflectiveCurveToRelative(1.77f, 4.95f, 4.19f, 5.72f);
        pathBuilder2.curveTo(21.33f, 16.1f, 22.0f, 14.13f, 22.0f, 12.0f);
        pathBuilder2.reflectiveCurveTo(21.33f, 7.9f, 20.19f, 6.28f);
        pathBuilder2.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw3 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk83 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(14.0f, 12.0f);
        pathBuilder3.curveToRelative(0.0f, -3.28f, 1.97f, -6.09f, 4.79f, -7.33f);
        pathBuilder3.curveTo(17.01f, 3.02f, 14.63f, 2.0f, 12.0f, 2.0f);
        pathBuilder3.reflectiveCurveTo(6.99f, 3.02f, 5.21f, 4.67f);
        pathBuilder3.curveTo(8.03f, 5.91f, 10.0f, 8.72f, 10.0f, 12.0f);
        pathBuilder3.reflectiveCurveToRelative(-1.97f, 6.09f, -4.79f, 7.33f);
        pathBuilder3.curveTo(6.99f, 20.98f, 9.37f, 22.0f, 12.0f, 22.0f);
        pathBuilder3.reflectiveCurveToRelative(5.01f, -1.02f, 6.79f, -2.67f);
        pathBuilder3.curveTo(15.97f, 18.09f, 14.0f, 15.28f, 14.0f, 12.0f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw3, iM31241getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsBaseball = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
