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
public final class Wifi2BarKt {
    private static ImageVector _wifi2Bar;

    public static final ImageVector getWifi2Bar(Icons.Sharp sharp) {
        ImageVector imageVector = _wifi2Bar;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Wifi2Bar", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 10.0f);
        pathBuilder.curveToRelative(3.03f, 0.0f, 5.78f, 1.23f, 7.76f, 3.22f);
        pathBuilder.lineToRelative(-2.12f, 2.12f);
        pathBuilder.curveTo(16.2f, 13.9f, 14.2f, 13.0f, 12.0f, 13.0f);
        pathBuilder.curveToRelative(-2.2f, 0.0f, -4.2f, 0.9f, -5.64f, 2.35f);
        pathBuilder.lineToRelative(-2.12f, -2.12f);
        pathBuilder.curveTo(6.22f, 11.23f, 8.97f, 10.0f, 12.0f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 16.0f);
        pathBuilder.curveToRelative(-1.38f, 0.0f, -2.63f, 0.56f, -3.53f, 1.46f);
        pathBuilder.lineTo(12.0f, 21.0f);
        pathBuilder.lineToRelative(3.53f, -3.54f);
        pathBuilder.curveTo(14.63f, 16.56f, 13.38f, 16.0f, 12.0f, 16.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifi2Bar = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
