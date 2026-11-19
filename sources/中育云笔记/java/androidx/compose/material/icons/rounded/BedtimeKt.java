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
public final class BedtimeKt {
    private static ImageVector _bedtime;

    public static final ImageVector getBedtime(Icons.Rounded rounded) {
        ImageVector imageVector = _bedtime;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Bedtime", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.65f, 3.46f);
        pathBuilder.curveToRelative(0.27f, -0.71f, -0.36f, -1.45f, -1.12f, -1.34f);
        pathBuilder.curveToRelative(-5.52f, 0.8f, -9.47f, 6.07f, -8.34f, 11.88f);
        pathBuilder.curveToRelative(0.78f, 4.02f, 4.09f, 7.21f, 8.14f, 7.87f);
        pathBuilder.curveToRelative(3.74f, 0.61f, 7.16f, -0.87f, 9.32f, -3.44f);
        pathBuilder.curveToRelative(0.48f, -0.57f, 0.19f, -1.48f, -0.55f, -1.62f);
        pathBuilder.curveTo(13.08f, 15.66f, 9.42f, 9.27f, 11.65f, 3.46f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bedtime = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
