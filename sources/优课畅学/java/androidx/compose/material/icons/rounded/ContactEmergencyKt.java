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
public final class ContactEmergencyKt {
    private static ImageVector _contactEmergency;

    public static final ImageVector getContactEmergency(Icons.Rounded rounded) {
        ImageVector imageVector = _contactEmergency;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ContactEmergency", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 3.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.curveTo(0.9f, 3.0f, 0.0f, 3.9f, 0.0f, 5.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
        pathBuilder.lineTo(24.0f, 5.0f);
        pathBuilder.curveTo(24.0f, 3.9f, 23.1f, 3.0f, 22.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 8.0f);
        pathBuilder.curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-1.35f, 3.0f, -3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-3.0f, -1.35f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveTo(7.35f, 8.0f, 9.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(2.08f, 19.0f);
        pathBuilder.curveToRelative(1.38f, -2.39f, 3.96f, -4.0f, 6.92f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(5.54f, 1.61f, 6.92f, 4.0f);
        pathBuilder.horizontalLineTo(2.08f);
        pathBuilder.close();
        pathBuilder.moveTo(20.6f, 10.5f);
        pathBuilder.lineTo(20.6f, 10.5f);
        pathBuilder.curveToRelative(-0.21f, 0.36f, -0.67f, 0.48f, -1.02f, 0.27f);
        pathBuilder.lineToRelative(-0.82f, -0.48f);
        pathBuilder.verticalLineToRelative(0.95f);
        pathBuilder.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilder.verticalLineTo(10.3f);
        pathBuilder.lineToRelative(-0.82f, 0.48f);
        pathBuilder.curveToRelative(-0.36f, 0.21f, -0.82f, 0.08f, -1.02f, -0.27f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.21f, -0.36f, -0.08f, -0.82f, 0.27f, -1.02f);
        pathBuilder.lineTo(16.5f, 9.0f);
        pathBuilder.lineToRelative(-0.82f, -0.48f);
        pathBuilder.curveToRelative(-0.36f, -0.21f, -0.48f, -0.67f, -0.27f, -1.02f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.21f, -0.36f, 0.67f, -0.48f, 1.02f, -0.27f);
        pathBuilder.lineToRelative(0.82f, 0.48f);
        pathBuilder.verticalLineTo(6.75f);
        pathBuilder.curveTo(17.25f, 6.34f, 17.59f, 6.0f, 18.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilder.verticalLineTo(7.7f);
        pathBuilder.lineToRelative(0.82f, -0.48f);
        pathBuilder.curveToRelative(0.36f, -0.21f, 0.82f, -0.08f, 1.02f, 0.27f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.21f, 0.36f, 0.08f, 0.82f, -0.27f, 1.02f);
        pathBuilder.lineTo(19.5f, 9.0f);
        pathBuilder.lineToRelative(0.82f, 0.48f);
        pathBuilder.curveTo(20.68f, 9.68f, 20.81f, 10.14f, 20.6f, 10.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contactEmergency = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
