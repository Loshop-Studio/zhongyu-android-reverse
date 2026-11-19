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
public final class AutoStoriesKt {
    private static ImageVector _autoStories;

    public static final ImageVector getAutoStories(Icons.Outlined outlined) {
        ImageVector imageVector = _autoStories;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AutoStories", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.47f, 5.2f);
        pathBuilder.curveTo(22.0f, 4.96f, 21.51f, 4.76f, 21.0f, 4.59f);
        pathBuilder.verticalLineToRelative(12.03f);
        pathBuilder.curveTo(19.86f, 16.21f, 18.69f, 16.0f, 17.5f, 16.0f);
        pathBuilder.curveToRelative(-1.9f, 0.0f, -3.78f, 0.54f, -5.5f, 1.58f);
        pathBuilder.verticalLineTo(5.48f);
        pathBuilder.curveTo(10.38f, 4.55f, 8.51f, 4.0f, 6.5f, 4.0f);
        pathBuilder.curveTo(4.71f, 4.0f, 3.02f, 4.44f, 1.53f, 5.2f);
        pathBuilder.curveTo(1.2f, 5.36f, 1.0f, 5.71f, 1.0f, 6.08f);
        pathBuilder.verticalLineToRelative(12.08f);
        pathBuilder.curveToRelative(0.0f, 0.58f, 0.47f, 0.99f, 1.0f, 0.99f);
        pathBuilder.curveToRelative(0.16f, 0.0f, 0.32f, -0.04f, 0.48f, -0.12f);
        pathBuilder.curveTo(3.69f, 18.4f, 5.05f, 18.0f, 6.5f, 18.0f);
        pathBuilder.curveToRelative(2.07f, 0.0f, 3.98f, 0.82f, 5.5f, 2.0f);
        pathBuilder.curveToRelative(1.52f, -1.18f, 3.43f, -2.0f, 5.5f, -2.0f);
        pathBuilder.curveToRelative(1.45f, 0.0f, 2.81f, 0.4f, 4.02f, 1.04f);
        pathBuilder.curveToRelative(0.16f, 0.08f, 0.32f, 0.12f, 0.48f, 0.12f);
        pathBuilder.curveToRelative(0.52f, 0.0f, 1.0f, -0.41f, 1.0f, -0.99f);
        pathBuilder.verticalLineTo(6.08f);
        pathBuilder.curveTo(23.0f, 5.71f, 22.8f, 5.36f, 22.47f, 5.2f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 16.62f);
        pathBuilder.curveTo(8.86f, 16.21f, 7.69f, 16.0f, 6.5f, 16.0f);
        pathBuilder.curveToRelative(-1.19f, 0.0f, -2.36f, 0.21f, -3.5f, 0.62f);
        pathBuilder.verticalLineTo(6.71f);
        pathBuilder.curveTo(4.11f, 6.24f, 5.28f, 6.0f, 6.5f, 6.0f);
        pathBuilder.curveTo(7.7f, 6.0f, 8.89f, 6.25f, 10.0f, 6.72f);
        pathBuilder.verticalLineTo(16.62f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 0.5f);
        pathBuilder.lineToRelative(-5.0f, 5.0f);
        pathBuilder.verticalLineTo(15.0f);
        pathBuilder.lineToRelative(5.0f, -4.5f);
        pathBuilder.verticalLineTo(0.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autoStories = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
