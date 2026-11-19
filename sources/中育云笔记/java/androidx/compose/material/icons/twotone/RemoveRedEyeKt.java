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
public final class RemoveRedEyeKt {
    private static ImageVector _removeRedEye;

    public static final ImageVector getRemoveRedEye(Icons.TwoTone twoTone) {
        ImageVector imageVector = _removeRedEye;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.RemoveRedEye", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 6.5f);
        pathBuilder.curveToRelative(-3.79f, 0.0f, -7.17f, 2.13f, -8.82f, 5.5f);
        pathBuilder.curveToRelative(1.65f, 3.37f, 5.02f, 5.5f, 8.82f, 5.5f);
        pathBuilder.reflectiveCurveToRelative(7.17f, -2.13f, 8.82f, -5.5f);
        pathBuilder.curveTo(19.17f, 8.63f, 15.79f, 6.5f, 12.0f, 6.5f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 16.5f);
        pathBuilder.curveToRelative(-2.48f, 0.0f, -4.5f, -2.02f, -4.5f, -4.5f);
        pathBuilder.reflectiveCurveTo(9.52f, 7.5f, 12.0f, 7.5f);
        pathBuilder.reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f);
        pathBuilder.reflectiveCurveToRelative(-2.02f, 4.5f, -4.5f, 4.5f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 4.5f);
        pathBuilder2.curveTo(7.0f, 4.5f, 2.73f, 7.61f, 1.0f, 12.0f);
        pathBuilder2.curveToRelative(1.73f, 4.39f, 6.0f, 7.5f, 11.0f, 7.5f);
        pathBuilder2.reflectiveCurveToRelative(9.27f, -3.11f, 11.0f, -7.5f);
        pathBuilder2.curveToRelative(-1.73f, -4.39f, -6.0f, -7.5f, -11.0f, -7.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 17.5f);
        pathBuilder2.curveToRelative(-3.79f, 0.0f, -7.17f, -2.13f, -8.82f, -5.5f);
        pathBuilder2.curveTo(4.83f, 8.63f, 8.21f, 6.5f, 12.0f, 6.5f);
        pathBuilder2.reflectiveCurveToRelative(7.17f, 2.13f, 8.82f, 5.5f);
        pathBuilder2.curveToRelative(-1.65f, 3.37f, -5.03f, 5.5f, -8.82f, 5.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 7.5f);
        pathBuilder2.curveToRelative(-2.48f, 0.0f, -4.5f, 2.02f, -4.5f, 4.5f);
        pathBuilder2.reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f);
        pathBuilder2.reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f);
        pathBuilder2.reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 14.5f);
        pathBuilder2.curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        pathBuilder2.reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f);
        pathBuilder2.reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilder2.reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _removeRedEye = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
