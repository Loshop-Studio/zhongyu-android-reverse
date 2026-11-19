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
public final class RawOffKt {
    private static ImageVector _rawOff;

    public static final ImageVector getRawOff(Icons.TwoTone twoTone) {
        ImageVector imageVector = _rawOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.RawOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.15f, 14.32f);
        pathBuilder.lineToRelative(0.59f, -2.36f);
        pathBuilder.lineToRelative(0.76f, 3.04f);
        pathBuilder.lineToRelative(1.48f, 0.0f);
        pathBuilder.lineToRelative(1.5f, -6.0f);
        pathBuilder.lineToRelative(-1.5f, 0.0f);
        pathBuilder.lineToRelative(-0.74f, 3.0f);
        pathBuilder.lineToRelative(-0.74f, -3.0f);
        pathBuilder.lineToRelative(-1.52f, 0.0f);
        pathBuilder.lineToRelative(-0.74f, 3.0f);
        pathBuilder.lineToRelative(-0.74f, -3.0f);
        pathBuilder.lineToRelative(-1.5f, 0.0f);
        pathBuilder.lineToRelative(0.72f, 2.9f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(1.39f, 4.22f);
        pathBuilder2.lineTo(6.17f, 9.0f);
        pathBuilder2.horizontalLineTo(3.0f);
        pathBuilder2.verticalLineToRelative(6.0f);
        pathBuilder2.horizontalLineToRelative(1.5f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.horizontalLineToRelative(1.1f);
        pathBuilder2.lineToRelative(0.9f, 2.0f);
        pathBuilder2.horizontalLineTo(8.0f);
        pathBuilder2.lineToRelative(-0.9f, -2.1f);
        pathBuilder2.curveTo(7.6f, 12.6f, 8.0f, 12.1f, 8.0f, 11.5f);
        pathBuilder2.verticalLineToRelative(-0.67f);
        pathBuilder2.lineToRelative(1.43f, 1.43f);
        pathBuilder2.lineTo(8.75f, 15.0f);
        pathBuilder2.horizontalLineToRelative(1.5f);
        pathBuilder2.lineToRelative(0.38f, -1.5f);
        pathBuilder2.horizontalLineToRelative(0.04f);
        pathBuilder2.lineToRelative(9.11f, 9.11f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.lineTo(2.81f, 2.81f);
        pathBuilder2.lineTo(1.39f, 4.22f);
        pathBuilder2.close();
        pathBuilder2.moveTo(6.5f, 11.5f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.verticalLineToRelative(-1.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineTo(11.5f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rawOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
