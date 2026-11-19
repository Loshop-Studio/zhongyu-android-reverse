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
public final class SwipeVerticalKt {
    private static ImageVector _swipeVertical;

    public static final ImageVector getSwipeVertical(Icons.TwoTone twoTone) {
        ImageVector imageVector = _swipeVertical;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SwipeVertical", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.49f, 17.34f);
        pathBuilder.lineTo(15.5f, 20.0f);
        pathBuilder.lineToRelative(-4.92f, -1.96f);
        pathBuilder.lineToRelative(4.18f, -0.88f);
        pathBuilder.lineToRelative(-4.3f, -9.7f);
        pathBuilder.curveToRelative(-0.11f, -0.25f, 0.0f, -0.55f, 0.25f, -0.66f);
        pathBuilder.curveToRelative(0.25f, -0.11f, 0.55f, 0.0f, 0.66f, 0.25f);
        pathBuilder.lineToRelative(2.5f, 5.65f);
        pathBuilder.lineToRelative(1.61f, -0.71f);
        pathBuilder.lineTo(20.13f, 12.0f);
        pathBuilder.lineTo(21.49f, 17.34f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(1.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(3.5f);
        pathBuilder2.horizontalLineTo(6.0f);
        pathBuilder2.verticalLineToRelative(1.5f);
        pathBuilder2.verticalLineTo(7.0f);
        pathBuilder2.horizontalLineTo(4.5f);
        pathBuilder2.verticalLineTo(4.09f);
        pathBuilder2.curveToRelative(-1.86f, 2.11f, -3.0f, 4.88f, -3.0f, 7.91f);
        pathBuilder2.reflectiveCurveToRelative(1.14f, 5.79f, 3.0f, 7.91f);
        pathBuilder2.verticalLineTo(17.0f);
        pathBuilder2.horizontalLineTo(6.0f);
        pathBuilder2.verticalLineToRelative(3.5f);
        pathBuilder2.verticalLineTo(22.0f);
        pathBuilder2.horizontalLineTo(4.5f);
        pathBuilder2.horizontalLineTo(1.0f);
        pathBuilder2.verticalLineToRelative(-1.5f);
        pathBuilder2.horizontalLineToRelative(2.02f);
        pathBuilder2.curveTo(1.13f, 18.18f, 0.0f, 15.22f, 0.0f, 12.0f);
        pathBuilder2.reflectiveCurveToRelative(1.13f, -6.18f, 3.02f, -8.5f);
        pathBuilder2.horizontalLineTo(1.0f);
        pathBuilder2.verticalLineTo(2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.22f, 10.0f);
        pathBuilder2.lineToRelative(-4.15f, 0.01f);
        pathBuilder2.curveToRelative(-0.16f, -0.01f, -0.31f, 0.02f, -0.45f, 0.08f);
        pathBuilder2.lineToRelative(-0.59f, 0.26f);
        pathBuilder2.lineTo(13.2f, 6.25f);
        pathBuilder2.curveToRelative(-0.56f, -1.26f, -2.04f, -1.83f, -3.3f, -1.27f);
        pathBuilder2.reflectiveCurveToRelative(-1.83f, 2.04f, -1.27f, 3.3f);
        pathBuilder2.lineToRelative(3.3f, 7.45f);
        pathBuilder2.lineToRelative(-1.87f, 0.39f);
        pathBuilder2.curveToRelative(-0.19f, 0.05f, -0.99f, 0.27f, -1.36f, 1.21f);
        pathBuilder2.lineTo(8.0f, 19.19f);
        pathBuilder2.lineToRelative(6.78f, 2.67f);
        pathBuilder2.curveToRelative(0.49f, 0.19f, 1.05f, 0.18f, 1.53f, -0.04f);
        pathBuilder2.lineToRelative(5.99f, -2.65f);
        pathBuilder2.curveToRelative(0.89f, -0.4f, 1.37f, -1.38f, 1.13f, -2.32f);
        pathBuilder2.lineToRelative(-1.36f, -5.34f);
        pathBuilder2.curveTo(21.85f, 10.65f, 21.1f, 10.04f, 20.22f, 10.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(21.49f, 17.34f);
        pathBuilder2.lineTo(15.5f, 20.0f);
        pathBuilder2.lineToRelative(-4.92f, -1.96f);
        pathBuilder2.lineToRelative(4.18f, -0.88f);
        pathBuilder2.lineToRelative(-4.3f, -9.7f);
        pathBuilder2.curveToRelative(-0.11f, -0.25f, 0.0f, -0.55f, 0.25f, -0.66f);
        pathBuilder2.curveToRelative(0.25f, -0.11f, 0.55f, 0.0f, 0.66f, 0.25f);
        pathBuilder2.lineToRelative(2.5f, 5.65f);
        pathBuilder2.lineToRelative(1.61f, -0.71f);
        pathBuilder2.lineTo(20.13f, 12.0f);
        pathBuilder2.lineTo(21.49f, 17.34f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeVertical = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
