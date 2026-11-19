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
public final class FormatOverlineKt {
    private static ImageVector _formatOverline;

    public static final ImageVector getFormatOverline(Icons.Outlined outlined) {
        ImageVector imageVector = _formatOverline;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.FormatOverline", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 3.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 7.0f);
        pathBuilder.curveToRelative(-3.87f, 0.0f, -7.0f, 3.13f, -7.0f, 7.0f);
        pathBuilder.curveToRelative(0.0f, 3.87f, 3.13f, 7.0f, 7.0f, 7.0f);
        pathBuilder.reflectiveCurveToRelative(7.0f, -3.13f, 7.0f, -7.0f);
        pathBuilder.curveTo(19.0f, 10.13f, 15.87f, 7.0f, 12.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 18.5f);
        pathBuilder.curveToRelative(-2.49f, 0.0f, -4.5f, -2.01f, -4.5f, -4.5f);
        pathBuilder.reflectiveCurveTo(9.51f, 9.5f, 12.0f, 9.5f);
        pathBuilder.reflectiveCurveToRelative(4.5f, 2.01f, 4.5f, 4.5f);
        pathBuilder.reflectiveCurveTo(14.49f, 18.5f, 12.0f, 18.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatOverline = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
