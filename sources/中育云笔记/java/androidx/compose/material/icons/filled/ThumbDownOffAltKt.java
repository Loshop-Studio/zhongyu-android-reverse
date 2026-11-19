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
public final class ThumbDownOffAltKt {
    private static ImageVector _thumbDownOffAlt;

    public static final ImageVector getThumbDownOffAlt(Icons.Filled filled) {
        ImageVector imageVector = _thumbDownOffAlt;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ThumbDownOffAlt", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.89f, 18.28f);
        pathBuilder.lineToRelative(0.57f, -2.89f);
        pathBuilder.curveToRelative(0.12f, -0.59f, -0.04f, -1.2f, -0.42f, -1.66f);
        pathBuilder.curveToRelative(-0.38f, -0.46f, -0.94f, -0.73f, -1.54f, -0.73f);
        pathBuilder.lineTo(4.0f, 13.0f);
        pathBuilder.verticalLineToRelative(-1.08f);
        pathBuilder.lineTo(6.57f, 6.0f);
        pathBuilder.horizontalLineToRelative(8.09f);
        pathBuilder.curveToRelative(0.18f, 0.0f, 0.34f, 0.16f, 0.34f, 0.34f);
        pathBuilder.verticalLineToRelative(7.84f);
        pathBuilder.lineToRelative(-4.11f, 4.1f);
        pathBuilder.moveTo(10.0f, 22.0f);
        pathBuilder.lineToRelative(6.41f, -6.41f);
        pathBuilder.curveToRelative(0.38f, -0.38f, 0.59f, -0.89f, 0.59f, -1.42f);
        pathBuilder.lineTo(17.0f, 6.34f);
        pathBuilder.curveTo(17.0f, 5.05f, 15.95f, 4.0f, 14.66f, 4.0f);
        pathBuilder.horizontalLineToRelative(-8.1f);
        pathBuilder.curveToRelative(-0.71f, 0.0f, -1.36f, 0.37f, -1.72f, 0.97f);
        pathBuilder.lineToRelative(-2.67f, 6.15f);
        pathBuilder.curveToRelative(-0.11f, 0.25f, -0.17f, 0.52f, -0.17f, 0.8f);
        pathBuilder.lineTo(2.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(5.5f);
        pathBuilder.lineToRelative(-0.92f, 4.65f);
        pathBuilder.curveToRelative(-0.05f, 0.22f, -0.02f, 0.46f, 0.08f, 0.66f);
        pathBuilder.curveToRelative(0.23f, 0.45f, 0.52f, 0.86f, 0.88f, 1.22f);
        pathBuilder.lineTo(10.0f, 22.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 15.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineTo(22.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(9.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thumbDownOffAlt = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
