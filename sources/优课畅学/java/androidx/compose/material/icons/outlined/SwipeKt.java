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
public final class SwipeKt {
    private static ImageVector _swipe;

    public static final ImageVector getSwipe(Icons.Outlined outlined) {
        ImageVector imageVector = _swipe;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Swipe", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM24629getButtKaPHkGw = companion2.m24629getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM24639getBevelLxFBmk8 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.5f, 2.0f);
        pathBuilder.verticalLineToRelative(2.02f);
        pathBuilder.curveTo(18.18f, 2.13f, 15.22f, 1.0f, 12.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(5.82f, 2.13f, 3.5f, 4.02f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineToRelative(3.5f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineTo(5.5f);
        pathBuilder.horizontalLineTo(4.09f);
        pathBuilder.curveToRelative(2.11f, -1.86f, 4.88f, -3.0f, 7.91f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(5.79f, 1.14f, 7.91f, 3.0f);
        pathBuilder.horizontalLineTo(17.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(3.5f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.verticalLineTo(5.5f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.horizontalLineTo(20.5f);
        pathBuilder.close();
        ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw2 = companion2.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk82 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(18.89f, 13.77f);
        pathBuilder2.lineToRelative(-3.8f, -1.67f);
        pathBuilder2.curveTo(14.96f, 12.04f, 14.81f, 12.0f, 14.65f, 12.0f);
        pathBuilder2.horizontalLineTo(14.0f);
        pathBuilder2.lineToRelative(0.0f, -4.37f);
        pathBuilder2.curveToRelative(0.0f, -1.32f, -0.96f, -2.5f, -2.27f, -2.62f);
        pathBuilder2.curveTo(10.25f, 4.88f, 9.0f, 6.05f, 9.0f, 7.5f);
        pathBuilder2.verticalLineToRelative(8.15f);
        pathBuilder2.lineToRelative(-1.87f, -0.4f);
        pathBuilder2.curveToRelative(-0.19f, -0.03f, -1.02f, -0.15f, -1.73f, 0.56f);
        pathBuilder2.lineTo(4.0f, 17.22f);
        pathBuilder2.lineToRelative(5.12f, 5.19f);
        pathBuilder2.curveTo(9.49f, 22.79f, 10.0f, 23.0f, 10.53f, 23.0f);
        pathBuilder2.horizontalLineToRelative(6.55f);
        pathBuilder2.curveToRelative(0.98f, 0.0f, 1.81f, -0.7f, 1.97f, -1.67f);
        pathBuilder2.lineToRelative(0.92f, -5.44f);
        pathBuilder2.curveTo(20.12f, 15.03f, 19.68f, 14.17f, 18.89f, 13.77f);
        pathBuilder2.close();
        pathBuilder2.moveTo(18.0f, 15.56f);
        pathBuilder2.lineTo(17.08f, 21.0f);
        pathBuilder2.horizontalLineToRelative(-6.55f);
        pathBuilder2.lineToRelative(-3.7f, -3.78f);
        pathBuilder2.lineTo(11.0f, 18.11f);
        pathBuilder2.verticalLineTo(7.5f);
        pathBuilder2.curveTo(11.0f, 7.22f, 11.22f, 7.0f, 11.5f, 7.0f);
        pathBuilder2.reflectiveCurveTo(12.0f, 7.22f, 12.0f, 7.5f);
        pathBuilder2.verticalLineToRelative(6.18f);
        pathBuilder2.horizontalLineToRelative(1.76f);
        pathBuilder2.lineTo(18.0f, 15.56f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw2, iM24639getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipe = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
