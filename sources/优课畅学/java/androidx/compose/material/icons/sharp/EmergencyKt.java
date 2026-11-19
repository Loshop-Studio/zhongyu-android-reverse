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
public final class EmergencyKt {
    private static ImageVector _emergency;

    public static final ImageVector getEmergency(Icons.Sharp sharp) {
        ImageVector imageVector = _emergency;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Emergency", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.79f, 9.23f);
        pathBuilder.lineToRelative(-2.0f, -3.46f);
        pathBuilder.lineToRelative(-4.79f, 2.77f);
        pathBuilder.lineToRelative(0.0f, -5.54f);
        pathBuilder.lineToRelative(-4.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 5.54f);
        pathBuilder.lineToRelative(-4.79f, -2.77f);
        pathBuilder.lineToRelative(-2.0f, 3.46f);
        pathBuilder.lineToRelative(4.79f, 2.77f);
        pathBuilder.lineToRelative(-4.79f, 2.77f);
        pathBuilder.lineToRelative(2.0f, 3.46f);
        pathBuilder.lineToRelative(4.79f, -2.77f);
        pathBuilder.lineToRelative(0.0f, 5.54f);
        pathBuilder.lineToRelative(4.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, -5.54f);
        pathBuilder.lineToRelative(4.79f, 2.77f);
        pathBuilder.lineToRelative(2.0f, -3.46f);
        pathBuilder.lineToRelative(-4.79f, -2.77f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emergency = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
