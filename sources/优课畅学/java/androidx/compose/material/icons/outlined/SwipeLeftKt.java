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
public final class SwipeLeftKt {
    private static ImageVector _swipeLeft;

    public static final ImageVector getSwipeLeft(Icons.Outlined outlined) {
        ImageVector imageVector = _swipeLeft;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SwipeLeft", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.89f, 13.77f);
        pathBuilder.lineToRelative(-3.8f, -1.67f);
        pathBuilder.curveTo(14.96f, 12.04f, 14.81f, 12.0f, 14.65f, 12.0f);
        pathBuilder.horizontalLineTo(14.0f);
        pathBuilder.verticalLineTo(7.5f);
        pathBuilder.curveTo(14.0f, 6.12f, 12.88f, 5.0f, 11.5f, 5.0f);
        pathBuilder.reflectiveCurveTo(9.0f, 6.12f, 9.0f, 7.5f);
        pathBuilder.verticalLineToRelative(8.15f);
        pathBuilder.lineToRelative(-1.87f, -0.4f);
        pathBuilder.curveToRelative(-0.19f, -0.03f, -1.02f, -0.15f, -1.73f, 0.56f);
        pathBuilder.lineTo(4.0f, 17.22f);
        pathBuilder.lineToRelative(5.12f, 5.19f);
        pathBuilder.curveTo(9.49f, 22.79f, 10.0f, 23.0f, 10.53f, 23.0f);
        pathBuilder.horizontalLineToRelative(6.55f);
        pathBuilder.curveToRelative(0.98f, 0.0f, 1.81f, -0.7f, 1.97f, -1.67f);
        pathBuilder.lineToRelative(0.92f, -5.44f);
        pathBuilder.curveTo(20.12f, 15.03f, 19.68f, 14.17f, 18.89f, 13.77f);
        pathBuilder.close();
        pathBuilder.moveTo(17.08f, 21.0f);
        pathBuilder.horizontalLineToRelative(-6.55f);
        pathBuilder.lineToRelative(-3.7f, -3.78f);
        pathBuilder.lineTo(11.0f, 18.11f);
        pathBuilder.verticalLineTo(7.5f);
        pathBuilder.curveTo(11.0f, 7.22f, 11.22f, 7.0f, 11.5f, 7.0f);
        pathBuilder.reflectiveCurveTo(12.0f, 7.22f, 12.0f, 7.5f);
        pathBuilder.verticalLineToRelative(6.18f);
        pathBuilder.horizontalLineToRelative(1.76f);
        pathBuilder.lineTo(18.0f, 15.56f);
        pathBuilder.lineTo(17.08f, 21.0f);
        pathBuilder.close();
        pathBuilder.moveTo(4.09f, 5.5f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.verticalLineToRelative(2.02f);
        pathBuilder.curveTo(5.82f, 2.13f, 8.78f, 1.0f, 12.0f, 1.0f);
        pathBuilder.curveToRelative(5.49f, 0.0f, 9.27f, 3.12f, 10.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(-1.57f);
        pathBuilder.curveTo(19.67f, 5.02f, 16.74f, 2.5f, 12.0f, 2.5f);
        pathBuilder.curveTo(8.97f, 2.5f, 6.21f, 3.64f, 4.09f, 5.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeLeft = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
