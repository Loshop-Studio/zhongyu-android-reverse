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
public final class CakeKt {
    private static ImageVector _cake;

    public static final ImageVector getCake(Icons.Outlined outlined) {
        ImageVector imageVector = _cake;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Cake", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 6.0f);
        pathBuilder.curveToRelative(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.curveToRelative(0.0f, -0.38f, -0.1f, -0.73f, -0.29f, -1.03f);
        pathBuilder.lineTo(12.0f, 0.0f);
        pathBuilder.lineToRelative(-1.71f, 2.97f);
        pathBuilder.curveToRelative(-0.19f, 0.3f, -0.29f, 0.65f, -0.29f, 1.03f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(-5.0f);
        pathBuilder.lineTo(13.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(6.0f, 9.0f);
        pathBuilder.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilder.verticalLineToRelative(9.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-9.0f);
        pathBuilder.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 20.0f);
        pathBuilder.lineTo(5.0f, 20.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(0.9f, -0.01f, 1.76f, -0.37f, 2.4f, -1.01f);
        pathBuilder.lineToRelative(1.09f, -1.07f);
        pathBuilder.lineToRelative(1.07f, 1.07f);
        pathBuilder.curveToRelative(1.31f, 1.31f, 3.59f, 1.3f, 4.89f, 0.0f);
        pathBuilder.lineToRelative(1.08f, -1.07f);
        pathBuilder.lineToRelative(1.07f, 1.07f);
        pathBuilder.curveToRelative(0.64f, 0.64f, 1.5f, 1.0f, 2.4f, 1.01f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 15.5f);
        pathBuilder.curveToRelative(-0.51f, -0.01f, -0.99f, -0.2f, -1.35f, -0.57f);
        pathBuilder.lineToRelative(-2.13f, -2.13f);
        pathBuilder.lineToRelative(-2.14f, 2.13f);
        pathBuilder.curveToRelative(-0.74f, 0.74f, -2.03f, 0.74f, -2.77f, 0.0f);
        pathBuilder.lineTo(8.48f, 12.8f);
        pathBuilder.lineToRelative(-2.14f, 2.13f);
        pathBuilder.curveToRelative(-0.35f, 0.36f, -0.83f, 0.56f, -1.34f, 0.57f);
        pathBuilder.lineTo(5.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(3.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cake = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
