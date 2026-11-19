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
public final class FormatColorFillKt {
    private static ImageVector _formatColorFill;

    public static final ImageVector getFormatColorFill(Icons.Outlined outlined) {
        ImageVector imageVector = _formatColorFill;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.FormatColorFill", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.56f, 8.94f);
        pathBuilder.lineTo(7.62f, 0.0f);
        pathBuilder.lineTo(6.21f, 1.41f);
        pathBuilder.lineToRelative(2.38f, 2.38f);
        pathBuilder.lineTo(3.44f, 8.94f);
        pathBuilder.curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0.0f, 2.12f);
        pathBuilder.lineToRelative(5.5f, 5.5f);
        pathBuilder.curveTo(9.23f, 16.85f, 9.62f, 17.0f, 10.0f, 17.0f);
        pathBuilder.reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f);
        pathBuilder.lineToRelative(5.5f, -5.5f);
        pathBuilder.curveTo(17.15f, 10.48f, 17.15f, 9.53f, 16.56f, 8.94f);
        pathBuilder.close();
        pathBuilder.moveTo(5.21f, 10.0f);
        pathBuilder.lineTo(10.0f, 5.21f);
        pathBuilder.lineTo(14.79f, 10.0f);
        pathBuilder.horizontalLineTo(5.21f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 11.5f);
        pathBuilder.curveToRelative(0.0f, 0.0f, -2.0f, 2.17f, -2.0f, 3.5f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.curveTo(21.0f, 13.67f, 19.0f, 11.5f, 19.0f, 11.5f);
        pathBuilder.close();
        pathBuilder.moveTo(2.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatColorFill = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
