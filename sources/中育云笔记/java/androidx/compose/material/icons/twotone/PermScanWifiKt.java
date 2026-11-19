package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class PermScanWifiKt {
    private static ImageVector _permScanWifi;

    public static final ImageVector getPermScanWifi(Icons.TwoTone twoTone) {
        ImageVector imageVector = _permScanWifi;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PermScanWifi", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 5.0f);
        pathBuilder.curveToRelative(-3.26f, 0.0f, -6.2f, 0.85f, -9.08f, 2.65f);
        pathBuilder.lineTo(12.0f, 18.83f);
        pathBuilder.lineToRelative(9.08f, -11.16f);
        pathBuilder.curveTo(18.18f, 5.85f, 15.25f, 5.0f, 12.0f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 8.0f);
        pathBuilder.lineTo(11.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 3.0f);
        pathBuilder2.curveTo(6.95f, 3.0f, 3.15f, 4.85f, 0.0f, 7.23f);
        pathBuilder2.lineTo(12.0f, 22.0f);
        pathBuilder2.lineTo(24.0f, 7.25f);
        pathBuilder2.curveTo(20.85f, 4.87f, 17.05f, 3.0f, 12.0f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(2.92f, 7.65f);
        pathBuilder2.curveTo(5.8f, 5.85f, 8.74f, 5.0f, 12.0f, 5.0f);
        pathBuilder2.curveToRelative(3.25f, 0.0f, 6.18f, 0.85f, 9.08f, 2.67f);
        pathBuilder2.lineTo(12.0f, 18.83f);
        pathBuilder2.lineTo(2.92f, 7.65f);
        pathBuilder2.close();
        pathBuilder2.moveTo(11.0f, 10.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(6.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(11.0f, 6.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _permScanWifi = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
