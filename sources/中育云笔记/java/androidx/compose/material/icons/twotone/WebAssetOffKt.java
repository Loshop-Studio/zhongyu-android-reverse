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
public final class WebAssetOffKt {
    private static ImageVector _webAssetOff;

    public static final ImageVector getWebAssetOff(Icons.TwoTone twoTone) {
        ImageVector imageVector = _webAssetOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.WebAssetOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 17.17f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineToRelative(-9.17f);
        pathBuilder.lineTo(20.0f, 17.17f);
        pathBuilder.close();
        pathBuilder.moveTo(5.17f, 8.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.horizontalLineToRelative(11.17f);
        pathBuilder.lineTo(5.17f, 8.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(6.83f, 4.0f);
        pathBuilder2.horizontalLineTo(20.0f);
        pathBuilder2.curveToRelative(1.11f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(12.0f);
        pathBuilder2.curveToRelative(0.0f, 0.34f, -0.09f, 0.66f, -0.23f, 0.94f);
        pathBuilder2.lineTo(20.0f, 17.17f);
        pathBuilder2.verticalLineTo(8.0f);
        pathBuilder2.horizontalLineToRelative(-9.17f);
        pathBuilder2.lineTo(6.83f, 4.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.49f, 23.31f);
        pathBuilder2.lineTo(17.17f, 20.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder2.verticalLineTo(6.0f);
        pathBuilder2.curveToRelative(0.0f, -0.34f, 0.08f, -0.66f, 0.23f, -0.94f);
        pathBuilder2.lineTo(0.69f, 3.51f);
        pathBuilder2.lineTo(2.1f, 2.1f);
        pathBuilder2.lineToRelative(19.8f, 19.8f);
        pathBuilder2.lineTo(20.49f, 23.31f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.17f, 18.0f);
        pathBuilder2.lineToRelative(-10.0f, -10.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.verticalLineToRelative(10.0f);
        pathBuilder2.horizontalLineTo(15.17f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _webAssetOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
