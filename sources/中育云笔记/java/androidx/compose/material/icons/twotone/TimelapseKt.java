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
public final class TimelapseKt {
    private static ImageVector _timelapse;

    public static final ImageVector getTimelapse(Icons.TwoTone twoTone) {
        ImageVector imageVector = _timelapse;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Timelapse", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 3.99f);
        pathBuilder.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(3.58f, 8.0f, 8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(-3.58f, -8.0f, -8.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.25f, 16.23f);
        pathBuilder.curveToRelative(-2.35f, 2.34f, -6.15f, 2.34f, -8.49f, 0.0f);
        pathBuilder.lineTo(12.0f, 11.99f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.curveToRelative(1.54f, 0.0f, 3.07f, 0.59f, 4.24f, 1.76f);
        pathBuilder.curveToRelative(2.35f, 2.34f, 2.35f, 6.14f, 0.01f, 8.48f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(16.24f, 7.75f);
        pathBuilder2.curveToRelative(-1.17f, -1.17f, -2.7f, -1.76f, -4.24f, -1.76f);
        pathBuilder2.verticalLineToRelative(6.0f);
        pathBuilder2.lineToRelative(-4.24f, 4.24f);
        pathBuilder2.curveToRelative(2.34f, 2.34f, 6.14f, 2.34f, 8.49f, 0.0f);
        pathBuilder2.curveToRelative(2.34f, -2.34f, 2.34f, -6.14f, -0.01f, -8.48f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 1.99f);
        pathBuilder2.curveToRelative(-5.52f, 0.0f, -10.0f, 4.48f, -10.0f, 10.0f);
        pathBuilder2.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder2.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder2.reflectiveCurveToRelative(-4.48f, -10.0f, -10.0f, -10.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 19.99f);
        pathBuilder2.curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        pathBuilder2.reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f);
        pathBuilder2.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        pathBuilder2.reflectiveCurveToRelative(-3.58f, 8.0f, -8.0f, 8.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _timelapse = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
