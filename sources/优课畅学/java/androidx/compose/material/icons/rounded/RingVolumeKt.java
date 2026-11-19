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
public final class RingVolumeKt {
    private static ImageVector _ringVolume;

    public static final ImageVector getRingVolume(Icons.Rounded rounded) {
        ImageVector imageVector = _ringVolume;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RingVolume", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.98f, 7.0f);
        pathBuilder.horizontalLineToRelative(0.03f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 0.99f, -0.44f, 0.99f, -0.98f);
        pathBuilder.lineTo(13.0f, 2.98f);
        pathBuilder.curveToRelative(0.0f, -0.54f, -0.44f, -0.98f, -0.98f, -0.98f);
        pathBuilder.horizontalLineToRelative(-0.03f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -0.99f, 0.44f, -0.99f, 0.98f);
        pathBuilder.verticalLineToRelative(3.03f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.44f, 0.99f, 0.98f, 0.99f);
        pathBuilder.close();
        pathBuilder.moveTo(16.9f, 9.11f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.01f, 0.39f, 1.4f, 0.0f);
        pathBuilder.curveToRelative(0.62f, -0.63f, 1.52f, -1.54f, 2.15f, -2.17f);
        pathBuilder.curveToRelative(0.39f, -0.38f, 0.39f, -1.01f, 0.0f, -1.39f);
        pathBuilder.curveToRelative(-0.38f, -0.38f, -1.01f, -0.38f, -1.39f, 0.0f);
        pathBuilder.lineTo(16.89f, 7.7f);
        pathBuilder.curveToRelative(-0.39f, 0.38f, -0.39f, 1.01f, 0.0f, 1.39f);
        pathBuilder.lineToRelative(0.01f, 0.02f);
        pathBuilder.close();
        pathBuilder.moveTo(5.71f, 9.1f);
        pathBuilder.curveToRelative(0.38f, 0.39f, 1.01f, 0.39f, 1.4f, 0.0f);
        pathBuilder.curveToRelative(0.38f, -0.38f, 0.38f, -1.01f, 0.0f, -1.39f);
        pathBuilder.lineTo(4.96f, 5.54f);
        pathBuilder.curveToRelative(-0.38f, -0.39f, -1.01f, -0.39f, -1.39f, 0.0f);
        pathBuilder.lineToRelative(-0.02f, 0.01f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.01f, 0.0f, 1.39f);
        pathBuilder.curveToRelative(0.63f, 0.62f, 1.54f, 1.53f, 2.16f, 2.16f);
        pathBuilder.close();
        pathBuilder.moveTo(23.29f, 16.23f);
        pathBuilder.curveToRelative(-6.41f, -5.66f, -16.07f, -5.66f, -22.48f, 0.0f);
        pathBuilder.curveToRelative(-0.85f, 0.75f, -0.85f, 2.08f, -0.05f, 2.88f);
        pathBuilder.lineToRelative(1.22f, 1.22f);
        pathBuilder.curveToRelative(0.72f, 0.72f, 1.86f, 0.78f, 2.66f, 0.15f);
        pathBuilder.lineToRelative(2.0f, -1.59f);
        pathBuilder.curveToRelative(0.48f, -0.38f, 0.76f, -0.96f, 0.76f, -1.57f);
        pathBuilder.verticalLineToRelative(-2.6f);
        pathBuilder.curveToRelative(3.02f, -0.98f, 6.29f, -0.99f, 9.32f, 0.0f);
        pathBuilder.verticalLineToRelative(2.61f);
        pathBuilder.curveToRelative(0.0f, 0.61f, 0.28f, 1.19f, 0.76f, 1.57f);
        pathBuilder.lineToRelative(1.99f, 1.58f);
        pathBuilder.curveToRelative(0.8f, 0.63f, 1.94f, 0.57f, 2.66f, -0.15f);
        pathBuilder.lineToRelative(1.22f, -1.22f);
        pathBuilder.curveToRelative(0.79f, -0.8f, 0.79f, -2.13f, -0.06f, -2.88f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _ringVolume = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
