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
public final class StrikethroughSKt {
    private static ImageVector _strikethroughS;

    public static final ImageVector getStrikethroughS(Icons.Filled filled) {
        ImageVector imageVector = _strikethroughS;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.StrikethroughS", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.85f, 7.08f);
        pathBuilder.curveTo(6.85f, 4.37f, 9.45f, 3.0f, 12.24f, 3.0f);
        pathBuilder.curveToRelative(1.64f, 0.0f, 3.0f, 0.49f, 3.9f, 1.28f);
        pathBuilder.curveToRelative(0.77f, 0.65f, 1.46f, 1.73f, 1.46f, 3.24f);
        pathBuilder.horizontalLineToRelative(-3.01f);
        pathBuilder.curveToRelative(0.0f, -0.31f, -0.05f, -0.59f, -0.15f, -0.85f);
        pathBuilder.curveToRelative(-0.29f, -0.86f, -1.2f, -1.28f, -2.25f, -1.28f);
        pathBuilder.curveToRelative(-1.86f, 0.0f, -2.34f, 1.02f, -2.34f, 1.7f);
        pathBuilder.curveToRelative(0.0f, 0.48f, 0.25f, 0.88f, 0.74f, 1.21f);
        pathBuilder.curveTo(10.97f, 8.55f, 11.36f, 8.78f, 12.0f, 9.0f);
        pathBuilder.horizontalLineTo(7.39f);
        pathBuilder.curveTo(7.18f, 8.66f, 6.85f, 8.11f, 6.85f, 7.08f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 12.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(9.62f);
        pathBuilder.curveToRelative(1.15f, 0.45f, 1.96f, 0.75f, 1.96f, 1.97f);
        pathBuilder.curveToRelative(0.0f, 1.0f, -0.81f, 1.67f, -2.28f, 1.67f);
        pathBuilder.curveToRelative(-1.54f, 0.0f, -2.93f, -0.54f, -2.93f, -2.51f);
        pathBuilder.horizontalLineTo(6.4f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.08f, 1.13f, 0.24f, 1.58f);
        pathBuilder.curveToRelative(0.81f, 2.29f, 3.29f, 3.3f, 5.67f, 3.3f);
        pathBuilder.curveToRelative(2.27f, 0.0f, 5.3f, -0.89f, 5.3f, -4.05f);
        pathBuilder.curveToRelative(0.0f, -0.3f, -0.01f, -1.16f, -0.48f, -1.94f);
        pathBuilder.horizontalLineTo(21.0f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _strikethroughS = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
