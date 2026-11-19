package androidx.compose.material.icons.outlined;

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
public final class ImageNotSupportedKt {
    private static ImageVector _imageNotSupported;

    public static final ImageVector getImageNotSupported(Icons.Outlined outlined) {
        ImageVector imageVector = _imageNotSupported;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ImageNotSupported", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.9f, 21.9f);
        pathBuilder.lineToRelative(-6.1f, -6.1f);
        pathBuilder.lineToRelative(-2.69f, -2.69f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.lineTo(5.0f, 5.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.lineTo(3.59f, 3.59f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.lineTo(2.1f, 2.1f);
        pathBuilder.lineTo(0.69f, 3.51f);
        pathBuilder.lineTo(3.0f, 5.83f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(13.17f);
        pathBuilder.lineToRelative(2.31f, 2.31f);
        pathBuilder.lineTo(21.9f, 21.9f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 19.0f);
        pathBuilder.verticalLineTo(7.83f);
        pathBuilder.lineToRelative(6.84f, 6.84f);
        pathBuilder.lineTo(11.0f, 15.72f);
        pathBuilder.lineTo(9.0f, 13.0f);
        pathBuilder.lineToRelative(-3.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(8.17f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.83f, 5.0f);
        pathBuilder.lineToRelative(-2.0f, -2.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(13.17f);
        pathBuilder.lineToRelative(-2.0f, -2.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineTo(7.83f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _imageNotSupported = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
