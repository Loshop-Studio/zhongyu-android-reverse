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
public final class GTranslateKt {
    private static ImageVector _gTranslate;

    public static final ImageVector getGTranslate(Icons.Filled filled) {
        ImageVector imageVector = _gTranslate;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.GTranslate", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 4.0f);
        pathBuilder.lineTo(11.0f, 4.0f);
        pathBuilder.lineToRelative(-1.0f, -3.0f);
        pathBuilder.lineTo(3.0f, 1.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(15.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.lineToRelative(1.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.lineTo(23.0f, 6.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 16.0f);
        pathBuilder.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        pathBuilder.reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f);
        pathBuilder.curveToRelative(1.35f, 0.0f, 2.48f, 0.5f, 3.35f, 1.3f);
        pathBuilder.lineTo(9.03f, 8.57f);
        pathBuilder.curveToRelative(-0.38f, -0.36f, -1.04f, -0.78f, -2.03f, -0.78f);
        pathBuilder.curveToRelative(-1.74f, 0.0f, -3.15f, 1.44f, -3.15f, 3.21f);
        pathBuilder.reflectiveCurveTo(5.26f, 14.21f, 7.0f, 14.21f);
        pathBuilder.curveToRelative(2.01f, 0.0f, 2.84f, -1.44f, 2.92f, -2.41f);
        pathBuilder.lineTo(7.0f, 11.8f);
        pathBuilder.verticalLineToRelative(-1.71f);
        pathBuilder.horizontalLineToRelative(4.68f);
        pathBuilder.curveToRelative(0.07f, 0.31f, 0.12f, 0.61f, 0.12f, 1.02f);
        pathBuilder.curveTo(11.8f, 13.97f, 9.89f, 16.0f, 7.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.17f, 10.58f);
        pathBuilder.horizontalLineToRelative(3.7f);
        pathBuilder.curveToRelative(-0.43f, 1.25f, -1.11f, 2.43f, -2.05f, 3.47f);
        pathBuilder.curveToRelative(-0.31f, -0.35f, -0.6f, -0.72f, -0.86f, -1.1f);
        pathBuilder.lineToRelative(-0.79f, -2.37f);
        pathBuilder.close();
        pathBuilder.moveTo(21.5f, 20.5f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.lineTo(14.0f, 21.5f);
        pathBuilder.lineToRelative(2.0f, -2.5f);
        pathBuilder.lineToRelative(-1.04f, -3.1f);
        pathBuilder.lineToRelative(3.1f, 3.1f);
        pathBuilder.lineToRelative(0.92f, -0.92f);
        pathBuilder.lineToRelative(-3.3f, -3.25f);
        pathBuilder.lineToRelative(0.02f, -0.02f);
        pathBuilder.curveToRelative(1.13f, -1.25f, 1.93f, -2.69f, 2.4f, -4.22f);
        pathBuilder.lineTo(20.0f, 10.59f);
        pathBuilder.verticalLineToRelative(-1.3f);
        pathBuilder.horizontalLineToRelative(-4.53f);
        pathBuilder.lineTo(15.47f, 8.0f);
        pathBuilder.horizontalLineToRelative(-1.29f);
        pathBuilder.verticalLineToRelative(1.29f);
        pathBuilder.horizontalLineToRelative(-1.44f);
        pathBuilder.lineTo(11.46f, 5.5f);
        pathBuilder.horizontalLineToRelative(9.04f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gTranslate = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
