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
public final class LinkOffKt {
    private static ImageVector _linkOff;

    public static final ImageVector getLinkOff(Icons.Rounded rounded) {
        ImageVector imageVector = _linkOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LinkOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(2.87f);
        pathBuilder.curveToRelative(1.46f, 0.0f, 2.8f, 0.98f, 3.08f, 2.42f);
        pathBuilder.curveToRelative(0.31f, 1.64f, -0.74f, 3.11f, -2.22f, 3.48f);
        pathBuilder.lineToRelative(1.53f, 1.53f);
        pathBuilder.curveToRelative(1.77f, -0.91f, 2.95f, -2.82f, 2.7f, -5.01f);
        pathBuilder.curveTo(21.68f, 8.86f, 19.37f, 7.0f, 16.79f, 7.0f);
        pathBuilder.horizontalLineTo(14.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.curveTo(13.0f, 8.55f, 13.45f, 9.0f, 14.0f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.51f, 3.51f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(2.64f, 2.64f);
        pathBuilder.curveToRelative(-1.77f, 0.91f, -2.95f, 2.82f, -2.7f, 5.01f);
        pathBuilder.curveTo(2.32f, 15.14f, 4.63f, 17.0f, 7.21f, 17.0f);
        pathBuilder.horizontalLineTo(10.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineTo(7.13f);
        pathBuilder.curveToRelative(-1.46f, 0.0f, -2.8f, -0.98f, -3.08f, -2.42f);
        pathBuilder.curveTo(3.74f, 10.94f, 4.8f, 9.47f, 6.27f, 9.1f);
        pathBuilder.lineToRelative(2.12f, 2.12f);
        pathBuilder.curveTo(8.16f, 11.41f, 8.0f, 11.68f, 8.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(1.17f);
        pathBuilder.lineToRelative(8.9f, 8.9f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineTo(3.51f, 3.51f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 11.0f);
        pathBuilder.lineToRelative(1.71f, 1.71f);
        pathBuilder.curveTo(15.89f, 12.53f, 16.0f, 12.28f, 16.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineTo(14.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _linkOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
