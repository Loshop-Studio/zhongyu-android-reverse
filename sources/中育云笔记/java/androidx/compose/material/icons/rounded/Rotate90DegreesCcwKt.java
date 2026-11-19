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
public final class Rotate90DegreesCcwKt {
    private static ImageVector _rotate90DegreesCcw;

    public static final ImageVector getRotate90DegreesCcw(Icons.Rounded rounded) {
        ImageVector imageVector = _rotate90DegreesCcw;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Rotate90DegreesCcw", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.93f, 7.83f);
        pathBuilder.lineToRelative(-3.65f, 3.66f);
        pathBuilder.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilder.lineToRelative(3.66f, 3.66f);
        pathBuilder.curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f);
        pathBuilder.lineToRelative(3.66f, -3.65f);
        pathBuilder.curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        pathBuilder.lineTo(8.76f, 7.82f);
        pathBuilder.curveToRelative(-0.79f, -0.78f, -2.05f, -0.78f, -2.83f, 0.01f);
        pathBuilder.close();
        pathBuilder.moveTo(4.4f, 12.19f);
        pathBuilder.lineToRelative(2.25f, -2.25f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.42f, 0.0f);
        pathBuilder.lineToRelative(2.24f, 2.24f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(-2.25f, 2.25f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.42f, 0.0f);
        pathBuilder.lineTo(4.4f, 13.61f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -0.39f, -1.03f, 0.0f, -1.42f);
        pathBuilder.close();
        pathBuilder.moveTo(19.36f, 6.64f);
        pathBuilder.curveTo(17.61f, 4.88f, 15.3f, 4.0f, 13.0f, 4.0f);
        pathBuilder.verticalLineToRelative(-0.83f);
        pathBuilder.curveToRelative(0.0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f);
        pathBuilder.lineTo(9.47f, 4.29f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(1.83f, 1.83f);
        pathBuilder.curveToRelative(0.62f, 0.63f, 1.7f, 0.19f, 1.7f, -0.7f);
        pathBuilder.lineTo(13.0f, 6.0f);
        pathBuilder.curveToRelative(2.02f, 0.0f, 4.03f, 0.86f, 5.45f, 2.61f);
        pathBuilder.curveToRelative(2.05f, 2.52f, 2.05f, 6.27f, 0.0f, 8.79f);
        pathBuilder.curveTo(17.03f, 19.14f, 15.02f, 20.0f, 13.0f, 20.0f);
        pathBuilder.curveToRelative(-0.78f, 0.0f, -1.55f, -0.13f, -2.29f, -0.39f);
        pathBuilder.curveToRelative(-0.36f, -0.12f, -0.75f, -0.01f, -1.02f, 0.26f);
        pathBuilder.curveToRelative(-0.5f, 0.5f, -0.34f, 1.39f, 0.34f, 1.62f);
        pathBuilder.curveToRelative(0.96f, 0.34f, 1.96f, 0.51f, 2.97f, 0.51f);
        pathBuilder.curveToRelative(2.3f, 0.0f, 4.61f, -0.88f, 6.36f, -2.64f);
        pathBuilder.curveToRelative(3.52f, -3.51f, 3.52f, -9.21f, 0.0f, -12.72f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rotate90DegreesCcw = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
