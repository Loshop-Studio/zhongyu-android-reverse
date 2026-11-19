package androidx.compose.material.icons.rounded;

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
public final class NumbersKt {
    private static ImageVector _numbers;

    public static final ImageVector getNumbers(Icons.Rounded rounded) {
        ImageVector imageVector = _numbers;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Numbers", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.68f, 9.27f);
        pathBuilder.lineToRelative(0.01f, -0.06f);
        pathBuilder.curveTo(20.85f, 8.59f, 20.39f, 8.0f, 19.76f, 8.0f);
        pathBuilder.horizontalLineTo(17.0f);
        pathBuilder.lineToRelative(0.7f, -2.79f);
        pathBuilder.curveTo(17.85f, 4.59f, 17.39f, 4.0f, 16.76f, 4.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.45f, 0.0f, -0.83f, 0.3f, -0.94f, 0.73f);
        pathBuilder.lineTo(15.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.lineToRelative(0.7f, -2.79f);
        pathBuilder.curveTo(11.85f, 4.59f, 11.39f, 4.0f, 10.76f, 4.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.45f, 0.0f, -0.83f, 0.3f, -0.94f, 0.73f);
        pathBuilder.lineTo(9.0f, 8.0f);
        pathBuilder.horizontalLineTo(5.76f);
        pathBuilder.curveTo(5.31f, 8.0f, 4.92f, 8.3f, 4.82f, 8.73f);
        pathBuilder.lineTo(4.8f, 8.79f);
        pathBuilder.curveTo(4.65f, 9.41f, 5.11f, 10.0f, 5.74f, 10.0f);
        pathBuilder.horizontalLineTo(8.5f);
        pathBuilder.lineToRelative(-1.0f, 4.0f);
        pathBuilder.horizontalLineTo(4.26f);
        pathBuilder.curveToRelative(-0.45f, 0.0f, -0.83f, 0.3f, -0.94f, 0.73f);
        pathBuilder.lineTo(3.3f, 14.79f);
        pathBuilder.curveTo(3.15f, 15.41f, 3.61f, 16.0f, 4.24f, 16.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.lineToRelative(-0.7f, 2.79f);
        pathBuilder.curveTo(6.15f, 19.41f, 6.61f, 20.0f, 7.24f, 20.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.45f, 0.0f, 0.83f, -0.3f, 0.94f, -0.73f);
        pathBuilder.lineTo(9.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.lineToRelative(-0.7f, 2.79f);
        pathBuilder.curveTo(12.15f, 19.41f, 12.61f, 20.0f, 13.24f, 20.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.45f, 0.0f, 0.83f, -0.3f, 0.94f, -0.73f);
        pathBuilder.lineTo(15.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(3.24f);
        pathBuilder.curveToRelative(0.45f, 0.0f, 0.83f, -0.3f, 0.94f, -0.73f);
        pathBuilder.lineToRelative(0.01f, -0.06f);
        pathBuilder.curveToRelative(0.15f, -0.61f, -0.31f, -1.21f, -0.94f, -1.21f);
        pathBuilder.horizontalLineTo(15.5f);
        pathBuilder.lineToRelative(1.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(3.24f);
        pathBuilder.curveTo(20.19f, 10.0f, 20.58f, 9.7f, 20.68f, 9.27f);
        pathBuilder.close();
        pathBuilder.moveTo(13.5f, 14.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.lineToRelative(1.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.lineTo(13.5f, 14.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _numbers = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
