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
public final class CameraKt {
    private static ImageVector _camera;

    public static final ImageVector getCamera(Icons.Outlined outlined) {
        ImageVector imageVector = _camera;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Camera", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.25f, 2.26f);
        pathBuilder.lineToRelative(-0.08f, -0.04f);
        pathBuilder.lineToRelative(-0.01f, 0.02f);
        pathBuilder.curveTo(13.46f, 2.09f, 12.74f, 2.0f, 12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.curveToRelative(0.0f, -4.75f, -3.31f, -8.72f, -7.75f, -9.74f);
        pathBuilder.close();
        pathBuilder.moveTo(19.41f, 9.0f);
        pathBuilder.horizontalLineToRelative(-7.99f);
        pathBuilder.lineToRelative(2.71f, -4.7f);
        pathBuilder.curveToRelative(2.4f, 0.66f, 4.35f, 2.42f, 5.28f, 4.7f);
        pathBuilder.close();
        pathBuilder.moveTo(13.1f, 4.08f);
        pathBuilder.lineTo(10.27f, 9.0f);
        pathBuilder.lineToRelative(-1.15f, 2.0f);
        pathBuilder.lineTo(6.4f, 6.3f);
        pathBuilder.curveTo(7.84f, 4.88f, 9.82f, 4.0f, 12.0f, 4.0f);
        pathBuilder.curveToRelative(0.37f, 0.0f, 0.74f, 0.03f, 1.1f, 0.08f);
        pathBuilder.close();
        pathBuilder.moveTo(5.7f, 7.09f);
        pathBuilder.lineTo(8.54f, 12.0f);
        pathBuilder.lineToRelative(1.15f, 2.0f);
        pathBuilder.lineTo(4.26f, 14.0f);
        pathBuilder.curveTo(4.1f, 13.36f, 4.0f, 12.69f, 4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.85f, 0.64f, -3.55f, 1.7f, -4.91f);
        pathBuilder.close();
        pathBuilder.moveTo(4.59f, 15.0f);
        pathBuilder.horizontalLineToRelative(7.98f);
        pathBuilder.lineToRelative(-2.71f, 4.7f);
        pathBuilder.curveToRelative(-2.4f, -0.67f, -4.34f, -2.42f, -5.27f, -4.7f);
        pathBuilder.close();
        pathBuilder.moveTo(10.9f, 19.91f);
        pathBuilder.lineTo(14.89f, 13.0f);
        pathBuilder.lineToRelative(2.72f, 4.7f);
        pathBuilder.curveTo(16.16f, 19.12f, 14.18f, 20.0f, 12.0f, 20.0f);
        pathBuilder.curveToRelative(-0.38f, 0.0f, -0.74f, -0.04f, -1.1f, -0.09f);
        pathBuilder.close();
        pathBuilder.moveTo(18.3f, 16.91f);
        pathBuilder.lineToRelative(-4.0f, -6.91f);
        pathBuilder.horizontalLineToRelative(5.43f);
        pathBuilder.curveToRelative(0.17f, 0.64f, 0.27f, 1.31f, 0.27f, 2.0f);
        pathBuilder.curveToRelative(0.0f, 1.85f, -0.64f, 3.55f, -1.7f, 4.91f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _camera = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
