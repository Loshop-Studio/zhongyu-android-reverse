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
public final class TextRotationAngledownKt {
    private static ImageVector _textRotationAngledown;

    public static final ImageVector getTextRotationAngledown(Icons.Filled filled) {
        ImageVector imageVector = _textRotationAngledown;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.TextRotationAngledown", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.4f, 4.91f);
        pathBuilder.lineToRelative(-1.06f, -1.06f);
        pathBuilder.lineTo(7.2f, 8.27f);
        pathBuilder.lineToRelative(1.48f, 1.48f);
        pathBuilder.lineToRelative(2.19f, -0.92f);
        pathBuilder.lineToRelative(3.54f, 3.54f);
        pathBuilder.lineToRelative(-0.92f, 2.19f);
        pathBuilder.lineToRelative(1.48f, 1.48f);
        pathBuilder.lineTo(19.4f, 4.91f);
        pathBuilder.close();
        pathBuilder.moveTo(12.59f, 8.01f);
        pathBuilder.lineToRelative(4.87f, -2.23f);
        pathBuilder.lineToRelative(-2.23f, 4.87f);
        pathBuilder.lineToRelative(-2.64f, -2.64f);
        pathBuilder.close();
        pathBuilder.moveTo(14.27f, 21.0f);
        pathBuilder.verticalLineToRelative(-4.24f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineToRelative(-8.84f, -8.84f);
        pathBuilder.lineToRelative(-1.42f, 1.42f);
        pathBuilder.lineToRelative(8.84f, 8.84f);
        pathBuilder.lineTo(10.03f, 21.0f);
        pathBuilder.horizontalLineToRelative(4.24f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textRotationAngledown = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
