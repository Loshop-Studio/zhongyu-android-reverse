package androidx.compose.material.icons.automirrored.filled;

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
public final class _360Kt {
    private static ImageVector __360;

    public static final ImageVector get_360(Icons.AutoMirrored.Filled filled) {
        ImageVector imageVector = __360;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Filled._360", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 7.0f);
        pathBuilder.curveTo(6.48f, 7.0f, 2.0f, 9.24f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 2.24f, 2.94f, 4.13f, 7.0f, 4.77f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.lineToRelative(4.0f, -4.0f);
        pathBuilder.lineToRelative(-4.0f, -4.0f);
        pathBuilder.verticalLineToRelative(2.73f);
        pathBuilder.curveToRelative(-3.15f, -0.56f, -5.0f, -1.9f, -5.0f, -2.73f);
        pathBuilder.curveToRelative(0.0f, -1.06f, 3.04f, -3.0f, 8.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, 1.94f, 8.0f, 3.0f);
        pathBuilder.curveToRelative(0.0f, 0.73f, -1.46f, 1.89f, -4.0f, 2.53f);
        pathBuilder.verticalLineToRelative(2.05f);
        pathBuilder.curveToRelative(3.53f, -0.77f, 6.0f, -2.53f, 6.0f, -4.58f);
        pathBuilder.curveToRelative(0.0f, -2.76f, -4.48f, -5.0f, -10.0f, -5.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __360 = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
