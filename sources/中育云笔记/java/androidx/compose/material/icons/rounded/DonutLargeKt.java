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
public final class DonutLargeKt {
    private static ImageVector _donutLarge;

    public static final ImageVector getDonutLarge(Icons.Rounded rounded) {
        ImageVector imageVector = _donutLarge;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DonutLarge", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.07f, 5.32f);
        pathBuilder.curveTo(16.26f, 6.0f, 18.0f, 7.74f, 18.68f, 9.93f);
        pathBuilder.curveToRelative(0.19f, 0.63f, 0.76f, 1.07f, 1.41f, 1.07f);
        pathBuilder.horizontalLineToRelative(0.04f);
        pathBuilder.curveToRelative(1.0f, 0.0f, 1.72f, -0.96f, 1.43f, -1.91f);
        pathBuilder.curveToRelative(-0.97f, -3.18f, -3.48f, -5.69f, -6.66f, -6.66f);
        pathBuilder.curveToRelative(-0.94f, -0.29f, -1.9f, 0.43f, -1.9f, 1.43f);
        pathBuilder.verticalLineToRelative(0.04f);
        pathBuilder.curveToRelative(0.0f, 0.66f, 0.44f, 1.23f, 1.07f, 1.42f);
        pathBuilder.close();
        pathBuilder.moveTo(18.68f, 14.07f);
        pathBuilder.curveToRelative(-0.68f, 2.2f, -2.42f, 3.93f, -4.61f, 4.61f);
        pathBuilder.curveToRelative(-0.63f, 0.19f, -1.07f, 0.76f, -1.07f, 1.41f);
        pathBuilder.verticalLineToRelative(0.04f);
        pathBuilder.curveToRelative(0.0f, 1.0f, 0.96f, 1.72f, 1.91f, 1.43f);
        pathBuilder.curveToRelative(3.18f, -0.97f, 5.69f, -3.48f, 6.66f, -6.66f);
        pathBuilder.curveToRelative(0.29f, -0.95f, -0.43f, -1.91f, -1.42f, -1.91f);
        pathBuilder.horizontalLineToRelative(-0.05f);
        pathBuilder.curveToRelative(-0.66f, 0.01f, -1.23f, 0.45f, -1.42f, 1.08f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 20.11f);
        pathBuilder.curveToRelative(0.0f, -0.67f, -0.45f, -1.24f, -1.09f, -1.44f);
        pathBuilder.curveTo(7.07f, 17.78f, 5.0f, 15.13f, 5.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(2.07f, -5.78f, 4.91f, -6.67f);
        pathBuilder.curveToRelative(0.64f, -0.2f, 1.09f, -0.77f, 1.09f, -1.44f);
        pathBuilder.verticalLineToRelative(-0.01f);
        pathBuilder.curveToRelative(0.0f, -1.0f, -0.97f, -1.74f, -1.93f, -1.44f);
        pathBuilder.curveTo(4.98f, 3.69f, 2.0f, 7.5f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 4.5f, 2.98f, 8.31f, 7.07f, 9.56f);
        pathBuilder.curveToRelative(0.96f, 0.3f, 1.93f, -0.44f, 1.93f, -1.45f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _donutLarge = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
