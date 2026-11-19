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
public final class _1kKt {
    private static ImageVector __1k;

    public static final ImageVector get_1k(Icons.Rounded rounded) {
        ImageVector imageVector = __1k;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded._1k", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        pathBuilder.moveTo(9.25f, 15.0f);
        pathBuilder.lineTo(9.25f, 15.0f);
        pathBuilder.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilder.verticalLineTo(10.5f);
        pathBuilder.horizontalLineTo(7.75f);
        pathBuilder.curveTo(7.34f, 10.5f, 7.0f, 10.16f, 7.0f, 9.75f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveTo(7.0f, 9.34f, 7.34f, 9.0f, 7.75f, 9.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(4.25f);
        pathBuilder.curveTo(10.0f, 14.66f, 9.66f, 15.0f, 9.25f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.59f, 15.0f);
        pathBuilder.lineTo(15.59f, 15.0f);
        pathBuilder.curveToRelative(-0.22f, 0.0f, -0.42f, -0.1f, -0.55f, -0.27f);
        pathBuilder.lineToRelative(-1.54f, -1.98f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(12.34f, 15.0f, 12.0f, 14.66f, 12.0f, 14.25f);
        pathBuilder.verticalLineToRelative(-4.5f);
        pathBuilder.curveTo(12.0f, 9.34f, 12.34f, 9.0f, 12.75f, 9.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.lineToRelative(1.54f, -1.98f);
        pathBuilder.curveTo(15.17f, 9.1f, 15.38f, 9.0f, 15.59f, 9.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.58f, 0.0f, 0.91f, 0.66f, 0.56f, 1.12f);
        pathBuilder.lineTo(14.75f, 12.0f);
        pathBuilder.lineToRelative(1.41f, 1.88f);
        pathBuilder.curveTo(16.5f, 14.34f, 16.17f, 15.0f, 15.59f, 15.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __1k = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
