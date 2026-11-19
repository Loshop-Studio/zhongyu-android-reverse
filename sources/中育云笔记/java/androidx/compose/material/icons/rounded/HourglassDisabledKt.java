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
public final class HourglassDisabledKt {
    private static ImageVector _hourglassDisabled;

    public static final ImageVector getHourglassDisabled(Icons.Rounded rounded) {
        ImageVector imageVector = _hourglassDisabled;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HourglassDisabled", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.81f, 2.81f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.curveTo(1.0f, 3.2f, 1.0f, 3.83f, 1.39f, 4.22f);
        pathBuilder.lineToRelative(8.19f, 8.19f);
        pathBuilder.lineToRelative(-3.0f, 3.01f);
        pathBuilder.curveTo(6.21f, 15.8f, 6.0f, 16.31f, 6.0f, 16.84f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.curveToRelative(0.86f, 0.0f, 1.58f, -0.54f, 1.87f, -1.3f);
        pathBuilder.lineToRelative(1.91f, 1.91f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineTo(2.81f, 2.81f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 19.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-2.5f);
        pathBuilder.lineToRelative(2.84f, -2.84f);
        pathBuilder.lineTo(16.0f, 18.83f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(8.0f, 5.0f);
        pathBuilder2.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder2.horizontalLineToRelative(6.0f);
        pathBuilder2.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder2.verticalLineToRelative(2.5f);
        pathBuilder2.lineToRelative(-2.84f, 2.84f);
        pathBuilder2.lineToRelative(1.25f, 1.25f);
        pathBuilder2.lineToRelative(3.0f, -2.99f);
        pathBuilder2.curveTo(17.79f, 8.22f, 18.0f, 7.71f, 18.0f, 7.18f);
        pathBuilder2.verticalLineTo(4.0f);
        pathBuilder2.curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.horizontalLineTo(8.0f);
        pathBuilder2.curveTo(7.14f, 2.0f, 6.42f, 2.54f, 6.13f, 3.3f);
        pathBuilder2.lineTo(8.0f, 5.17f);
        pathBuilder2.verticalLineTo(5.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hourglassDisabled = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
