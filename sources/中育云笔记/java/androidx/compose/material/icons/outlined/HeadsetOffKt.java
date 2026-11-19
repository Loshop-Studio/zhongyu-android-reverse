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
public final class HeadsetOffKt {
    private static ImageVector _headsetOff;

    public static final ImageVector getHeadsetOff(Icons.Outlined outlined) {
        ImageVector imageVector = _headsetOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.HeadsetOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.curveToRelative(3.87f, 0.0f, 7.0f, 3.13f, 7.0f, 7.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineToRelative(0.17f);
        pathBuilder.lineTo(16.83f, 14.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.verticalLineToRelative(2.17f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.curveToRelative(0.0f, -4.97f, -4.03f, -9.0f, -9.0f, -9.0f);
        pathBuilder.curveTo(9.98f, 2.0f, 8.12f, 2.67f, 6.62f, 3.8f);
        pathBuilder.lineToRelative(1.43f, 1.43f);
        pathBuilder.curveTo(9.17f, 4.45f, 10.53f, 4.0f, 12.0f, 4.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(2.1f, 2.1f);
        pathBuilder2.lineTo(0.69f, 3.51f);
        pathBuilder2.lineToRelative(3.33f, 3.33f);
        pathBuilder2.curveTo(3.37f, 8.09f, 3.0f, 9.5f, 3.0f, 11.0f);
        pathBuilder2.verticalLineToRelative(7.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(4.0f);
        pathBuilder2.verticalLineToRelative(-8.0f);
        pathBuilder2.horizontalLineTo(5.0f);
        pathBuilder2.verticalLineToRelative(-1.0f);
        pathBuilder2.curveToRelative(0.0f, -0.94f, 0.19f, -1.83f, 0.52f, -2.65f);
        pathBuilder2.lineTo(15.0f, 17.83f);
        pathBuilder2.verticalLineTo(20.0f);
        pathBuilder2.horizontalLineToRelative(2.17f);
        pathBuilder2.lineToRelative(1.0f, 1.0f);
        pathBuilder2.horizontalLineTo(12.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(7.0f);
        pathBuilder2.curveToRelative(0.34f, 0.0f, 0.65f, -0.09f, 0.93f, -0.24f);
        pathBuilder2.lineToRelative(0.55f, 0.55f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.lineTo(2.1f, 2.1f);
        pathBuilder2.close();
        pathBuilder2.moveTo(7.0f, 14.0f);
        pathBuilder2.verticalLineToRelative(4.0f);
        pathBuilder2.horizontalLineTo(5.0f);
        pathBuilder2.verticalLineToRelative(-4.0f);
        pathBuilder2.horizontalLineTo(7.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _headsetOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
