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
public final class SwipeRightKt {
    private static ImageVector _swipeRight;

    public static final ImageVector getSwipeRight(Icons.Rounded rounded) {
        ImageVector imageVector = _swipeRight;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SwipeRight", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 1.0f);
        pathBuilder.curveTo(7.19f, 1.0f, 3.7f, 3.39f, 2.41f, 5.92f);
        pathBuilder.curveTo(2.16f, 6.41f, 2.53f, 7.0f, 3.09f, 7.0f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.54f, -0.15f, 0.66f, -0.4f);
        pathBuilder.curveTo(4.73f, 4.69f, 7.58f, 2.5f, 12.0f, 2.5f);
        pathBuilder.curveToRelative(3.03f, 0.0f, 5.79f, 1.14f, 7.91f, 3.0f);
        pathBuilder.horizontalLineToRelative(-2.16f);
        pathBuilder.curveTo(17.34f, 5.5f, 17.0f, 5.84f, 17.0f, 6.25f);
        pathBuilder.reflectiveCurveTo(17.34f, 7.0f, 17.75f, 7.0f);
        pathBuilder.horizontalLineTo(21.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineTo(2.75f);
        pathBuilder.curveTo(22.0f, 2.34f, 21.66f, 2.0f, 21.25f, 2.0f);
        pathBuilder.reflectiveCurveTo(20.5f, 2.34f, 20.5f, 2.75f);
        pathBuilder.verticalLineToRelative(1.27f);
        pathBuilder.curveTo(18.18f, 2.13f, 15.22f, 1.0f, 12.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.2f, 17.43f);
        pathBuilder.curveToRelative(0.0f, -0.65f, 0.6f, -1.13f, 1.24f, -0.99f);
        pathBuilder.lineTo(10.0f, 17.24f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.curveTo(10.0f, 5.67f, 10.67f, 5.0f, 11.5f, 5.0f);
        pathBuilder.reflectiveCurveTo(13.0f, 5.67f, 13.0f, 6.5f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(0.91f);
        pathBuilder.curveToRelative(0.31f, 0.0f, 0.62f, 0.07f, 0.89f, 0.21f);
        pathBuilder.lineToRelative(4.09f, 2.04f);
        pathBuilder.curveToRelative(0.77f, 0.38f, 1.21f, 1.22f, 1.09f, 2.07f);
        pathBuilder.lineToRelative(-0.63f, 4.46f);
        pathBuilder.curveTo(19.21f, 22.27f, 18.36f, 23.0f, 17.37f, 23.0f);
        pathBuilder.horizontalLineToRelative(-6.16f);
        pathBuilder.curveToRelative(-0.53f, 0.0f, -1.29f, -0.21f, -1.66f, -0.59f);
        pathBuilder.lineToRelative(-4.07f, -4.29f);
        pathBuilder.curveTo(5.3f, 17.94f, 5.2f, 17.69f, 5.2f, 17.43f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeRight = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
