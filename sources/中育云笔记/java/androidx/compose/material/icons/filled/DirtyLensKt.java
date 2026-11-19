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
public final class DirtyLensKt {
    private static ImageVector _dirtyLens;

    public static final ImageVector getDirtyLens(Icons.Filled filled) {
        ImageVector imageVector = _dirtyLens;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DirtyLens", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.95f, 19.0f);
        pathBuilder.lineTo(20.0f, 19.0f);
        pathBuilder.lineTo(20.0f, 7.0f);
        pathBuilder.lineTo(4.0f, 7.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.horizontalLineToRelative(7.24f);
        pathBuilder.curveToRelative(0.14f, -0.98f, 0.42f, -2.05f, -0.16f, -2.43f);
        pathBuilder.curveToRelative(-0.89f, -0.59f, -1.27f, 2.06f, -2.8f, 1.35f);
        pathBuilder.curveToRelative(-1.39f, -1.12f, 1.05f, -1.29f, 0.5f, -3.27f);
        pathBuilder.curveToRelative(-0.22f, -0.79f, -2.28f, 0.36f, -2.4f, -1.24f);
        pathBuilder.curveToRelative(-0.08f, -1.0f, 1.49f, -0.74f, 1.51f, -1.49f);
        pathBuilder.curveToRelative(0.03f, -0.75f, -1.03f, -1.05f, -0.25f, -1.91f);
        pathBuilder.curveToRelative(0.22f, -0.24f, 0.71f, -0.26f, 0.91f, -0.19f);
        pathBuilder.curveToRelative(0.79f, 0.27f, 1.55f, 1.82f, 2.51f, 1.19f);
        pathBuilder.curveToRelative(1.03f, -0.66f, -1.88f, -2.35f, 0.0f, -2.86f);
        pathBuilder.curveToRelative(1.64f, -0.44f, 1.31f, 2.08f, 2.65f, 2.44f);
        pathBuilder.curveToRelative(1.94f, 0.52f, 2.65f, -4.55f, 4.41f, -2.33f);
        pathBuilder.curveToRelative(1.85f, 2.33f, -3.43f, 2.27f, -2.85f, 4.01f);
        pathBuilder.curveToRelative(0.34f, 1.01f, 2.15f, -1.2f, 2.76f, 0.53f);
        pathBuilder.curveToRelative(0.64f, 1.83f, -3.09f, 0.82f, -3.04f, 1.66f);
        pathBuilder.curveToRelative(0.06f, 0.83f, 2.41f, 0.55f, 1.64f, 2.12f);
        pathBuilder.curveToRelative(-1.14f, 1.86f, -3.0f, -1.03f, -3.81f, 0.09f);
        pathBuilder.curveToRelative(-0.39f, 0.57f, -0.09f, 1.49f, 0.13f, 2.33f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 5.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.lineTo(4.0f, 21.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.lineTo(2.0f, 7.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(3.17f);
        pathBuilder.lineTo(9.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.lineToRelative(1.83f, 2.0f);
        pathBuilder.lineTo(20.0f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.14f, 18.01f);
        pathBuilder.curveToRelative(-0.47f, 0.0f, -0.86f, -0.38f, -0.86f, -0.86f);
        pathBuilder.reflectiveCurveToRelative(0.38f, -0.86f, 0.86f, -0.86f);
        pathBuilder.curveToRelative(0.47f, 0.0f, 0.86f, 0.38f, 0.86f, 0.86f);
        pathBuilder.reflectiveCurveToRelative(-0.38f, 0.86f, -0.86f, 0.86f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dirtyLens = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
