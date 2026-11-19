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
public final class ExposureNeg2Kt {
    private static ImageVector _exposureNeg2;

    public static final ImageVector getExposureNeg2(Icons.Filled filled) {
        ImageVector imageVector = _exposureNeg2;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ExposureNeg2", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.05f, 16.29f);
        pathBuilder.lineToRelative(2.86f, -3.07f);
        pathBuilder.curveToRelative(0.38f, -0.39f, 0.72f, -0.79f, 1.04f, -1.18f);
        pathBuilder.curveToRelative(0.32f, -0.39f, 0.59f, -0.78f, 0.82f, -1.17f);
        pathBuilder.curveToRelative(0.23f, -0.39f, 0.41f, -0.78f, 0.54f, -1.17f);
        pathBuilder.reflectiveCurveToRelative(0.19f, -0.79f, 0.19f, -1.18f);
        pathBuilder.curveToRelative(0.0f, -0.53f, -0.09f, -1.02f, -0.27f, -1.46f);
        pathBuilder.curveToRelative(-0.18f, -0.44f, -0.44f, -0.81f, -0.78f, -1.11f);
        pathBuilder.curveToRelative(-0.34f, -0.31f, -0.77f, -0.54f, -1.26f, -0.71f);
        pathBuilder.curveToRelative(-0.51f, -0.16f, -1.08f, -0.24f, -1.72f, -0.24f);
        pathBuilder.curveToRelative(-0.69f, 0.0f, -1.31f, 0.11f, -1.85f, 0.32f);
        pathBuilder.curveToRelative(-0.54f, 0.21f, -1.0f, 0.51f, -1.36f, 0.88f);
        pathBuilder.curveToRelative(-0.37f, 0.37f, -0.65f, 0.8f, -0.84f, 1.3f);
        pathBuilder.curveToRelative(-0.18f, 0.47f, -0.27f, 0.97f, -0.28f, 1.5f);
        pathBuilder.horizontalLineToRelative(2.14f);
        pathBuilder.curveToRelative(0.01f, -0.31f, 0.05f, -0.6f, 0.13f, -0.87f);
        pathBuilder.curveToRelative(0.09f, -0.29f, 0.23f, -0.54f, 0.4f, -0.75f);
        pathBuilder.curveToRelative(0.18f, -0.21f, 0.41f, -0.37f, 0.68f, -0.49f);
        pathBuilder.curveToRelative(0.27f, -0.12f, 0.6f, -0.18f, 0.96f, -0.18f);
        pathBuilder.curveToRelative(0.31f, 0.0f, 0.58f, 0.05f, 0.81f, 0.15f);
        pathBuilder.curveToRelative(0.23f, 0.1f, 0.43f, 0.25f, 0.59f, 0.43f);
        pathBuilder.curveToRelative(0.16f, 0.18f, 0.28f, 0.4f, 0.37f, 0.65f);
        pathBuilder.curveToRelative(0.08f, 0.25f, 0.13f, 0.52f, 0.13f, 0.81f);
        pathBuilder.curveToRelative(0.0f, 0.22f, -0.03f, 0.43f, -0.08f, 0.65f);
        pathBuilder.curveToRelative(-0.06f, 0.22f, -0.15f, 0.45f, -0.29f, 0.7f);
        pathBuilder.curveToRelative(-0.14f, 0.25f, -0.32f, 0.53f, -0.56f, 0.83f);
        pathBuilder.curveToRelative(-0.23f, 0.3f, -0.52f, 0.65f, -0.88f, 1.03f);
        pathBuilder.lineToRelative(-4.17f, 4.55f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.horizontalLineTo(21.0f);
        pathBuilder.verticalLineToRelative(-1.71f);
        pathBuilder.horizontalLineToRelative(-5.95f);
        pathBuilder.close();
        pathBuilder.moveTo(2.0f, 11.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _exposureNeg2 = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
