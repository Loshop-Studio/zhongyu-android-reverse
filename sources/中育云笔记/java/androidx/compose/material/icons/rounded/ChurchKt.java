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
public final class ChurchKt {
    private static ImageVector _church;

    public static final ImageVector getChurch(Icons.Rounded rounded) {
        ImageVector imageVector = _church;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Church", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 12.22f);
        pathBuilder.verticalLineToRelative(-1.99f);
        pathBuilder.curveToRelative(0.0f, -0.76f, -0.43f, -1.45f, -1.11f, -1.79f);
        pathBuilder.lineTo(13.0f, 6.5f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.curveTo(9.45f, 3.0f, 9.0f, 3.45f, 9.0f, 4.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.lineTo(7.11f, 8.45f);
        pathBuilder.curveTo(6.43f, 8.79f, 6.0f, 9.48f, 6.0f, 10.24f);
        pathBuilder.verticalLineToRelative(1.99f);
        pathBuilder.lineToRelative(-2.81f, 1.25f);
        pathBuilder.curveTo(2.47f, 13.79f, 2.0f, 14.51f, 2.0f, 15.3f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.lineToRelative(0.0f, -2.89f);
        pathBuilder.curveToRelative(0.0f, -1.0f, 0.68f, -1.92f, 1.66f, -2.08f);
        pathBuilder.curveTo(12.92f, 16.82f, 14.0f, 17.79f, 14.0f, 19.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-4.7f);
        pathBuilder.curveToRelative(0.0f, -0.79f, -0.47f, -1.51f, -1.19f, -1.83f);
        pathBuilder.lineTo(18.0f, 12.22f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 13.5f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(12.83f, 13.5f, 12.0f, 13.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _church = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
