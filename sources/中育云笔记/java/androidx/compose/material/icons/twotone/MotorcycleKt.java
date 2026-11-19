package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class MotorcycleKt {
    private static ImageVector _motorcycle;

    public static final ImageVector getMotorcycle(Icons.TwoTone twoTone) {
        ImageVector imageVector = _motorcycle;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Motorcycle", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.7f, 12.31f);
        pathBuilder.lineToRelative(0.25f, 0.69f);
        pathBuilder.horizontalLineToRelative(0.77f);
        pathBuilder.lineToRelative(2.0f, -2.0f);
        pathBuilder.horizontalLineTo(8.98f);
        pathBuilder.curveToRelative(0.3f, 0.39f, 0.54f, 0.83f, 0.72f, 1.31f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(19.44f, 9.03f);
        pathBuilder2.lineTo(15.41f, 5.0f);
        pathBuilder2.lineTo(11.0f, 5.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(3.59f);
        pathBuilder2.lineToRelative(2.0f, 2.0f);
        pathBuilder2.lineTo(5.0f, 9.0f);
        pathBuilder2.curveToRelative(-2.8f, 0.0f, -5.0f, 2.2f, -5.0f, 5.0f);
        pathBuilder2.reflectiveCurveToRelative(2.2f, 5.0f, 5.0f, 5.0f);
        pathBuilder2.curveToRelative(2.46f, 0.0f, 4.45f, -1.69f, 4.9f, -4.0f);
        pathBuilder2.horizontalLineToRelative(1.65f);
        pathBuilder2.lineToRelative(2.77f, -2.77f);
        pathBuilder2.curveToRelative(-0.21f, 0.54f, -0.32f, 1.14f, -0.32f, 1.77f);
        pathBuilder2.curveToRelative(0.0f, 2.8f, 2.2f, 5.0f, 5.0f, 5.0f);
        pathBuilder2.reflectiveCurveToRelative(5.0f, -2.2f, 5.0f, -5.0f);
        pathBuilder2.curveToRelative(0.0f, -2.65f, -1.97f, -4.77f, -4.56f, -4.97f);
        pathBuilder2.close();
        pathBuilder2.moveTo(7.82f, 15.0f);
        pathBuilder2.curveTo(7.4f, 16.15f, 6.28f, 17.0f, 5.0f, 17.0f);
        pathBuilder2.curveToRelative(-1.63f, 0.0f, -3.0f, -1.37f, -3.0f, -3.0f);
        pathBuilder2.reflectiveCurveToRelative(1.37f, -3.0f, 3.0f, -3.0f);
        pathBuilder2.curveToRelative(1.28f, 0.0f, 2.4f, 0.85f, 2.82f, 2.0f);
        pathBuilder2.lineTo(5.0f, 13.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(2.82f);
        pathBuilder2.close();
        pathBuilder2.moveTo(10.72f, 13.0f);
        pathBuilder2.horizontalLineToRelative(-0.77f);
        pathBuilder2.lineToRelative(-0.25f, -0.69f);
        pathBuilder2.curveToRelative(-0.18f, -0.48f, -0.42f, -0.92f, -0.72f, -1.31f);
        pathBuilder2.horizontalLineToRelative(3.74f);
        pathBuilder2.lineToRelative(-2.0f, 2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.0f, 17.0f);
        pathBuilder2.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder2.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder2.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _motorcycle = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
