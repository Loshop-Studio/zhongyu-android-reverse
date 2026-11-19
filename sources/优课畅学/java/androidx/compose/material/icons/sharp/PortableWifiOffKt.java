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
public final class PortableWifiOffKt {
    private static ImageVector _portableWifiOff;

    public static final ImageVector getPortableWifiOff(Icons.Sharp sharp) {
        ImageVector imageVector = _portableWifiOff;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PortableWifiOff", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.42f, 2.36f);
        pathBuilder.lineTo(2.01f, 3.78f);
        pathBuilder.lineTo(4.1f, 5.87f);
        pathBuilder.curveTo(2.79f, 7.57f, 2.0f, 9.69f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 3.7f, 2.01f, 6.92f, 4.99f, 8.65f);
        pathBuilder.lineToRelative(1.0f, -1.73f);
        pathBuilder.curveTo(5.61f, 17.53f, 4.0f, 14.96f, 4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.76f, 0.57f, -3.38f, 1.53f, -4.69f);
        pathBuilder.lineToRelative(1.43f, 1.44f);
        pathBuilder.curveTo(6.36f, 9.68f, 6.0f, 10.8f, 6.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 2.22f, 1.21f, 4.15f, 3.0f, 5.19f);
        pathBuilder.lineToRelative(1.0f, -1.74f);
        pathBuilder.curveToRelative(-1.19f, -0.7f, -2.0f, -1.97f, -2.0f, -3.45f);
        pathBuilder.curveToRelative(0.0f, -0.65f, 0.17f, -1.25f, 0.44f, -1.79f);
        pathBuilder.lineToRelative(1.58f, 1.58f);
        pathBuilder.lineTo(10.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.lineToRelative(0.21f, -0.02f);
        pathBuilder.lineToRelative(7.52f, 7.52f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(3.42f, 2.36f);
        pathBuilder.close();
        pathBuilder.moveTo(17.71f, 13.82f);
        pathBuilder.curveToRelative(0.18f, -0.57f, 0.29f, -1.19f, 0.29f, -1.82f);
        pathBuilder.curveToRelative(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f);
        pathBuilder.curveToRelative(-0.63f, 0.0f, -1.25f, 0.11f, -1.82f, 0.29f);
        pathBuilder.lineToRelative(1.72f, 1.72f);
        pathBuilder.curveToRelative(0.03f, 0.0f, 0.06f, -0.01f, 0.1f, -0.01f);
        pathBuilder.curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, 0.04f, -0.01f, 0.07f, -0.01f, 0.11f);
        pathBuilder.lineToRelative(1.72f, 1.71f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.curveToRelative(4.42f, 0.0f, 8.0f, 3.58f, 8.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, 1.2f, -0.29f, 2.32f, -0.77f, 3.35f);
        pathBuilder.lineToRelative(1.49f, 1.49f);
        pathBuilder.curveTo(21.53f, 15.4f, 22.0f, 13.76f, 22.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        pathBuilder.curveToRelative(-1.76f, 0.0f, -3.4f, 0.48f, -4.84f, 1.28f);
        pathBuilder.lineToRelative(1.48f, 1.48f);
        pathBuilder.curveTo(9.66f, 4.28f, 10.8f, 4.0f, 12.0f, 4.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _portableWifiOff = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
