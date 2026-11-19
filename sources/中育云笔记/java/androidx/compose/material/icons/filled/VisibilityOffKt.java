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
public final class VisibilityOffKt {
    private static ImageVector _visibilityOff;

    public static final ImageVector getVisibilityOff(Icons.Filled filled) {
        ImageVector imageVector = _visibilityOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.VisibilityOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 7.0f);
        pathBuilder.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, 0.65f, -0.13f, 1.26f, -0.36f, 1.83f);
        pathBuilder.lineToRelative(2.92f, 2.92f);
        pathBuilder.curveToRelative(1.51f, -1.26f, 2.7f, -2.89f, 3.43f, -4.75f);
        pathBuilder.curveToRelative(-1.73f, -4.39f, -6.0f, -7.5f, -11.0f, -7.5f);
        pathBuilder.curveToRelative(-1.4f, 0.0f, -2.74f, 0.25f, -3.98f, 0.7f);
        pathBuilder.lineToRelative(2.16f, 2.16f);
        pathBuilder.curveTo(10.74f, 7.13f, 11.35f, 7.0f, 12.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(2.0f, 4.27f);
        pathBuilder.lineToRelative(2.28f, 2.28f);
        pathBuilder.lineToRelative(0.46f, 0.46f);
        pathBuilder.curveTo(3.08f, 8.3f, 1.78f, 10.02f, 1.0f, 12.0f);
        pathBuilder.curveToRelative(1.73f, 4.39f, 6.0f, 7.5f, 11.0f, 7.5f);
        pathBuilder.curveToRelative(1.55f, 0.0f, 3.03f, -0.3f, 4.38f, -0.84f);
        pathBuilder.lineToRelative(0.42f, 0.42f);
        pathBuilder.lineTo(19.73f, 22.0f);
        pathBuilder.lineTo(21.0f, 20.73f);
        pathBuilder.lineTo(3.27f, 3.0f);
        pathBuilder.lineTo(2.0f, 4.27f);
        pathBuilder.close();
        pathBuilder.moveTo(7.53f, 9.8f);
        pathBuilder.lineToRelative(1.55f, 1.55f);
        pathBuilder.curveToRelative(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f);
        pathBuilder.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.curveToRelative(0.22f, 0.0f, 0.44f, -0.03f, 0.65f, -0.08f);
        pathBuilder.lineToRelative(1.55f, 1.55f);
        pathBuilder.curveToRelative(-0.67f, 0.33f, -1.41f, 0.53f, -2.2f, 0.53f);
        pathBuilder.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        pathBuilder.curveToRelative(0.0f, -0.79f, 0.2f, -1.53f, 0.53f, -2.2f);
        pathBuilder.close();
        pathBuilder.moveTo(11.84f, 9.02f);
        pathBuilder.lineToRelative(3.15f, 3.15f);
        pathBuilder.lineToRelative(0.02f, -0.16f);
        pathBuilder.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilder.lineToRelative(-0.17f, 0.01f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _visibilityOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
