package androidx.compose.material.icons.sharp;

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
public final class IcecreamKt {
    private static ImageVector _icecream;

    public static final ImageVector getIcecream(Icons.Sharp sharp) {
        ImageVector imageVector = _icecream;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Icecream", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.38f, 6.24f);
        pathBuilder.curveTo(17.79f, 3.24f, 15.14f, 1.0f, 12.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(6.21f, 3.24f, 5.62f, 6.24f);
        pathBuilder.curveTo(4.08f, 6.81f, 3.0f, 8.29f, 3.0f, 10.0f);
        pathBuilder.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder.curveToRelative(0.12f, 0.0f, 0.23f, -0.02f, 0.34f, -0.02f);
        pathBuilder.lineTo(12.07f, 23.0f);
        pathBuilder.lineToRelative(4.61f, -9.03f);
        pathBuilder.curveTo(16.79f, 13.98f, 16.89f, 14.0f, 17.0f, 14.0f);
        pathBuilder.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder.curveTo(21.0f, 8.29f, 19.92f, 6.81f, 18.38f, 6.24f);
        pathBuilder.close();
        pathBuilder.moveTo(12.05f, 18.63f);
        pathBuilder.lineToRelative(-2.73f, -5.21f);
        pathBuilder.curveTo(10.15f, 13.79f, 11.06f, 14.0f, 12.0f, 14.0f);
        pathBuilder.curveToRelative(0.95f, 0.0f, 1.88f, -0.21f, 2.72f, -0.6f);
        pathBuilder.lineTo(12.05f, 18.63f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _icecream = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
