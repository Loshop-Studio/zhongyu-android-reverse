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
public final class AutoStoriesKt {
    private static ImageVector _autoStories;

    public static final ImageVector getAutoStories(Icons.Sharp sharp) {
        ImageVector imageVector = _autoStories;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AutoStories", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 4.6f);
        pathBuilder.verticalLineToRelative(2.12f);
        pathBuilder.verticalLineToRelative(7.24f);
        pathBuilder.verticalLineToRelative(2.66f);
        pathBuilder.curveTo(19.86f, 16.21f, 18.69f, 16.0f, 17.5f, 16.0f);
        pathBuilder.curveToRelative(-1.9f, 0.0f, -3.78f, 0.54f, -5.5f, 1.58f);
        pathBuilder.verticalLineToRelative(-3.62f);
        pathBuilder.verticalLineTo(7.79f);
        pathBuilder.verticalLineTo(5.48f);
        pathBuilder.curveTo(10.38f, 4.55f, 8.51f, 4.0f, 6.5f, 4.0f);
        pathBuilder.reflectiveCurveTo(2.62f, 4.55f, 1.0f, 5.48f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.curveToRelative(1.52f, -1.18f, 3.43f, -2.0f, 5.5f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(3.98f, 0.82f, 5.5f, 2.0f);
        pathBuilder.curveToRelative(1.52f, -1.18f, 3.43f, -2.0f, 5.5f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(3.98f, 0.82f, 5.5f, 2.0f);
        pathBuilder.verticalLineTo(5.48f);
        pathBuilder.curveTo(22.37f, 5.12f, 21.7f, 4.84f, 21.0f, 4.6f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(19.0f, 0.5f);
        pathBuilder2.lineToRelative(-5.0f, 5.0f);
        pathBuilder2.lineToRelative(0.0f, 9.5f);
        pathBuilder2.lineToRelative(5.0f, -4.5f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autoStories = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
