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
public final class FormatBoldKt {
    private static ImageVector _formatBold;

    public static final ImageVector getFormatBold(Icons.Sharp sharp) {
        ImageVector imageVector = _formatBold;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FormatBold", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.6f, 10.79f);
        pathBuilder.curveToRelative(0.97f, -0.67f, 1.65f, -1.77f, 1.65f, -2.79f);
        pathBuilder.curveToRelative(0.0f, -2.26f, -1.75f, -4.0f, -4.0f, -4.0f);
        pathBuilder.lineTo(7.0f, 4.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.horizontalLineToRelative(7.04f);
        pathBuilder.curveToRelative(2.09f, 0.0f, 3.71f, -1.7f, 3.71f, -3.79f);
        pathBuilder.curveToRelative(0.0f, -1.52f, -0.86f, -2.82f, -2.15f, -3.42f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 6.5f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.5f, 15.5f);
        pathBuilder.lineTo(10.0f, 15.5f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineToRelative(3.5f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatBold = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
