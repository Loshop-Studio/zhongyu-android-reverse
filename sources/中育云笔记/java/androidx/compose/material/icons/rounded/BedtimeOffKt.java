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
public final class BedtimeOffKt {
    private static ImageVector _bedtimeOff;

    public static final ImageVector getBedtimeOff(Icons.Rounded rounded) {
        ImageVector imageVector = _bedtimeOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BedtimeOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.65f, 3.46f);
        pathBuilder.curveToRelative(0.27f, -0.71f, -0.36f, -1.45f, -1.12f, -1.34f);
        pathBuilder.curveTo(9.05f, 2.33f, 7.68f, 2.88f, 6.49f, 3.66f);
        pathBuilder.lineToRelative(4.59f, 4.59f);
        pathBuilder.curveTo(10.88f, 6.69f, 11.04f, 5.05f, 11.65f, 3.46f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(2.1f, 3.51f);
        pathBuilder2.lineTo(2.1f, 3.51f);
        pathBuilder2.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder2.lineToRelative(1.56f, 1.56f);
        pathBuilder2.curveToRelative(-1.4f, 2.11f, -2.02f, 4.77f, -1.46f, 7.56f);
        pathBuilder2.curveToRelative(0.79f, 3.94f, 3.99f, 7.07f, 7.94f, 7.78f);
        pathBuilder2.curveToRelative(2.74f, 0.49f, 5.3f, -0.15f, 7.35f, -1.51f);
        pathBuilder2.lineToRelative(1.57f, 1.57f);
        pathBuilder2.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder2.lineToRelative(0.0f, 0.0f);
        pathBuilder2.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder2.lineTo(3.51f, 3.51f);
        pathBuilder2.curveTo(3.12f, 3.12f, 2.49f, 3.12f, 2.1f, 3.51f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bedtimeOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
