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
public final class PinchKt {
    private static ImageVector _pinch;

    public static final ImageVector getPinch(Icons.Rounded rounded) {
        ImageVector imageVector = _pinch;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Pinch", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.2f, 17.43f);
        pathBuilder.curveToRelative(0.0f, -0.65f, 0.6f, -1.13f, 1.24f, -0.99f);
        pathBuilder.lineTo(13.0f, 17.24f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.curveTo(13.0f, 5.67f, 13.67f, 5.0f, 14.5f, 5.0f);
        pathBuilder.reflectiveCurveTo(16.0f, 5.67f, 16.0f, 6.5f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(0.91f);
        pathBuilder.curveToRelative(0.31f, 0.0f, 0.62f, 0.07f, 0.89f, 0.21f);
        pathBuilder.lineToRelative(4.09f, 2.04f);
        pathBuilder.curveToRelative(0.77f, 0.38f, 1.21f, 1.22f, 1.09f, 2.07f);
        pathBuilder.lineToRelative(-0.63f, 4.46f);
        pathBuilder.curveTo(22.21f, 22.27f, 21.36f, 23.0f, 20.37f, 23.0f);
        pathBuilder.horizontalLineToRelative(-6.16f);
        pathBuilder.curveToRelative(-0.53f, 0.0f, -1.29f, -0.21f, -1.66f, -0.59f);
        pathBuilder.lineToRelative(-4.07f, -4.29f);
        pathBuilder.curveTo(8.3f, 17.94f, 8.2f, 17.69f, 8.2f, 17.43f);
        pathBuilder.close();
        pathBuilder.moveTo(9.5f, 5.25f);
        pathBuilder.curveTo(9.5f, 5.66f, 9.84f, 6.0f, 10.25f, 6.0f);
        pathBuilder.reflectiveCurveTo(11.0f, 5.66f, 11.0f, 5.25f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineTo(6.75f);
        pathBuilder.curveTo(6.34f, 1.0f, 6.0f, 1.34f, 6.0f, 1.75f);
        pathBuilder.reflectiveCurveTo(6.34f, 2.5f, 6.75f, 2.5f);
        pathBuilder.horizontalLineToRelative(1.69f);
        pathBuilder.lineTo(2.5f, 8.44f);
        pathBuilder.verticalLineTo(6.75f);
        pathBuilder.curveTo(2.5f, 6.34f, 2.16f, 6.0f, 1.75f, 6.0f);
        pathBuilder.reflectiveCurveTo(1.0f, 6.34f, 1.0f, 6.75f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(3.25f);
        pathBuilder.curveTo(5.66f, 11.0f, 6.0f, 10.66f, 6.0f, 10.25f);
        pathBuilder.reflectiveCurveTo(5.66f, 9.5f, 5.25f, 9.5f);
        pathBuilder.horizontalLineTo(3.56f);
        pathBuilder.lineTo(9.5f, 3.56f);
        pathBuilder.verticalLineTo(5.25f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pinch = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
