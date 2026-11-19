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
public final class UmbrellaKt {
    private static ImageVector _umbrella;

    public static final ImageVector getUmbrella(Icons.Rounded rounded) {
        ImageVector imageVector = _umbrella;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Umbrella", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.12f, 6.28f);
        pathBuilder.lineTo(14.5f, 6.92f);
        pathBuilder.lineTo(13.0f, 5.77f);
        pathBuilder.verticalLineTo(3.88f);
        pathBuilder.verticalLineTo(3.4f);
        pathBuilder.curveToRelative(0.0f, -0.26f, 0.22f, -0.48f, 0.5f, -0.48f);
        pathBuilder.curveToRelative(0.23f, 0.0f, 0.43f, 0.16f, 0.49f, 0.36f);
        pathBuilder.curveTo(14.1f, 3.7f, 14.49f, 4.0f, 14.94f, 4.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.curveToRelative(0.0f, -0.1f, -0.02f, -0.2f, -0.05f, -0.3f);
        pathBuilder.curveTo(15.59f, 1.72f, 14.63f, 1.0f, 13.5f, 1.0f);
        pathBuilder.curveTo(12.12f, 1.0f, 11.0f, 2.07f, 11.0f, 3.4f);
        pathBuilder.verticalLineToRelative(0.48f);
        pathBuilder.verticalLineToRelative(1.89f);
        pathBuilder.lineTo(9.5f, 6.92f);
        pathBuilder.lineTo(6.88f, 6.28f);
        pathBuilder.curveTo(6.5f, 6.19f, 6.16f, 6.55f, 6.28f, 6.92f);
        pathBuilder.lineToRelative(4.77f, 14.39f);
        pathBuilder.curveTo(11.2f, 21.77f, 11.6f, 22.0f, 12.0f, 22.0f);
        pathBuilder.reflectiveCurveToRelative(0.8f, -0.23f, 0.95f, -0.69f);
        pathBuilder.lineToRelative(4.77f, -14.39f);
        pathBuilder.curveTo(17.84f, 6.55f, 17.5f, 6.19f, 17.12f, 6.28f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 14.8f);
        pathBuilder.lineTo(9.03f, 8.86f);
        pathBuilder.lineToRelative(0.92f, 0.23f);
        pathBuilder.lineToRelative(0.76f, -0.58f);
        pathBuilder.lineTo(11.0f, 8.29f);
        pathBuilder.verticalLineTo(14.8f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 14.8f);
        pathBuilder.verticalLineTo(8.29f);
        pathBuilder.lineToRelative(0.28f, 0.22f);
        pathBuilder.lineToRelative(0.76f, 0.58f);
        pathBuilder.lineToRelative(0.92f, -0.23f);
        pathBuilder.lineTo(13.0f, 14.8f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _umbrella = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
