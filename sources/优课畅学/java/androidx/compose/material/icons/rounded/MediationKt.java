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
public final class MediationKt {
    private static ImageVector _mediation;

    public static final ImageVector getMediation(Icons.Rounded rounded) {
        ImageVector imageVector = _mediation;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Mediation", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(-5.06f);
        pathBuilder.curveToRelative(-0.34f, 3.1f, -2.26f, 5.72f, -4.94f, 7.05f);
        pathBuilder.curveToRelative(-0.03f, 1.81f, -1.66f, 3.23f, -3.55f, 2.9f);
        pathBuilder.curveToRelative(-1.2f, -0.21f, -2.19f, -1.2f, -2.4f, -2.4f);
        pathBuilder.curveTo(1.71f, 18.65f, 3.16f, 17.0f, 5.0f, 17.0f);
        pathBuilder.curveToRelative(0.95f, 0.0f, 1.78f, 0.45f, 2.33f, 1.14f);
        pathBuilder.curveToRelative(1.9f, -1.03f, 3.26f, -2.91f, 3.58f, -5.14f);
        pathBuilder.horizontalLineToRelative(-3.1f);
        pathBuilder.curveToRelative(-0.48f, 1.34f, -1.86f, 2.24f, -3.42f, 1.94f);
        pathBuilder.curveToRelative(-1.18f, -0.23f, -2.13f, -1.2f, -2.35f, -2.38f);
        pathBuilder.curveTo(1.7f, 10.66f, 3.16f, 9.0f, 5.0f, 9.0f);
        pathBuilder.curveToRelative(1.3f, 0.0f, 2.4f, 0.84f, 2.82f, 2.0f);
        pathBuilder.horizontalLineToRelative(3.1f);
        pathBuilder.curveTo(10.6f, 8.77f, 9.23f, 6.9f, 7.33f, 5.86f);
        pathBuilder.curveToRelative(-0.64f, 0.8f, -1.67f, 1.28f, -2.81f, 1.1f);
        pathBuilder.curveTo(3.29f, 6.77f, 2.26f, 5.77f, 2.05f, 4.54f);
        pathBuilder.curveTo(1.72f, 2.65f, 3.17f, 1.0f, 5.0f, 1.0f);
        pathBuilder.curveToRelative(1.64f, 0.0f, 2.96f, 1.31f, 2.99f, 2.95f);
        pathBuilder.curveToRelative(2.68f, 1.33f, 4.6f, 3.95f, 4.94f, 7.05f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.verticalLineTo(9.21f);
        pathBuilder.curveToRelative(0.0f, -0.45f, 0.54f, -0.67f, 0.85f, -0.35f);
        pathBuilder.lineToRelative(2.79f, 2.79f);
        pathBuilder.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder.lineToRelative(-2.79f, 2.79f);
        pathBuilder.curveTo(18.54f, 15.46f, 18.0f, 15.24f, 18.0f, 14.79f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mediation = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
