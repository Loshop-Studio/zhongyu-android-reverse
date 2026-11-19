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
public final class DonutLargeKt {
    private static ImageVector _donutLarge;

    public static final ImageVector getDonutLarge(Icons.Filled filled) {
        ImageVector imageVector = _donutLarge;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DonutLarge", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 5.08f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.curveTo(6.0f, 2.5f, 2.0f, 6.81f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.0f, 9.5f, 9.0f, 10.0f);
        pathBuilder.verticalLineToRelative(-3.08f);
        pathBuilder.curveToRelative(-3.0f, -0.48f, -6.0f, -3.4f, -6.0f, -6.92f);
        pathBuilder.reflectiveCurveTo(8.0f, 5.56f, 11.0f, 5.08f);
        pathBuilder.close();
        pathBuilder.moveTo(18.97f, 11.0f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.curveToRelative(-0.47f, -5.0f, -4.0f, -8.53f, -9.0f, -9.0f);
        pathBuilder.verticalLineToRelative(3.08f);
        pathBuilder.curveTo(16.0f, 5.51f, 18.54f, 8.0f, 18.97f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 18.92f);
        pathBuilder.verticalLineTo(22.0f);
        pathBuilder.curveToRelative(5.0f, -0.47f, 8.53f, -4.0f, 9.0f, -9.0f);
        pathBuilder.horizontalLineToRelative(-3.03f);
        pathBuilder.curveTo(18.54f, 16.0f, 16.0f, 18.49f, 13.0f, 18.92f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _donutLarge = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
