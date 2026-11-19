package androidx.compose.material.icons.outlined;

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
public final class AnimationKt {
    private static ImageVector _animation;

    public static final ImageVector getAnimation(Icons.Outlined outlined) {
        ImageVector imageVector = _animation;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Animation", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.0f, 2.0f);
        pathBuilder.curveToRelative(-2.71f, 0.0f, -5.05f, 1.54f, -6.22f, 3.78f);
        pathBuilder.curveToRelative(-1.28f, 0.67f, -2.34f, 1.72f, -3.0f, 3.0f);
        pathBuilder.curveTo(3.54f, 9.95f, 2.0f, 12.29f, 2.0f, 15.0f);
        pathBuilder.curveToRelative(0.0f, 3.87f, 3.13f, 7.0f, 7.0f, 7.0f);
        pathBuilder.curveToRelative(2.71f, 0.0f, 5.05f, -1.54f, 6.22f, -3.78f);
        pathBuilder.curveToRelative(1.28f, -0.67f, 2.34f, -1.72f, 3.0f, -3.0f);
        pathBuilder.curveTo(20.46f, 14.05f, 22.0f, 11.71f, 22.0f, 9.0f);
        pathBuilder.curveTo(22.0f, 5.13f, 18.87f, 2.0f, 15.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 20.0f);
        pathBuilder.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        pathBuilder.curveToRelative(0.0f, -1.12f, 0.37f, -2.16f, 1.0f, -3.0f);
        pathBuilder.curveToRelative(0.0f, 3.87f, 3.13f, 7.0f, 7.0f, 7.0f);
        pathBuilder.curveTo(11.16f, 19.63f, 10.12f, 20.0f, 9.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 17.0f);
        pathBuilder.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        pathBuilder.curveToRelative(0.0f, -1.12f, 0.37f, -2.16f, 1.0f, -3.0f);
        pathBuilder.curveToRelative(0.0f, 3.86f, 3.13f, 6.99f, 7.0f, 7.0f);
        pathBuilder.curveTo(14.16f, 16.63f, 13.12f, 17.0f, 12.0f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.7f, 13.7f);
        pathBuilder.curveTo(16.17f, 13.89f, 15.6f, 14.0f, 15.0f, 14.0f);
        pathBuilder.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        pathBuilder.curveToRelative(0.0f, -0.6f, 0.11f, -1.17f, 0.3f, -1.7f);
        pathBuilder.curveTo(10.83f, 7.11f, 11.4f, 7.0f, 12.0f, 7.0f);
        pathBuilder.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilder.curveTo(17.0f, 12.6f, 16.89f, 13.17f, 16.7f, 13.7f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -3.86f, -3.13f, -6.99f, -7.0f, -7.0f);
        pathBuilder.curveToRelative(0.84f, -0.63f, 1.87f, -1.0f, 3.0f, -1.0f);
        pathBuilder.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilder.curveTo(20.0f, 10.12f, 19.63f, 11.16f, 19.0f, 12.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _animation = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
