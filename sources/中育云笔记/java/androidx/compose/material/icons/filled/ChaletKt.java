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
public final class ChaletKt {
    private static ImageVector _chalet;

    public static final ImageVector getChalet(Icons.Filled filled) {
        ImageVector imageVector = _chalet;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Chalet", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.0f, 7.5f);
        pathBuilder.lineToRelative(7.5f, 7.5f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineTo(15.0f, 15.33f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineToRelative(-5.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineToRelative(-4.67f);
        pathBuilder.lineToRelative(-1.09f, 1.09f);
        pathBuilder.lineTo(2.5f, 15.0f);
        pathBuilder.lineTo(10.0f, 7.5f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 6.5f);
        pathBuilder.horizontalLineToRelative(-1.19f);
        pathBuilder.lineToRelative(0.75f, -0.75f);
        pathBuilder.lineToRelative(-0.71f, -0.71f);
        pathBuilder.lineTo(19.39f, 6.5f);
        pathBuilder.horizontalLineTo(18.5f);
        pathBuilder.verticalLineTo(5.61f);
        pathBuilder.lineToRelative(1.45f, -1.45f);
        pathBuilder.lineToRelative(-0.71f, -0.71f);
        pathBuilder.lineTo(18.5f, 4.19f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineToRelative(1.19f);
        pathBuilder.lineToRelative(-0.75f, -0.75f);
        pathBuilder.lineToRelative(-0.71f, 0.71f);
        pathBuilder.lineToRelative(1.45f, 1.45f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.horizontalLineToRelative(-0.89f);
        pathBuilder.lineToRelative(-1.45f, -1.45f);
        pathBuilder.lineToRelative(-0.71f, 0.71f);
        pathBuilder.lineToRelative(0.75f, 0.75f);
        pathBuilder.horizontalLineTo(14.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(1.19f);
        pathBuilder.lineToRelative(-0.75f, 0.75f);
        pathBuilder.lineToRelative(0.71f, 0.71f);
        pathBuilder.lineToRelative(1.45f, -1.45f);
        pathBuilder.horizontalLineToRelative(0.89f);
        pathBuilder.verticalLineToRelative(0.89f);
        pathBuilder.lineToRelative(-1.45f, 1.45f);
        pathBuilder.lineToRelative(0.71f, 0.71f);
        pathBuilder.lineToRelative(0.75f, -0.75f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(9.81f);
        pathBuilder.lineToRelative(0.75f, 0.75f);
        pathBuilder.lineToRelative(0.71f, -0.71f);
        pathBuilder.lineTo(18.5f, 8.39f);
        pathBuilder.verticalLineTo(7.5f);
        pathBuilder.horizontalLineToRelative(0.89f);
        pathBuilder.lineToRelative(1.45f, 1.45f);
        pathBuilder.lineToRelative(0.71f, -0.71f);
        pathBuilder.lineTo(20.81f, 7.5f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _chalet = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
