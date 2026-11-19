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
public final class ExploreOffKt {
    private static ImageVector _exploreOff;

    public static final ImageVector getExploreOff(Icons.Rounded rounded) {
        ImageVector imageVector = _exploreOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ExploreOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 6.0f);
        pathBuilder.lineToRelative(-2.91f, 6.26f);
        pathBuilder.lineToRelative(5.25f, 5.25f);
        pathBuilder.curveTo(21.39f, 15.93f, 22.0f, 14.04f, 22.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        pathBuilder.curveToRelative(-2.04f, 0.0f, -3.93f, 0.61f, -5.51f, 1.66f);
        pathBuilder.lineToRelative(5.25f, 5.25f);
        pathBuilder.lineTo(18.0f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(2.81f, 5.64f);
        pathBuilder.lineToRelative(0.85f, 0.85f);
        pathBuilder.curveToRelative(-1.37f, 2.07f, -2.0f, 4.68f, -1.48f, 7.45f);
        pathBuilder.curveToRelative(0.75f, 3.95f, 3.92f, 7.13f, 7.88f, 7.88f);
        pathBuilder.curveToRelative(2.77f, 0.52f, 5.38f, -0.1f, 7.45f, -1.48f);
        pathBuilder.lineToRelative(0.85f, 0.85f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineTo(4.22f, 4.22f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0.0f, 1.42f);
        pathBuilder.close();
        pathBuilder.moveTo(8.91f, 11.74f);
        pathBuilder.lineToRelative(3.35f, 3.35f);
        pathBuilder.lineTo(6.0f, 18.0f);
        pathBuilder.lineToRelative(2.91f, -6.26f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _exploreOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
