package androidx.compose.material.icons.outlined;

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
public final class CloudCircleKt {
    private static ImageVector _cloudCircle;

    public static final ImageVector getCloudCircle(Icons.Outlined outlined) {
        ImageVector imageVector = _cloudCircle;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.CloudCircle", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.29f, 10.19f);
        pathBuilder.curveToRelative(-0.4f, -2.01f, -2.16f, -3.52f, -4.29f, -3.52f);
        pathBuilder.curveToRelative(-1.69f, 0.0f, -3.15f, 0.96f, -3.88f, 2.36f);
        pathBuilder.curveTo(6.36f, 9.21f, 5.0f, 10.7f, 5.0f, 12.5f);
        pathBuilder.curveTo(5.0f, 14.43f, 6.57f, 16.0f, 8.5f, 16.0f);
        pathBuilder.horizontalLineToRelative(7.58f);
        pathBuilder.curveToRelative(1.61f, 0.0f, 2.92f, -1.31f, 2.92f, -2.92f);
        pathBuilder.curveToRelative(0.0f, -1.54f, -1.2f, -2.79f, -2.71f, -2.89f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 14.0f);
        pathBuilder.lineTo(8.5f, 14.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(7.67f, 11.0f, 8.5f, 11.0f);
        pathBuilder.horizontalLineToRelative(0.9f);
        pathBuilder.lineToRelative(0.49f, -1.05f);
        pathBuilder.curveToRelative(0.41f, -0.79f, 1.22f, -1.28f, 2.11f, -1.28f);
        pathBuilder.curveToRelative(1.13f, 0.0f, 2.11f, 0.8f, 2.33f, 1.91f);
        pathBuilder.lineToRelative(0.28f, 1.42f);
        pathBuilder.lineTo(16.0f, 12.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cloudCircle = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
