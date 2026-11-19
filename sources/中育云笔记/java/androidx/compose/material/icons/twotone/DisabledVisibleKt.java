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
public final class DisabledVisibleKt {
    private static ImageVector _disabledVisible;

    public static final ImageVector getDisabledVisible(Icons.TwoTone twoTone) {
        ImageVector imageVector = _disabledVisible;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.DisabledVisible", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.0f, 15.0f);
        pathBuilder.curveToRelative(-1.95f, 0.0f, -3.76f, 0.98f, -4.75f, 2.5f);
        pathBuilder.curveTo(13.24f, 19.02f, 15.05f, 20.0f, 17.0f, 20.0f);
        pathBuilder.reflectiveCurveToRelative(3.76f, -0.98f, 4.75f, -2.5f);
        pathBuilder.curveTo(20.76f, 15.98f, 18.95f, 15.0f, 17.0f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 19.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.curveTo(18.5f, 18.33f, 17.83f, 19.0f, 17.0f, 19.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(17.0f, 15.0f);
        pathBuilder2.curveToRelative(1.95f, 0.0f, 3.76f, 0.98f, 4.75f, 2.5f);
        pathBuilder2.curveTo(20.76f, 19.02f, 18.95f, 20.0f, 17.0f, 20.0f);
        pathBuilder2.reflectiveCurveToRelative(-3.76f, -0.98f, -4.75f, -2.5f);
        pathBuilder2.curveTo(13.24f, 15.98f, 15.05f, 15.0f, 17.0f, 15.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(17.0f, 13.0f);
        pathBuilder2.curveToRelative(-3.18f, 0.0f, -5.9f, 1.87f, -7.0f, 4.5f);
        pathBuilder2.curveToRelative(1.1f, 2.63f, 3.82f, 4.5f, 7.0f, 4.5f);
        pathBuilder2.reflectiveCurveToRelative(5.9f, -1.87f, 7.0f, -4.5f);
        pathBuilder2.curveTo(22.9f, 14.87f, 20.18f, 13.0f, 17.0f, 13.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(17.0f, 19.0f);
        pathBuilder2.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder2.reflectiveCurveTo(16.17f, 16.0f, 17.0f, 16.0f);
        pathBuilder2.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder2.reflectiveCurveTo(17.83f, 19.0f, 17.0f, 19.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(21.99f, 12.34f);
        pathBuilder2.curveTo(22.0f, 12.23f, 22.0f, 12.11f, 22.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        pathBuilder2.reflectiveCurveTo(2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, 5.17f, 3.93f, 9.43f, 8.96f, 9.95f);
        pathBuilder2.curveToRelative(-0.93f, -0.73f, -1.72f, -1.64f, -2.32f, -2.68f);
        pathBuilder2.curveTo(5.9f, 18.0f, 4.0f, 15.22f, 4.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, -1.85f, 0.63f, -3.55f, 1.69f, -4.9f);
        pathBuilder2.lineToRelative(5.66f, 5.66f);
        pathBuilder2.curveToRelative(0.56f, -0.4f, 1.17f, -0.73f, 1.82f, -1.0f);
        pathBuilder2.lineTo(7.1f, 5.69f);
        pathBuilder2.curveTo(8.45f, 4.63f, 10.15f, 4.0f, 12.0f, 4.0f);
        pathBuilder2.curveToRelative(4.24f, 0.0f, 7.7f, 3.29f, 7.98f, 7.45f);
        pathBuilder2.curveTo(20.69f, 11.67f, 21.37f, 11.97f, 21.99f, 12.34f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _disabledVisible = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
