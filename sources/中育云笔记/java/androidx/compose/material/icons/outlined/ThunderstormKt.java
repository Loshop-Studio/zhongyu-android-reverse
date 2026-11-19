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
public final class ThunderstormKt {
    private static ImageVector _thunderstorm;

    public static final ImageVector getThunderstorm(Icons.Outlined outlined) {
        ImageVector imageVector = _thunderstorm;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Thunderstorm", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.92f, 7.02f);
        pathBuilder.curveTo(17.45f, 4.18f, 14.97f, 2.0f, 12.0f, 2.0f);
        pathBuilder.curveTo(9.82f, 2.0f, 7.83f, 3.18f, 6.78f, 5.06f);
        pathBuilder.curveTo(4.09f, 5.41f, 2.0f, 7.74f, 2.0f, 10.5f);
        pathBuilder.curveTo(2.0f, 13.53f, 4.47f, 16.0f, 7.5f, 16.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.curveToRelative(2.48f, 0.0f, 4.5f, -2.02f, 4.5f, -4.5f);
        pathBuilder.curveTo(22.0f, 9.16f, 20.21f, 7.23f, 17.92f, 7.02f);
        pathBuilder.close();
        pathBuilder.moveTo(17.5f, 14.0f);
        pathBuilder.horizontalLineToRelative(-10.0f);
        pathBuilder.curveTo(5.57f, 14.0f, 4.0f, 12.43f, 4.0f, 10.5f);
        pathBuilder.curveToRelative(0.0f, -1.74f, 1.31f, -3.23f, 3.04f, -3.46f);
        pathBuilder.lineToRelative(0.99f, -0.13f);
        pathBuilder.lineToRelative(0.49f, -0.87f);
        pathBuilder.curveTo(9.23f, 4.78f, 10.56f, 4.0f, 12.0f, 4.0f);
        pathBuilder.curveToRelative(1.94f, 0.0f, 3.63f, 1.44f, 3.95f, 3.35f);
        pathBuilder.lineToRelative(0.25f, 1.52f);
        pathBuilder.lineToRelative(1.54f, 0.14f);
        pathBuilder.curveTo(19.01f, 9.13f, 20.0f, 10.22f, 20.0f, 11.5f);
        pathBuilder.curveTo(20.0f, 12.88f, 18.88f, 14.0f, 17.5f, 14.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(14.8f, 17.0f);
        pathBuilder2.lineToRelative(-2.9f, 3.32f);
        pathBuilder2.lineToRelative(2.0f, 1.0f);
        pathBuilder2.lineToRelative(-2.35f, 2.68f);
        pathBuilder2.lineToRelative(2.65f, 0.0f);
        pathBuilder2.lineToRelative(2.9f, -3.32f);
        pathBuilder2.lineToRelative(-2.0f, -1.0f);
        pathBuilder2.lineToRelative(2.35f, -2.68f);
        pathBuilder2.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw3 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk83 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(8.8f, 17.0f);
        pathBuilder3.lineToRelative(-2.9f, 3.32f);
        pathBuilder3.lineToRelative(2.0f, 1.0f);
        pathBuilder3.lineToRelative(-2.35f, 2.68f);
        pathBuilder3.lineToRelative(2.65f, 0.0f);
        pathBuilder3.lineToRelative(2.9f, -3.32f);
        pathBuilder3.lineToRelative(-2.0f, -1.0f);
        pathBuilder3.lineToRelative(2.35f, -2.68f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw3, iM31241getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thunderstorm = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
