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
public final class MotorcycleKt {
    private static ImageVector _motorcycle;

    public static final ImageVector getMotorcycle(Icons.Rounded rounded) {
        ImageVector imageVector = _motorcycle;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Motorcycle", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.44f, 9.03f);
        pathBuilder.lineTo(17.31f, 6.9f);
        pathBuilder.lineToRelative(-1.6f, -1.6f);
        pathBuilder.curveToRelative(-0.19f, -0.19f, -0.45f, -0.3f, -0.71f, -0.3f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(2.59f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.lineTo(5.0f, 9.0f);
        pathBuilder.curveToRelative(-2.8f, 0.0f, -5.0f, 2.2f, -5.0f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(2.2f, 5.0f, 5.0f, 5.0f);
        pathBuilder.curveToRelative(2.46f, 0.0f, 4.45f, -1.69f, 4.9f, -4.0f);
        pathBuilder.horizontalLineToRelative(0.82f);
        pathBuilder.curveToRelative(0.53f, 0.0f, 1.04f, -0.21f, 1.41f, -0.59f);
        pathBuilder.lineToRelative(2.18f, -2.18f);
        pathBuilder.curveToRelative(-0.2f, 0.54f, -0.31f, 1.14f, -0.31f, 1.77f);
        pathBuilder.curveToRelative(0.0f, 2.8f, 2.2f, 5.0f, 5.0f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(5.0f, -2.2f, 5.0f, -5.0f);
        pathBuilder.curveToRelative(0.0f, -2.65f, -1.97f, -4.77f, -4.56f, -4.97f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 15.0f);
        pathBuilder.horizontalLineToRelative(2.82f);
        pathBuilder.curveTo(7.4f, 16.15f, 6.28f, 17.0f, 5.0f, 17.0f);
        pathBuilder.curveToRelative(-1.63f, 0.0f, -3.0f, -1.37f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(1.37f, -3.0f, 3.0f, -3.0f);
        pathBuilder.curveToRelative(1.28f, 0.0f, 2.4f, 0.85f, 2.82f, 2.0f);
        pathBuilder.lineTo(5.0f, 13.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 17.0f);
        pathBuilder.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _motorcycle = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
