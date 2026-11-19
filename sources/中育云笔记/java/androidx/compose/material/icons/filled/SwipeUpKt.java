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
public final class SwipeUpKt {
    private static ImageVector _swipeUp;

    public static final ImageVector getSwipeUp(Icons.Filled filled) {
        ImageVector imageVector = _swipeUp;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SwipeUp", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.06f, 5.56f);
        pathBuilder.lineTo(1.0f, 4.5f);
        pathBuilder.lineTo(4.5f, 1.0f);
        pathBuilder.lineTo(8.0f, 4.5f);
        pathBuilder.lineTo(6.94f, 5.56f);
        pathBuilder.lineTo(5.32f, 3.94f);
        pathBuilder.curveTo(5.11f, 4.76f, 5.0f, 5.62f, 5.0f, 6.5f);
        pathBuilder.curveToRelative(0.0f, 2.42f, 0.82f, 4.65f, 2.2f, 6.43f);
        pathBuilder.lineTo(6.13f, 14.0f);
        pathBuilder.curveTo(4.49f, 11.95f, 3.5f, 9.34f, 3.5f, 6.5f);
        pathBuilder.curveToRelative(0.0f, -0.92f, 0.1f, -1.82f, 0.3f, -2.68f);
        pathBuilder.lineTo(2.06f, 5.56f);
        pathBuilder.close();
        pathBuilder.moveTo(13.85f, 11.62f);
        pathBuilder.lineToRelative(-2.68f, -5.37f);
        pathBuilder.curveToRelative(-0.37f, -0.74f, -1.27f, -1.04f, -2.01f, -0.67f);
        pathBuilder.curveTo(8.41f, 5.96f, 8.11f, 6.86f, 8.48f, 7.6f);
        pathBuilder.lineToRelative(4.81f, 9.6f);
        pathBuilder.lineTo(10.05f, 18.0f);
        pathBuilder.curveToRelative(-0.33f, 0.09f, -0.59f, 0.33f, -0.7f, 0.66f);
        pathBuilder.lineTo(9.0f, 19.78f);
        pathBuilder.lineToRelative(6.19f, 2.25f);
        pathBuilder.curveToRelative(0.5f, 0.17f, 1.28f, 0.02f, 1.75f, -0.22f);
        pathBuilder.lineToRelative(5.51f, -2.75f);
        pathBuilder.curveToRelative(0.89f, -0.45f, 1.32f, -1.48f, 1.0f, -2.42f);
        pathBuilder.lineToRelative(-1.43f, -4.27f);
        pathBuilder.curveToRelative(-0.27f, -0.82f, -1.04f, -1.37f, -1.9f, -1.37f);
        pathBuilder.horizontalLineToRelative(-4.56f);
        pathBuilder.curveToRelative(-0.31f, 0.0f, -0.62f, 0.07f, -0.89f, 0.21f);
        pathBuilder.lineTo(13.85f, 11.62f);
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeUp = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
