package androidx.compose.material.icons.filled;

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

    public static final ImageVector getMonetizationOn(Icons.Filled filled) {
        ImageVector imageVector = _monetizationOn;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.MonetizationOn", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        pathBuilder.lineTo(13.41f, 20.0f);
        pathBuilder.horizontalLineToRelative(-2.67f);
        pathBuilder.verticalLineToRelative(-1.93f);
        pathBuilder.curveToRelative(-1.71f, -0.36f, -3.16f, -1.46f, -3.27f, -3.4f);
        pathBuilder.horizontalLineToRelative(1.96f);
        pathBuilder.curveToRelative(0.1f, 1.05f, 0.82f, 1.87f, 2.65f, 1.87f);
        pathBuilder.curveToRelative(1.96f, 0.0f, 2.4f, -0.98f, 2.4f, -1.59f);
        pathBuilder.curveToRelative(0.0f, -0.83f, -0.44f, -1.61f, -2.67f, -2.14f);
        pathBuilder.curveToRelative(-2.48f, -0.6f, -4.18f, -1.62f, -4.18f, -3.67f);
        pathBuilder.curveToRelative(0.0f, -1.72f, 1.39f, -2.84f, 3.11f, -3.21f);
        pathBuilder.lineTo(10.74f, 4.0f);
        pathBuilder.horizontalLineToRelative(2.67f);
        pathBuilder.verticalLineToRelative(1.95f);
        pathBuilder.curveToRelative(1.86f, 0.45f, 2.79f, 1.86f, 2.85f, 3.39f);
        pathBuilder.lineTo(14.3f, 9.34f);
        pathBuilder.curveToRelative(-0.05f, -1.11f, -0.64f, -1.87f, -2.22f, -1.87f);
        pathBuilder.curveToRelative(-1.5f, 0.0f, -2.4f, 0.68f, -2.4f, 1.64f);
        pathBuilder.curveToRelative(0.0f, 0.84f, 0.65f, 1.39f, 2.67f, 1.91f);
        pathBuilder.reflectiveCurveToRelative(4.18f, 1.39f, 4.18f, 3.91f);
        pathBuilder.curveToRelative(-0.01f, 1.83f, -1.38f, 2.83f, -3.12f, 3.16f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _monetizationOn = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
