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
public final class NoFoodKt {
    private static ImageVector _noFood;

    public static final ImageVector getNoFood(Icons.Rounded rounded) {
        ImageVector imageVector = _noFood;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NoFood", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.0f, 22.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(13.0f);
        pathBuilder.curveTo(15.55f, 21.0f, 16.0f, 21.45f, 16.0f, 22.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.89f, 6.1f);
        pathBuilder.curveTo(22.95f, 5.51f, 22.49f, 5.0f, 21.9f, 5.0f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(-3.9f);
        pathBuilder.curveToRelative(-0.59f, 0.0f, -1.05f, 0.51f, -1.0f, 1.1f);
        pathBuilder.lineToRelative(0.24f, 2.41f);
        pathBuilder.lineTo(18.0f, 15.17f);
        pathBuilder.lineToRelative(3.62f, 3.62f);
        pathBuilder.lineTo(22.89f, 6.1f);
        pathBuilder.close();
        pathBuilder.moveTo(21.19f, 22.61f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineTo(12.0f, 12.0f);
        pathBuilder.lineTo(9.01f, 9.01f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(-6.2f, -6.2f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(1.0f, 3.2f, 1.0f, 3.83f, 1.39f, 4.22f);
        pathBuilder.lineToRelative(4.99f, 4.99f);
        pathBuilder.curveToRelative(-2.56f, 0.54f, -4.76f, 2.08f, -5.28f, 4.63f);
        pathBuilder.curveTo(0.99f, 14.45f, 1.49f, 15.0f, 2.1f, 15.0f);
        pathBuilder.lineToRelative(10.07f, 0.0f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(13.0f);
        pathBuilder.curveToRelative(0.32f, 0.0f, 0.59f, -0.16f, 0.78f, -0.4f);
        pathBuilder.lineToRelative(4.0f, 4.0f);
        pathBuilder.curveTo(20.17f, 23.0f, 20.8f, 23.0f, 21.19f, 22.61f);
        pathBuilder.lineTo(21.19f, 22.61f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noFood = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
