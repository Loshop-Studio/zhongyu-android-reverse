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
public final class CameraKt {
    private static ImageVector _camera;

    public static final ImageVector getCamera(Icons.Rounded rounded) {
        ImageVector imageVector = _camera;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Camera", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.81f, 2.86f);
        pathBuilder.curveToRelative(0.17f, -0.3f, 0.0f, -0.7f, -0.35f, -0.74f);
        pathBuilder.curveToRelative(-2.62f, -0.37f, -5.3f, 0.28f, -7.44f, 1.86f);
        pathBuilder.curveToRelative(-0.19f, 0.15f, -0.25f, 0.43f, -0.12f, 0.65f);
        pathBuilder.lineToRelative(3.01f, 5.22f);
        pathBuilder.curveToRelative(0.19f, 0.33f, 0.67f, 0.33f, 0.87f, 0.0f);
        pathBuilder.lineToRelative(4.03f, -6.99f);
        pathBuilder.close();
        pathBuilder.moveTo(21.3f, 8.33f);
        pathBuilder.curveToRelative(-0.98f, -2.47f, -2.92f, -4.46f, -5.35f, -5.5f);
        pathBuilder.curveToRelative(-0.23f, -0.1f, -0.5f, 0.0f, -0.63f, 0.22f);
        pathBuilder.lineToRelative(-3.01f, 5.21f);
        pathBuilder.curveToRelative(-0.19f, 0.32f, 0.05f, 0.74f, 0.44f, 0.74f);
        pathBuilder.horizontalLineToRelative(8.08f);
        pathBuilder.curveToRelative(0.35f, 0.0f, 0.6f, -0.35f, 0.47f, -0.67f);
        pathBuilder.close();
        pathBuilder.moveTo(21.37f, 10.0f);
        pathBuilder.horizontalLineToRelative(-6.2f);
        pathBuilder.curveToRelative(-0.38f, 0.0f, -0.63f, 0.42f, -0.43f, 0.75f);
        pathBuilder.lineTo(19.0f, 18.14f);
        pathBuilder.curveToRelative(0.17f, 0.3f, 0.6f, 0.35f, 0.82f, 0.08f);
        pathBuilder.curveToRelative(1.74f, -2.18f, 2.48f, -5.03f, 2.05f, -7.79f);
        pathBuilder.curveToRelative(-0.03f, -0.25f, -0.25f, -0.43f, -0.5f, -0.43f);
        pathBuilder.close();
        pathBuilder.moveTo(4.18f, 5.79f);
        pathBuilder.curveToRelative(-1.73f, 2.19f, -2.48f, 5.02f, -2.05f, 7.79f);
        pathBuilder.curveToRelative(0.03f, 0.24f, 0.25f, 0.42f, 0.5f, 0.42f);
        pathBuilder.horizontalLineToRelative(6.2f);
        pathBuilder.curveToRelative(0.38f, 0.0f, 0.63f, -0.42f, 0.43f, -0.75f);
        pathBuilder.lineTo(5.0f, 5.87f);
        pathBuilder.curveToRelative(-0.18f, -0.3f, -0.61f, -0.35f, -0.82f, -0.08f);
        pathBuilder.close();
        pathBuilder.moveTo(2.7f, 15.67f);
        pathBuilder.curveToRelative(0.98f, 2.47f, 2.92f, 4.46f, 5.35f, 5.5f);
        pathBuilder.curveToRelative(0.23f, 0.1f, 0.5f, 0.0f, 0.63f, -0.22f);
        pathBuilder.lineToRelative(3.01f, -5.21f);
        pathBuilder.curveToRelative(0.19f, -0.33f, -0.05f, -0.75f, -0.43f, -0.75f);
        pathBuilder.lineTo(3.17f, 14.99f);
        pathBuilder.curveToRelative(-0.35f, 0.01f, -0.6f, 0.36f, -0.47f, 0.68f);
        pathBuilder.close();
        pathBuilder.moveTo(10.53f, 21.89f);
        pathBuilder.curveToRelative(2.62f, 0.37f, 5.3f, -0.28f, 7.44f, -1.86f);
        pathBuilder.curveToRelative(0.2f, -0.15f, 0.26f, -0.44f, 0.13f, -0.66f);
        pathBuilder.lineToRelative(-3.01f, -5.22f);
        pathBuilder.curveToRelative(-0.19f, -0.33f, -0.67f, -0.33f, -0.87f, 0.0f);
        pathBuilder.lineToRelative(-4.04f, 6.99f);
        pathBuilder.curveToRelative(-0.17f, 0.3f, 0.01f, 0.7f, 0.35f, 0.75f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _camera = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
