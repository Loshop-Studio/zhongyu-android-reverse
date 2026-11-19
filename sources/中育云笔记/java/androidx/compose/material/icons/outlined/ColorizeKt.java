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
public final class ColorizeKt {
    private static ImageVector _colorize;

    public static final ImageVector getColorize(Icons.Outlined outlined) {
        ImageVector imageVector = _colorize;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Colorize", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.66f, 5.41f);
        pathBuilder.lineToRelative(0.92f, 0.92f);
        pathBuilder.lineToRelative(-2.69f, 2.69f);
        pathBuilder.lineToRelative(-0.92f, -0.92f);
        pathBuilder.lineToRelative(2.69f, -2.69f);
        pathBuilder.moveTo(17.67f, 3.0f);
        pathBuilder.curveToRelative(-0.26f, 0.0f, -0.51f, 0.1f, -0.71f, 0.29f);
        pathBuilder.lineToRelative(-3.12f, 3.12f);
        pathBuilder.lineToRelative(-1.93f, -1.91f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineToRelative(1.42f, 1.42f);
        pathBuilder.lineTo(3.0f, 16.25f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.horizontalLineToRelative(4.75f);
        pathBuilder.lineToRelative(8.92f, -8.92f);
        pathBuilder.lineToRelative(1.42f, 1.42f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineToRelative(-1.92f, -1.92f);
        pathBuilder.lineToRelative(3.12f, -3.12f);
        pathBuilder.curveToRelative(0.4f, -0.4f, 0.4f, -1.03f, 0.01f, -1.42f);
        pathBuilder.lineToRelative(-2.34f, -2.34f);
        pathBuilder.curveToRelative(-0.2f, -0.19f, -0.45f, -0.29f, -0.7f, -0.29f);
        pathBuilder.close();
        pathBuilder.moveTo(6.92f, 19.0f);
        pathBuilder.lineTo(5.0f, 17.08f);
        pathBuilder.lineToRelative(8.06f, -8.06f);
        pathBuilder.lineToRelative(1.92f, 1.92f);
        pathBuilder.lineTo(6.92f, 19.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _colorize = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
