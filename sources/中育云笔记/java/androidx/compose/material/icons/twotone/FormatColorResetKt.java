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
public final class FormatColorResetKt {
    private static ImageVector _formatColorReset;

    public static final ImageVector getFormatColorReset(Icons.TwoTone twoTone) {
        ImageVector imageVector = _formatColorReset;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FormatColorReset", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.93f, 7.83f);
        pathBuilder.lineToRelative(4.77f, 4.77f);
        pathBuilder.curveToRelative(-0.62f, -1.81f, -2.17f, -4.24f, -3.71f, -6.24f);
        pathBuilder.curveToRelative(-0.35f, 0.47f, -0.71f, 0.96f, -1.06f, 1.47f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 18.0f);
        pathBuilder.curveToRelative(0.96f, 0.0f, 1.83f, -0.36f, 2.53f, -0.92f);
        pathBuilder.lineToRelative(-5.72f, -5.72f);
        pathBuilder.curveTo(8.32f, 12.38f, 8.0f, 13.31f, 8.0f, 14.0f);
        pathBuilder.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 6.36f);
        pathBuilder2.curveToRelative(1.53f, 2.0f, 3.08f, 4.43f, 3.71f, 6.24f);
        pathBuilder2.lineToRelative(2.23f, 2.23f);
        pathBuilder2.curveToRelative(0.03f, -0.27f, 0.06f, -0.55f, 0.06f, -0.83f);
        pathBuilder2.curveToRelative(0.0f, -3.98f, -6.0f, -10.8f, -6.0f, -10.8f);
        pathBuilder2.reflectiveCurveToRelative(-1.18f, 1.35f, -2.5f, 3.19f);
        pathBuilder2.lineToRelative(1.44f, 1.44f);
        pathBuilder2.curveToRelative(0.34f, -0.51f, 0.7f, -1.0f, 1.06f, -1.47f);
        pathBuilder2.close();
        pathBuilder2.moveTo(5.41f, 5.14f);
        pathBuilder2.lineTo(4.0f, 6.55f);
        pathBuilder2.lineToRelative(3.32f, 3.32f);
        pathBuilder2.curveTo(6.55f, 11.33f, 6.0f, 12.79f, 6.0f, 14.0f);
        pathBuilder2.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        pathBuilder2.curveToRelative(1.52f, 0.0f, 2.9f, -0.57f, 3.95f, -1.5f);
        pathBuilder2.lineToRelative(2.63f, 2.63f);
        pathBuilder2.lineTo(20.0f, 19.72f);
        pathBuilder2.lineTo(5.41f, 5.14f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 18.0f);
        pathBuilder2.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilder2.curveToRelative(0.0f, -0.69f, 0.32f, -1.62f, 0.81f, -2.64f);
        pathBuilder2.lineToRelative(5.72f, 5.72f);
        pathBuilder2.curveToRelative(-0.7f, 0.56f, -1.57f, 0.92f, -2.53f, 0.92f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatColorReset = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
