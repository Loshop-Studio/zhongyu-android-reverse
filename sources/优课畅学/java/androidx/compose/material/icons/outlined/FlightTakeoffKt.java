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
public final class FlightTakeoffKt {
    private static ImageVector _flightTakeoff;

    public static final ImageVector getFlightTakeoff(Icons.Outlined outlined) {
        ImageVector imageVector = _flightTakeoff;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.FlightTakeoff", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.5f, 19.0f);
        pathBuilder.horizontalLineToRelative(19.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-19.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.07f, 9.64f);
        pathBuilder.curveToRelative(-0.21f, -0.8f, -1.04f, -1.28f, -1.84f, -1.06f);
        pathBuilder.lineTo(14.92f, 10.0f);
        pathBuilder.lineToRelative(-6.9f, -6.43f);
        pathBuilder.lineToRelative(-1.93f, 0.51f);
        pathBuilder.lineToRelative(4.14f, 7.17f);
        pathBuilder.lineToRelative(-4.97f, 1.33f);
        pathBuilder.lineToRelative(-1.97f, -1.54f);
        pathBuilder.lineToRelative(-1.45f, 0.39f);
        pathBuilder.lineToRelative(2.59f, 4.49f);
        pathBuilder.lineTo(21.0f, 11.49f);
        pathBuilder.curveToRelative(0.81f, -0.23f, 1.28f, -1.05f, 1.07f, -1.85f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flightTakeoff = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
