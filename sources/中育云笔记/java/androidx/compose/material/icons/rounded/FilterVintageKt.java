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
public final class FilterVintageKt {
    private static ImageVector _filterVintage;

    public static final ImageVector getFilterVintage(Icons.Rounded rounded) {
        ImageVector imageVector = _filterVintage;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FilterVintage", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.7f, 12.4f);
        pathBuilder.curveToRelative(-0.28f, -0.16f, -0.57f, -0.29f, -0.86f, -0.4f);
        pathBuilder.curveToRelative(0.29f, -0.11f, 0.58f, -0.24f, 0.86f, -0.4f);
        pathBuilder.curveToRelative(1.92f, -1.11f, 2.99f, -3.12f, 3.0f, -5.19f);
        pathBuilder.curveToRelative(-1.79f, -1.03f, -4.07f, -1.11f, -6.0f, 0.0f);
        pathBuilder.curveToRelative(-0.28f, 0.16f, -0.54f, 0.35f, -0.78f, 0.54f);
        pathBuilder.curveToRelative(0.05f, -0.31f, 0.08f, -0.63f, 0.08f, -0.95f);
        pathBuilder.curveToRelative(0.0f, -2.22f, -1.21f, -4.15f, -3.0f, -5.19f);
        pathBuilder.curveTo(10.21f, 1.85f, 9.0f, 3.78f, 9.0f, 6.0f);
        pathBuilder.curveToRelative(0.0f, 0.32f, 0.03f, 0.64f, 0.08f, 0.95f);
        pathBuilder.curveToRelative(-0.24f, -0.2f, -0.5f, -0.39f, -0.78f, -0.55f);
        pathBuilder.curveToRelative(-1.92f, -1.11f, -4.2f, -1.03f, -6.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 2.07f, 1.07f, 4.08f, 3.0f, 5.19f);
        pathBuilder.curveToRelative(0.28f, 0.16f, 0.57f, 0.29f, 0.86f, 0.4f);
        pathBuilder.curveToRelative(-0.29f, 0.11f, -0.58f, 0.24f, -0.86f, 0.4f);
        pathBuilder.curveToRelative(-1.92f, 1.11f, -2.99f, 3.12f, -3.0f, 5.19f);
        pathBuilder.curveToRelative(1.79f, 1.03f, 4.07f, 1.11f, 6.0f, 0.0f);
        pathBuilder.curveToRelative(0.28f, -0.16f, 0.54f, -0.35f, 0.78f, -0.54f);
        pathBuilder.curveToRelative(-0.05f, 0.32f, -0.08f, 0.64f, -0.08f, 0.96f);
        pathBuilder.curveToRelative(0.0f, 2.22f, 1.21f, 4.15f, 3.0f, 5.19f);
        pathBuilder.curveToRelative(1.79f, -1.04f, 3.0f, -2.97f, 3.0f, -5.19f);
        pathBuilder.curveToRelative(0.0f, -0.32f, -0.03f, -0.64f, -0.08f, -0.95f);
        pathBuilder.curveToRelative(0.24f, 0.2f, 0.5f, 0.38f, 0.78f, 0.54f);
        pathBuilder.curveToRelative(1.92f, 1.11f, 4.2f, 1.03f, 6.0f, 0.0f);
        pathBuilder.curveToRelative(-0.01f, -2.07f, -1.08f, -4.08f, -3.0f, -5.19f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 16.0f);
        pathBuilder.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _filterVintage = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
