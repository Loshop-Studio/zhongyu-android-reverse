package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.SolidColor;
import androidx.compose.p014ui.graphics.StrokeCap;
import androidx.compose.p014ui.graphics.StrokeJoin;
import androidx.compose.p014ui.graphics.vector.ImageVector;
import androidx.compose.p014ui.graphics.vector.PathBuilder;
import androidx.compose.p014ui.graphics.vector.VectorKt;
import androidx.compose.p014ui.unit.C3186Dp;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
public final class MonetizationOnKt {
    private static ImageVector _monetizationOn;

    public static final ImageVector getMonetizationOn(Icons.Rounded rounded) {
        ImageVector imageVector = _monetizationOn;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MonetizationOn", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.41f, 18.09f);
        pathBuilder.verticalLineToRelative(0.58f);
        pathBuilder.curveToRelative(0.0f, 0.73f, -0.6f, 1.33f, -1.33f, 1.33f);
        pathBuilder.horizontalLineToRelative(-0.01f);
        pathBuilder.curveToRelative(-0.73f, 0.0f, -1.33f, -0.6f, -1.33f, -1.33f);
        pathBuilder.verticalLineToRelative(-0.6f);
        pathBuilder.curveToRelative(-1.33f, -0.28f, -2.51f, -1.01f, -3.01f, -2.24f);
        pathBuilder.curveToRelative(-0.23f, -0.55f, 0.2f, -1.16f, 0.8f, -1.16f);
        pathBuilder.horizontalLineToRelative(0.24f);
        pathBuilder.curveToRelative(0.37f, 0.0f, 0.67f, 0.25f, 0.81f, 0.6f);
        pathBuilder.curveToRelative(0.29f, 0.75f, 1.05f, 1.27f, 2.51f, 1.27f);
        pathBuilder.curveToRelative(1.96f, 0.0f, 2.4f, -0.98f, 2.4f, -1.59f);
        pathBuilder.curveToRelative(0.0f, -0.83f, -0.44f, -1.61f, -2.67f, -2.14f);
        pathBuilder.curveToRelative(-2.48f, -0.6f, -4.18f, -1.62f, -4.18f, -3.67f);
        pathBuilder.curveToRelative(0.0f, -1.72f, 1.39f, -2.84f, 3.11f, -3.21f);
        pathBuilder.verticalLineToRelative(-0.6f);
        pathBuilder.curveToRelative(0.0f, -0.73f, 0.6f, -1.33f, 1.33f, -1.33f);
        pathBuilder.horizontalLineToRelative(0.01f);
        pathBuilder.curveToRelative(0.73f, 0.0f, 1.33f, 0.6f, 1.33f, 1.33f);
        pathBuilder.verticalLineToRelative(0.62f);
        pathBuilder.curveToRelative(1.38f, 0.34f, 2.25f, 1.2f, 2.63f, 2.26f);
        pathBuilder.curveToRelative(0.2f, 0.55f, -0.22f, 1.13f, -0.81f, 1.13f);
        pathBuilder.horizontalLineToRelative(-0.26f);
        pathBuilder.curveToRelative(-0.37f, 0.0f, -0.67f, -0.26f, -0.77f, -0.62f);
        pathBuilder.curveToRelative(-0.23f, -0.76f, -0.86f, -1.25f, -2.12f, -1.25f);
        pathBuilder.curveToRelative(-1.5f, 0.0f, -2.4f, 0.68f, -2.4f, 1.64f);
        pathBuilder.curveToRelative(0.0f, 0.84f, 0.65f, 1.39f, 2.67f, 1.91f);
        pathBuilder.reflectiveCurveToRelative(4.18f, 1.39f, 4.18f, 3.91f);
        pathBuilder.curveToRelative(-0.02f, 1.83f, -1.39f, 2.83f, -3.13f, 3.16f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _monetizationOn = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
