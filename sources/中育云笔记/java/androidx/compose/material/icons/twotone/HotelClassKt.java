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
public final class HotelClassKt {
    private static ImageVector _hotelClass;

    public static final ImageVector getHotelClass(Icons.TwoTone twoTone) {
        ImageVector imageVector = _hotelClass;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.HotelClass", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 8.89f);
        pathBuilder.lineToRelative(0.94f, 3.11f);
        pathBuilder.lineToRelative(2.82f, 0.0f);
        pathBuilder.lineToRelative(-2.27f, 1.62f);
        pathBuilder.lineToRelative(0.93f, 3.01f);
        pathBuilder.lineToRelative(-2.42f, -1.84f);
        pathBuilder.lineToRelative(-2.42f, 1.84f);
        pathBuilder.lineToRelative(0.93f, -3.01f);
        pathBuilder.lineToRelative(-2.27f, -1.62f);
        pathBuilder.lineToRelative(2.82f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(11.0f, 8.89f);
        pathBuilder2.lineTo(11.94f, 12.0f);
        pathBuilder2.horizontalLineToRelative(2.82f);
        pathBuilder2.lineToRelative(-2.27f, 1.62f);
        pathBuilder2.lineToRelative(0.93f, 3.01f);
        pathBuilder2.lineTo(11.0f, 14.79f);
        pathBuilder2.lineToRelative(-2.42f, 1.84f);
        pathBuilder2.lineToRelative(0.93f, -3.01f);
        pathBuilder2.lineTo(7.24f, 12.0f);
        pathBuilder2.horizontalLineToRelative(2.82f);
        pathBuilder2.lineTo(11.0f, 8.89f);
        pathBuilder2.close();
        pathBuilder2.moveTo(8.58f, 10.0f);
        pathBuilder2.horizontalLineTo(1.0f);
        pathBuilder2.lineToRelative(6.17f, 4.41f);
        pathBuilder2.lineTo(4.83f, 22.0f);
        pathBuilder2.lineTo(11.0f, 17.31f);
        pathBuilder2.lineTo(17.18f, 22.0f);
        pathBuilder2.lineToRelative(-2.35f, -7.59f);
        pathBuilder2.lineTo(21.0f, 10.0f);
        pathBuilder2.horizontalLineToRelative(-7.58f);
        pathBuilder2.lineTo(11.0f, 2.0f);
        pathBuilder2.lineTo(8.58f, 10.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(21.36f, 22.0f);
        pathBuilder2.lineToRelative(-1.86f, -6.01f);
        pathBuilder2.lineTo(23.68f, 13.0f);
        pathBuilder2.horizontalLineToRelative(-3.44f);
        pathBuilder2.lineToRelative(-3.08f, 2.2f);
        pathBuilder2.lineToRelative(1.46f, 4.72f);
        pathBuilder2.lineTo(21.36f, 22.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(17.0f, 8.0f);
        pathBuilder2.lineToRelative(-1.82f, -6.0f);
        pathBuilder2.lineToRelative(-1.04f, 3.45f);
        pathBuilder2.lineTo(14.91f, 8.0f);
        pathBuilder2.horizontalLineTo(17.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hotelClass = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
