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
public final class FormatUnderlinedKt {
    private static ImageVector _formatUnderlined;

    public static final ImageVector getFormatUnderlined(Icons.Rounded rounded) {
        ImageVector imageVector = _formatUnderlined;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FormatUnderlined", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.79f, 16.95f);
        pathBuilder.curveToRelative(3.03f, -0.39f, 5.21f, -3.11f, 5.21f, -6.16f);
        pathBuilder.verticalLineTo(4.25f);
        pathBuilder.curveTo(18.0f, 3.56f, 17.44f, 3.0f, 16.75f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-1.25f, 0.56f, -1.25f, 1.25f);
        pathBuilder.verticalLineToRelative(6.65f);
        pathBuilder.curveToRelative(0.0f, 1.67f, -1.13f, 3.19f, -2.77f, 3.52f);
        pathBuilder.curveToRelative(-2.25f, 0.47f, -4.23f, -1.25f, -4.23f, -3.42f);
        pathBuilder.verticalLineTo(4.25f);
        pathBuilder.curveTo(8.5f, 3.56f, 7.94f, 3.0f, 7.25f, 3.0f);
        pathBuilder.reflectiveCurveTo(6.0f, 3.56f, 6.0f, 4.25f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.curveToRelative(0.0f, 3.57f, 3.13f, 6.42f, 6.79f, 5.95f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 20.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatUnderlined = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
