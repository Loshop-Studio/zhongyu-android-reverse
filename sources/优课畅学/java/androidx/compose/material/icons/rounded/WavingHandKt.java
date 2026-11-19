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
public final class WavingHandKt {
    private static ImageVector _wavingHand;

    public static final ImageVector getWavingHand(Icons.Rounded rounded) {
        ImageVector imageVector = _wavingHand;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WavingHand", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.07f, 9.8f);
        pathBuilder.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(1.07f, 1.07f, 1.16f, 2.75f, 0.28f, 3.92f);
        pathBuilder.curveToRelative(-0.15f, 0.2f, -0.12f, 0.47f, 0.05f, 0.65f);
        pathBuilder.curveToRelative(0.22f, 0.22f, 0.57f, 0.19f, 0.76f, -0.05f);
        pathBuilder.curveToRelative(1.07f, -1.43f, 1.06f, -3.43f, -0.04f, -4.85f);
        pathBuilder.lineToRelative(7.62f, -7.62f);
        pathBuilder.curveToRelative(0.49f, -0.49f, 1.28f, -0.49f, 1.77f, 0.0f);
        pathBuilder.reflectiveCurveToRelative(0.49f, 1.28f, 0.0f, 1.77f);
        pathBuilder.lineToRelative(-5.13f, 5.13f);
        pathBuilder.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder.reflectiveCurveToRelative(0.51f, 0.2f, 0.71f, 0.0f);
        pathBuilder.lineToRelative(6.54f, -6.54f);
        pathBuilder.curveToRelative(0.49f, -0.49f, 1.28f, -0.49f, 1.77f, 0.0f);
        pathBuilder.reflectiveCurveToRelative(0.49f, 1.28f, 0.0f, 1.77f);
        pathBuilder.lineToRelative(-6.54f, 6.54f);
        pathBuilder.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder.reflectiveCurveToRelative(0.51f, 0.2f, 0.71f, 0.0f);
        pathBuilder.lineToRelative(5.48f, -5.48f);
        pathBuilder.curveToRelative(0.49f, -0.49f, 1.28f, -0.49f, 1.77f, 0.0f);
        pathBuilder.reflectiveCurveToRelative(0.49f, 1.28f, 0.0f, 1.77f);
        pathBuilder.lineToRelative(-6.19f, 6.19f);
        pathBuilder.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        pathBuilder.lineToRelative(4.07f, -4.07f);
        pathBuilder.curveToRelative(0.49f, -0.49f, 1.28f, -0.49f, 1.77f, 0.0f);
        pathBuilder.curveToRelative(0.49f, 0.49f, 0.49f, 1.28f, 0.0f, 1.77f);
        pathBuilder.lineToRelative(-7.07f, 7.07f);
        pathBuilder.curveToRelative(-3.22f, 3.22f, -8.45f, 3.22f, -11.67f, 0.0f);
        pathBuilder.reflectiveCurveToRelative(-3.22f, -8.45f, 0.0f, -11.67f);
        pathBuilder.lineToRelative(4.6f, -4.6f);
        pathBuilder.curveToRelative(0.49f, -0.49f, 1.28f, -0.49f, 1.77f, 0.0f);
        pathBuilder.curveToRelative(0.49f, 0.49f, 0.49f, 1.28f, 0.0f, 1.77f);
        pathBuilder.lineTo(6.07f, 9.8f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 1.8f);
        pathBuilder.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilder.curveToRelative(-0.04f, 0.0f, -0.07f, 0.0f, -0.11f, 0.01f);
        pathBuilder.curveToRelative(-2.63f, 0.38f, -4.7f, 2.46f, -5.08f, 5.08f);
        pathBuilder.curveToRelative(0.0f, 0.03f, -0.01f, 0.07f, -0.01f, 0.11f);
        pathBuilder.curveTo(1.05f, 6.66f, 1.39f, 7.0f, 1.8f, 7.0f);
        pathBuilder.curveToRelative(0.38f, 0.0f, 0.69f, -0.28f, 0.74f, -0.64f);
        pathBuilder.curveToRelative(0.28f, -1.97f, 1.84f, -3.53f, 3.81f, -3.81f);
        pathBuilder.curveTo(6.72f, 2.49f, 7.0f, 2.18f, 7.0f, 1.8f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 22.2f);
        pathBuilder.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilder.curveToRelative(0.04f, 0.0f, 0.07f, 0.0f, 0.11f, -0.01f);
        pathBuilder.curveToRelative(2.63f, -0.38f, 4.7f, -2.46f, 5.08f, -5.08f);
        pathBuilder.curveToRelative(0.0f, -0.03f, 0.01f, -0.07f, 0.01f, -0.11f);
        pathBuilder.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilder.curveToRelative(-0.38f, 0.0f, -0.69f, 0.28f, -0.74f, 0.64f);
        pathBuilder.curveToRelative(-0.28f, 1.97f, -1.84f, 3.53f, -3.81f, 3.81f);
        pathBuilder.curveTo(17.28f, 21.51f, 17.0f, 21.82f, 17.0f, 22.2f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wavingHand = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
