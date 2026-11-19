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
public final class AirlineSeatFlatAngledKt {
    private static ImageVector _airlineSeatFlatAngled;

    public static final ImageVector getAirlineSeatFlatAngled(Icons.Rounded rounded) {
        ImageVector imageVector = _airlineSeatFlatAngled;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AirlineSeatFlatAngled", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.25f, 14.29f);
        pathBuilder.lineToRelative(-0.69f, 1.89f);
        pathBuilder.lineTo(9.2f, 11.71f);
        pathBuilder.lineToRelative(1.39f, -3.79f);
        pathBuilder.curveToRelative(0.38f, -1.03f, 1.52f, -1.56f, 2.56f, -1.19f);
        pathBuilder.lineToRelative(6.69f, 2.41f);
        pathBuilder.curveToRelative(2.1f, 0.76f, 3.18f, 3.06f, 2.41f, 5.15f);
        pathBuilder.close();
        pathBuilder.moveTo(2.45f, 12.48f);
        pathBuilder.lineToRelative(5.55f, 2.0f);
        pathBuilder.lineTo(8.0f, 18.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-0.63f);
        pathBuilder.lineToRelative(3.58f, 1.29f);
        pathBuilder.curveToRelative(0.52f, 0.19f, 1.1f, -0.08f, 1.29f, -0.6f);
        pathBuilder.curveToRelative(0.19f, -0.52f, -0.08f, -1.1f, -0.6f, -1.29f);
        pathBuilder.lineTo(3.13f, 10.59f);
        pathBuilder.curveToRelative(-0.52f, -0.19f, -1.1f, 0.08f, -1.29f, 0.6f);
        pathBuilder.curveToRelative(-0.18f, 0.52f, 0.09f, 1.1f, 0.61f, 1.29f);
        pathBuilder.close();
        pathBuilder.moveTo(7.3f, 10.2f);
        pathBuilder.curveToRelative(1.49f, -0.72f, 2.12f, -2.51f, 1.41f, -4.0f);
        pathBuilder.curveTo(7.99f, 4.71f, 6.2f, 4.08f, 4.7f, 4.8f);
        pathBuilder.curveToRelative(-1.49f, 0.71f, -2.12f, 2.5f, -1.4f, 4.0f);
        pathBuilder.curveToRelative(0.71f, 1.49f, 2.5f, 2.12f, 4.0f, 1.4f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airlineSeatFlatAngled = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
