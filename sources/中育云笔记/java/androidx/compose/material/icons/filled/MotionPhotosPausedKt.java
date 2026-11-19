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
public final class MotionPhotosPausedKt {
    private static ImageVector _motionPhotosPaused;

    public static final ImageVector getMotionPhotosPaused(Icons.Filled filled) {
        ImageVector imageVector = _motionPhotosPaused;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.MotionPhotosPaused", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 5.52f, -4.48f, 10.0f, -10.0f, 10.0f);
        pathBuilder.reflectiveCurveTo(2.0f, 17.52f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.19f, 0.22f, -2.32f, 0.6f, -3.38f);
        pathBuilder.lineTo(4.48f, 9.3f);
        pathBuilder.curveTo(4.17f, 10.14f, 4.0f, 11.05f, 4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 4.41f, 3.59f, 8.0f, 8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, -3.59f, 8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(-3.59f, -8.0f, -8.0f, -8.0f);
        pathBuilder.curveToRelative(-0.95f, 0.0f, -1.85f, 0.17f, -2.69f, 0.48f);
        pathBuilder.lineTo(8.63f, 2.59f);
        pathBuilder.curveTo(9.69f, 2.22f, 10.82f, 2.0f, 12.0f, 2.0f);
        pathBuilder.curveTo(17.52f, 2.0f, 22.0f, 6.48f, 22.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.5f, 4.0f);
        pathBuilder.curveTo(4.67f, 4.0f, 4.0f, 4.67f, 4.0f, 5.5f);
        pathBuilder.reflectiveCurveTo(4.67f, 7.0f, 5.5f, 7.0f);
        pathBuilder.reflectiveCurveTo(7.0f, 6.33f, 7.0f, 5.5f);
        pathBuilder.reflectiveCurveTo(6.33f, 4.0f, 5.5f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 16.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 16.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.horizontalLineTo(15.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _motionPhotosPaused = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
