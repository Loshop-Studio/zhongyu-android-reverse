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
public final class MicExternalOnKt {
    private static ImageVector _micExternalOn;

    public static final ImageVector getMicExternalOn(Icons.Rounded rounded) {
        ImageVector imageVector = _micExternalOn;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MicExternalOn", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.22f, 7.0f);
        pathBuilder.horizontalLineTo(4.78f);
        pathBuilder.curveTo(4.3f, 6.47f, 4.0f, 5.77f, 4.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder.curveTo(10.0f, 5.77f, 9.7f, 6.47f, 9.22f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.24f, 2.01f);
        pathBuilder.curveTo(18.32f, 2.13f, 20.0f, 4.08f, 20.0f, 6.16f);
        pathBuilder.lineTo(20.0f, 21.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.lineToRelative(0.0f, -14.91f);
        pathBuilder.curveToRelative(0.0f, -0.96f, -0.64f, -1.86f, -1.58f, -2.05f);
        pathBuilder.curveTo(15.14f, 3.78f, 14.0f, 4.76f, 14.0f, 6.0f);
        pathBuilder.lineToRelative(0.0f, 11.84f);
        pathBuilder.curveToRelative(0.0f, 2.08f, -1.68f, 4.03f, -3.76f, 4.15f);
        pathBuilder.curveTo(7.92f, 22.13f, 6.0f, 20.29f, 6.0f, 18.0f);
        pathBuilder.horizontalLineTo(5.45f);
        pathBuilder.curveToRelative(-0.26f, 0.0f, -0.47f, -0.19f, -0.5f, -0.45f);
        pathBuilder.lineTo(4.11f, 9.1f);
        pathBuilder.curveTo(4.05f, 8.51f, 4.51f, 8.0f, 5.1f, 8.0f);
        pathBuilder.horizontalLineTo(8.9f);
        pathBuilder.curveToRelative(0.59f, 0.0f, 1.05f, 0.51f, 1.0f, 1.1f);
        pathBuilder.lineToRelative(-0.85f, 8.45f);
        pathBuilder.curveTo(9.02f, 17.81f, 8.8f, 18.0f, 8.55f, 18.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.curveToRelative(0.0f, 1.24f, 1.14f, 2.22f, 2.42f, 1.96f);
        pathBuilder.curveToRelative(0.94f, -0.19f, 1.58f, -1.09f, 1.58f, -2.05f);
        pathBuilder.lineTo(12.0f, 6.0f);
        pathBuilder.curveTo(12.0f, 3.71f, 13.92f, 1.87f, 16.24f, 2.01f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _micExternalOn = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
