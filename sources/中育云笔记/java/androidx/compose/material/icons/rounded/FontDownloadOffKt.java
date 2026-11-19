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
public final class FontDownloadOffKt {
    private static ImageVector _fontDownloadOff;

    public static final ImageVector getFontDownloadOff(Icons.Rounded rounded) {
        ImageVector imageVector = _fontDownloadOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FontDownloadOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.58f, 9.75f);
        pathBuilder.lineToRelative(-0.87f, -0.87f);
        pathBuilder.lineToRelative(0.23f, -0.66f);
        pathBuilder.horizontalLineToRelative(0.1f);
        pathBuilder.lineTo(12.58f, 9.75f);
        pathBuilder.close();
        pathBuilder.moveTo(10.35f, 7.52f);
        pathBuilder.lineTo(10.55f, 7.0f);
        pathBuilder.curveToRelative(0.23f, -0.6f, 0.8f, -1.0f, 1.45f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.22f, 0.4f, 1.45f, 1.0f);
        pathBuilder.lineToRelative(2.17f, 5.79f);
        pathBuilder.lineTo(22.0f, 19.17f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineTo(4.83f);
        pathBuilder.lineTo(10.35f, 7.52f);
        pathBuilder.close();
        pathBuilder.moveTo(21.19f, 22.61f);
        pathBuilder.lineTo(21.19f, 22.61f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilder.lineTo(19.17f, 22.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.verticalLineTo(4.83f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.curveTo(1.0f, 3.83f, 1.0f, 3.2f, 1.39f, 2.81f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(18.38f, 18.38f);
        pathBuilder.curveTo(21.58f, 21.58f, 21.58f, 22.22f, 21.19f, 22.61f);
        pathBuilder.close();
        pathBuilder.moveTo(12.1f, 14.93f);
        pathBuilder.lineToRelative(-3.3f, -3.3f);
        pathBuilder.lineTo(6.9f, 16.7f);
        pathBuilder.curveTo(6.67f, 17.33f, 7.13f, 18.0f, 7.8f, 18.0f);
        pathBuilder.horizontalLineToRelative(0.01f);
        pathBuilder.curveToRelative(0.41f, 0.0f, 0.77f, -0.26f, 0.9f, -0.64f);
        pathBuilder.lineToRelative(0.86f, -2.43f);
        pathBuilder.horizontalLineTo(12.1f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fontDownloadOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
