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
public final class LoyaltyKt {
    private static ImageVector _loyalty;

    public static final ImageVector getLoyalty(Icons.Filled filled) {
        ImageVector imageVector = _loyalty;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Loyalty", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.41f, 11.58f);
        pathBuilder.lineToRelative(-9.0f, -9.0f);
        pathBuilder.curveTo(12.05f, 2.22f, 11.55f, 2.0f, 11.0f, 2.0f);
        pathBuilder.lineTo(4.0f, 2.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.22f, 1.05f, 0.59f, 1.42f);
        pathBuilder.lineToRelative(9.0f, 9.0f);
        pathBuilder.curveToRelative(0.36f, 0.36f, 0.86f, 0.58f, 1.41f, 0.58f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.05f, -0.22f, 1.41f, -0.59f);
        pathBuilder.lineToRelative(7.0f, -7.0f);
        pathBuilder.curveToRelative(0.37f, -0.36f, 0.59f, -0.86f, 0.59f, -1.41f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.23f, -1.06f, -0.59f, -1.42f);
        pathBuilder.close();
        pathBuilder.moveTo(5.5f, 7.0f);
        pathBuilder.curveTo(4.67f, 7.0f, 4.0f, 6.33f, 4.0f, 5.5f);
        pathBuilder.reflectiveCurveTo(4.67f, 4.0f, 5.5f, 4.0f);
        pathBuilder.reflectiveCurveTo(7.0f, 4.67f, 7.0f, 5.5f);
        pathBuilder.reflectiveCurveTo(6.33f, 7.0f, 5.5f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.27f, 15.27f);
        pathBuilder.lineTo(13.0f, 19.54f);
        pathBuilder.lineToRelative(-4.27f, -4.27f);
        pathBuilder.curveTo(8.28f, 14.81f, 8.0f, 14.19f, 8.0f, 13.5f);
        pathBuilder.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        pathBuilder.curveToRelative(0.69f, 0.0f, 1.32f, 0.28f, 1.77f, 0.74f);
        pathBuilder.lineToRelative(0.73f, 0.72f);
        pathBuilder.lineToRelative(0.73f, -0.73f);
        pathBuilder.curveToRelative(0.45f, -0.45f, 1.08f, -0.73f, 1.77f, -0.73f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilder.curveToRelative(0.0f, 0.69f, -0.28f, 1.32f, -0.73f, 1.77f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _loyalty = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
