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
public final class ThumbsUpDownKt {
    private static ImageVector _thumbsUpDown;

    public static final ImageVector getThumbsUpDown(Icons.Rounded rounded) {
        ImageVector imageVector = _thumbsUpDown;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ThumbsUpDown", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.06f, 5.0f);
        pathBuilder.horizontalLineTo(5.82f);
        pathBuilder.lineToRelative(0.66f, -3.18f);
        pathBuilder.curveToRelative(0.08f, -0.37f, -0.04f, -0.75f, -0.3f, -1.02f);
        pathBuilder.curveTo(5.74f, 0.36f, 5.03f, 0.36f, 4.6f, 0.8f);
        pathBuilder.lineToRelative(-4.0f, 4.0f);
        pathBuilder.curveToRelative(-0.39f, 0.37f, -0.6f, 0.88f, -0.6f, 1.41f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(5.92f);
        pathBuilder.curveToRelative(0.8f, 0.0f, 1.52f, -0.48f, 1.84f, -1.21f);
        pathBuilder.lineToRelative(2.14f, -5.0f);
        pathBuilder.curveTo(12.46f, 6.47f, 11.49f, 5.0f, 10.06f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 10.0f);
        pathBuilder.horizontalLineToRelative(-5.92f);
        pathBuilder.curveToRelative(-0.8f, 0.0f, -1.52f, 0.48f, -1.84f, 1.21f);
        pathBuilder.lineToRelative(-2.14f, 5.0f);
        pathBuilder.curveToRelative(-0.56f, 1.32f, 0.4f, 2.79f, 1.84f, 2.79f);
        pathBuilder.horizontalLineToRelative(4.24f);
        pathBuilder.lineToRelative(-0.66f, 3.18f);
        pathBuilder.curveToRelative(-0.08f, 0.37f, 0.04f, 0.75f, 0.3f, 1.02f);
        pathBuilder.curveToRelative(0.44f, 0.44f, 1.15f, 0.44f, 1.58f, 0.0f);
        pathBuilder.lineToRelative(4.0f, -4.0f);
        pathBuilder.curveToRelative(0.38f, -0.38f, 0.59f, -0.88f, 0.59f, -1.41f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.curveToRelative(0.01f, -1.1f, -0.89f, -2.0f, -1.99f, -2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thumbsUpDown = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
