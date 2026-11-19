package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class ScreenRotationKt {
    private static ImageVector _screenRotation;

    public static final ImageVector getScreenRotation(Icons.TwoTone twoTone) {
        ImageVector imageVector = _screenRotation;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ScreenRotation", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.828f, 21.192f);
        pathBuilder.lineTo(2.808f, 9.172f);
        pathBuilder.lineToRelative(6.357f, -6.357f);
        pathBuilder.lineToRelative(12.02f, 12.02f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(16.48f, 2.52f);
        pathBuilder2.curveToRelative(3.27f, 1.55f, 5.61f, 4.72f, 5.97f, 8.48f);
        pathBuilder2.horizontalLineToRelative(1.5f);
        pathBuilder2.curveTo(23.44f, 4.84f, 18.29f, 0.0f, 12.0f, 0.0f);
        pathBuilder2.lineToRelative(-0.66f, 0.03f);
        pathBuilder2.lineToRelative(3.81f, 3.81f);
        pathBuilder2.lineToRelative(1.33f, -1.32f);
        pathBuilder2.close();
        pathBuilder2.moveTo(10.23f, 1.75f);
        pathBuilder2.curveToRelative(-0.59f, -0.59f, -1.54f, -0.59f, -2.12f, 0.0f);
        pathBuilder2.lineTo(1.75f, 8.11f);
        pathBuilder2.curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0.0f, 2.12f);
        pathBuilder2.lineToRelative(12.02f, 12.02f);
        pathBuilder2.curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0.0f);
        pathBuilder2.lineToRelative(6.36f, -6.36f);
        pathBuilder2.curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0.0f, -2.12f);
        pathBuilder2.lineTo(10.23f, 1.75f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.83f, 21.19f);
        pathBuilder2.lineTo(2.81f, 9.17f);
        pathBuilder2.lineToRelative(6.36f, -6.36f);
        pathBuilder2.lineToRelative(12.02f, 12.02f);
        pathBuilder2.lineToRelative(-6.36f, 6.36f);
        pathBuilder2.close();
        pathBuilder2.moveTo(7.52f, 21.48f);
        pathBuilder2.curveTo(4.25f, 19.94f, 1.91f, 16.76f, 1.55f, 13.0f);
        pathBuilder2.lineTo(0.05f, 13.0f);
        pathBuilder2.curveTo(0.56f, 19.16f, 5.71f, 24.0f, 12.0f, 24.0f);
        pathBuilder2.lineToRelative(0.66f, -0.03f);
        pathBuilder2.lineToRelative(-3.81f, -3.81f);
        pathBuilder2.lineToRelative(-1.33f, 1.32f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _screenRotation = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
