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
public final class SnowmobileKt {
    private static ImageVector _snowmobile;

    public static final ImageVector getSnowmobile(Icons.Rounded rounded) {
        ImageVector imageVector = _snowmobile;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Snowmobile", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 6.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(1.25f);
        pathBuilder.lineToRelative(1.45f, 1.3f);
        pathBuilder.lineTo(11.0f, 11.0f);
        pathBuilder.lineToRelative(-9.12f, -0.96f);
        pathBuilder.curveTo(0.88f, 9.93f, 0.0f, 10.72f, 0.0f, 11.73f);
        pathBuilder.curveToRelative(0.0f, 0.75f, 0.49f, 1.41f, 1.21f, 1.63f);
        pathBuilder.lineToRelative(3.33f, 1.0f);
        pathBuilder.lineToRelative(-3.49f, 1.88f);
        pathBuilder.curveTo(-0.77f, 17.22f, -0.07f, 20.0f, 2.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.curveToRelative(1.13f, 0.0f, 2.11f, -0.62f, 2.63f, -1.55f);
        pathBuilder.curveToRelative(0.36f, -0.65f, -0.15f, -1.45f, -0.9f, -1.45f);
        pathBuilder.curveToRelative(-0.34f, 0.0f, -0.68f, 0.16f, -0.84f, 0.47f);
        pathBuilder.curveTo(21.72f, 17.78f, 21.38f, 18.0f, 21.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(-0.17f);
        pathBuilder.lineToRelative(-2.2f, -2.2f);
        pathBuilder.curveTo(20.58f, 15.37f, 22.0f, 14.4f, 22.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, -0.89f, -7.72f, -7.75f, -7.72f, -7.75f);
        pathBuilder.curveTo(14.1f, 5.09f, 13.87f, 5.0f, 13.62f, 5.0f);
        pathBuilder.horizontalLineTo(12.0f);
        pathBuilder.curveTo(11.45f, 5.0f, 11.0f, 5.45f, 11.0f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 18.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.lineToRelative(5.25f, -2.83f);
        pathBuilder.lineTo(10.0f, 16.0f);
        pathBuilder.curveTo(10.0f, 17.1f, 9.11f, 18.0f, 8.0f, 18.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _snowmobile = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
