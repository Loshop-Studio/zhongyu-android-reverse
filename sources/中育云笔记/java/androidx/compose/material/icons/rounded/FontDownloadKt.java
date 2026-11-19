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
public final class FontDownloadKt {
    private static ImageVector _fontDownload;

    public static final ImageVector getFontDownload(Icons.Rounded rounded) {
        ImageVector imageVector = _fontDownload;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FontDownload", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.93f, 13.5f);
        pathBuilder.horizontalLineToRelative(4.14f);
        pathBuilder.lineTo(12.0f, 7.98f);
        pathBuilder.lineTo(9.93f, 13.5f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 2.0f);
        pathBuilder.lineTo(4.0f, 2.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.lineTo(22.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.71f, 17.88f);
        pathBuilder.lineToRelative(-0.9f, -2.38f);
        pathBuilder.lineTo(9.17f, 15.5f);
        pathBuilder.lineToRelative(-0.89f, 2.37f);
        pathBuilder.curveToRelative(-0.14f, 0.38f, -0.5f, 0.63f, -0.91f, 0.63f);
        pathBuilder.curveToRelative(-0.68f, 0.0f, -1.15f, -0.69f, -0.9f, -1.32f);
        pathBuilder.lineToRelative(4.25f, -10.81f);
        pathBuilder.curveToRelative(0.22f, -0.53f, 0.72f, -0.87f, 1.28f, -0.87f);
        pathBuilder.reflectiveCurveToRelative(1.06f, 0.34f, 1.27f, 0.87f);
        pathBuilder.lineToRelative(4.25f, 10.81f);
        pathBuilder.curveToRelative(0.25f, 0.63f, -0.22f, 1.32f, -0.9f, 1.32f);
        pathBuilder.curveToRelative(-0.4f, 0.0f, -0.76f, -0.25f, -0.91f, -0.62f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fontDownload = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
