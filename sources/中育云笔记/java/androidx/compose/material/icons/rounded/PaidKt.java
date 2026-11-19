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
public final class PaidKt {
    private static ImageVector _paid;

    public static final ImageVector getPaid(Icons.Rounded rounded) {
        ImageVector imageVector = _paid;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Paid", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        pathBuilder.moveTo(12.88f, 17.76f);
        pathBuilder.verticalLineToRelative(0.36f);
        pathBuilder.curveToRelative(0.0f, 0.48f, -0.39f, 0.88f, -0.88f, 0.88f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.48f, 0.0f, -0.88f, -0.39f, -0.88f, -0.88f);
        pathBuilder.verticalLineToRelative(-0.42f);
        pathBuilder.curveToRelative(-0.63f, -0.15f, -1.93f, -0.61f, -2.69f, -2.1f);
        pathBuilder.curveToRelative(-0.23f, -0.44f, -0.01f, -0.99f, 0.45f, -1.18f);
        pathBuilder.lineToRelative(0.07f, -0.03f);
        pathBuilder.curveToRelative(0.41f, -0.17f, 0.87f, 0.0f, 1.08f, 0.39f);
        pathBuilder.curveToRelative(0.32f, 0.61f, 0.95f, 1.37f, 2.12f, 1.37f);
        pathBuilder.curveToRelative(0.93f, 0.0f, 1.98f, -0.48f, 1.98f, -1.61f);
        pathBuilder.curveToRelative(0.0f, -0.96f, -0.7f, -1.46f, -2.28f, -2.03f);
        pathBuilder.curveToRelative(-1.1f, -0.39f, -3.35f, -1.03f, -3.35f, -3.31f);
        pathBuilder.curveToRelative(0.0f, -0.1f, 0.01f, -2.4f, 2.62f, -2.96f);
        pathBuilder.verticalLineTo(5.88f);
        pathBuilder.curveTo(11.12f, 5.39f, 11.52f, 5.0f, 12.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.48f, 0.0f, 0.88f, 0.39f, 0.88f, 0.88f);
        pathBuilder.verticalLineToRelative(0.37f);
        pathBuilder.curveToRelative(1.07f, 0.19f, 1.75f, 0.76f, 2.16f, 1.3f);
        pathBuilder.curveToRelative(0.34f, 0.44f, 0.16f, 1.08f, -0.36f, 1.3f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(14.32f, 9.0f, 13.9f, 8.88f, 13.66f, 8.57f);
        pathBuilder.curveToRelative(-0.28f, -0.38f, -0.78f, -0.77f, -1.6f, -0.77f);
        pathBuilder.curveToRelative(-0.7f, 0.0f, -1.81f, 0.37f, -1.81f, 1.39f);
        pathBuilder.curveToRelative(0.0f, 0.95f, 0.86f, 1.31f, 2.64f, 1.9f);
        pathBuilder.curveToRelative(2.4f, 0.83f, 3.01f, 2.05f, 3.01f, 3.45f);
        pathBuilder.curveTo(15.9f, 17.17f, 13.4f, 17.67f, 12.88f, 17.76f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _paid = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
