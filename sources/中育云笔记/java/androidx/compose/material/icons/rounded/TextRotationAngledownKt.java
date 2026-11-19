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
public final class TextRotationAngledownKt {
    private static ImageVector _textRotationAngledown;

    public static final ImageVector getTextRotationAngledown(Icons.Rounded rounded) {
        ImageVector imageVector = _textRotationAngledown;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TextRotationAngledown", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.0f, 20.5f);
        pathBuilder.verticalLineToRelative(-2.54f);
        pathBuilder.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        pathBuilder.lineToRelative(-0.56f, 0.56f);
        pathBuilder.lineTo(5.1f, 9.68f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(8.49f, 8.49f);
        pathBuilder.lineToRelative(-0.56f, 0.56f);
        pathBuilder.curveToRelative(-0.32f, 0.32f, -0.1f, 0.86f, 0.34f, 0.86f);
        pathBuilder.horizontalLineToRelative(2.54f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, -0.23f, 0.5f, -0.5f);
        pathBuilder.close();
        pathBuilder.moveTo(11.25f, 8.48f);
        pathBuilder.lineToRelative(3.54f, 3.54f);
        pathBuilder.lineToRelative(-0.67f, 1.6f);
        pathBuilder.curveToRelative(-0.15f, 0.36f, -0.07f, 0.77f, 0.21f, 1.05f);
        pathBuilder.curveToRelative(0.49f, 0.49f, 1.31f, 0.32f, 1.57f, -0.32f);
        pathBuilder.lineToRelative(3.61f, -9.09f);
        pathBuilder.curveToRelative(0.17f, -0.42f, 0.07f, -0.91f, -0.25f, -1.23f);
        pathBuilder.curveToRelative(-0.32f, -0.32f, -0.8f, -0.42f, -1.23f, -0.25f);
        pathBuilder.lineToRelative(-9.1f, 3.6f);
        pathBuilder.curveToRelative(-0.64f, 0.25f, -0.81f, 1.08f, -0.32f, 1.57f);
        pathBuilder.curveToRelative(0.27f, 0.27f, 0.68f, 0.35f, 1.04f, 0.2f);
        pathBuilder.lineToRelative(1.6f, -0.67f);
        pathBuilder.close();
        pathBuilder.moveTo(17.84f, 5.43f);
        pathBuilder.lineToRelative(-2.23f, 4.87f);
        pathBuilder.lineToRelative(-2.64f, -2.64f);
        pathBuilder.lineToRelative(4.87f, -2.23f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textRotationAngledown = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
