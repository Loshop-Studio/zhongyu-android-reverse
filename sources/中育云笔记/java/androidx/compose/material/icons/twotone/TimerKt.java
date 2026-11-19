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
public final class TimerKt {
    private static ImageVector _timer;

    public static final ImageVector getTimer(Icons.TwoTone twoTone) {
        ImageVector imageVector = _timer;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Timer", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 6.0f);
        pathBuilder.curveToRelative(-3.87f, 0.0f, -7.0f, 3.13f, -7.0f, 7.0f);
        pathBuilder.reflectiveCurveToRelative(3.13f, 7.0f, 7.0f, 7.0f);
        pathBuilder.reflectiveCurveToRelative(7.0f, -3.13f, 7.0f, -7.0f);
        pathBuilder.reflectiveCurveTo(15.87f, 6.0f, 12.0f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(14.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(9.0f, 1.0f);
        pathBuilder2.horizontalLineToRelative(6.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(-6.0f);
        pathBuilder2.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw3 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk83 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(19.03f, 7.39f);
        pathBuilder3.lineToRelative(1.42f, -1.42f);
        pathBuilder3.curveToRelative(-0.43f, -0.51f, -0.9f, -0.99f, -1.41f, -1.41f);
        pathBuilder3.lineToRelative(-1.42f, 1.42f);
        pathBuilder3.curveTo(16.07f, 4.74f, 14.12f, 4.0f, 12.0f, 4.0f);
        pathBuilder3.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        pathBuilder3.curveToRelative(0.0f, 4.97f, 4.02f, 9.0f, 9.0f, 9.0f);
        pathBuilder3.reflectiveCurveToRelative(9.0f, -4.03f, 9.0f, -9.0f);
        pathBuilder3.curveTo(21.0f, 10.88f, 20.26f, 8.93f, 19.03f, 7.39f);
        pathBuilder3.close();
        pathBuilder3.moveTo(12.0f, 20.0f);
        pathBuilder3.curveToRelative(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        pathBuilder3.reflectiveCurveToRelative(3.13f, -7.0f, 7.0f, -7.0f);
        pathBuilder3.reflectiveCurveToRelative(7.0f, 3.13f, 7.0f, 7.0f);
        pathBuilder3.reflectiveCurveTo(15.87f, 20.0f, 12.0f, 20.0f);
        pathBuilder3.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw3, iM31241getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw4 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk84 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(11.0f, 8.0f);
        pathBuilder4.horizontalLineToRelative(2.0f);
        pathBuilder4.verticalLineToRelative(6.0f);
        pathBuilder4.horizontalLineToRelative(-2.0f);
        pathBuilder4.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw4, iM31241getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _timer = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
