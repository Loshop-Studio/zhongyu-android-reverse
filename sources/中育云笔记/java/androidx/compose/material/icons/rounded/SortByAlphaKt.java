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
public final class SortByAlphaKt {
    private static ImageVector _sortByAlpha;

    public static final ImageVector getSortByAlpha(Icons.Rounded rounded) {
        ImageVector imageVector = _sortByAlpha;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SortByAlpha", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.93f, 2.65f);
        pathBuilder.curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f);
        pathBuilder.lineToRelative(-2.01f, 2.01f);
        pathBuilder.horizontalLineToRelative(4.72f);
        pathBuilder.lineToRelative(-2.0f, -2.01f);
        pathBuilder.close();
        pathBuilder.moveTo(12.23f, 21.35f);
        pathBuilder.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        pathBuilder.lineToRelative(1.98f, -1.98f);
        pathBuilder.horizontalLineToRelative(-4.66f);
        pathBuilder.lineToRelative(1.97f, 1.98f);
        pathBuilder.close();
        pathBuilder.moveTo(10.98f, 17.73f);
        pathBuilder.curveToRelative(0.6f, 0.0f, 1.01f, -0.6f, 0.79f, -1.16f);
        pathBuilder.lineTo(8.04f, 7.03f);
        pathBuilder.curveToRelative(-0.18f, -0.46f, -0.63f, -0.76f, -1.12f, -0.76f);
        pathBuilder.curveToRelative(-0.49f, 0.0f, -0.94f, 0.3f, -1.12f, 0.76f);
        pathBuilder.lineToRelative(-3.74f, 9.53f);
        pathBuilder.curveToRelative(-0.22f, 0.56f, 0.19f, 1.16f, 0.79f, 1.16f);
        pathBuilder.curveToRelative(0.35f, 0.0f, 0.67f, -0.22f, 0.8f, -0.55f);
        pathBuilder.lineToRelative(0.71f, -1.9f);
        pathBuilder.horizontalLineToRelative(5.11f);
        pathBuilder.lineToRelative(0.71f, 1.9f);
        pathBuilder.curveToRelative(0.13f, 0.34f, 0.45f, 0.56f, 0.8f, 0.56f);
        pathBuilder.close();
        pathBuilder.moveTo(4.97f, 13.64f);
        pathBuilder.lineToRelative(1.94f, -5.18f);
        pathBuilder.lineToRelative(1.94f, 5.18f);
        pathBuilder.lineTo(4.97f, 13.64f);
        pathBuilder.close();
        pathBuilder.moveTo(21.05f, 16.14f);
        pathBuilder.horizontalLineToRelative(-5.33f);
        pathBuilder.lineToRelative(5.72f, -8.29f);
        pathBuilder.curveToRelative(0.46f, -0.66f, -0.02f, -1.57f, -0.82f, -1.57f);
        pathBuilder.horizontalLineToRelative(-6.48f);
        pathBuilder.curveToRelative(-0.44f, 0.0f, -0.79f, 0.36f, -0.79f, 0.8f);
        pathBuilder.verticalLineToRelative(0.01f);
        pathBuilder.curveToRelative(0.0f, 0.44f, 0.36f, 0.8f, 0.79f, 0.8f);
        pathBuilder.horizontalLineToRelative(5.09f);
        pathBuilder.lineToRelative(-5.73f, 8.28f);
        pathBuilder.curveToRelative(-0.46f, 0.66f, 0.02f, 1.57f, 0.82f, 1.57f);
        pathBuilder.horizontalLineToRelative(6.72f);
        pathBuilder.curveToRelative(0.44f, 0.0f, 0.79f, -0.36f, 0.79f, -0.79f);
        pathBuilder.curveToRelative(0.02f, -0.45f, -0.34f, -0.81f, -0.78f, -0.81f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sortByAlpha = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
