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
public final class WatchOffKt {
    private static ImageVector _watchOff;

    public static final ImageVector getWatchOff(Icons.Outlined outlined) {
        ImageVector imageVector = _watchOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.WatchOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 7.0f);
        pathBuilder.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, 0.64f, -0.13f, 1.25f, -0.35f, 1.82f);
        pathBuilder.lineToRelative(1.5f, 1.5f);
        pathBuilder.curveTo(18.69f, 14.33f, 19.0f, 13.2f, 19.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -2.22f, -1.03f, -4.19f, -2.64f, -5.47f);
        pathBuilder.lineTo(15.0f, 2.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.lineTo(8.04f, 5.21f);
        pathBuilder.lineToRelative(2.14f, 2.14f);
        pathBuilder.curveTo(10.75f, 7.13f, 11.36f, 7.0f, 12.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.49f, 4.0f);
        pathBuilder.horizontalLineToRelative(3.02f);
        pathBuilder.lineToRelative(0.38f, 1.27f);
        pathBuilder.curveToRelative(-0.55f, -0.16f, -1.97f, -0.51f, -3.78f, 0.0f);
        pathBuilder.lineTo(10.49f, 4.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(2.81f, 2.81f);
        pathBuilder2.lineTo(1.39f, 4.22f);
        pathBuilder2.lineToRelative(4.46f, 4.46f);
        pathBuilder2.curveTo(5.31f, 9.67f, 5.0f, 10.8f, 5.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, 2.22f, 1.03f, 4.19f, 2.64f, 5.47f);
        pathBuilder2.lineTo(9.0f, 22.0f);
        pathBuilder2.horizontalLineToRelative(6.0f);
        pathBuilder2.lineToRelative(0.96f, -3.21f);
        pathBuilder2.lineToRelative(3.82f, 3.82f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.lineTo(2.81f, 2.81f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.51f, 20.0f);
        pathBuilder2.horizontalLineToRelative(-3.02f);
        pathBuilder2.lineToRelative(-0.38f, -1.27f);
        pathBuilder2.curveToRelative(0.55f, 0.15f, 1.97f, 0.51f, 3.78f, 0.0f);
        pathBuilder2.lineTo(13.51f, 20.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 17.0f);
        pathBuilder2.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        pathBuilder2.curveToRelative(0.0f, -0.64f, 0.13f, -1.25f, 0.35f, -1.82f);
        pathBuilder2.lineToRelative(6.47f, 6.47f);
        pathBuilder2.curveTo(13.25f, 16.87f, 12.64f, 17.0f, 12.0f, 17.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _watchOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
