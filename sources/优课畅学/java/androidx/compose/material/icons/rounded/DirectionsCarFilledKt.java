package androidx.compose.material.icons.rounded;

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
public final class DirectionsCarFilledKt {
    private static ImageVector _directionsCarFilled;

    public static final ImageVector getDirectionsCarFilled(Icons.Rounded rounded) {
        ImageVector imageVector = _directionsCarFilled;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DirectionsCarFilled", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.92f, 6.01f);
        pathBuilder.curveTo(18.72f, 5.42f, 18.16f, 5.0f, 17.5f, 5.0f);
        pathBuilder.horizontalLineToRelative(-11.0f);
        pathBuilder.curveTo(5.84f, 5.0f, 5.29f, 5.42f, 5.08f, 6.01f);
        pathBuilder.lineTo(3.0f, 12.0f);
        pathBuilder.verticalLineToRelative(7.5f);
        pathBuilder.curveTo(3.0f, 20.33f, 3.67f, 21.0f, 4.5f, 21.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(5.33f, 21.0f, 6.0f, 20.33f, 6.0f, 19.5f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineToRelative(0.5f);
        pathBuilder.curveToRelative(0.0f, 0.82f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.82f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.lineTo(18.92f, 6.01f);
        pathBuilder.close();
        pathBuilder.moveTo(7.5f, 16.0f);
        pathBuilder.curveTo(6.67f, 16.0f, 6.0f, 15.33f, 6.0f, 14.5f);
        pathBuilder.reflectiveCurveTo(6.67f, 13.0f, 7.5f, 13.0f);
        pathBuilder.reflectiveCurveTo(9.0f, 13.67f, 9.0f, 14.5f);
        pathBuilder.reflectiveCurveTo(8.33f, 16.0f, 7.5f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.5f, 16.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(17.33f, 16.0f, 16.5f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.81f, 10.0f);
        pathBuilder.lineToRelative(1.04f, -3.0f);
        pathBuilder.horizontalLineToRelative(10.29f);
        pathBuilder.lineToRelative(1.04f, 3.0f);
        pathBuilder.horizontalLineTo(5.81f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _directionsCarFilled = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
