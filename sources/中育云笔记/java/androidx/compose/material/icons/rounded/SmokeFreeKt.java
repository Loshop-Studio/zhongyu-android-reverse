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
public final class SmokeFreeKt {
    private static ImageVector _smokeFree;

    public static final ImageVector getSmokeFree(Icons.Rounded rounded) {
        ImageVector imageVector = _smokeFree;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SmokeFree", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.5f, 13.0f);
        pathBuilder.lineTo(22.0f, 13.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(-1.5f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.lineTo(18.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 14.5f);
        pathBuilder.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder.horizontalLineToRelative(-0.84f);
        pathBuilder.lineToRelative(2.18f, 2.18f);
        pathBuilder.curveToRelative(0.1f, -0.21f, 0.16f, -0.44f, 0.16f, -0.68f);
        pathBuilder.close();
        pathBuilder.moveTo(18.96f, 2.35f);
        pathBuilder.lineTo(19.0f, 2.35f);
        pathBuilder.horizontalLineToRelative(-0.04f);
        pathBuilder.close();
        pathBuilder.moveTo(18.85f, 4.73f);
        pathBuilder.curveToRelative(0.38f, -0.38f, 0.67f, -0.84f, 0.84f, -1.35f);
        pathBuilder.curveToRelative(0.16f, -0.5f, -0.19f, -1.01f, -0.71f, -1.02f);
        pathBuilder.curveToRelative(-0.34f, 0.01f, -0.61f, 0.25f, -0.72f, 0.58f);
        pathBuilder.curveToRelative(-0.18f, 0.55f, -0.62f, 0.99f, -1.17f, 1.17f);
        pathBuilder.curveToRelative(-0.34f, 0.11f, -0.59f, 0.39f, -0.59f, 0.74f);
        pathBuilder.lineTo(16.5f, 5.0f);
        pathBuilder.curveToRelative(0.0f, 0.37f, 0.27f, 0.69f, 0.64f, 0.75f);
        pathBuilder.curveToRelative(1.93f, 0.31f, 3.36f, 2.0f, 3.36f, 4.02f);
        pathBuilder.verticalLineToRelative(1.48f);
        pathBuilder.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilder.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilder.lineTo(22.0f, 9.76f);
        pathBuilder.curveToRelative(0.0f, -2.22f, -1.28f, -4.14f, -3.15f, -5.03f);
        pathBuilder.close();
        pathBuilder.moveTo(14.61f, 8.65f);
        pathBuilder.horizontalLineToRelative(1.42f);
        pathBuilder.curveToRelative(1.05f, 0.0f, 1.97f, 0.74f, 1.97f, 2.05f);
        pathBuilder.verticalLineToRelative(0.55f);
        pathBuilder.curveToRelative(0.0f, 0.41f, 0.33f, 0.75f, 0.75f, 0.75f);
        pathBuilder.horizontalLineToRelative(0.01f);
        pathBuilder.curveToRelative(0.41f, 0.0f, 0.75f, -0.33f, 0.75f, -0.75f);
        pathBuilder.verticalLineToRelative(-0.89f);
        pathBuilder.curveToRelative(0.0f, -1.81f, -1.6f, -3.16f, -3.47f, -3.16f);
        pathBuilder.horizontalLineToRelative(-1.3f);
        pathBuilder.curveToRelative(-1.02f, 0.0f, -1.94f, -0.73f, -2.07f, -1.75f);
        pathBuilder.curveToRelative(-0.12f, -0.95f, 0.46f, -1.7f, 1.3f, -1.93f);
        pathBuilder.curveToRelative(0.32f, -0.09f, 0.54f, -0.38f, 0.54f, -0.72f);
        pathBuilder.curveToRelative(0.0f, -0.49f, -0.46f, -0.86f, -0.93f, -0.72f);
        pathBuilder.curveToRelative(-1.42f, 0.41f, -2.45f, 1.73f, -2.42f, 3.28f);
        pathBuilder.curveToRelative(0.02f, 1.85f, 1.61f, 3.29f, 3.45f, 3.29f);
        pathBuilder.close();
        pathBuilder.moveTo(4.12f, 5.29f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineTo(9.0f, 13.0f);
        pathBuilder.lineTo(3.5f, 13.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(2.67f, 16.0f, 3.5f, 16.0f);
        pathBuilder.lineTo(12.0f, 16.0f);
        pathBuilder.lineToRelative(6.29f, 6.29f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineTo(4.12f, 5.29f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _smokeFree = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
