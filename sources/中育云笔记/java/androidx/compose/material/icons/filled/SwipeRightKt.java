package androidx.compose.material.icons.filled;

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

    public static final ImageVector getSwipeRight(Icons.Filled filled) {
        ImageVector imageVector = _swipeRight;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SwipeRight", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.98f, 16.82f);
        pathBuilder.lineToRelative(-0.63f, 4.46f);
        pathBuilder.curveTo(19.21f, 22.27f, 18.36f, 23.0f, 17.37f, 23.0f);
        pathBuilder.horizontalLineToRelative(-6.16f);
        pathBuilder.curveToRelative(-0.53f, 0.0f, -1.29f, -0.21f, -1.66f, -0.59f);
        pathBuilder.lineTo(5.0f, 17.62f);
        pathBuilder.lineToRelative(0.83f, -0.84f);
        pathBuilder.curveToRelative(0.24f, -0.24f, 0.58f, -0.35f, 0.92f, -0.28f);
        pathBuilder.lineTo(10.0f, 17.24f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.curveTo(10.0f, 5.67f, 10.67f, 5.0f, 11.5f, 5.0f);
        pathBuilder.reflectiveCurveTo(13.0f, 5.67f, 13.0f, 6.5f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(0.91f);
        pathBuilder.curveToRelative(0.31f, 0.0f, 0.62f, 0.07f, 0.89f, 0.21f);
        pathBuilder.lineToRelative(4.09f, 2.04f);
        pathBuilder.curveTo(19.66f, 15.14f, 20.1f, 15.97f, 19.98f, 16.82f);
        pathBuilder.close();
        pathBuilder.moveTo(19.91f, 5.5f);
        pathBuilder.horizontalLineTo(17.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.horizontalLineToRelative(-1.5f);
        pathBuilder.verticalLineToRelative(2.02f);
        pathBuilder.curveTo(18.18f, 2.13f, 15.22f, 1.0f, 12.0f, 1.0f);
        pathBuilder.curveTo(6.51f, 1.0f, 2.73f, 4.12f, 2.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(1.57f);
        pathBuilder.curveTo(4.33f, 5.02f, 7.26f, 2.5f, 12.0f, 2.5f);
        pathBuilder.curveTo(15.03f, 2.5f, 17.79f, 3.64f, 19.91f, 5.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeRight = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
