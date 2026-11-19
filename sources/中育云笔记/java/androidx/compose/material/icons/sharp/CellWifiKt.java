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
public final class CellWifiKt {
    private static ImageVector _cellWifi;

    public static final ImageVector getCellWifi(Icons.Sharp sharp) {
        ImageVector imageVector = _cellWifi;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.CellWifi", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.0f, 22.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineTo(5.97f);
        pathBuilder.lineTo(6.0f, 22.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-7.22f);
        pathBuilder.lineToRelative(2.0f, -2.0f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.22f, 7.22f);
        pathBuilder.lineTo(3.93f, 5.93f);
        pathBuilder.curveToRelative(3.9f, -3.91f, 10.24f, -3.91f, 14.15f, 0.0f);
        pathBuilder.lineToRelative(-1.29f, 1.29f);
        pathBuilder.curveTo(13.6f, 4.03f, 8.41f, 4.03f, 5.22f, 7.22f);
        pathBuilder.close();
        pathBuilder.moveTo(12.93f, 11.07f);
        pathBuilder.lineTo(11.0f, 13.0f);
        pathBuilder.lineToRelative(-1.93f, -1.93f);
        pathBuilder.curveTo(10.14f, 10.01f, 11.86f, 10.01f, 12.93f, 11.07f);
        pathBuilder.close();
        pathBuilder.moveTo(14.22f, 9.79f);
        pathBuilder.curveToRelative(-1.78f, -1.77f, -4.66f, -1.77f, -6.43f, 0.0f);
        pathBuilder.lineTo(6.5f, 8.5f);
        pathBuilder.curveToRelative(2.48f, -2.48f, 6.52f, -2.48f, 9.0f, 0.0f);
        pathBuilder.lineTo(14.22f, 9.79f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cellWifi = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
