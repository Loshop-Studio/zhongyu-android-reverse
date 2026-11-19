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
public final class OpacityKt {
    private static ImageVector _opacity;

    public static final ImageVector getOpacity(Icons.TwoTone twoTone) {
        ImageVector imageVector = _opacity;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Opacity", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.24f, 9.65f);
        pathBuilder.lineTo(12.0f, 5.27f);
        pathBuilder.lineTo(7.76f, 9.6f);
        pathBuilder.curveTo(6.62f, 10.73f, 6.01f, 12.0f, 6.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.curveToRelative(-0.01f, -2.0f, -0.62f, -3.23f, -1.76f, -4.35f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(17.66f, 8.0f);
        pathBuilder2.lineTo(12.0f, 2.35f);
        pathBuilder2.lineTo(6.34f, 8.0f);
        pathBuilder2.curveTo(4.78f, 9.56f, 4.0f, 11.64f, 4.0f, 13.64f);
        pathBuilder2.reflectiveCurveToRelative(0.78f, 4.11f, 2.34f, 5.67f);
        pathBuilder2.reflectiveCurveToRelative(3.61f, 2.35f, 5.66f, 2.35f);
        pathBuilder2.reflectiveCurveToRelative(4.1f, -0.79f, 5.66f, -2.35f);
        pathBuilder2.reflectiveCurveTo(20.0f, 15.64f, 20.0f, 13.64f);
        pathBuilder2.reflectiveCurveTo(19.22f, 9.56f, 17.66f, 8.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(6.0f, 14.0f);
        pathBuilder2.curveToRelative(0.01f, -2.0f, 0.62f, -3.27f, 1.76f, -4.4f);
        pathBuilder2.lineTo(12.0f, 5.27f);
        pathBuilder2.lineToRelative(4.24f, 4.38f);
        pathBuilder2.curveTo(17.38f, 10.77f, 17.99f, 12.0f, 18.0f, 14.0f);
        pathBuilder2.horizontalLineTo(6.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _opacity = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
