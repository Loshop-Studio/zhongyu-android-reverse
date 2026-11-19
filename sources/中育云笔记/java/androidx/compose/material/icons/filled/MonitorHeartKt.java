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
public final class MonitorHeartKt {
    private static ImageVector _monitorHeart;

    public static final ImageVector getMonitorHeart(Icons.Filled filled) {
        ImageVector imageVector = _monitorHeart;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.MonitorHeart", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.11f, 12.45f);
        pathBuilder.lineTo(14.0f, 10.24f);
        pathBuilder.lineToRelative(-3.11f, 6.21f);
        pathBuilder.curveTo(10.73f, 16.79f, 10.38f, 17.0f, 10.0f, 17.0f);
        pathBuilder.reflectiveCurveToRelative(-0.73f, -0.21f, -0.89f, -0.55f);
        pathBuilder.lineTo(7.38f, 13.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-5.0f);
        pathBuilder.horizontalLineToRelative(-6.0f);
        pathBuilder.curveTo(15.62f, 13.0f, 15.27f, 12.79f, 15.11f, 12.45f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.0f, 4.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        pathBuilder2.verticalLineToRelative(5.0f);
        pathBuilder2.horizontalLineToRelative(6.0f);
        pathBuilder2.curveToRelative(0.38f, 0.0f, 0.73f, 0.21f, 0.89f, 0.55f);
        pathBuilder2.lineTo(10.0f, 13.76f);
        pathBuilder2.lineToRelative(3.11f, -6.21f);
        pathBuilder2.curveToRelative(0.34f, -0.68f, 1.45f, -0.68f, 1.79f, 0.0f);
        pathBuilder2.lineTo(16.62f, 11.0f);
        pathBuilder2.horizontalLineTo(22.0f);
        pathBuilder2.verticalLineTo(6.0f);
        pathBuilder2.curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _monitorHeart = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
