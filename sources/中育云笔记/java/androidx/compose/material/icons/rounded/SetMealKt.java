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
public final class SetMealKt {
    private static ImageVector _setMeal;

    public static final ImageVector getSetMeal(Icons.Rounded rounded) {
        ImageVector imageVector = _setMeal;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SetMeal", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.3f, 17.6f);
        pathBuilder.lineTo(3.83f, 18.46f);
        pathBuilder.curveToRelative(-0.41f, 0.02f, -0.77f, -0.3f, -0.79f, -0.71f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.02f, -0.41f, 0.3f, -0.77f, 0.71f, -0.79f);
        pathBuilder.lineToRelative(16.48f, -0.86f);
        pathBuilder.curveToRelative(0.41f, -0.02f, 0.77f, 0.3f, 0.79f, 0.71f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveTo(21.04f, 17.22f, 20.72f, 17.58f, 20.3f, 17.6f);
        pathBuilder.close();
        pathBuilder.moveTo(20.25f, 19.48f);
        pathBuilder.horizontalLineTo(3.75f);
        pathBuilder.curveTo(3.34f, 19.48f, 3.0f, 19.82f, 3.0f, 20.23f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilder.horizontalLineToRelative(16.5f);
        pathBuilder.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(21.0f, 19.82f, 20.66f, 19.48f, 20.25f, 19.48f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 5.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveTo(21.1f, 3.0f, 22.0f, 3.9f, 22.0f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.12f, 6.09f);
        pathBuilder.curveToRelative(-1.25f, 0.27f, -2.19f, 1.11f, -2.33f, 2.14f);
        pathBuilder.curveTo(16.15f, 7.5f, 14.06f, 5.5f, 10.25f, 5.5f);
        pathBuilder.curveToRelative(-3.44f, 0.0f, -5.48f, 1.63f, -6.31f, 2.49f);
        pathBuilder.curveToRelative(-0.28f, 0.29f, -0.28f, 0.74f, 0.0f, 1.03f);
        pathBuilder.curveToRelative(0.83f, 0.86f, 2.87f, 2.49f, 6.31f, 2.49f);
        pathBuilder.curveToRelative(3.81f, 0.0f, 5.9f, -2.0f, 6.54f, -2.73f);
        pathBuilder.curveToRelative(0.14f, 1.02f, 1.08f, 1.86f, 2.33f, 2.14f);
        pathBuilder.curveToRelative(0.46f, 0.1f, 0.88f, -0.28f, 0.88f, -0.74f);
        pathBuilder.verticalLineTo(6.84f);
        pathBuilder.curveTo(20.0f, 6.37f, 19.57f, 5.99f, 19.12f, 6.09f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _setMeal = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
