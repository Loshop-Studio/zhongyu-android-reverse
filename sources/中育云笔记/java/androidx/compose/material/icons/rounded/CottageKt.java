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
public final class CottageKt {
    private static ImageVector _cottage;

    public static final ImageVector getCottage(Icons.Rounded rounded) {
        ImageVector imageVector = _cottage;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Cottage", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.39f, 12.19f);
        pathBuilder.curveToRelative(0.34f, -0.44f, 0.25f, -1.07f, -0.19f, -1.4f);
        pathBuilder.lineToRelative(-9.6f, -7.33f);
        pathBuilder.curveToRelative(-0.36f, -0.27f, -0.86f, -0.27f, -1.21f, 0.0f);
        pathBuilder.lineTo(6.0f, 7.58f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveTo(4.0f, 6.45f, 4.0f, 7.0f);
        pathBuilder.verticalLineToRelative(2.11f);
        pathBuilder.lineToRelative(-2.21f, 1.68f);
        pathBuilder.curveToRelative(-0.44f, 0.33f, -0.52f, 0.96f, -0.19f, 1.4f);
        pathBuilder.curveToRelative(0.34f, 0.44f, 0.96f, 0.52f, 1.4f, 0.19f);
        pathBuilder.lineTo(4.0f, 11.62f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(-5.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-8.38f);
        pathBuilder.lineToRelative(0.99f, 0.76f);
        pathBuilder.curveTo(21.43f, 12.72f, 22.06f, 12.63f, 22.39f, 12.19f);
        pathBuilder.close();
        pathBuilder.moveTo(5.27f, 5.0f);
        pathBuilder.curveToRelative(-0.74f, 0.0f, -1.26f, -0.8f, -0.9f, -1.45f);
        pathBuilder.curveTo(4.89f, 2.62f, 5.87f, 2.0f, 7.0f, 2.0f);
        pathBuilder.curveToRelative(0.38f, 0.0f, 0.72f, -0.22f, 0.89f, -0.53f);
        pathBuilder.curveTo(8.04f, 1.16f, 8.39f, 1.0f, 8.73f, 1.0f);
        pathBuilder.curveToRelative(0.74f, 0.0f, 1.26f, 0.8f, 0.9f, 1.45f);
        pathBuilder.curveTo(9.11f, 3.38f, 8.13f, 4.0f, 7.0f, 4.0f);
        pathBuilder.curveTo(6.62f, 4.0f, 6.28f, 4.22f, 6.11f, 4.53f);
        pathBuilder.curveTo(5.96f, 4.84f, 5.61f, 5.0f, 5.27f, 5.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cottage = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
