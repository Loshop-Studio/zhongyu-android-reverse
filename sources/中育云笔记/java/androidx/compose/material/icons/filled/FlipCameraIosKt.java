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
public final class FlipCameraIosKt {
    private static ImageVector _flipCameraIos;

    public static final ImageVector getFlipCameraIos(Icons.Filled filled) {
        ImageVector imageVector = _flipCameraIos;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.FlipCameraIos", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(-3.17f);
        pathBuilder.lineTo(15.0f, 3.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.lineTo(7.17f, 5.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveTo(2.9f, 5.0f, 2.0f, 5.9f, 2.0f, 7.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.curveTo(22.0f, 5.9f, 21.1f, 5.0f, 20.0f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 18.0f);
        pathBuilder.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.lineToRelative(2.5f, -2.5f);
        pathBuilder.lineTo(10.0f, 13.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder.curveToRelative(0.58f, 0.0f, 1.13f, -0.13f, 1.62f, -0.35f);
        pathBuilder.lineToRelative(0.74f, 0.74f);
        pathBuilder.curveTo(13.65f, 17.76f, 12.86f, 18.0f, 12.0f, 18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.5f, 15.5f);
        pathBuilder.lineTo(14.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder.curveToRelative(-0.58f, 0.0f, -1.13f, 0.13f, -1.62f, 0.35f);
        pathBuilder.lineTo(9.64f, 8.62f);
        pathBuilder.curveTo(10.35f, 8.24f, 11.14f, 8.0f, 12.0f, 8.0f);
        pathBuilder.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineTo(16.5f, 15.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flipCameraIos = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
