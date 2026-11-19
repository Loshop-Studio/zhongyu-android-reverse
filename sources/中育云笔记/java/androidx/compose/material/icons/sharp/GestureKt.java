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
public final class GestureKt {
    private static ImageVector _gesture;

    public static final ImageVector getGesture(Icons.Sharp sharp) {
        ImageVector imageVector = _gesture;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Gesture", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.59f, 6.89f);
        pathBuilder.curveToRelative(0.7f, -0.71f, 1.4f, -1.35f, 1.71f, -1.22f);
        pathBuilder.curveToRelative(0.5f, 0.2f, 0.0f, 1.03f, -0.3f, 1.52f);
        pathBuilder.curveToRelative(-0.25f, 0.42f, -2.86f, 3.89f, -2.86f, 6.31f);
        pathBuilder.curveToRelative(0.0f, 1.28f, 0.48f, 2.34f, 1.34f, 2.98f);
        pathBuilder.curveToRelative(0.75f, 0.56f, 1.74f, 0.73f, 2.64f, 0.46f);
        pathBuilder.curveToRelative(1.07f, -0.31f, 1.95f, -1.4f, 3.06f, -2.77f);
        pathBuilder.curveToRelative(1.21f, -1.49f, 2.83f, -3.44f, 4.08f, -3.44f);
        pathBuilder.curveToRelative(1.63f, 0.0f, 1.65f, 1.01f, 1.76f, 1.79f);
        pathBuilder.curveToRelative(-3.78f, 0.64f, -5.38f, 3.67f, -5.38f, 5.37f);
        pathBuilder.curveToRelative(0.0f, 1.7f, 1.44f, 3.09f, 3.21f, 3.09f);
        pathBuilder.curveToRelative(1.63f, 0.0f, 4.29f, -1.33f, 4.69f, -6.1f);
        pathBuilder.lineTo(21.0f, 14.88f);
        pathBuilder.verticalLineToRelative(-2.5f);
        pathBuilder.horizontalLineToRelative(-2.47f);
        pathBuilder.curveToRelative(-0.15f, -1.65f, -1.09f, -4.2f, -4.03f, -4.2f);
        pathBuilder.curveToRelative(-2.25f, 0.0f, -4.18f, 1.91f, -4.94f, 2.84f);
        pathBuilder.curveToRelative(-0.58f, 0.73f, -2.06f, 2.48f, -2.29f, 2.72f);
        pathBuilder.curveToRelative(-0.25f, 0.3f, -0.68f, 0.84f, -1.11f, 0.84f);
        pathBuilder.curveToRelative(-0.45f, 0.0f, -0.72f, -0.83f, -0.36f, -1.92f);
        pathBuilder.curveToRelative(0.35f, -1.09f, 1.4f, -2.86f, 1.85f, -3.52f);
        pathBuilder.curveToRelative(0.78f, -1.14f, 1.3f, -1.92f, 1.3f, -3.28f);
        pathBuilder.curveTo(8.95f, 3.69f, 7.31f, 3.0f, 6.44f, 3.0f);
        pathBuilder.curveTo(5.12f, 3.0f, 3.97f, 4.0f, 3.72f, 4.25f);
        pathBuilder.curveToRelative(-0.36f, 0.36f, -0.66f, 0.66f, -0.88f, 0.93f);
        pathBuilder.lineToRelative(1.75f, 1.71f);
        pathBuilder.close();
        pathBuilder.moveTo(13.88f, 18.55f);
        pathBuilder.curveToRelative(-0.31f, 0.0f, -0.74f, -0.26f, -0.74f, -0.72f);
        pathBuilder.curveToRelative(0.0f, -0.6f, 0.73f, -2.2f, 2.87f, -2.76f);
        pathBuilder.curveToRelative(-0.3f, 2.69f, -1.43f, 3.48f, -2.13f, 3.48f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gesture = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
