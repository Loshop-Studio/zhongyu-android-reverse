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
public final class MicOffKt {
    private static ImageVector _micOff;

    public static final ImageVector getMicOff(Icons.Rounded rounded) {
        ImageVector imageVector = _micOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MicOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.0f, 10.6f);
        pathBuilder.lineTo(15.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilder.curveToRelative(-1.54f, 0.0f, -2.79f, 1.16f, -2.96f, 2.65f);
        pathBuilder.lineTo(15.0f, 10.6f);
        pathBuilder.close();
        pathBuilder.moveTo(18.08f, 11.0f);
        pathBuilder.curveToRelative(-0.41f, 0.0f, -0.77f, 0.3f, -0.83f, 0.71f);
        pathBuilder.curveToRelative(-0.05f, 0.32f, -0.12f, 0.64f, -0.22f, 0.93f);
        pathBuilder.lineToRelative(1.27f, 1.27f);
        pathBuilder.curveToRelative(0.3f, -0.6f, 0.52f, -1.25f, 0.63f, -1.94f);
        pathBuilder.curveToRelative(0.07f, -0.51f, -0.33f, -0.97f, -0.85f, -0.97f);
        pathBuilder.close();
        pathBuilder.moveTo(3.71f, 3.56f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineTo(9.0f, 10.27f);
        pathBuilder.verticalLineToRelative(0.43f);
        pathBuilder.curveToRelative(0.0f, 1.19f, 0.6f, 2.32f, 1.63f, 2.91f);
        pathBuilder.curveToRelative(0.75f, 0.43f, 1.41f, 0.44f, 2.02f, 0.31f);
        pathBuilder.lineToRelative(1.66f, 1.66f);
        pathBuilder.curveToRelative(-0.71f, 0.33f, -1.5f, 0.52f, -2.31f, 0.52f);
        pathBuilder.curveToRelative(-2.54f, 0.0f, -4.88f, -1.77f, -5.25f, -4.39f);
        pathBuilder.curveToRelative(-0.06f, -0.41f, -0.42f, -0.71f, -0.83f, -0.71f);
        pathBuilder.curveToRelative(-0.52f, 0.0f, -0.92f, 0.46f, -0.85f, 0.97f);
        pathBuilder.curveToRelative(0.46f, 2.96f, 2.96f, 5.3f, 5.93f, 5.75f);
        pathBuilder.lineTo(11.0f, 20.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-2.28f);
        pathBuilder.curveToRelative(0.91f, -0.13f, 1.77f, -0.45f, 2.55f, -0.9f);
        pathBuilder.lineToRelative(3.49f, 3.49f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineTo(5.12f, 3.56f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _micOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
