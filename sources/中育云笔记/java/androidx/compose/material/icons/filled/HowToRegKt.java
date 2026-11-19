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
public final class HowToRegKt {
    private static ImageVector _howToReg;

    public static final ImageVector getHowToReg(Icons.Filled filled) {
        ImageVector imageVector = _howToReg;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.HowToReg", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        PathFillType.Companion companion = PathFillType.Companion;
        int iM31160getEvenOddRgk1Os = companion.m31160getEvenOddRgk1Os();
        Color.Companion companion2 = Color.Companion;
        SolidColor solidColor = new SolidColor(companion2.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion3 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion3.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion4 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion4.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 17.0f);
        pathBuilder.lineToRelative(3.0f, -2.94f);
        pathBuilder.curveToRelative(-0.39f, -0.04f, -0.68f, -0.06f, -1.0f, -0.06f);
        pathBuilder.curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.lineToRelative(-3.0f, -3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 12.0f);
        pathBuilder.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), iM31160getEvenOddRgk1Os, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int iM31160getEvenOddRgk1Os2 = companion.m31160getEvenOddRgk1Os();
        SolidColor solidColor2 = new SolidColor(companion2.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion3.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion4.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(15.47f, 20.5f);
        pathBuilder2.lineTo(12.0f, 17.0f);
        pathBuilder2.lineToRelative(1.4f, -1.41f);
        pathBuilder2.lineToRelative(2.07f, 2.08f);
        pathBuilder2.lineToRelative(5.13f, -5.17f);
        pathBuilder2.lineToRelative(1.4f, 1.41f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), iM31160getEvenOddRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _howToReg = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
