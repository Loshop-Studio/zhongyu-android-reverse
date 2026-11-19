package androidx.compose.material.icons.sharp;

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
public final class PhonelinkSetupKt {
    private static ImageVector _phonelinkSetup;

    public static final ImageVector getPhonelinkSetup(Icons.Sharp sharp) {
        ImageVector imageVector = _phonelinkSetup;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PhonelinkSetup", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.0f, 1.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineTo(9.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.lineTo(9.0f, 20.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.lineTo(7.0f, 18.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.lineTo(21.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.5f, 15.5f);
        pathBuilder.curveToRelative(0.29f, -0.12f, 0.55f, -0.29f, 0.8f, -0.48f);
        pathBuilder.lineToRelative(-0.02f, 0.03f);
        pathBuilder.lineToRelative(1.41f, 0.55f);
        pathBuilder.lineToRelative(1.27f, -2.2f);
        pathBuilder.lineToRelative(-1.18f, -0.95f);
        pathBuilder.lineToRelative(-0.02f, 0.03f);
        pathBuilder.curveToRelative(0.02f, -0.16f, 0.05f, -0.32f, 0.05f, -0.48f);
        pathBuilder.reflectiveCurveToRelative(-0.03f, -0.32f, -0.05f, -0.48f);
        pathBuilder.lineToRelative(0.02f, 0.03f);
        pathBuilder.lineToRelative(1.18f, -0.95f);
        pathBuilder.lineToRelative(-1.26f, -2.2f);
        pathBuilder.lineToRelative(-1.41f, 0.55f);
        pathBuilder.lineToRelative(0.02f, 0.03f);
        pathBuilder.curveToRelative(-0.26f, -0.19f, -0.52f, -0.36f, -0.81f, -0.48f);
        pathBuilder.lineTo(9.27f, 7.0f);
        pathBuilder.lineTo(6.73f, 7.0f);
        pathBuilder.lineTo(6.5f, 8.5f);
        pathBuilder.curveToRelative(-0.29f, 0.12f, -0.55f, 0.29f, -0.8f, 0.48f);
        pathBuilder.lineToRelative(0.02f, -0.03f);
        pathBuilder.lineTo(4.3f, 8.4f);
        pathBuilder.lineToRelative(-1.27f, 2.2f);
        pathBuilder.lineToRelative(1.18f, 0.95f);
        pathBuilder.lineToRelative(0.02f, -0.03f);
        pathBuilder.curveToRelative(-0.01f, 0.16f, -0.04f, 0.32f, -0.04f, 0.48f);
        pathBuilder.reflectiveCurveToRelative(0.03f, 0.32f, 0.05f, 0.48f);
        pathBuilder.lineToRelative(-0.02f, -0.03f);
        pathBuilder.lineToRelative(-1.18f, 0.95f);
        pathBuilder.lineToRelative(1.27f, 2.2f);
        pathBuilder.lineToRelative(1.41f, -0.55f);
        pathBuilder.lineToRelative(-0.02f, -0.03f);
        pathBuilder.curveToRelative(0.25f, 0.19f, 0.51f, 0.36f, 0.8f, 0.48f);
        pathBuilder.lineToRelative(0.23f, 1.5f);
        pathBuilder.horizontalLineToRelative(2.54f);
        pathBuilder.lineToRelative(0.23f, -1.5f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phonelinkSetup = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
