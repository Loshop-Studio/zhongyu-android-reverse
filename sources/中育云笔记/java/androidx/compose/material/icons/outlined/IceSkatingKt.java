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
public final class IceSkatingKt {
    private static ImageVector _iceSkating;

    public static final ImageVector getIceSkating(Icons.Outlined outlined) {
        ImageVector imageVector = _iceSkating;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.IceSkating", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 17.0f);
        pathBuilder.curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(0.0f, -1.79f, -1.19f, -3.34f, -2.91f, -3.82f);
        pathBuilder.lineToRelative(-2.62f, -0.74f);
        pathBuilder.curveTo(12.62f, 9.19f, 12.0f, 8.39f, 12.0f, 7.5f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(15.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilder.horizontalLineTo(21.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 16.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineTo(8.5f);
        pathBuilder.curveTo(8.22f, 6.0f, 8.0f, 6.22f, 8.0f, 6.5f);
        pathBuilder.curveTo(8.0f, 6.78f, 8.22f, 7.0f, 8.5f, 7.0f);
        pathBuilder.horizontalLineTo(10.0f);
        pathBuilder.lineToRelative(0.1f, 1.0f);
        pathBuilder.horizontalLineTo(8.5f);
        pathBuilder.curveTo(8.22f, 8.0f, 8.0f, 8.22f, 8.0f, 8.5f);
        pathBuilder.curveTo(8.0f, 8.78f, 8.22f, 9.0f, 8.5f, 9.0f);
        pathBuilder.horizontalLineToRelative(1.81f);
        pathBuilder.curveToRelative(0.45f, 1.12f, 1.4f, 2.01f, 2.6f, 2.36f);
        pathBuilder.lineToRelative(2.62f, 0.73f);
        pathBuilder.curveTo(16.4f, 12.33f, 17.0f, 13.1f, 17.0f, 14.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 20.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _iceSkating = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
