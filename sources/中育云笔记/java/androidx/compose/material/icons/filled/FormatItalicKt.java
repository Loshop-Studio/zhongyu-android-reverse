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
public final class FormatItalicKt {
    private static ImageVector _formatItalic;

    public static final ImageVector getFormatItalic(Icons.Filled filled) {
        ImageVector imageVector = _formatItalic;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.FormatItalic", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.0f, 4.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(2.21f);
        pathBuilder.lineToRelative(-3.42f, 8.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineToRelative(-2.21f);
        pathBuilder.lineToRelative(3.42f, -8.0f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatItalic = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
