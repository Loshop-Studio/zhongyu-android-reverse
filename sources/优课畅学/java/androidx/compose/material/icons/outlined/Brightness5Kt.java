package androidx.compose.material.icons.outlined;

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
public final class Brightness5Kt {
    private static ImageVector _brightness5;

    public static final ImageVector getBrightness5(Icons.Outlined outlined) {
        ImageVector imageVector = _brightness5;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Brightness5", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 8.69f);
        pathBuilder.lineTo(20.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(-4.69f);
        pathBuilder.lineTo(12.0f, 0.69f);
        pathBuilder.lineTo(8.69f, 4.0f);
        pathBuilder.lineTo(4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(4.69f);
        pathBuilder.lineTo(0.69f, 12.0f);
        pathBuilder.lineTo(4.0f, 15.31f);
        pathBuilder.lineTo(4.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(4.69f);
        pathBuilder.lineTo(12.0f, 23.31f);
        pathBuilder.lineTo(15.31f, 20.0f);
        pathBuilder.lineTo(20.0f, 20.0f);
        pathBuilder.verticalLineToRelative(-4.69f);
        pathBuilder.lineTo(23.31f, 12.0f);
        pathBuilder.lineTo(20.0f, 8.69f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 14.48f);
        pathBuilder.lineTo(18.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(-3.52f);
        pathBuilder.lineTo(12.0f, 20.48f);
        pathBuilder.lineTo(9.52f, 18.0f);
        pathBuilder.lineTo(6.0f, 18.0f);
        pathBuilder.verticalLineToRelative(-3.52f);
        pathBuilder.lineTo(3.52f, 12.0f);
        pathBuilder.lineTo(6.0f, 9.52f);
        pathBuilder.lineTo(6.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(3.52f);
        pathBuilder.lineTo(12.0f, 3.52f);
        pathBuilder.lineTo(14.48f, 6.0f);
        pathBuilder.lineTo(18.0f, 6.0f);
        pathBuilder.verticalLineToRelative(3.52f);
        pathBuilder.lineTo(20.48f, 12.0f);
        pathBuilder.lineTo(18.0f, 14.48f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 6.5f);
        pathBuilder.curveToRelative(-3.03f, 0.0f, -5.5f, 2.47f, -5.5f, 5.5f);
        pathBuilder.reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f);
        pathBuilder.reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f);
        pathBuilder.reflectiveCurveToRelative(-2.47f, -5.5f, -5.5f, -5.5f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 15.5f);
        pathBuilder.curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f);
        pathBuilder.reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f);
        pathBuilder.reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f);
        pathBuilder.reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _brightness5 = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
