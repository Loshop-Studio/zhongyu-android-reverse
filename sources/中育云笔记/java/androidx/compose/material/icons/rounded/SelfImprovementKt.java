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
public final class SelfImprovementKt {
    private static ImageVector _selfImprovement;

    public static final ImageVector getSelfImprovement(Icons.Rounded rounded) {
        ImageVector imageVector = _selfImprovement;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SelfImprovement", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 6.0f);
        pathBuilder.moveToRelative(-2.0f, 0.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(21.0f, 14.94f);
        pathBuilder2.lineTo(21.0f, 14.94f);
        pathBuilder2.curveToRelative(0.0f, -0.5f, -0.36f, -0.93f, -0.85f, -0.98f);
        pathBuilder2.curveToRelative(-1.88f, -0.21f, -3.49f, -1.13f, -4.75f, -2.63f);
        pathBuilder2.lineToRelative(-1.34f, -1.6f);
        pathBuilder2.curveTo(13.68f, 9.26f, 13.12f, 9.0f, 12.53f, 9.0f);
        pathBuilder2.horizontalLineToRelative(-1.05f);
        pathBuilder2.curveToRelative(-0.59f, 0.0f, -1.15f, 0.26f, -1.53f, 0.72f);
        pathBuilder2.lineToRelative(-1.34f, 1.6f);
        pathBuilder2.curveToRelative(-1.25f, 1.5f, -2.87f, 2.42f, -4.75f, 2.63f);
        pathBuilder2.curveTo(3.36f, 14.01f, 3.0f, 14.44f, 3.0f, 14.94f);
        pathBuilder2.verticalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.0f, 0.6f, 0.53f, 1.07f, 1.13f, 1.0f);
        pathBuilder2.curveToRelative(2.3f, -0.27f, 4.32f, -1.39f, 5.87f, -3.19f);
        pathBuilder2.verticalLineTo(15.0f);
        pathBuilder2.lineToRelative(-3.76f, 1.5f);
        pathBuilder2.curveToRelative(-0.65f, 0.26f, -1.16f, 0.83f, -1.23f, 1.53f);
        pathBuilder2.curveTo(4.91f, 19.1f, 5.74f, 20.0f, 6.79f, 20.0f);
        pathBuilder2.horizontalLineTo(9.0f);
        pathBuilder2.verticalLineToRelative(-0.5f);
        pathBuilder2.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        pathBuilder2.horizontalLineToRelative(3.0f);
        pathBuilder2.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder2.reflectiveCurveTo(14.78f, 18.0f, 14.5f, 18.0f);
        pathBuilder2.horizontalLineToRelative(-3.0f);
        pathBuilder2.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilder2.verticalLineTo(20.0f);
        pathBuilder2.lineToRelative(7.1f, 0.0f);
        pathBuilder2.curveToRelative(0.85f, 0.0f, 1.65f, -0.54f, 1.85f, -1.37f);
        pathBuilder2.curveToRelative(0.21f, -0.89f, -0.27f, -1.76f, -1.08f, -2.08f);
        pathBuilder2.lineTo(14.0f, 15.0f);
        pathBuilder2.verticalLineToRelative(-2.25f);
        pathBuilder2.curveToRelative(1.56f, 1.8f, 3.57f, 2.91f, 5.87f, 3.19f);
        pathBuilder2.curveTo(20.47f, 16.0f, 21.0f, 15.54f, 21.0f, 14.94f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _selfImprovement = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
