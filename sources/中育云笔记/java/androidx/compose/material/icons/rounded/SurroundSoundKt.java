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
public final class SurroundSoundKt {
    private static ImageVector _surroundSound;

    public static final ImageVector getSurroundSound(Icons.Rounded rounded) {
        ImageVector imageVector = _surroundSound;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SurroundSound", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 4.0f);
        pathBuilder.lineTo(4.0f, 4.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.lineTo(22.0f, 6.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.11f, 16.89f);
        pathBuilder.curveToRelative(-0.43f, 0.43f, -1.14f, 0.39f, -1.51f, -0.09f);
        pathBuilder.curveTo(4.53f, 15.39f, 4.0f, 13.69f, 4.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(0.53f, -3.38f, 1.59f, -4.8f);
        pathBuilder.curveToRelative(0.37f, -0.48f, 1.08f, -0.53f, 1.51f, -0.1f);
        pathBuilder.curveToRelative(0.35f, 0.35f, 0.39f, 0.9f, 0.1f, 1.29f);
        pathBuilder.curveTo(6.4f, 9.46f, 6.0f, 10.73f, 6.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(0.4f, 2.53f, 1.2f, 3.6f);
        pathBuilder.curveToRelative(0.3f, 0.39f, 0.26f, 0.94f, -0.09f, 1.29f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 16.0f);
        pathBuilder.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.9f, 16.9f);
        pathBuilder.curveToRelative(-0.35f, -0.35f, -0.39f, -0.9f, -0.09f, -1.29f);
        pathBuilder.curveTo(17.6f, 14.54f, 18.0f, 13.27f, 18.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(-0.4f, -2.53f, -1.2f, -3.6f);
        pathBuilder.curveToRelative(-0.3f, -0.39f, -0.26f, -0.95f, 0.09f, -1.3f);
        pathBuilder.curveToRelative(0.43f, -0.43f, 1.14f, -0.39f, 1.51f, 0.09f);
        pathBuilder.curveToRelative(1.07f, 1.41f, 1.6f, 3.1f, 1.6f, 4.8f);
        pathBuilder.curveToRelative(0.0f, 1.69f, -0.53f, 3.38f, -1.59f, 4.8f);
        pathBuilder.curveToRelative(-0.37f, 0.49f, -1.08f, 0.54f, -1.51f, 0.11f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 10.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _surroundSound = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
