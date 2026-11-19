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
public final class _7kKt {
    private static ImageVector __7k;

    public static final ImageVector get_7k(Icons.Rounded rounded) {
        ImageVector imageVector = __7k;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded._7k", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 3.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.95f, 15.0f);
        pathBuilder.horizontalLineTo(8.76f);
        pathBuilder.curveToRelative(-0.5f, 0.0f, -0.86f, -0.49f, -0.72f, -0.97f);
        pathBuilder.lineToRelative(1.08f, -3.53f);
        pathBuilder.horizontalLineTo(7.25f);
        pathBuilder.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveTo(6.5f, 9.34f, 6.84f, 9.0f, 7.25f, 9.0f);
        pathBuilder.horizontalLineTo(10.0f);
        pathBuilder.curveToRelative(0.67f, 0.0f, 1.15f, 0.65f, 0.96f, 1.29f);
        pathBuilder.lineToRelative(-1.3f, 4.18f);
        pathBuilder.curveTo(9.57f, 14.79f, 9.28f, 15.0f, 8.95f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.59f, 15.0f);
        pathBuilder.lineTo(16.59f, 15.0f);
        pathBuilder.curveToRelative(-0.22f, 0.0f, -0.42f, -0.1f, -0.55f, -0.27f);
        pathBuilder.lineToRelative(-1.54f, -1.98f);
        pathBuilder.verticalLineToRelative(1.55f);
        pathBuilder.curveToRelative(0.0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f);
        pathBuilder.horizontalLineTo(13.7f);
        pathBuilder.curveToRelative(-0.39f, 0.0f, -0.7f, -0.31f, -0.7f, -0.7f);
        pathBuilder.verticalLineTo(9.7f);
        pathBuilder.curveTo(13.0f, 9.31f, 13.31f, 9.0f, 13.7f, 9.0f);
        pathBuilder.horizontalLineToRelative(0.09f);
        pathBuilder.curveToRelative(0.39f, 0.0f, 0.7f, 0.31f, 0.7f, 0.7f);
        pathBuilder.verticalLineToRelative(1.55f);
        pathBuilder.lineToRelative(1.54f, -1.98f);
        pathBuilder.curveTo(16.17f, 9.1f, 16.38f, 9.0f, 16.59f, 9.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.58f, 0.0f, 0.91f, 0.66f, 0.56f, 1.12f);
        pathBuilder.lineTo(15.75f, 12.0f);
        pathBuilder.lineToRelative(1.41f, 1.88f);
        pathBuilder.curveTo(17.5f, 14.34f, 17.17f, 15.0f, 16.59f, 15.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __7k = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
