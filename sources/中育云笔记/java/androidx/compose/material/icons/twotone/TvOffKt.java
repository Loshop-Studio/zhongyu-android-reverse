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
public final class TvOffKt {
    private static ImageVector _tvOff;

    public static final ImageVector getTvOff(Icons.TwoTone twoTone) {
        ImageVector imageVector = _tvOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.TvOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(13.46f);
        pathBuilder.lineToRelative(-12.0f, -12.0f);
        pathBuilder.lineTo(3.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.12f, 7.0f);
        pathBuilder.lineTo(21.0f, 17.88f);
        pathBuilder.lineTo(21.0f, 7.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(21.0f, 7.0f);
        pathBuilder2.verticalLineToRelative(10.88f);
        pathBuilder2.lineToRelative(1.85f, 1.85f);
        pathBuilder2.curveToRelative(0.09f, -0.23f, 0.15f, -0.47f, 0.15f, -0.73f);
        pathBuilder2.lineTo(23.0f, 7.0f);
        pathBuilder2.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.horizontalLineToRelative(-7.58f);
        pathBuilder2.lineToRelative(3.29f, -3.3f);
        pathBuilder2.lineTo(16.0f, 1.0f);
        pathBuilder2.lineToRelative(-4.0f, 4.0f);
        pathBuilder2.lineToRelative(-4.0f, -4.0f);
        pathBuilder2.lineToRelative(-0.7f, 0.7f);
        pathBuilder2.lineTo(10.58f, 5.0f);
        pathBuilder2.lineTo(8.12f, 5.0f);
        pathBuilder2.lineToRelative(2.0f, 2.0f);
        pathBuilder2.lineTo(21.0f, 7.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.46f, 23.0f);
        pathBuilder2.lineToRelative(1.26f, -1.27f);
        pathBuilder2.lineToRelative(-1.26f, 1.26f);
        pathBuilder2.close();
        pathBuilder2.moveTo(2.41f, 2.13f);
        pathBuilder2.lineToRelative(-0.14f, 0.14f);
        pathBuilder2.lineTo(1.0f, 3.54f);
        pathBuilder2.lineToRelative(1.53f, 1.53f);
        pathBuilder2.curveTo(1.65f, 5.28f, 1.0f, 6.06f, 1.0f, 7.0f);
        pathBuilder2.verticalLineToRelative(12.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(15.46f);
        pathBuilder2.lineToRelative(1.99f, 1.99f);
        pathBuilder2.lineToRelative(1.26f, -1.26f);
        pathBuilder2.lineToRelative(0.15f, -0.15f);
        pathBuilder2.lineTo(2.41f, 2.13f);
        pathBuilder2.close();
        pathBuilder2.moveTo(3.0f, 19.0f);
        pathBuilder2.lineTo(3.0f, 7.0f);
        pathBuilder2.horizontalLineToRelative(1.46f);
        pathBuilder2.lineToRelative(12.0f, 12.0f);
        pathBuilder2.lineTo(3.0f, 19.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tvOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
