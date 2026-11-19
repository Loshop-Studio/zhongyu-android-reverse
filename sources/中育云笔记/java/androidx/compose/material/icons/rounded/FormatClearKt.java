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
public final class FormatClearKt {
    private static ImageVector _formatClear;

    public static final ImageVector getFormatClear(Icons.Rounded rounded) {
        ImageVector imageVector = _formatClear;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FormatClear", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.5f, 8.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(19.33f, 5.0f, 18.5f, 5.0f);
        pathBuilder.lineTo(6.39f, 5.0f);
        pathBuilder.lineToRelative(3.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(1.83f);
        pathBuilder.lineToRelative(-0.55f, 1.28f);
        pathBuilder.lineToRelative(2.09f, 2.09f);
        pathBuilder.lineTo(14.21f, 8.0f);
        pathBuilder.horizontalLineToRelative(4.29f);
        pathBuilder.close();
        pathBuilder.moveTo(17.44f, 18.88f);
        pathBuilder.lineTo(4.12f, 5.56f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(6.26f, 6.26f);
        pathBuilder.lineToRelative(-1.65f, 3.84f);
        pathBuilder.curveToRelative(-0.39f, 0.92f, 0.28f, 1.93f, 1.27f, 1.93f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.05f, -0.33f, 1.27f, -0.84f);
        pathBuilder.lineToRelative(1.21f, -2.83f);
        pathBuilder.lineToRelative(4.95f, 4.95f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.curveToRelative(0.4f, -0.38f, 0.4f, -1.01f, 0.01f, -1.4f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatClear = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
