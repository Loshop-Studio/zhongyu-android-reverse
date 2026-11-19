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
public final class SignalCellularAlt2BarKt {
    private static ImageVector _signalCellularAlt2Bar;

    public static final ImageVector getSignalCellularAlt2Bar(Icons.Rounded rounded) {
        ImageVector imageVector = _signalCellularAlt2Bar;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SignalCellularAlt2Bar", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.5f, 20.0f);
        pathBuilder.curveTo(5.67f, 20.0f, 5.0f, 19.33f, 5.0f, 18.5f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveTo(5.0f, 14.67f, 5.67f, 14.0f, 6.5f, 14.0f);
        pathBuilder.reflectiveCurveTo(8.0f, 14.67f, 8.0f, 15.5f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.curveTo(8.0f, 19.33f, 7.33f, 20.0f, 6.5f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.5f, 20.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.curveTo(11.0f, 9.67f, 11.67f, 9.0f, 12.5f, 9.0f);
        pathBuilder.reflectiveCurveTo(14.0f, 9.67f, 14.0f, 10.5f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.curveTo(14.0f, 19.33f, 13.33f, 20.0f, 12.5f, 20.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _signalCellularAlt2Bar = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
