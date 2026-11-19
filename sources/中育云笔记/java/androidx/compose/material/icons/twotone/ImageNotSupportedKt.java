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
public final class ImageNotSupportedKt {
    private static ImageVector _imageNotSupported;

    public static final ImageVector getImageNotSupported(Icons.TwoTone twoTone) {
        ImageVector imageVector = _imageNotSupported;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ImageNotSupported", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.83f, 5.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.verticalLineToRelative(11.17f);
        pathBuilder.lineTo(7.83f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.17f, 19.0f);
        pathBuilder.lineToRelative(-2.0f, -2.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.lineToRelative(3.0f, -4.0f);
        pathBuilder.lineToRelative(2.0f, 2.72f);
        pathBuilder.lineToRelative(0.84f, -1.05f);
        pathBuilder.lineTo(5.0f, 7.83f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineTo(16.17f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(5.83f, 3.0f);
        pathBuilder2.horizontalLineTo(19.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(13.17f);
        pathBuilder2.lineToRelative(-2.0f, -2.0f);
        pathBuilder2.verticalLineTo(5.0f);
        pathBuilder2.horizontalLineTo(7.83f);
        pathBuilder2.lineTo(5.83f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.49f, 23.31f);
        pathBuilder2.lineTo(18.17f, 21.0f);
        pathBuilder2.horizontalLineTo(5.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder2.verticalLineTo(5.83f);
        pathBuilder2.lineTo(0.69f, 3.51f);
        pathBuilder2.lineTo(2.1f, 2.1f);
        pathBuilder2.lineToRelative(1.49f, 1.49f);
        pathBuilder2.lineTo(5.0f, 5.0f);
        pathBuilder2.lineToRelative(8.11f, 8.11f);
        pathBuilder2.lineToRelative(2.69f, 2.69f);
        pathBuilder2.lineTo(19.0f, 19.0f);
        pathBuilder2.lineToRelative(1.41f, 1.41f);
        pathBuilder2.lineToRelative(1.49f, 1.49f);
        pathBuilder2.lineTo(20.49f, 23.31f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.17f, 19.0f);
        pathBuilder2.lineToRelative(-2.0f, -2.0f);
        pathBuilder2.horizontalLineTo(6.0f);
        pathBuilder2.lineToRelative(3.0f, -4.0f);
        pathBuilder2.lineToRelative(2.0f, 2.72f);
        pathBuilder2.lineToRelative(0.84f, -1.05f);
        pathBuilder2.lineTo(5.0f, 7.83f);
        pathBuilder2.verticalLineTo(19.0f);
        pathBuilder2.horizontalLineTo(16.17f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _imageNotSupported = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
