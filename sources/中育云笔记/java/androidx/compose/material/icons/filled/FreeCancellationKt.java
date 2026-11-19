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
public final class FreeCancellationKt {
    private static ImageVector _freeCancellation;

    public static final ImageVector getFreeCancellation(Icons.Filled filled) {
        ImageVector imageVector = _freeCancellation;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.FreeCancellation", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.21f, 20.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineToRelative(4.38f);
        pathBuilder.lineToRelative(2.0f, -2.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveTo(3.89f, 4.0f, 3.01f, 4.9f, 3.01f, 6.0f);
        pathBuilder.lineTo(3.0f, 20.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(8.21f);
        pathBuilder.lineTo(11.21f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.54f, 22.5f);
        pathBuilder.lineTo(13.0f, 18.96f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineToRelative(2.12f, 2.12f);
        pathBuilder.lineToRelative(4.24f, -4.24f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineTo(16.54f, 22.5f);
        pathBuilder.close();
        pathBuilder.moveTo(10.41f, 14.0f);
        pathBuilder.lineTo(12.0f, 15.59f);
        pathBuilder.lineTo(10.59f, 17.0f);
        pathBuilder.lineTo(9.0f, 15.41f);
        pathBuilder.lineTo(7.41f, 17.0f);
        pathBuilder.lineTo(6.0f, 15.59f);
        pathBuilder.lineTo(7.59f, 14.0f);
        pathBuilder.lineTo(6.0f, 12.41f);
        pathBuilder.lineTo(7.41f, 11.0f);
        pathBuilder.lineTo(9.0f, 12.59f);
        pathBuilder.lineTo(10.59f, 11.0f);
        pathBuilder.lineTo(12.0f, 12.41f);
        pathBuilder.lineTo(10.41f, 14.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _freeCancellation = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
