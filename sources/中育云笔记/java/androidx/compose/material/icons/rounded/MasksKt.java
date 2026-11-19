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
public final class MasksKt {
    private static ImageVector _masks;

    public static final ImageVector getMasks(Icons.Rounded rounded) {
        ImageVector imageVector = _masks;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Masks", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.5f, 6.0f);
        pathBuilder.curveToRelative(-1.31f, 0.0f, -2.37f, 1.01f, -2.48f, 2.3f);
        pathBuilder.curveTo(15.14f, 7.8f, 14.18f, 6.5f, 12.0f, 6.5f);
        pathBuilder.curveToRelative(-2.19f, 0.0f, -3.14f, 1.3f, -5.02f, 1.8f);
        pathBuilder.curveTo(6.87f, 7.02f, 5.81f, 6.0f, 4.5f, 6.0f);
        pathBuilder.curveTo(3.12f, 6.0f, 2.0f, 7.12f, 2.0f, 8.5f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.curveToRelative(0.0f, 6.0f, 3.6f, 7.81f, 6.52f, 7.98f);
        pathBuilder.curveTo(9.53f, 17.62f, 10.72f, 18.0f, 12.0f, 18.0f);
        pathBuilder.reflectiveCurveToRelative(2.47f, -0.38f, 3.48f, -1.02f);
        pathBuilder.curveTo(18.4f, 16.81f, 22.0f, 15.0f, 22.0f, 9.0f);
        pathBuilder.verticalLineTo(8.5f);
        pathBuilder.curveTo(22.0f, 7.12f, 20.88f, 6.0f, 19.5f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.5f, 9.0f);
        pathBuilder.verticalLineTo(8.5f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.curveToRelative(0.0f, 1.28f, 0.38f, 2.47f, 1.01f, 3.48f);
        pathBuilder.curveTo(4.99f, 14.27f, 3.5f, 12.65f, 3.5f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.3f, 11.01f);
        pathBuilder.curveToRelative(-0.4f, -0.17f, -0.72f, -0.36f, -1.01f, -0.53f);
        pathBuilder.curveTo(12.83f, 10.2f, 12.49f, 10.0f, 12.0f, 10.0f);
        pathBuilder.curveToRelative(-0.49f, 0.0f, -0.84f, 0.2f, -1.31f, 0.48f);
        pathBuilder.curveToRelative(-0.28f, 0.17f, -0.6f, 0.35f, -0.98f, 0.51f);
        pathBuilder.curveTo(9.37f, 11.14f, 9.0f, 10.91f, 9.0f, 10.54f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, -0.2f, 0.11f, -0.38f, 0.29f, -0.45f);
        pathBuilder.curveToRelative(0.34f, -0.14f, 0.62f, -0.31f, 0.88f, -0.46f);
        pathBuilder.curveTo(10.72f, 9.3f, 11.23f, 9.0f, 12.0f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(1.27f, 0.3f, 1.8f, 0.62f);
        pathBuilder.curveToRelative(0.27f, 0.16f, 0.55f, 0.33f, 0.9f, 0.48f);
        pathBuilder.curveToRelative(0.18f, 0.08f, 0.29f, 0.26f, 0.29f, 0.45f);
        pathBuilder.curveTo(15.0f, 10.91f, 14.63f, 11.15f, 14.3f, 11.01f);
        pathBuilder.close();
        pathBuilder.moveTo(20.5f, 9.0f);
        pathBuilder.curveToRelative(0.0f, 3.65f, -1.49f, 5.27f, -3.01f, 5.98f);
        pathBuilder.curveToRelative(0.64f, -1.01f, 1.01f, -2.2f, 1.01f, -3.48f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _masks = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
