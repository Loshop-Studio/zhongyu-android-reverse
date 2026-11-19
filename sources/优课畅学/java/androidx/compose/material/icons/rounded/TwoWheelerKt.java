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
public final class TwoWheelerKt {
    private static ImageVector _twoWheeler;

    public static final ImageVector getTwoWheeler(Icons.Rounded rounded) {
        ImageVector imageVector = _twoWheeler;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TwoWheeler", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 11.0f);
        pathBuilder.curveToRelative(-0.18f, 0.0f, -0.36f, 0.03f, -0.53f, 0.05f);
        pathBuilder.lineTo(17.41f, 9.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineTo(7.62f);
        pathBuilder.curveToRelative(0.0f, -0.74f, -0.78f, -1.23f, -1.45f, -0.89f);
        pathBuilder.lineToRelative(-2.28f, 1.14f);
        pathBuilder.lineToRelative(-2.57f, -2.57f);
        pathBuilder.curveTo(13.52f, 5.11f, 13.26f, 5.0f, 13.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.curveTo(9.45f, 5.0f, 9.0f, 5.45f, 9.0f, 6.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(2.17f);
        pathBuilder.curveToRelative(0.27f, 0.0f, 0.52f, 0.11f, 0.71f, 0.29f);
        pathBuilder.lineTo(14.59f, 9.0f);
        pathBuilder.horizontalLineToRelative(-3.35f);
        pathBuilder.curveToRelative(-0.16f, 0.0f, -0.31f, 0.04f, -0.45f, 0.11f);
        pathBuilder.lineToRelative(-3.14f, 1.57f);
        pathBuilder.curveToRelative(-0.38f, 0.19f, -0.85f, 0.12f, -1.15f, -0.19f);
        pathBuilder.lineToRelative(-1.2f, -1.2f);
        pathBuilder.curveTo(5.11f, 9.11f, 4.85f, 9.0f, 4.59f, 9.0f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.curveToRelative(-2.52f, 0.0f, -4.49f, 2.32f, -3.89f, 4.94f);
        pathBuilder.curveToRelative(0.33f, 1.45f, 1.5f, 2.62f, 2.95f, 2.95f);
        pathBuilder.curveTo(5.68f, 19.49f, 8.0f, 17.52f, 8.0f, 15.0f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.curveTo(9.79f, 16.79f, 10.3f, 17.0f, 10.83f, 17.0f);
        pathBuilder.horizontalLineToRelative(1.01f);
        pathBuilder.curveToRelative(0.72f, 0.0f, 1.38f, -0.38f, 1.74f, -1.01f);
        pathBuilder.lineToRelative(2.91f, -5.09f);
        pathBuilder.lineToRelative(1.01f, 1.01f);
        pathBuilder.curveToRelative(-1.13f, 0.91f, -1.76f, 2.41f, -1.38f, 4.05f);
        pathBuilder.curveToRelative(0.34f, 1.44f, 1.51f, 2.61f, 2.95f, 2.94f);
        pathBuilder.curveTo(21.68f, 19.49f, 24.0f, 17.51f, 24.0f, 15.0f);
        pathBuilder.curveTo(24.0f, 12.79f, 22.21f, 11.0f, 20.0f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(4.0f, 17.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.curveTo(6.0f, 16.1f, 5.1f, 17.0f, 4.0f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 17.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.curveTo(22.0f, 16.1f, 21.1f, 17.0f, 20.0f, 17.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _twoWheeler = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
