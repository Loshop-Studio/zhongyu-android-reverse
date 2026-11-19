package androidx.compose.material.icons.automirrored.rounded;

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
public final class VolumeUpKt {
    private static ImageVector _volumeUp;

    public static final ImageVector getVolumeUp(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _volumeUp;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.VolumeUp", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 10.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.lineToRelative(3.29f, 3.29f);
        pathBuilder.curveToRelative(0.63f, 0.63f, 1.71f, 0.18f, 1.71f, -0.71f);
        pathBuilder.lineTo(12.0f, 6.41f);
        pathBuilder.curveToRelative(0.0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f);
        pathBuilder.lineTo(7.0f, 9.0f);
        pathBuilder.lineTo(4.0f, 9.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.5f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.77f, -1.02f, -3.29f, -2.5f, -4.03f);
        pathBuilder.verticalLineToRelative(8.05f);
        pathBuilder.curveToRelative(1.48f, -0.73f, 2.5f, -2.25f, 2.5f, -4.02f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 4.45f);
        pathBuilder.verticalLineToRelative(0.2f);
        pathBuilder.curveToRelative(0.0f, 0.38f, 0.25f, 0.71f, 0.6f, 0.85f);
        pathBuilder.curveTo(17.18f, 6.53f, 19.0f, 9.06f, 19.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(-1.82f, 5.47f, -4.4f, 6.5f);
        pathBuilder.curveToRelative(-0.36f, 0.14f, -0.6f, 0.47f, -0.6f, 0.85f);
        pathBuilder.verticalLineToRelative(0.2f);
        pathBuilder.curveToRelative(0.0f, 0.63f, 0.63f, 1.07f, 1.21f, 0.85f);
        pathBuilder.curveTo(18.6f, 19.11f, 21.0f, 15.84f, 21.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(-2.4f, -7.11f, -5.79f, -8.4f);
        pathBuilder.curveToRelative(-0.58f, -0.23f, -1.21f, 0.22f, -1.21f, 0.85f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _volumeUp = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
