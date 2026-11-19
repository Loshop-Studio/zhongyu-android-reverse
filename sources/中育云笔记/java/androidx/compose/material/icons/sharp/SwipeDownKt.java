package androidx.compose.material.icons.sharp;

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
public final class SwipeDownKt {
    private static ImageVector _swipeDown;

    public static final ImageVector getSwipeDown(Icons.Sharp sharp) {
        ImageVector imageVector = _swipeDown;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SwipeDown", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.8f, 12.18f);
        pathBuilder.curveToRelative(-0.2f, -0.86f, -0.3f, -1.76f, -0.3f, -2.68f);
        pathBuilder.curveToRelative(0.0f, -2.84f, 0.99f, -5.45f, 2.63f, -7.5f);
        pathBuilder.lineTo(7.2f, 3.07f);
        pathBuilder.curveTo(5.82f, 4.85f, 5.0f, 7.08f, 5.0f, 9.5f);
        pathBuilder.curveToRelative(0.0f, 0.88f, 0.11f, 1.74f, 0.32f, 2.56f);
        pathBuilder.lineToRelative(1.62f, -1.62f);
        pathBuilder.lineTo(8.0f, 11.5f);
        pathBuilder.lineTo(4.5f, 15.0f);
        pathBuilder.lineTo(1.0f, 11.5f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.lineTo(3.8f, 12.18f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(21.71f, 11.18f);
        pathBuilder2.lineToRelative(2.09f, 7.39f);
        pathBuilder2.lineToRelative(-8.23f, 3.65f);
        pathBuilder2.lineToRelative(-6.84f, -2.85f);
        pathBuilder2.lineToRelative(0.61f, -1.62f);
        pathBuilder2.lineToRelative(3.8f, -0.75f);
        pathBuilder2.lineTo(8.79f, 7.17f);
        pathBuilder2.curveToRelative(-0.34f, -0.76f, 0.0f, -1.64f, 0.76f, -1.98f);
        pathBuilder2.curveToRelative(0.76f, -0.34f, 1.64f, 0.0f, 1.98f, 0.76f);
        pathBuilder2.lineToRelative(2.43f, 5.49f);
        pathBuilder2.lineToRelative(1.26f, -0.56f);
        pathBuilder2.lineTo(21.71f, 11.18f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeDown = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
