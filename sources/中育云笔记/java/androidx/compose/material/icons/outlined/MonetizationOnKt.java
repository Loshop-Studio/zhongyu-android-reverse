package androidx.compose.material.icons.outlined;

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

    public static final ImageVector getMonetizationOn(Icons.Outlined outlined) {
        ImageVector imageVector = _monetizationOn;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.MonetizationOn", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.31f, 11.14f);
        pathBuilder.curveToRelative(-1.77f, -0.45f, -2.34f, -0.94f, -2.34f, -1.67f);
        pathBuilder.curveToRelative(0.0f, -0.84f, 0.79f, -1.43f, 2.1f, -1.43f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 1.9f, 0.66f, 1.94f, 1.64f);
        pathBuilder.horizontalLineToRelative(1.71f);
        pathBuilder.curveToRelative(-0.05f, -1.34f, -0.87f, -2.57f, -2.49f, -2.97f);
        pathBuilder.lineTo(13.23f, 5.0f);
        pathBuilder.lineTo(10.9f, 5.0f);
        pathBuilder.verticalLineToRelative(1.69f);
        pathBuilder.curveToRelative(-1.51f, 0.32f, -2.72f, 1.3f, -2.72f, 2.81f);
        pathBuilder.curveToRelative(0.0f, 1.79f, 1.49f, 2.69f, 3.66f, 3.21f);
        pathBuilder.curveToRelative(1.95f, 0.46f, 2.34f, 1.15f, 2.34f, 1.87f);
        pathBuilder.curveToRelative(0.0f, 0.53f, -0.39f, 1.39f, -2.1f, 1.39f);
        pathBuilder.curveToRelative(-1.6f, 0.0f, -2.23f, -0.72f, -2.32f, -1.64f);
        pathBuilder.lineTo(8.04f, 14.33f);
        pathBuilder.curveToRelative(0.1f, 1.7f, 1.36f, 2.66f, 2.86f, 2.97f);
        pathBuilder.lineTo(10.9f, 19.0f);
        pathBuilder.horizontalLineToRelative(2.34f);
        pathBuilder.verticalLineToRelative(-1.67f);
        pathBuilder.curveToRelative(1.52f, -0.29f, 2.72f, -1.16f, 2.73f, -2.77f);
        pathBuilder.curveToRelative(-0.01f, -2.2f, -1.9f, -2.96f, -3.66f, -3.42f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _monetizationOn = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
