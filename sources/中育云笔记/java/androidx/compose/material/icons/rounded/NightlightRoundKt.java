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
public final class NightlightRoundKt {
    private static ImageVector _nightlightRound;

    public static final ImageVector getNightlightRound(Icons.Rounded rounded) {
        ImageVector imageVector = _nightlightRound;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NightlightRound", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.5f, 22.0f);
        pathBuilder.curveToRelative(0.07f, 0.0f, 0.14f, 0.0f, 0.21f, 0.0f);
        pathBuilder.curveToRelative(0.84f, -0.02f, 1.12f, -1.11f, 0.41f, -1.56f);
        pathBuilder.curveToRelative(-2.78f, -1.77f, -4.63f, -4.89f, -4.63f, -8.43f);
        pathBuilder.curveToRelative(0.0f, -3.55f, 1.85f, -6.66f, 4.63f, -8.44f);
        pathBuilder.curveToRelative(0.7f, -0.45f, 0.44f, -1.54f, -0.39f, -1.56f);
        pathBuilder.curveToRelative(-0.04f, 0.0f, -0.09f, 0.0f, -0.13f, 0.0f);
        pathBuilder.curveToRelative(-4.9f, -0.05f, -9.21f, 3.53f, -9.98f, 8.37f);
        pathBuilder.curveTo(4.64f, 16.61f, 9.45f, 22.0f, 15.5f, 22.0f);
        pathBuilder.lineTo(15.5f, 22.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nightlightRound = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
