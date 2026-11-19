package androidx.compose.material.icons.filled;

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
public final class ScreenSearchDesktopKt {
    private static ImageVector _screenSearchDesktop;

    public static final ImageVector getScreenSearchDesktop(Icons.Filled filled) {
        ImageVector imageVector = _screenSearchDesktop;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ScreenSearchDesktop", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 18.0f);
        pathBuilder.curveTo(21.1f, 18.0f, 21.99f, 17.1f, 21.99f, 16.0f);
        pathBuilder.lineTo(22.0f, 6.0f);
        pathBuilder.curveTo(22.0f, 4.89f, 21.1f, 4.0f, 20.0f, 4.0f);
        pathBuilder.lineTo(4.0f, 4.0f);
        pathBuilder.curveTo(2.89f, 4.0f, 2.0f, 4.89f, 2.0f, 6.0f);
        pathBuilder.lineTo(2.0f, 16.0f);
        pathBuilder.curveTo(2.0f, 17.1f, 2.89f, 18.0f, 4.0f, 18.0f);
        pathBuilder.lineTo(0.0f, 18.0f);
        pathBuilder.lineTo(0.0f, 20.0f);
        pathBuilder.lineTo(24.0f, 20.0f);
        pathBuilder.lineTo(24.0f, 18.0f);
        pathBuilder.lineTo(20.0f, 18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(4.0f, 16.0f);
        pathBuilder.lineTo(4.0f, 6.0f);
        pathBuilder.lineTo(20.0f, 6.0f);
        pathBuilder.lineTo(20.0f, 16.0f);
        pathBuilder.lineTo(20.0f, 16.01f);
        pathBuilder.lineTo(4.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.097f, 9.953f);
        pathBuilder.curveTo(9.097f, 8.926f, 9.933f, 8.089f, 10.961f, 8.089f);
        pathBuilder.curveTo(11.988f, 8.089f, 12.825f, 8.926f, 12.825f, 9.953f);
        pathBuilder.curveTo(12.825f, 10.98f, 11.988f, 11.817f, 10.961f, 11.817f);
        pathBuilder.curveTo(9.933f, 11.817f, 9.097f, 10.98f, 9.097f, 9.953f);
        pathBuilder.close();
        pathBuilder.moveTo(16.129f, 14.189f);
        pathBuilder.lineTo(13.647f, 11.707f);
        pathBuilder.curveTo(13.978f, 11.202f, 14.174f, 10.6f, 14.174f, 9.953f);
        pathBuilder.curveTo(14.174f, 8.181f, 12.733f, 6.74f, 10.961f, 6.74f);
        pathBuilder.curveTo(9.189f, 6.74f, 7.747f, 8.181f, 7.747f, 9.953f);
        pathBuilder.curveTo(7.747f, 11.725f, 9.189f, 13.167f, 10.961f, 13.167f);
        pathBuilder.curveTo(11.597f, 13.167f, 12.186f, 12.975f, 12.685f, 12.656f);
        pathBuilder.lineTo(15.174f, 15.144f);
        pathBuilder.lineTo(16.129f, 14.189f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _screenSearchDesktop = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
