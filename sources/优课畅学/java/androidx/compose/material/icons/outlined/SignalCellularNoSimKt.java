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
public final class SignalCellularNoSimKt {
    private static ImageVector _signalCellularNoSim;

    public static final ImageVector getSignalCellularNoSim(Icons.Outlined outlined) {
        ImageVector imageVector = _signalCellularNoSim;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SignalCellularNoSim", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.83f, 5.0f);
        pathBuilder.lineTo(17.0f, 5.0f);
        pathBuilder.verticalLineToRelative(9.11f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.lineTo(19.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(-7.0f);
        pathBuilder.lineTo(7.94f, 5.06f);
        pathBuilder.lineToRelative(1.42f, 1.42f);
        pathBuilder.lineTo(10.83f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.26f, 21.21f);
        pathBuilder.lineTo(3.79f, 3.74f);
        pathBuilder.lineTo(2.38f, 5.15f);
        pathBuilder.lineTo(5.0f, 7.77f);
        pathBuilder.lineTo(5.0f, 19.0f);
        pathBuilder.curveToRelative(0.0f, 1.11f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(11.23f);
        pathBuilder.lineToRelative(1.62f, 1.62f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 19.0f);
        pathBuilder.lineTo(7.0f, 9.79f);
        pathBuilder.lineTo(16.23f, 19.0f);
        pathBuilder.lineTo(7.0f, 19.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _signalCellularNoSim = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
