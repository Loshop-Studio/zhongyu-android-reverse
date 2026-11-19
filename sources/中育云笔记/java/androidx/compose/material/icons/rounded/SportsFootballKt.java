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
public final class SportsFootballKt {
    private static ImageVector _sportsFootball;

    public static final ImageVector getSportsFootball(Icons.Rounded rounded) {
        ImageVector imageVector = _sportsFootball;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SportsFootball", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.02f, 15.62f);
        pathBuilder.curveToRelative(-0.08f, 2.42f, 0.32f, 4.34f, 0.67f, 4.69f);
        pathBuilder.reflectiveCurveToRelative(2.28f, 0.76f, 4.69f, 0.67f);
        pathBuilder.lineTo(3.02f, 15.62f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(13.08f, 3.28f);
        pathBuilder2.curveTo(10.75f, 3.7f, 8.29f, 4.62f, 6.46f, 6.46f);
        pathBuilder2.reflectiveCurveToRelative(-2.76f, 4.29f, -3.18f, 6.62f);
        pathBuilder2.lineToRelative(7.63f, 7.63f);
        pathBuilder2.curveToRelative(2.34f, -0.41f, 4.79f, -1.34f, 6.62f, -3.18f);
        pathBuilder2.reflectiveCurveToRelative(2.76f, -4.29f, 3.18f, -6.62f);
        pathBuilder2.lineTo(13.08f, 3.28f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.8f, 10.6f);
        pathBuilder2.lineToRelative(-4.2f, 4.2f);
        pathBuilder2.curveToRelative(-0.39f, 0.39f, -1.01f, 0.39f, -1.4f, 0.0f);
        pathBuilder2.reflectiveCurveToRelative(-0.39f, -1.01f, 0.0f, -1.4f);
        pathBuilder2.lineToRelative(4.2f, -4.2f);
        pathBuilder2.curveToRelative(0.39f, -0.39f, 1.01f, -0.39f, 1.4f, 0.0f);
        pathBuilder2.reflectiveCurveTo(15.19f, 10.21f, 14.8f, 10.6f);
        pathBuilder2.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw3 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk83 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(20.98f, 8.38f);
        pathBuilder3.curveToRelative(0.08f, -2.42f, -0.32f, -4.34f, -0.67f, -4.69f);
        pathBuilder3.reflectiveCurveToRelative(-2.28f, -0.76f, -4.69f, -0.67f);
        pathBuilder3.lineTo(20.98f, 8.38f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw3, iM31241getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsFootball = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
