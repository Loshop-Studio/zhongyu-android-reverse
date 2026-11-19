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
public final class VisibilityOffKt {
    private static ImageVector _visibilityOff;

    public static final ImageVector getVisibilityOff(Icons.Outlined outlined) {
        ImageVector imageVector = _visibilityOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.VisibilityOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 6.0f);
        pathBuilder.curveToRelative(3.79f, 0.0f, 7.17f, 2.13f, 8.82f, 5.5f);
        pathBuilder.curveToRelative(-0.59f, 1.22f, -1.42f, 2.27f, -2.41f, 3.12f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.curveToRelative(1.39f, -1.23f, 2.49f, -2.77f, 3.18f, -4.53f);
        pathBuilder.curveTo(21.27f, 7.11f, 17.0f, 4.0f, 12.0f, 4.0f);
        pathBuilder.curveToRelative(-1.27f, 0.0f, -2.49f, 0.2f, -3.64f, 0.57f);
        pathBuilder.lineToRelative(1.65f, 1.65f);
        pathBuilder.curveTo(10.66f, 6.09f, 11.32f, 6.0f, 12.0f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.93f, 7.14f);
        pathBuilder.lineTo(13.0f, 9.21f);
        pathBuilder.curveToRelative(0.57f, 0.25f, 1.03f, 0.71f, 1.28f, 1.28f);
        pathBuilder.lineToRelative(2.07f, 2.07f);
        pathBuilder.curveToRelative(0.08f, -0.34f, 0.14f, -0.7f, 0.14f, -1.07f);
        pathBuilder.curveTo(16.5f, 9.01f, 14.48f, 7.0f, 12.0f, 7.0f);
        pathBuilder.curveToRelative(-0.37f, 0.0f, -0.72f, 0.05f, -1.07f, 0.14f);
        pathBuilder.close();
        pathBuilder.moveTo(2.01f, 3.87f);
        pathBuilder.lineToRelative(2.68f, 2.68f);
        pathBuilder.curveTo(3.06f, 7.83f, 1.77f, 9.53f, 1.0f, 11.5f);
        pathBuilder.curveTo(2.73f, 15.89f, 7.0f, 19.0f, 12.0f, 19.0f);
        pathBuilder.curveToRelative(1.52f, 0.0f, 2.98f, -0.29f, 4.32f, -0.82f);
        pathBuilder.lineToRelative(3.42f, 3.42f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(3.42f, 2.45f);
        pathBuilder.lineTo(2.01f, 3.87f);
        pathBuilder.close();
        pathBuilder.moveTo(9.51f, 11.37f);
        pathBuilder.lineToRelative(2.61f, 2.61f);
        pathBuilder.curveToRelative(-0.04f, 0.01f, -0.08f, 0.02f, -0.12f, 0.02f);
        pathBuilder.curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        pathBuilder.curveToRelative(0.0f, -0.05f, 0.01f, -0.08f, 0.01f, -0.13f);
        pathBuilder.close();
        pathBuilder.moveTo(6.11f, 7.97f);
        pathBuilder.lineToRelative(1.75f, 1.75f);
        pathBuilder.curveToRelative(-0.23f, 0.55f, -0.36f, 1.15f, -0.36f, 1.78f);
        pathBuilder.curveToRelative(0.0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f);
        pathBuilder.curveToRelative(0.63f, 0.0f, 1.23f, -0.13f, 1.77f, -0.36f);
        pathBuilder.lineToRelative(0.98f, 0.98f);
        pathBuilder.curveToRelative(-0.88f, 0.24f, -1.8f, 0.38f, -2.75f, 0.38f);
        pathBuilder.curveToRelative(-3.79f, 0.0f, -7.17f, -2.13f, -8.82f, -5.5f);
        pathBuilder.curveToRelative(0.7f, -1.43f, 1.72f, -2.61f, 2.93f, -3.53f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _visibilityOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
