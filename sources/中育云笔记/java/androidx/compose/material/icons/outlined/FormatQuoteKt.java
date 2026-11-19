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
public final class FormatQuoteKt {
    private static ImageVector _formatQuote;

    public static final ImageVector getFormatQuote(Icons.Outlined outlined) {
        ImageVector imageVector = _formatQuote;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.FormatQuote", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.62f, 18.0f);
        pathBuilder.horizontalLineToRelative(-5.24f);
        pathBuilder.lineToRelative(2.0f, -4.0f);
        pathBuilder.lineTo(13.0f, 14.0f);
        pathBuilder.lineTo(13.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineToRelative(7.24f);
        pathBuilder.lineTo(18.62f, 18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.62f, 16.0f);
        pathBuilder.horizontalLineToRelative(0.76f);
        pathBuilder.lineTo(19.0f, 12.76f);
        pathBuilder.lineTo(19.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(3.62f);
        pathBuilder.lineToRelative(-2.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.62f, 18.0f);
        pathBuilder.lineTo(3.38f, 18.0f);
        pathBuilder.lineToRelative(2.0f, -4.0f);
        pathBuilder.lineTo(3.0f, 14.0f);
        pathBuilder.lineTo(3.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineToRelative(7.24f);
        pathBuilder.lineTo(8.62f, 18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.62f, 16.0f);
        pathBuilder.horizontalLineToRelative(0.76f);
        pathBuilder.lineTo(9.0f, 12.76f);
        pathBuilder.lineTo(9.0f, 8.0f);
        pathBuilder.lineTo(5.0f, 8.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(3.62f);
        pathBuilder.lineToRelative(-2.0f, 4.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatQuote = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
