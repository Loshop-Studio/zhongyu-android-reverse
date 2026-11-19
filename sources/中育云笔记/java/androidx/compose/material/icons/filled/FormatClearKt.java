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
public final class FormatClearKt {
    private static ImageVector _formatClear;

    public static final ImageVector getFormatClear(Icons.Filled filled) {
        ImageVector imageVector = _formatClear;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.FormatClear", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.27f, 5.0f);
        pathBuilder.lineTo(2.0f, 6.27f);
        pathBuilder.lineToRelative(6.97f, 6.97f);
        pathBuilder.lineTo(6.5f, 19.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.lineToRelative(1.57f, -3.66f);
        pathBuilder.lineTo(16.73f, 21.0f);
        pathBuilder.lineTo(18.0f, 19.73f);
        pathBuilder.lineTo(3.55f, 5.27f);
        pathBuilder.lineTo(3.27f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 5.0f);
        pathBuilder.verticalLineToRelative(0.18f);
        pathBuilder.lineTo(8.82f, 8.0f);
        pathBuilder.horizontalLineToRelative(2.4f);
        pathBuilder.lineToRelative(-0.72f, 1.68f);
        pathBuilder.lineToRelative(2.1f, 2.1f);
        pathBuilder.lineTo(14.21f, 8.0f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatClear = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
