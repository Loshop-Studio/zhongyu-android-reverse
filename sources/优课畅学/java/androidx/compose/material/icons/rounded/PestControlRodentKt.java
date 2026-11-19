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
public final class PestControlRodentKt {
    private static ImageVector _pestControlRodent;

    public static final ImageVector getPestControlRodent(Icons.Rounded rounded) {
        ImageVector imageVector = _pestControlRodent;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PestControlRodent", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.31f, 17.38f);
        pathBuilder.lineToRelative(-2.39f, -2.13f);
        pathBuilder.curveTo(19.44f, 12.89f, 17.56f, 11.0f, 15.5f, 11.0f);
        pathBuilder.curveToRelative(-1.16f, 0.0f, -3.5f, 0.9f, -3.5f, 3.5f);
        pathBuilder.curveToRelative(0.0f, 0.81f, 0.27f, 1.55f, 0.74f, 2.15f);
        pathBuilder.curveToRelative(0.15f, 0.2f, 0.14f, 0.48f, -0.04f, 0.66f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.21f, 0.21f, -0.56f, 0.19f, -0.75f, -0.04f);
        pathBuilder.curveTo(11.35f, 16.5f, 11.0f, 15.54f, 11.0f, 14.5f);
        pathBuilder.curveToRelative(0.0f, -1.7f, 0.96f, -3.17f, 2.35f, -3.93f);
        pathBuilder.curveToRelative(-0.7f, -0.36f, -1.48f, -0.57f, -2.28f, -0.57f);
        pathBuilder.curveToRelative(-2.38f, 0.0f, -4.37f, 1.65f, -4.91f, 3.87f);
        pathBuilder.curveToRelative(-1.33f, -0.39f, -2.28f, -1.66f, -2.15f, -3.14f);
        pathBuilder.curveTo(4.15f, 9.16f, 5.54f, 8.0f, 7.11f, 8.0f);
        pathBuilder.lineToRelative(2.0f, 0.0f);
        pathBuilder.curveToRelative(1.58f, 0.0f, 2.75f, -0.95f, 2.87f, -2.25f);
        pathBuilder.curveTo(12.13f, 4.25f, 10.96f, 3.0f, 9.5f, 3.0f);
        pathBuilder.horizontalLineTo(8.05f);
        pathBuilder.curveToRelative(-0.5f, 0.0f, -0.96f, 0.34f, -1.04f, 0.83f);
        pathBuilder.curveTo(6.91f, 4.46f, 7.39f, 5.0f, 8.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.curveTo(9.78f, 5.0f, 10.0f, 5.22f, 10.0f, 5.5f);
        pathBuilder.curveTo(10.0f, 5.78f, 9.78f, 6.0f, 9.5f, 6.0f);
        pathBuilder.lineTo(7.16f, 6.0f);
        pathBuilder.curveToRelative(-2.67f, 0.0f, -4.99f, 2.03f, -5.15f, 4.7f);
        pathBuilder.curveTo(1.86f, 13.25f, 3.62f, 15.42f, 6.0f, 15.9f);
        pathBuilder.verticalLineToRelative(0.03f);
        pathBuilder.curveTo(6.0f, 18.73f, 8.27f, 21.0f, 11.07f, 21.0f);
        pathBuilder.horizontalLineToRelative(8.86f);
        pathBuilder.curveTo(21.8f, 21.0f, 22.74f, 18.66f, 21.31f, 17.38f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 19.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.curveTo(19.0f, 18.55f, 18.55f, 19.0f, 18.0f, 19.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pestControlRodent = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
