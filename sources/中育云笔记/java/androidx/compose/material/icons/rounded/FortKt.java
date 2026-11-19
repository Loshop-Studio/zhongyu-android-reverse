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
public final class FortKt {
    private static ImageVector _fort;

    public static final ImageVector getFort(Icons.Rounded rounded) {
        ImageVector imageVector = _fort;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Fort", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 4.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(2.17f);
        pathBuilder.curveToRelative(0.0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.41f);
        pathBuilder.lineTo(15.0f, 9.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.curveTo(10.79f, 7.21f, 11.0f, 6.7f, 11.0f, 6.17f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(9.45f, 3.0f, 9.0f, 3.45f, 9.0f, 4.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(5.45f, 3.0f, 5.0f, 3.45f, 5.0f, 4.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(1.45f, 3.0f, 1.0f, 3.45f, 1.0f, 4.0f);
        pathBuilder.verticalLineToRelative(2.17f);
        pathBuilder.curveTo(1.0f, 6.7f, 1.21f, 7.21f, 1.59f, 7.59f);
        pathBuilder.lineTo(3.0f, 9.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.curveTo(1.21f, 16.79f, 1.0f, 17.3f, 1.0f, 17.83f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(7.0f);
        pathBuilder.lineToRelative(0.0f, -2.89f);
        pathBuilder.curveToRelative(0.0f, -1.0f, 0.68f, -1.92f, 1.66f, -2.08f);
        pathBuilder.curveTo(12.92f, 15.82f, 14.0f, 16.79f, 14.0f, 18.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(7.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-1.17f);
        pathBuilder.curveToRelative(0.0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f);
        pathBuilder.lineTo(21.0f, 15.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.curveTo(22.79f, 7.21f, 23.0f, 6.7f, 23.0f, 6.17f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(21.45f, 3.0f, 21.0f, 3.45f, 21.0f, 4.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fort = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
