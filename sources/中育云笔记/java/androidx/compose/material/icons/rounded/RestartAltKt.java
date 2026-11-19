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
public final class RestartAltKt {
    private static ImageVector _restartAlt;

    public static final ImageVector getRestartAlt(Icons.Rounded rounded) {
        ImageVector imageVector = _restartAlt;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RestartAlt", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 5.0f);
        pathBuilder.verticalLineTo(3.21f);
        pathBuilder.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        pathBuilder.lineTo(8.35f, 5.65f);
        pathBuilder.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder.lineToRelative(2.79f, 2.79f);
        pathBuilder.curveTo(11.46f, 9.46f, 12.0f, 9.24f, 12.0f, 8.79f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        pathBuilder.curveToRelative(0.0f, 2.72f, -1.83f, 5.02f, -4.31f, 5.75f);
        pathBuilder.curveTo(13.27f, 18.87f, 13.0f, 19.27f, 13.0f, 19.7f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, 0.65f, 0.62f, 1.16f, 1.25f, 0.97f);
        pathBuilder.curveTo(17.57f, 19.7f, 20.0f, 16.64f, 20.0f, 13.0f);
        pathBuilder.curveTo(20.0f, 8.58f, 16.42f, 5.0f, 12.0f, 5.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(6.0f, 13.0f);
        pathBuilder2.curveToRelative(0.0f, -1.34f, 0.44f, -2.58f, 1.19f, -3.59f);
        pathBuilder2.curveToRelative(0.3f, -0.4f, 0.26f, -0.95f, -0.09f, -1.31f);
        pathBuilder2.lineToRelative(0.0f, 0.0f);
        pathBuilder2.curveTo(6.68f, 7.68f, 5.96f, 7.72f, 5.6f, 8.2f);
        pathBuilder2.curveTo(4.6f, 9.54f, 4.0f, 11.2f, 4.0f, 13.0f);
        pathBuilder2.curveToRelative(0.0f, 3.64f, 2.43f, 6.7f, 5.75f, 7.67f);
        pathBuilder2.curveTo(10.38f, 20.86f, 11.0f, 20.35f, 11.0f, 19.7f);
        pathBuilder2.verticalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.0f, -0.43f, -0.27f, -0.83f, -0.69f, -0.95f);
        pathBuilder2.curveTo(7.83f, 18.02f, 6.0f, 15.72f, 6.0f, 13.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _restartAlt = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
