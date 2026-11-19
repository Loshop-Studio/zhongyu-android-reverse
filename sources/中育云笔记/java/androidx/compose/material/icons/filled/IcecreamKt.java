package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.PathFillType;
import androidx.compose.p014ui.graphics.SolidColor;
import androidx.compose.p014ui.graphics.StrokeCap;
import androidx.compose.p014ui.graphics.StrokeJoin;
import androidx.compose.p014ui.graphics.vector.ImageVector;
import androidx.compose.p014ui.graphics.vector.PathBuilder;
import androidx.compose.p014ui.unit.C3186Dp;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
public final class IcecreamKt {
    private static ImageVector _icecream;

    public static final ImageVector getIcecream(Icons.Filled filled) {
        ImageVector imageVector = _icecream;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Icecream", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int iM31160getEvenOddRgk1Os = PathFillType.Companion.m31160getEvenOddRgk1Os();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.79f, 12.4f);
        pathBuilder.lineToRelative(3.26f, 6.22f);
        pathBuilder.lineToRelative(3.17f, -6.21f);
        pathBuilder.curveToRelative(-0.11f, -0.08f, -0.21f, -0.16f, -0.3f, -0.25f);
        pathBuilder.curveTo(14.08f, 12.69f, 13.07f, 13.0f, 12.0f, 13.0f);
        pathBuilder.reflectiveCurveToRelative(-2.08f, -0.31f, -2.92f, -0.84f);
        pathBuilder.curveTo(8.99f, 12.25f, 8.89f, 12.33f, 8.79f, 12.4f);
        pathBuilder.close();
        pathBuilder.moveTo(6.83f, 12.99f);
        pathBuilder.curveTo(5.25f, 12.9f, 4.0f, 11.6f, 4.0f, 10.0f);
        pathBuilder.curveToRelative(0.0f, -1.49f, 1.09f, -2.73f, 2.52f, -2.96f);
        pathBuilder.curveTo(6.75f, 4.22f, 9.12f, 2.0f, 12.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(5.25f, 2.22f, 5.48f, 5.04f);
        pathBuilder.curveTo(18.91f, 7.27f, 20.0f, 8.51f, 20.0f, 10.0f);
        pathBuilder.curveToRelative(0.0f, 1.59f, -1.24f, 2.9f, -2.81f, 2.99f);
        pathBuilder.lineTo(12.07f, 23.0f);
        pathBuilder.lineTo(6.83f, 12.99f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), iM31160getEvenOddRgk1Os, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _icecream = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
