package androidx.compose.material.icons.sharp;

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
public final class PinDropKt {
    private static ImageVector _pinDrop;

    public static final ImageVector getPinDrop(Icons.Sharp sharp) {
        ImageVector imageVector = _pinDrop;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PinDrop", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int iM31160getEvenOddRgk1Os = PathFillType.Companion.m31160getEvenOddRgk1Os();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(5.0f, 22.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 7.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveToRelative(3.27f, 0.0f, 7.0f, 2.46f, 7.0f, 7.15f);
        pathBuilder.curveToRelative(0.0f, 3.12f, -2.33f, 6.41f, -7.0f, 9.85f);
        pathBuilder.curveToRelative(-4.67f, -3.44f, -7.0f, -6.73f, -7.0f, -9.85f);
        pathBuilder.curveTo(5.0f, 4.46f, 8.73f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), iM31160getEvenOddRgk1Os, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pinDrop = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
