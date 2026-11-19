package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;
import androidx.compose.p013ui.graphics.vector.ImageVector;
import androidx.compose.p013ui.graphics.vector.PathBuilder;
import androidx.compose.p013ui.graphics.vector.VectorKt;
import androidx.compose.p013ui.unit.C3156Dp;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
public final class DonutLargeKt {
    private static ImageVector _donutLarge;

    public static final ImageVector getDonutLarge(Icons.Filled filled) {
        ImageVector imageVector = _donutLarge;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DonutLarge", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
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
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _donutLarge = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
