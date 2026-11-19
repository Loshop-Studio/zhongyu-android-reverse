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
public final class WatchKt {
    private static ImageVector _watch;

    public static final ImageVector getWatch(Icons.TwoTone twoTone) {
        ImageVector imageVector = _watch;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Watch", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.72f, 4.48f);
        pathBuilder.lineTo(14.31f, 2.0f);
        pathBuilder.horizontalLineTo(9.7f);
        pathBuilder.lineToRelative(-0.41f, 2.47f);
        pathBuilder.curveTo(10.13f, 4.17f, 11.05f, 4.0f, 12.0f, 4.0f);
        pathBuilder.curveToRelative(0.96f, 0.0f, 1.87f, 0.17f, 2.72f, 0.48f);
        pathBuilder.close();
        pathBuilder.moveTo(9.29f, 19.53f);
        pathBuilder.lineTo(9.7f, 22.0f);
        pathBuilder.horizontalLineToRelative(4.61f);
        pathBuilder.lineToRelative(0.41f, -2.48f);
        pathBuilder.curveToRelative(-0.85f, 0.31f, -1.76f, 0.48f, -2.72f, 0.48f);
        pathBuilder.curveToRelative(-0.95f, 0.0f, -1.87f, -0.17f, -2.71f, -0.47f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(16.96f, 5.73f);
        pathBuilder2.lineTo(16.0f, 0.0f);
        pathBuilder2.lineTo(8.0f, 0.0f);
        pathBuilder2.lineToRelative(-0.95f, 5.73f);
        pathBuilder2.curveTo(5.19f, 7.19f, 4.0f, 9.45f, 4.0f, 12.0f);
        pathBuilder2.reflectiveCurveToRelative(1.19f, 4.81f, 3.05f, 6.27f);
        pathBuilder2.lineTo(8.0f, 24.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.lineToRelative(0.96f, -5.73f);
        pathBuilder2.curveTo(18.81f, 16.81f, 20.0f, 14.54f, 20.0f, 12.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.19f, -4.81f, -3.04f, -6.27f);
        pathBuilder2.close();
        pathBuilder2.moveTo(9.7f, 2.0f);
        pathBuilder2.horizontalLineToRelative(4.61f);
        pathBuilder2.lineToRelative(0.41f, 2.48f);
        pathBuilder2.curveTo(13.87f, 4.17f, 12.96f, 4.0f, 12.0f, 4.0f);
        pathBuilder2.curveToRelative(-0.95f, 0.0f, -1.87f, 0.17f, -2.71f, 0.47f);
        pathBuilder2.lineTo(9.7f, 2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.31f, 22.0f);
        pathBuilder2.lineTo(9.7f, 22.0f);
        pathBuilder2.lineToRelative(-0.41f, -2.47f);
        pathBuilder2.curveToRelative(0.84f, 0.3f, 1.76f, 0.47f, 2.71f, 0.47f);
        pathBuilder2.curveToRelative(0.96f, 0.0f, 1.87f, -0.17f, 2.72f, -0.48f);
        pathBuilder2.lineTo(14.31f, 22.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 18.0f);
        pathBuilder2.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilder2.reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f);
        pathBuilder2.reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f);
        pathBuilder2.reflectiveCurveToRelative(-2.69f, 6.0f, -6.0f, 6.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _watch = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
