package androidx.compose.material.icons.filled;

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
public final class NoPhotographyKt {
    private static ImageVector _noPhotography;

    public static final ImageVector getNoPhotography(Icons.Filled filled) {
        ImageVector imageVector = _noPhotography;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NoPhotography", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.94f, 8.12f);
        pathBuilder.lineTo(7.48f, 4.66f);
        pathBuilder.lineTo(9.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.lineToRelative(1.83f, 2.0f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.curveToRelative(0.0f, 0.05f, -0.01f, 0.1f, -0.02f, 0.16f);
        pathBuilder.lineToRelative(-5.1f, -5.1f);
        pathBuilder.curveTo(16.96f, 13.71f, 17.0f, 13.36f, 17.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        pathBuilder.curveTo(11.64f, 8.0f, 11.29f, 8.04f, 10.94f, 8.12f);
        pathBuilder.close();
        pathBuilder.moveTo(20.49f, 23.31f);
        pathBuilder.lineTo(18.17f, 21.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.curveToRelative(0.0f, -0.59f, 0.27f, -1.12f, 0.68f, -1.49f);
        pathBuilder.lineToRelative(-2.0f, -2.0f);
        pathBuilder.lineTo(2.1f, 2.1f);
        pathBuilder.lineToRelative(19.8f, 19.8f);
        pathBuilder.lineTo(20.49f, 23.31f);
        pathBuilder.close();
        pathBuilder.moveTo(14.49f, 17.32f);
        pathBuilder.lineToRelative(-1.5f, -1.5f);
        pathBuilder.curveTo(12.67f, 15.92f, 12.35f, 16.0f, 12.0f, 16.0f);
        pathBuilder.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder.curveToRelative(0.0f, -0.35f, 0.08f, -0.67f, 0.19f, -0.98f);
        pathBuilder.lineToRelative(-1.5f, -1.5f);
        pathBuilder.curveTo(7.25f, 11.24f, 7.0f, 12.09f, 7.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder.curveTo(12.91f, 18.0f, 13.76f, 17.75f, 14.49f, 17.32f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noPhotography = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
