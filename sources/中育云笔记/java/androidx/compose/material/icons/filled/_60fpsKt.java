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
public final class _60fpsKt {
    private static ImageVector __60fps;

    public static final ImageVector get_60fps(Icons.Filled filled) {
        ImageVector imageVector = __60fps;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled._60fps", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 8.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.moveTo(19.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.curveTo(22.0f, 6.34f, 20.66f, 5.0f, 19.0f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 8.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveTo(3.34f, 5.0f, 2.0f, 6.34f, 2.0f, 8.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineTo(10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 13.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __60fps = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
