package androidx.compose.material.icons.sharp;

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
public final class TvOffKt {
    private static ImageVector _tvOff;

    public static final ImageVector getTvOff(Icons.Sharp sharp) {
        ImageVector imageVector = _tvOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.TvOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 7.0f);
        pathBuilder.verticalLineToRelative(10.88f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineToRelative(-9.58f);
        pathBuilder.lineToRelative(3.29f, -3.3f);
        pathBuilder.lineTo(16.0f, 1.0f);
        pathBuilder.lineToRelative(-4.0f, 4.0f);
        pathBuilder.lineToRelative(-4.0f, -4.0f);
        pathBuilder.lineToRelative(-0.7f, 0.7f);
        pathBuilder.lineTo(10.58f, 5.0f);
        pathBuilder.horizontalLineTo(8.12f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(2.41f, 2.13f);
        pathBuilder.lineToRelative(-0.14f, 0.14f);
        pathBuilder.lineTo(1.0f, 3.54f);
        pathBuilder.lineToRelative(1.53f, 1.53f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.horizontalLineToRelative(17.46f);
        pathBuilder.lineToRelative(1.99f, 1.99f);
        pathBuilder.lineToRelative(1.26f, -1.26f);
        pathBuilder.lineToRelative(0.15f, -0.15f);
        pathBuilder.lineTo(2.41f, 2.13f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 19.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(1.46f);
        pathBuilder.lineToRelative(12.0f, 12.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tvOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
