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
public final class WifiKt {
    private static ImageVector _wifi;

    public static final ImageVector getWifi(Icons.Sharp sharp) {
        ImageVector imageVector = _wifi;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Wifi", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(1.0f, 9.0f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.curveToRelative(4.97f, -4.97f, 13.03f, -4.97f, 18.0f, 0.0f);
        pathBuilder.lineToRelative(2.0f, -2.0f);
        pathBuilder.curveTo(16.93f, 2.93f, 7.08f, 2.93f, 1.0f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 17.0f);
        pathBuilder.lineToRelative(3.0f, 3.0f);
        pathBuilder.lineToRelative(3.0f, -3.0f);
        pathBuilder.curveToRelative(-1.65f, -1.66f, -4.34f, -1.66f, -6.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 13.0f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.curveToRelative(2.76f, -2.76f, 7.24f, -2.76f, 10.0f, 0.0f);
        pathBuilder.lineToRelative(2.0f, -2.0f);
        pathBuilder.curveTo(15.14f, 9.14f, 8.87f, 9.14f, 5.0f, 13.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifi = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
