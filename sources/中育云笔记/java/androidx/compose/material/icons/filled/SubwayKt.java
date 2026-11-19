package androidx.compose.material.icons.filled;

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
public final class SubwayKt {
    private static ImageVector _subway;

    public static final ImageVector getSubway(Icons.Filled filled) {
        ImageVector imageVector = _subway;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Subway", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.5f, 16.0f);
        pathBuilder.moveToRelative(-1.0f, 0.0f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(8.5f, 16.0f);
        pathBuilder2.moveToRelative(-1.0f, 0.0f);
        pathBuilder2.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        pathBuilder2.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw3 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk83 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(7.01f, 9.0f);
        pathBuilder3.horizontalLineToRelative(10.0f);
        pathBuilder3.verticalLineToRelative(5.0f);
        pathBuilder3.horizontalLineToRelative(-10.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(17.8f, 2.8f);
        pathBuilder3.curveTo(16.0f, 2.09f, 13.86f, 2.0f, 12.0f, 2.0f);
        pathBuilder3.curveToRelative(-1.86f, 0.0f, -4.0f, 0.09f, -5.8f, 0.8f);
        pathBuilder3.curveTo(3.53f, 3.84f, 2.0f, 6.05f, 2.0f, 8.86f);
        pathBuilder3.lineTo(2.0f, 22.0f);
        pathBuilder3.horizontalLineToRelative(20.0f);
        pathBuilder3.lineTo(22.0f, 8.86f);
        pathBuilder3.curveToRelative(0.0f, -2.81f, -1.53f, -5.02f, -4.2f, -6.06f);
        pathBuilder3.close();
        pathBuilder3.moveTo(18.0f, 15.88f);
        pathBuilder3.curveToRelative(0.0f, 1.45f, -1.18f, 2.62f, -2.63f, 2.62f);
        pathBuilder3.lineToRelative(1.13f, 1.12f);
        pathBuilder3.lineTo(16.5f, 20.0f);
        pathBuilder3.lineTo(15.0f, 20.0f);
        pathBuilder3.lineToRelative(-1.5f, -1.5f);
        pathBuilder3.horizontalLineToRelative(-2.83f);
        pathBuilder3.lineTo(9.17f, 20.0f);
        pathBuilder3.lineTo(7.5f, 20.0f);
        pathBuilder3.verticalLineToRelative(-0.38f);
        pathBuilder3.lineToRelative(1.12f, -1.12f);
        pathBuilder3.curveTo(7.18f, 18.5f, 6.0f, 17.32f, 6.0f, 15.88f);
        pathBuilder3.lineTo(6.0f, 9.0f);
        pathBuilder3.curveToRelative(0.0f, -2.63f, 3.0f, -3.0f, 6.0f, -3.0f);
        pathBuilder3.curveToRelative(3.32f, 0.0f, 6.0f, 0.38f, 6.0f, 3.0f);
        pathBuilder3.verticalLineToRelative(6.88f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw3, iM31241getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _subway = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
