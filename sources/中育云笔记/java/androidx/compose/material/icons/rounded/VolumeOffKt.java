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
import p309qc.InterfaceC10770a;

/* loaded from: classes.dex */
public final class VolumeOffKt {
    private static ImageVector _volumeOff;

    public static final ImageVector getVolumeOff(Icons.Rounded rounded) {
        ImageVector imageVector = _volumeOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.VolumeOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.63f, 3.63f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineTo(7.29f, 8.7f);
        pathBuilder.lineTo(7.0f, 9.0f);
        pathBuilder.lineTo(4.0f, 9.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.lineToRelative(3.29f, 3.29f);
        pathBuilder.curveToRelative(0.63f, 0.63f, 1.71f, 0.18f, 1.71f, -0.71f);
        pathBuilder.verticalLineToRelative(-4.17f);
        pathBuilder.lineToRelative(4.18f, 4.18f);
        pathBuilder.curveToRelative(-0.49f, 0.37f, -1.02f, 0.68f, -1.6f, 0.91f);
        pathBuilder.curveToRelative(-0.36f, 0.15f, -0.58f, 0.53f, -0.58f, 0.92f);
        pathBuilder.curveToRelative(0.0f, 0.72f, 0.73f, 1.18f, 1.39f, 0.91f);
        pathBuilder.curveToRelative(0.8f, -0.33f, 1.55f, -0.77f, 2.22f, -1.31f);
        pathBuilder.lineToRelative(1.34f, 1.34f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineTo(5.05f, 3.63f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.42f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 0.82f, -0.15f, 1.61f, -0.41f, 2.34f);
        pathBuilder.lineToRelative(1.53f, 1.53f);
        pathBuilder.curveToRelative(0.56f, -1.17f, 0.88f, -2.48f, 0.88f, -3.87f);
        pathBuilder.curveToRelative(0.0f, -3.83f, -2.4f, -7.11f, -5.78f, -8.4f);
        pathBuilder.curveToRelative(-0.59f, -0.23f, -1.22f, 0.23f, -1.22f, 0.86f);
        pathBuilder.verticalLineToRelative(0.19f);
        pathBuilder.curveToRelative(0.0f, 0.38f, 0.25f, 0.71f, 0.61f, 0.85f);
        pathBuilder.curveTo(17.18f, 6.54f, 19.0f, 9.06f, 19.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.29f, 5.71f);
        pathBuilder.lineToRelative(-0.17f, 0.17f);
        pathBuilder.lineTo(12.0f, 7.76f);
        pathBuilder.lineTo(12.0f, 6.41f);
        pathBuilder.curveToRelative(0.0f, -0.89f, -1.08f, -1.33f, -1.71f, -0.7f);
        pathBuilder.close();
        pathBuilder.moveTo(16.5f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.77f, -1.02f, -3.29f, -2.5f, -4.03f);
        pathBuilder.verticalLineToRelative(1.79f);
        pathBuilder.lineToRelative(2.48f, 2.48f);
        pathBuilder.curveToRelative(0.01f, -0.08f, 0.02f, -0.16f, 0.02f, -0.24f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _volumeOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }

    @InterfaceC10770a
    public static /* synthetic */ void getVolumeOff$annotations(Icons.Rounded rounded) {
    }
}
