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
public final class PhonelinkRingKt {
    private static ImageVector _phonelinkRing;

    public static final ImageVector getPhonelinkRing(Icons.Rounded rounded) {
        ImageVector imageVector = _phonelinkRing;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PhonelinkRing", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.0f, 1.0f);
        pathBuilder.lineTo(4.0f, 1.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.lineTo(16.0f, 3.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 20.0f);
        pathBuilder.lineTo(4.0f, 20.0f);
        pathBuilder.lineTo(4.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.63f, 8.26f);
        pathBuilder.curveToRelative(-0.26f, -0.32f, -0.74f, -0.36f, -1.04f, -0.06f);
        pathBuilder.lineToRelative(-0.03f, 0.03f);
        pathBuilder.curveToRelative(-0.25f, 0.25f, -0.26f, 0.65f, -0.05f, 0.93f);
        pathBuilder.curveToRelative(1.26f, 1.64f, 1.25f, 3.87f, -0.02f, 5.57f);
        pathBuilder.curveToRelative(-0.21f, 0.28f, -0.19f, 0.67f, 0.05f, 0.92f);
        pathBuilder.lineToRelative(0.05f, 0.05f);
        pathBuilder.curveToRelative(0.29f, 0.29f, 0.76f, 0.26f, 1.03f, -0.05f);
        pathBuilder.curveToRelative(1.8f, -2.13f, 1.8f, -5.19f, 0.01f, -7.39f);
        pathBuilder.close();
        pathBuilder.moveTo(17.42f, 10.37f);
        pathBuilder.lineToRelative(-0.06f, 0.06f);
        pathBuilder.curveToRelative(-0.2f, 0.2f, -0.26f, 0.5f, -0.15f, 0.76f);
        pathBuilder.curveToRelative(0.21f, 0.49f, 0.21f, 1.03f, 0.0f, 1.52f);
        pathBuilder.curveToRelative(-0.11f, 0.26f, -0.05f, 0.56f, 0.15f, 0.76f);
        pathBuilder.lineToRelative(0.08f, 0.08f);
        pathBuilder.curveToRelative(0.32f, 0.32f, 0.87f, 0.25f, 1.09f, -0.15f);
        pathBuilder.curveToRelative(0.49f, -0.89f, 0.49f, -1.94f, -0.01f, -2.86f);
        pathBuilder.curveToRelative(-0.22f, -0.42f, -0.77f, -0.5f, -1.1f, -0.17f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phonelinkRing = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
